package com.yuntu.basis_learn.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String line = "罗某1与戴某离婚纠纷一审民事判决书\n" +
				"<p>\n" +
				"\t<title></title>\n" +
				"</p>\n" +
				"\n" +
				"\n" +
				"\t江西省德安县人民法院\n" +
				"\n" +
				"\n" +
				"\t民 事 判 决 书\n" +
				"\n" +
				"\n" +
				"\t(2015)德民一初字第425号\n" +
				"\n" +
				"\n" +
				"\t原告罗某1,男，1975年3月22日出生，汉族，无固定职业，住德安县。\n" +
				"\n" +
				"\n" +
				"\t委托代理人周泰发，德安县蒲亭法律服务所法律工作者，执业证号：31402011102177。\n" +
				"\n" +
				"\n" +
				"\t被告戴某,女，1982年2月3日出生，汉族，住德安县。\n" +
				"\n" +
				"\n" +
				"\t原告罗某1诉被告戴某离婚纠纷一案，本院于2015年7月15日立案受理，依法组成合议庭，公开开庭进行了审理。原告罗某1及委托代理人周泰发到庭参加诉讼。被告戴某经本院公告传唤期限届满未到庭，本案现已审理终结。\n" +
				"\n" +
				"\n" +
				"\t原告罗某1诉称，原告于2010年元月通过他人介绍与被告戴某相识，于&times;&times;&times;&times;年&times;&times;月&times;&times;日在德安县民政局登记结婚，&times;&times;&times;&times;年&times;&times;月&times;&times;日生子取名罗某2。婚后不久，由于双方婚前认识短，互相缺乏了解，性格不合，加之原告无固定工作，经济收入少，因此发生多次争吵。2012年2月19日被告戴某外出至今未归，已有三年五个月，原告也曾做和好工作未果。原告认为双方婚姻关系已名存实亡，难以继续共同生活，遂向法院提起诉讼，请求依法判令原告与被告离婚；婚生子罗某2由原告抚养，被告每月承担抚养费600元至其独立生活止；本案诉讼费由被告承担。\n" +
				"\n" +
				"\n" +
				"\t被告戴某未答辩。\n" +
				"\n" +
				"\n" +
				"\t经审理查明：原告罗某1与被告戴某于2010年经人介绍相识恋爱，&times;&times;&times;&times;年&times;&times;月&times;&times;日在德安县民政局登记结婚，&times;&times;&times;&times;年&times;&times;月&times;&times;日生育子罗某2，婚生子罗某2至今一直随原告父母生活。由于婚前原、被告相处时间短，缺乏了解，婚后不久经常为家庭琐事发生争吵，甚至发生肢体冲突。2012年2月19日被告戴某独自离家外出，与原告分居至今，原告遂诉至本院要求与被告离婚。\n" +
				"\n" +
				"\n" +
				"\t上述事实有原告的陈述、结婚证、出生医学证明、接处警登记表、证明等证据存卷佐证，事实清楚，证据充分，足以认定。\n" +
				"\n" +
				"\n" +
				"\t本院认为：原、被告双方婚前缺乏相互了解，感情基础薄弱，结婚五年多以来，在处理家庭问题上，相互间缺乏沟通，不能互谅互让，甚至发生肢体冲突，导致夫妻矛盾逐渐加深，夫妻感情逐渐淡漠。被告自2012年2月19日离家至今未归，不履行夫妻义务，夫妻感情确已破裂。原告要求与被告离婚应予支持。由于被告戴某长期离家，不履行夫妻义务，且目前婚生子罗某2随原告父母生活，罗某2由原告抚养更有利于其生活成长，综合被告的收入及当地实际生活水平，罗某2的抚养费酌定为500元为宜。依照《中华人民共和国民事诉讼法》第六十四条第一款、第九十二条、第一百四十四条，《中华人民共和国婚姻法》第三十二条、第三十九之规定，判决如下：\n" +
				"\n" +
				"\n" +
				"\t一、准许原告罗某1与被告戴某离婚；\n" +
				"\n" +
				"\n" +
				"\t二、婚生子罗某2随原告罗某1生活，由原告抚养，被告戴某自2015年7月15日起每月支付婚生子罗某2抚养费500元，此款于每月15日给付；\n" +
				"\n" +
				"\n" +
				"\t三、驳回原告的其他诉讼请求；\n" +
				"\n" +
				"\n" +
				"\t案件受理费300元（原告已预交）减半收取150元，由原告罗某1负担。\n" +
				"\n" +
				"\n" +
				"\t如不服本判决，可在判决书送达之日起十五日内，向本院递交上诉状，并按对方当事人的人数提出副本，上诉于江西省九江市中级人民法院。\n" +
				"\n" +
				"\n" +
				"\t审　判　长　　周　宇\n" +
				"\n" +
				"\n" +
				"\t代理审判员　　王青蓝\n" +
				"\n" +
				"\n" +
				"\t代理审判员　　黄　强\n" +
				"\n" +
				"\n" +
				"\t二〇一五年十一月十六日\n";
		String pattern = "(?<=[，,])(.+(事务所|服务所).*)(?=[。，,.])";


		line=line.replaceAll("反诉原告","");
		line=line.replaceAll("反诉被告","");
		String plaintiffLawyer = null;
		String defendantLawyer = null;
		int defendanTSignIndex = line.indexOf("被告");
		if (line.contains("被上诉人")){
			defendanTSignIndex = line.indexOf("被上诉人");
		}

		String defendantPart = line.substring(defendanTSignIndex);


		// 创建 Pattern 对象
		Pattern defendantPattern = Pattern.compile(pattern);

		// 现在创建 matcher 对象
		Matcher defendantMatcher = defendantPattern.matcher(defendantPart);

		while(defendantMatcher.find()){
			String lawyerOfiice = defendantMatcher.group();
			if(lawyerOfiice!=null){
				if(lawyerOfiice.contains("事务所")){
					int officeSignIndex = lawyerOfiice.indexOf("事务所");
					lawyerOfiice = lawyerOfiice.substring(0,officeSignIndex+3);
				} else {
					int officeSignIndex = lawyerOfiice.indexOf("服务所");
					lawyerOfiice = lawyerOfiice.substring(0,officeSignIndex+3);
				}

				//添加到被告人律师
					if(defendantLawyer!=null){
						defendantLawyer+=","+lawyerOfiice;
					} else {
						defendantLawyer=lawyerOfiice;
					}
				}
			}

		String plaintiffPart = line.substring(0,defendanTSignIndex-1);

		// 创建 Pattern 对象
		Pattern plaintiffPattern = Pattern.compile(pattern);

		// 现在创建 matcher 对象
		Matcher plaintiffMatcher = plaintiffPattern.matcher(plaintiffPart);

		while(plaintiffMatcher.find()){
			String lawyerOfiice = plaintiffMatcher.group();
			if(lawyerOfiice!=null){
				if(lawyerOfiice.contains("事务所")){
					int officeSignIndex = lawyerOfiice.indexOf("事务所");
					lawyerOfiice = lawyerOfiice.substring(0,officeSignIndex+3);
				} else {
					int officeSignIndex = lawyerOfiice.indexOf("服务所");
					lawyerOfiice = lawyerOfiice.substring(0,officeSignIndex+3);
				}
				//添加到被告人律师
					if(plaintiffLawyer!=null){
						plaintiffLawyer+=","+lawyerOfiice;
					} else {
						plaintiffLawyer=lawyerOfiice;
					}
				}
			}
		System.out.println(plaintiffLawyer);
		System.out.println(defendantLawyer);

		}


	}
