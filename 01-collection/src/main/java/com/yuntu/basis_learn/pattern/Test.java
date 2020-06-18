package com.yuntu.basis_learn.pattern;

import com.yuntu.basis_learn.java_eight.parallel_stream.Accumulator;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {

		String line = "2019/07/15 15:39:35 - Java 代码.0 - \t南昌市青云谱区人民法院\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t刑 事 判 决 书\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t（2018）赣0104刑初78号\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t公诉机关南昌市青云谱区人民检察院。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t被告人吴爱芝，女，汉族，1970年11月5日出生，小学文化，户籍地址江西省南昌市青云谱区，现住江西省南昌县，因涉嫌盗窃罪，于2017年8月16日被南昌市公安局青云谱分局刑事拘留，同年9月20日经青云谱区人民检察院批准逮捕，次日由南昌市公安局青云谱分局执行逮捕。现羁押于南昌市第一看守所。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t辩护人陈剑华，江西民信律师事务所律师。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t南昌市青云谱区人民检察院以青检公刑诉[2018]68号起诉书指控被告人吴爱芝犯盗窃罪，于2018年2月8日向本院提起公诉。本院依法组成合议庭，公开开庭审理了本案。南昌市青云谱区人民检察院指派检察员罗祥发、江帆出庭支持公诉，被告人吴爱芝及其辩护人到庭参加诉讼。现已审理终结。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t公诉机关指控：2014年，被告人吴爱芝由劳务公司派遣至被害人李某1、李某2家中（南昌市青云谱区三店西路788号象湖威尼斯小区11栋1单元501户）从事住家保姆工作。2016年至2017年间，被告人吴爱芝多次窃取被害人家中财物，具体如下：\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t2016年底的一天，被告人吴爱芝趁被害人李某1母亲单独在家之时，盗取了李某1母亲房间抽屉内的一叠面值1000元的华润万家商场预付卡。2017年4月4日下午，被告人吴爱芝趁被害人李某1母亲单独在家之时，盗取了被害人李某1房间内的人民币1100元及一叠面值1000的港币（当日100港币兑人民币中间价为88.671元）。2017年4月23日12时许，被告人吴爱芝盗取了被害人李某2放在其卧室外椅子上钱包内的人民币700元及1000港币（当日100港币兑人民币中间价为88.518元）。2017年4月24日16时许，被告人吴爱芝进入被害人李某1卧室盗取了4000元港币（当日100港币兑人民币中间价为88.316元）。同年4月26日14时许，被告人吴爱芝盗取了被害人李某2放在其卧室外椅子上钱包内的人民币200元。2017年5月28日19时许，被告人吴爱芝盗取了被害人李某2放在其卧室外椅子上钱包内的3000元港币（当日100港币兑人民币中间价为88.171元）。2017年6月6日6时许，被告人吴爱芝盗取了被害人李某2放在其卧室外椅子上钱包内的人民币600元及4000元港币（当日100港币兑人民币中间价为88.178元）。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t被告人吴爱芝将上述部分所盗财物藏于其位于南昌市金沙大道奥林匹克花园48栋1101户的家中杂物间内，2017年8月16日，民警在上述地点搜出39张面值1000元的华润万家商场预付卡和18200港币。同日，被告人吴爱芝被公安机关传唤到案。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t为证实上述指控事实的成立，公诉机关当庭出示和宣读了书证、被害人陈述、被告人供述、鉴定意见、搜查笔录、视听资料等证据。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t公诉机关认为，被告人吴爱芝以非法占有为目的，秘密窃取他人财物折合人民币共计57687.672余元，数额巨大，其行为触犯了《中华人民共和国刑法》第二百六十四条之规定，犯罪事实清楚，证据确实、充分，应当以盗窃罪追究其刑事责任。提请法院判处。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t被告人吴爱芝对公诉机关的指控无异议并当庭自愿认罪。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t被告人吴爱芝的辩护人辩称：1、对被告人吴爱芝犯公诉机关指控的盗窃罪不持异议。2、被告人吴爱芝具有以下量刑情节：1）归案后如实供述全部犯罪事实，具有坦白情节；2）被扣押的财物已发还给被害人，被害人的经济损失得到挽回；3）没有前科劣迹。综上，请求法庭予以考虑。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t经审理查明：2014年，被告人吴爱芝经劳务公司介绍，在被害人李某2、李某1夫妇位于南昌市青云谱区三店西路788号象湖威尼斯小区11栋1单元501户的家中从事住家保姆工作。2016年至2017年间，被告人吴爱芝七次盗窃被害人家中财物，共计人民币57687.67元，具体分述如下：\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t1、2016年底的一天，被告人吴爱芝盗取了被害人李某1母亲房间抽屉内的一叠面值1000元的华润万家商场预付卡。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t2、2017年4月4日下午，被告人吴爱芝盗取了被害人李某1房间内的1100元人民币及一叠面值1000的港币（当日100港币兑人民币中间价为88.671元）。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t3、2017年4月23日12时许，被告人吴爱芝盗取了被害人李某2放在其卧室外椅子上钱包内的700元人民币及1000港币（当日100港币兑人民币中间价为88.518元）。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t4、2017年4月24日16时许，被告人吴爱芝在被害人李某1卧室内盗取了4000元港币（当日100港币兑人民币中间价为88.316元）。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t5、2017年4月26日14时许，被告人吴爱芝盗取了被害人李某2放在其卧室外椅子上钱包内的200元人民币。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t6、2017年5月28日19时许，被告人吴爱芝盗取了被害人李某2放在其卧室外椅子上钱包内的3000元港币（当日100港币兑人民币中间价为88.171元）。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t7、2017年6月6日6时许，被告人吴爱芝盗取了被害人李某2放在其卧室外椅子上钱包内的600元人民币及4000元港币（当日100港币兑人民币中间价为88.178元）。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t2017年8月16日，被告人吴爱芝被公安机关传唤到案。同日，公安机关在被告人吴爱芝位于南昌县金沙大道奥林匹克花园48栋1101户的家中杂物间内，扣押到18200港币和39张面值1000元的华润万家商场预付卡。经青云谱区价格监测认定局认定，39张华润万家商场预付卡价值39000元。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t另查，根据国家外汇管理局江西分公司查询的案发时港币兑人民币的中间价计算，被扣押的18200港币折合人民币共计16087.67元。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t上述事实，有经庭审举证并经质证的被告人吴爱芝的人口信息表、归案情况说明、扣押决定书、扣押清单、扣押物品编号及照片、发还清单、江西财富广场有限公司情况说明、中国人民银行货币真伪鉴定书、国家外汇管理局江西省分局证明及汇率证明，证人刘某、张某的证言，被害人李某1的陈述，被告人吴爱芝的供述，青云谱区价格监测认定局青价认定字【2017】133号价格认定结论书，搜查笔录，被盗监控视频等证据证实，足以认定。被告人吴爱芝在庭审过程中对上述查明事实及证据的主要内容亦无异议。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t本院认为，被告人吴爱芝以非法占有为目的，多次盗窃他人财物价值人民币57687.67元，数额巨大，其行为已构成盗窃罪。公诉机关指控的罪名成立，予以支持。被告人吴爱芝归案后如实供述了自己的罪行，且当庭自愿认罪，具有坦白情节，依法从轻处罚。关于辩护人提出的辩护意见，与查明事实及法律规定相符，予以采纳。综合考虑本案事实和情节，依照《中华人民共和国刑法》第二百六十四条，第六十七条第三款之规定，判决如下：\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t被告人吴爱芝犯盗窃罪，判处有期徒刑三年，并处罚金人民币一万元。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t（刑期从判决执行之日起计算。判决执行以前先行羁押的，羁押一日折抵刑期一日，即自2017年8月16日起至2020年8月15日止；罚金自本判决生效后十日内缴纳。）\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t如不服本判决，可在接到判决书的第二日起十日内，通过本院或者直接向南昌市中级人民法院提出上诉。书面上诉的，应提交上诉状正本一份，副本三份。\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t审　判　长　　熊文彪\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t人民陪审员　　刘水金\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t人民陪审员　　孙　杰\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t二〇一八年四月十八日\n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \n" +
				"2019/07/15 15:39:35 - Java 代码.0 - \t书　记　员　　汪　莹";


		// 机动车交通事故责任纠纷 医疗费
		String fileContent = "2111111111111判决书";

		fileContent.substring(0,fileContent.indexOf("判决书")).contains("民事判决书");
		// 机动车交通事故责任纠纷  住院天数
		int jslcmIndex = line.indexOf("经审理查明");
		if(jslcmIndex==-1){
			jslcmIndex = line.indexOf("经审理认定");
		}
		int byrwIndex = line.indexOf("本院认为，");
		int pjrxIndex = line.indexOf("判决如下");
		Integer tianshu = 0;
		if(jslcmIndex>1&&byrwIndex>1&&pjrxIndex>1){

			// 审理查明
			String slcm = line.substring(jslcmIndex,byrwIndex);

			// 本院认为
			String byrw = line.substring(byrwIndex,pjrxIndex);

			//  审理查明处理
			if(slcm!=null&&slcm.length()>0){
				tianshu=getDays(slcm, tianshu);
			} if(tianshu==0){
				if(byrw!=null&&byrw.length()>0){
					tianshu=getDays(byrw, tianshu);

				}
			}

		}

		//法条
//		String tiaowen = "";
//		tiaowen=line.replaceAll(".(?=《)","\n");
//		String pattern = "《(中华人民共和国|最高人民法院).*((一|二|三|四|五|六|七|八|九|十)(条|款))";
//		Pattern compile = Pattern.compile(pattern);
//		Matcher matcher = compile.matcher(tiaowen);
//		StringBuffer sb = new StringBuffer();
//		while(matcher.find()){
//			String result = matcher.group().trim();
//			sb.append(result+"|");
//		}
//		sb.setCharAt(sb.length()-1,' ');
//		System.out.println(sb.toString().trim());
		String tiaowen = "";
		tiaowen=line.replaceAll(".(?=《)","\n");
		String myPattern = "《(中华人民共和国|最高人民法院).*((一|二|三|四|五|六|七|八|九|十)(条|款))";
		Pattern compile = Pattern.compile(myPattern);
		Matcher matcher = compile.matcher(tiaowen);
		String sb = "";
		while(matcher.find()){
			String result = matcher.group().trim();
			sb+=result+"|";
		}
		if(sb.length()>0){
			sb = sb.substring(0,sb.length()-1);
		}
//		System.out.println(sb);
		// 审判长
		String shenpanzhang = "";
		shenpanzhang = line;
		String sPattern = "((?<=审.{0,20}判.{0,20}长.{0,20})|(?<=审.{0,20}判.{0,20}员.{0,20}))[\\u4e00-\\u9fa5]*.*[\\u4e00-\\u9fa5]*.*[\\u4e00-\\u9fa5]*";
		Matcher matcher1 = Pattern.compile(sPattern).matcher(shenpanzhang);
		while(matcher1.find()){
			String result = matcher1.group().trim();
			if(result.length()>0){
//					System.out.println(result.replaceAll("[\\t,\\s,\\r,\\n,　]*",""));
			}
		}

		// 律师
//		String line = get(Fields.In, "fileContent").getString(r);

		String lvshiPattern = "(.+(事务所|服务所).*)";

		// 预处理
		line=line.replaceAll("反诉原告","");
		line=line.replaceAll("反诉被告","");
		String plaintiffLawyer = null;
		String defendantLawyer = null;
		int defendanTSignIndex = line.indexOf("被告");
		if (line.contains("被上诉人")){
			defendanTSignIndex = line.indexOf("被上诉人");
		}
		int startIndex = line.indexOf("判决书");
		int slzjIndex = line.indexOf("审理终结");
		// 防止为空报错
		if(defendanTSignIndex!=-1&&defendanTSignIndex!=0&&startIndex<defendanTSignIndex&&startIndex!=-1&&slzjIndex>defendanTSignIndex){
			// 区被告人段落
			String defendantPart = line.substring(defendanTSignIndex,slzjIndex);
			// 创建 Pattern 对象
			Pattern defendantPattern = Pattern.compile(lvshiPattern);
			// 现在创建 matcher 对象
			Matcher defendantMatcher = defendantPattern.matcher(defendantPart);
			defendantLawyer = getString(defendantLawyer, defendantMatcher);
			// 取原告段落
			String plaintiffPart = line.substring(startIndex,defendanTSignIndex-1);
			// 创建 Pattern 对象
			Pattern plaintiffPattern = Pattern.compile(lvshiPattern);
			// 现在创建 matcher 对象
			Matcher plaintiffMatcher = plaintiffPattern.matcher(plaintiffPart);
			plaintiffLawyer = getString(plaintiffLawyer, plaintiffMatcher);

		}
		System.out.println(defendantLawyer+"ss");
		System.out.println(plaintiffLawyer);
		// 法院
		String fPattern = ".*人民法院$";
		String courtResult = "";
		Pattern compile1 = Pattern.compile(fPattern,Pattern.MULTILINE);
		Matcher matcher2 = compile1.matcher(line);
		matcher2.useAnchoringBounds(true);
		matcher2.useTransparentBounds(true);
		while (matcher2.find()){
			String group = matcher2.group();
			if(group.length()>0&&group!=null){
				courtResult = group;
				if(courtResult.indexOf("省")!=-1){
					courtResult.substring(0, courtResult.indexOf("省"));
				}
				if(courtResult.indexOf("市")!=-1){
					courtResult.substring(0,courtResult.indexOf("市"));
				}
				if(courtResult.indexOf("县")!=-1){
					courtResult.substring(0,courtResult.indexOf("县"));
				}
				if(courtResult.indexOf("区")!=-1){
					courtResult.substring(0,courtResult.indexOf("区"));
				}
			}
		}


//		if(defendantLawyer==null&&plaintiffLawyer==null){
//			putRow(data.outputRowMeta, r);
//			return true;
//		}
//		String[] dls = null;
//		if(defendantLawyer!=null){
//			dls = defendantLawyer.split(",");
//			for(int i=0;i<dls.length;i++){
//				String lawyerName = dls[i].split("\\|")[0];
//				String lawyerOfficeName = dls[i].split("\\|")[1];
//				System.out.println(lawyerName);
//				System.out.println(lawyerOfficeName);
//				get(Fields.Out, "defendantLawyerOffices").setValue(r, dls[i]);
//				get(Fields.Out, "plaintiffLawyerOffices").setValue(r, null);
//				putRow(data.outputRowMeta, r);
//				r = createOutputRow(r, data.outputRowMeta.size());
//			}
//		}
//		String[] pls = null;
//		if(plaintiffLawyer!=null){
//			pls = plaintiffLawyer.split(",");
//			for(int i=0;i<pls.length;i++){
//				String lawyerName = pls[i].split("\\|")[0];
//				String lawyerOfficeName = pls[i].split("\\|")[1];
//				System.out.println(lawyerName);
//				System.out.println(lawyerOfficeName);
//				get(Fields.Out, "defendantLawyerOffices").setValue(r, null);
//				get(Fields.Out, "plaintiffLawyerOffices").setValue(r, pls[i]);
//				putRow(data.outputRowMeta, r);
//				r = createOutputRow(r, data.outputRowMeta.size());
//			}
//		}


	}

	private  static int  getDays(String line, int tianshu) {
		String zhuyuanTianP = "实际住院天数(\\d*)天|实际住院(\\d+)天";
		Pattern compile2 = Pattern.compile(zhuyuanTianP);
		Matcher matcher3 = compile2.matcher(line);
		Set nums = new HashSet();
		if(matcher3.find()){
			String group = matcher3.group(1);
			if(group.length()>0&&group!=null){
				tianshu = Integer.parseInt(group);
			}
		} else {
			Matcher matcher = matcher3.usePattern(Pattern.compile("住院(\\d*)天"));
			while (matcher.find()){
				String group = matcher.group(1);
				if(group.length()>0&&group!=null){
					nums.add(Integer.parseInt(group));
				}
			}
			Object[] objects = nums.toArray();
			for(int i=0;i<objects.length;i++){
				tianshu+=objects[i].hashCode();
			}
		}
		return  tianshu;
	}

	private static String getString(String defendantLawyer, Matcher defendantMatcher) {
		while(defendantMatcher.find()){
			String lawyerOfiice = defendantMatcher.group()+"。".trim();
			lawyerOfiice=lawyerOfiice.replaceAll("人","，");
			if(lawyerOfiice.contains("协议")||lawyerOfiice.matches(".*\\d.*")||lawyerOfiice.contains("判决书")||lawyerOfiice.contains("被告：")||lawyerOfiice.equals("事务所律师。")){
				continue;
			}
			System.out.println(lawyerOfiice);
			// 防空
			if(lawyerOfiice!=null&&lawyerOfiice.length()>3){
				// 防止过长
				if(lawyerOfiice.length()>50){
					continue;
				}
				String prepare = lawyerOfiice;
				String group= "";
				// 添加律所
				Matcher matcher = Pattern.compile("(?<=[，、,])(.+(事务所|服务所).*)(?=[。，,.])").matcher(lawyerOfiice);
				if(matcher.find()){
					group = matcher.group();
				}
				lawyerOfiice = getString(group);
				if(lawyerOfiice.contains("，")){
					lawyerOfiice = lawyerOfiice.substring(lawyerOfiice.indexOf("，")+1);
				}
				if(lawyerOfiice.contains(",")){
					lawyerOfiice = lawyerOfiice.substring(lawyerOfiice.indexOf(",")+1);
				}
				// 去除首字为系的字符串
				if(lawyerOfiice.substring(0,1).equals("系")){
					lawyerOfiice = lawyerOfiice.substring(1);
				}
				String patternTwo = "([\\u4E00-\\u9FA5]{1,10})[，,](.+(事务所|服务所).*)(?=[。，,.])";
				Matcher matcher1 = Pattern.compile(patternTwo).matcher(prepare);
				String group1= "";
				if(matcher1.find()){
					String trim = matcher1.group(1).trim();
					if(trim!=null&&trim.length()>0){
						if(trim.indexOf("代理人")!=-1){
							trim = trim.substring(trim.indexOf("代理人")+3);
						}
						group1 = trim;
					}
				}
				lawyerOfiice=group1+"|"+lawyerOfiice;
				// 添加结果
				if(defendantLawyer!=null){
					if(!defendantLawyer.contains(lawyerOfiice)){
						defendantLawyer+=","+lawyerOfiice;
					}
				} else {
					defendantLawyer=lawyerOfiice;
				}
			}
		}
		return defendantLawyer;
	}

	static String getString(String lawyerOfiice) {
		if(lawyerOfiice.contains("事务所")){
			int officeSignIndex = lawyerOfiice.indexOf("事务所");
			lawyerOfiice = lawyerOfiice.substring(0,officeSignIndex+3);
		} else if(lawyerOfiice.contains("服务所")){
			int officeSignIndex = lawyerOfiice.indexOf("服务所");
			lawyerOfiice = lawyerOfiice.substring(0,officeSignIndex+3);
		}
		return lawyerOfiice;
	}
}
