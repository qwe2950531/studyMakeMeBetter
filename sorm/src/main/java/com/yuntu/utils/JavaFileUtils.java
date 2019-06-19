package com.yuntu.utils;

import com.yuntu.bean.ColumnInfo;
import com.yuntu.bean.JavaFiledGetSet;
import com.yuntu.bean.TableInfo;
import com.yuntu.core.DBManger;
import com.yuntu.core.MysqlTypeConvertor;
import com.yuntu.core.TableContext;
import com.yuntu.core.TypeConvertor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 封装了生成java文件常用的一些操作
 * @author wang_lei
 */
public class JavaFileUtils {
	/**
	 * 根据字段信息生成java属性信息
	 * @param columnInfo 字段信息
	 * @param convertor 类型转换器
	 * @return
	 */
	public static JavaFiledGetSet createFieldGetSetSrc(ColumnInfo columnInfo, TypeConvertor convertor){
		JavaFiledGetSet jfgs = new JavaFiledGetSet();
		String javaType = convertor.databaseType2JavaType(columnInfo.getDateType());
		jfgs.setFieldInfo("\tprivate "+javaType+" "+columnInfo.getName()+";\n\n");

		StringBuilder getBuilder = new StringBuilder();
		getBuilder.append("\tpublic "+javaType+" get"+StringUtils.getFirstUpCaseString(columnInfo.getName())+"() {\n");
		getBuilder.append("\t\treturn "+columnInfo.getName()+";\n");
		getBuilder.append("\t}\n\n");
		jfgs.setGetInfo(getBuilder.toString());

		StringBuilder setBuilder = new StringBuilder();
		setBuilder.append("\tpublic void set"+StringUtils.getFirstUpCaseString(columnInfo.getName())+"("+javaType+" "+columnInfo.getName()+") {\n");
		setBuilder.append("\t\tthis."+columnInfo.getName()+"="+columnInfo.getName()+";\n");
		setBuilder.append("\t}\n\n");
		jfgs.setSetInfo(setBuilder.toString());
		return jfgs;
	}
	public static String createJavaSrc(TableInfo tableInfo,TypeConvertor convertor){
		StringBuilder sb = new StringBuilder();
		Map<String, ColumnInfo> columns = tableInfo.getColumns();
		List<JavaFiledGetSet> javaFields = new ArrayList<>();
		for(ColumnInfo c : columns.values()){
			javaFields.add(createFieldGetSetSrc(c,convertor));
		}
		// 生成package
		sb.append("package "+ DBManger.getConf().getPoPackage()+";\n");
		// 生成import
		sb.append("import java.sql.*;\n");
		sb.append("import java.util.*;\n\n\n");
		// 生成类声明
		sb.append("public class  "+StringUtils.getFirstUpCaseString(tableInfo.getName())+" {\n\n");
		// 生成属性列表
		for(JavaFiledGetSet f :javaFields){
			String fieldInfo = f.getFieldInfo();
			sb.append(fieldInfo);
		}
		sb.append("\n\n");
		// 生成setget方法列表
		for(JavaFiledGetSet f :javaFields){
			String setInfo = f.getSetInfo();
			String getInfo = f.getGetInfo();
			sb.append(setInfo);
			sb.append("\n");
			sb.append(getInfo);
		}
		sb.append("\n");
		sb.append("}\n");
		return sb.toString();

	}

	public static void createJavaPOFile(TableInfo tableInfo,TypeConvertor typeConvertor){
		String javaSrc = createJavaSrc(tableInfo, typeConvertor);
		String srcPath = DBManger.getConf().getSrcPath()+"\\";
		String poPackage = DBManger.getConf().getPoPackage().replaceAll("\\.", "\\\\");
		BufferedWriter writer = null;
		try {

			writer = new BufferedWriter(new FileWriter(srcPath+"src\\main\\java\\"+poPackage+"\\"+StringUtils.getFirstUpCaseString(tableInfo.getName())+".java"));
		     writer.write(javaSrc);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
				if(writer != null){
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void updateJavaPOFile(){
		Map<String,TableInfo> map = TableContext.nameMapTable;
		for(TableInfo tableInfo : map.values()){
			createJavaPOFile(tableInfo,new MysqlTypeConvertor());
		}
	}

	public static void loadPOTables(){
		System.out.println("in");
		Collection<TableInfo> values = TableContext.nameMapTable.values();
		for(TableInfo tableInfo : values){
			try {
				Class c = Class.forName(DBManger.getConf().getPoPackage()+"."+StringUtils.getFirstUpCaseString(tableInfo.getName()));
				System.out.println(c);
				TableContext.classMapTable.put(c,tableInfo);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
//		JavaFiledGetSet fieldGetSetSrc = JavaFileUtils.createFieldGetSetSrc(new ColumnInfo("userId", "int", 0), new MysqlTypeConvertor());
//		System.out.println(fieldGetSetSrc);
		Map<String,TableInfo> map = TableContext.nameMapTable;
		TableInfo emp = map.get("feature");
		createJavaPOFile(emp,new MysqlTypeConvertor());

	}
}
