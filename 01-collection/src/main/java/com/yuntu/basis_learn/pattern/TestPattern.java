package com.yuntu.basis_learn.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {
	public static void main(String[] args) {
		String line = "蔡某与徐某1离婚纠纷一审民事判决书\n" +
				"江西省乐平市人民法院\n" +
				"民 事 判 决 书\n" +
				"（2017）赣0281民初2903号\n" +
				"原告蔡某，女，1982年11月19日出生，汉族，住江西省乐平市。\n" +
				"委托代理人黄海明，江西护三农律师事务所律师，代理权限：一般代理。\n" +
				"被告徐某1，男，1984年8月22日出生，汉族，住江西省乐平市。\n" +
				"委托代理人熊林松，乐平市双田法律服务所法律法律工作者，代理权限：一般代理。\n" +
				"原告蔡某与被告徐某1离婚纠纷一案，本院于2017年11月14日受理后，依法适用简易程序，公开开庭进行了审理。原告及其代理人、被告及其代理人均到庭参加诉讼。本案现已审理终结。\n" +
				"原告蔡某向本院提出诉讼请求：1、请求法院依法判决原被告离婚;2、夫妻共同财产依法分割；3、婚生女儿徐某2由原告抚养成年,被告依法承担抚养费。4、本案诉讼费由被告承担。事实与理由：原告与被告于2012年农历12月经人介绍认识并确定恋爱关系,××××年××月××日登记结婚。婚后由于被告经常使用家庭暴力致使双方长期处于矛盾之中,又因为双方性格不合而经常吵架。尤其是在2015年农历12月30日晚上,被告因生活琐事,对原告大打出手，原告因无法忍受被告的家庭暴力离开被告,一直分居至今。原告与被告之间夫妻感情已完全破裂,原告于2016年10月曾向人民法院提起诉讼要求与被告离婚,后乐平市人民法院判决不予离婚,之后原告与被告也一直没有联系,夫妻感情已无和好可能性。因此,原告为维护自身合法权益,根据《民事诉讼法》第119条之规定,特向贵院提起诉讼,请求法院依法支持原告诉请。\n" +
				"被告徐某1辩称，1、原告诉称事项绝大部分不是事实,原告诉称经常受到被告的家庭暴力,这严重不实,反而是原告性格和脾气好强暴躁,在原被告双方因生活琐事发生争吵后,被告忍让却从不出手打人,更谈不上对原告家庭暴力。原告诉称“去年腊月30日晚上”的事情陈述也是严重捏造事实,虚假表示,违背诚实守信的现象。当天事实是:去年腊月30日早上,被告要到蔡家村去祭祖,原告称需要到市区看病便乘坐被告摩托车一同去蔡家村,原告叫被告停车,说一个人去市区看病。当天10时左右,原告打电话要求被告到蔡家村里去接她回去,于是被告来到蔡家后却再无法打通原告电话,被告马上到市区去寻找并报警接下来的多日里,被告多方寻找原告未果。自此原被告双方就再也没有见过面了。从以上事实表述来看,原告诉称当日晚受到被告的大打出手,而一个人孤独离开家乡的说法是多么的虚假和伪装,根本就是谎言连篇。2、针对原告起诉离婚诉请,答辩人的意见是考虑到女儿还幼小,不同意离婚。3、如果法院判决离婚,我坚持的原则底线是女儿由我抚养，要求对方一次性支付女儿抚养费4万元。4、在法院判决离婚的基础上,关于财产分割意见是:婚前我给付的彩礼款中,其中的7万元由对方以自己的名字一次性存入银行,现我要求对方全部返还。还有由我给付的黄金器物全部在原告处,我要求原告全部一并返还。这些黄金器物分别有项链,二个金戒指,一对金耳环,一只金手镯。\n" +
				"原告围绕诉讼请求依法提交了证据并当庭举证，对原告提供的身份信息、婚姻登记信息、民事判决书，被告未提出反驳意见或证据，本院对上述证据予以认定。\n" +
				"被告在举证期限内未向本院提交证据。\n" +
				"根据当事人的陈述和经审查确认的证据，本院经审理认定事实如下：\n" +
				"原被告于2012年经人介绍确定恋爱关系，于××××年××月××日登记结婚，婚后感情尚可，××××年××月××日生育一女孩徐某2。原被告间经常因琐事发生矛盾，原告于2015年农历年三十离家外出，后原告于2016年10月向法院提出要求与被告离婚的诉讼请求，法院判决驳回原告诉请。2017年11月，原告再次持该请求向法院起诉。\n" +
				"本院认为，婚姻以感情为基础。原、被告婚后因琐事经常发生争吵，致感情不和，且原告曾向本院起诉，要求与被告离婚，经本院判决不准离婚后，仍未能和好，说明双方夫妻感情确已破裂，现原告坚持要求离婚，本院依法准予原、被告离婚。原、被告离婚后，都有抚养婚生子女的权利和义务，因原、被告婚生女儿徐某2一直在被告处生活，考虑其成长环境等原因，应继续由被告抚养为宜，故本院支持被告要求抚养子女的请求。一方抚养的子女，另一方应负担必要的抚养费，结合被告生活水平及原、被告的现状，本院确定原告一次性支付被告子女抚养费40000元。关于原被告之间是否有共同财产的问题，在该案审理过程中，原被告均未提供相应的证据予以证实，故本院不予认定。据此，本院依据《中华人民共和国婚姻法》第三十二条、第三十七条、第三十九条第一款、第四十一条之规定，判决如下：\n" +
				"准予原告蔡某与被告徐某1离婚。\n" +
				"二、原、被告婚生女徐某2由被告徐某1抚养，原告蔡某一次性支付子女抚养费40000元（限本判决生效后一个月内付清）。\n" +
				"三、原、被告婚姻存续期间的财产，现在原告处的归原告所有，现在被告处的归被告所有。\n" +
				"本案受理费300元（减半收取），决定由原告负担。\n" +
				"如不服本判决，可于判决书送达之日起十五日内向本院递交上诉状，并按对方当事人的人数提出副本，上诉于江西省景德镇市中级人民法院。\n" +
				"审判员　　夏发忠\n" +
				"二〇一八年一月二十三日\n" +
				"书记员　　蔡丽平";

		String lvshiPattern = "代理人[:：，,。.、·`]?([\\u4E00-\\u9FA5]*)[,，.。:：、`]{1}([\\u4E00-\\u9FA5]*(事务所|服务所))";
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
//			defendantLawyer = getString(defendantLawyer, defendantMatcher);
			// 取原告段落
			String plaintiffPart = line.substring(startIndex,defendanTSignIndex-1);
			// 创建 Pattern 对象
			Pattern plaintiffPattern = Pattern.compile(lvshiPattern);
			// 现在创建 matcher 对象
			Matcher plaintiffMatcher = plaintiffPattern.matcher(plaintiffPart);
//			plaintiffLawyer = getString(plaintiffLawyer, plaintiffMatcher);
		}
		System.out.println(defendantLawyer);
		System.out.println(plaintiffLawyer);



		if(defendantLawyer==null&&plaintiffLawyer==null){

		}


	String[] dls = null;
		if(defendantLawyer!=null){
		dls = defendantLawyer.split(",");
		for(int i=0;i<dls.length;i++){
			String lawyerName = dls[i].split("\\|")[0];
			String lawyerOfficeName = dls[i].split("\\|")[1];

//			get(Fields.Out, "lawyerName").setValue(r, lawyerName);
//			get(Fields.Out, "defendantLawyerOffices").setValue(r, lawyerOfficeName);
//			get(Fields.Out, "plaintiffLawyerOffices").setValue(r, null);
//			putRow(data.outputRowMeta, r);
//			r = createOutputRow(r, data.outputRowMeta.size());
		}
	}
	String[] pls = null;
		if(plaintiffLawyer!=null){
		pls = plaintiffLawyer.split(",");
		for(int i=0;i<pls.length;i++){
			String lawyerName = pls[i].split("\\|")[0];
			String lawyerOfficeName = pls[i].split("\\|")[1];
//			get(Fields.Out, "lawyerName").setValue(r, lawyerName);
//			get(Fields.Out, "defendantLawyerOffices").setValue(r, null);
//			get(Fields.Out, "plaintiffLawyerOffices").setValue(r, lawyerOfficeName);
//			putRow(data.outputRowMeta, r);
//			r = createOutputRow(r, data.outputRowMeta.size());
		}
	}

}

	private  String getString(String defendantLawyer, Matcher defendantMatcher) {
		while(defendantMatcher.find()){
			String group = defendantMatcher.group(1);
			// 防空
			if(group!=null){
				// 防止过长
				if(group.length()>50){
					continue;
				}
				String lawyerName = defendantMatcher.group(1)==null?"":defendantMatcher.group(1);
				String lawyerOffice = defendantMatcher.group(2)==null?"":defendantMatcher.group(2);
				if(lawyerOffice.contains("事务所")){
					lawyerOffice=lawyerOffice.substring(0,lawyerOffice.indexOf("事务所")+3);
				} else if(lawyerOffice.contains("服务所")){
					lawyerOffice=lawyerOffice.substring(0,lawyerOffice.indexOf("服务所")+3);
				}

				// 去除首字为系的字符串
				if(lawyerOffice.length()>2&&lawyerOffice.substring(0,1).equals("系")){
					lawyerOffice = lawyerOffice.substring(1);
				}

				lawyerOffice=lawyerName+"|"+lawyerOffice;
				// 添加结果
				if(defendantLawyer!=null){
					if(!defendantLawyer.contains(lawyerOffice)){
						defendantLawyer+=","+lawyerOffice;
					}
				} else {
					defendantLawyer=lawyerOffice;
				}
			}
		}
		return defendantLawyer;
	}



}
