package com.yuntu.basis_learn.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseCondition {
	public static void main(String[] args) {
		String line = "马玉兰与吴兰兵民间借贷纠纷一审民事判决书\n" +
				"<p>\n" +
				"\t<title></title>\n" +
				"</p>\n" +
				"\n" +
				"\n" +
				"\t江西省湖口县人民法院\n" +
				"\n" +
				"\n" +
				"\t民 事 判 决 书\n" +
				"\n" +
				"\n" +
				"\t（2018）赣0429民初914号\n" +
				"\n" +
				"\n" +
				"\t原告马玉兰，女，1986年10月16日出生，回族，新疆图壁县人，户籍所在地为新疆维吾尔自治区图壁县。\n" +
				"\n" +
				"\n" +
				"\t委托诉讼代理人齐迹，江西天康律师事务所律师。一般代理。\n" +
				"\n" +
				"\n" +
				"\t被告吴兰兵，男，1981年8月1日出生，汉族，江西省湖口县人，户籍所在地为江西省湖口县。现住广东省广州市白云区。\n" +
				"\n" +
				"\n" +
				"\t原告马玉兰与被告吴兰兵民间借贷纠纷一案，本院于2018年9月17日立案，依法适用简易程序于2018年10月23日公开开庭进行了审理。原告马玉兰的委托诉讼代理人齐迹到庭参加诉讼。被告吴兰兵经本院传票传唤无正当理由拒不到庭参加诉讼。本案现已审理终结。\n" +
				"\n" +
				"\n" +
				"\t原告马玉兰向本院提出诉讼请求：1.判令被告归还借款50000元整；2.本案诉讼由被告承担。事实与理由：被告自2017年7月份起因各种原因向原告借款，原告以现金支付及信用卡消费方式向被告交付款项。截止2018年2月20日共计50000元，被告于同日向原告出具欠条：&ldquo;我吴兰兵因自身原因借了马玉兰现金和花的一些共计伍万元整，自今日起2018年2月20日起两个月内还清。借款人吴兰兵，身份证,2018.2.20&rdquo;原告多次向被告催讨未果，为维护自身权益，诉至法院，望判如所请。\n" +
				"\n" +
				"\n" +
				"\t被告吴兰兵经本院依法传唤无正当理由，拒不到庭参加诉讼，视为放弃答辩、举证、质证的权利。\n" +
				"\n" +
				"\n" +
				"\t原告马玉兰向本院提交证据具备真实性、合法性、关联性，故对其证明效力予以确认并在卷佐证。\n" +
				"\n" +
				"\n" +
				"\t根据原告陈述和经审理确认的证据，本院认定事实如下：\n" +
				"\n" +
				"\n" +
				"\t被告自2017年7月份起因各种原因向原告借款，原告以现金支付及信用卡消费方式向被告交付款项。截止2018年2月20日共计50000元，被告于同日向原告出具欠条：&ldquo;我吴兰兵因自身原因借了马玉兰现金和花的一些共计伍万元整，自今日起2018年2月20日起两个月内还清。借款人吴兰兵，身份证,2018.2.20&rdquo;庭审中，原告马玉兰自认被告吴兰兵已归还3000元。\n" +
				"\n" +
				"\n" +
				"\t本院认为，原告提供的欠条、微信截屏等证据证明原、被告之间的民间借贷关系成立。被告吴兰兵未能按期归还借款，原告马玉兰主张被告立即归还借款本金的诉请，本院依法予以支持。据此，依照《中华人民共和国合同法》第一百九十六条、第二百零六条、第二百一十条及《中华人民共和国民事诉讼法》第一百四十四条之规定，判决如下：\n" +
				"\n" +
				"\n" +
				"\t被告吴兰兵于本判决生效之日起三日内一次性归还原告马玉兰借款本金47000元。\n" +
				"\n" +
				"\n" +
				"\t如果未按本判决指定期间履行给付金钱义务，应当依照《中华人民共和国民事诉讼法》第二百五十三条之规定，加倍支付迟延履行期间债务利息。\n" +
				"\n" +
				"\n" +
				"\t本案受理费1050元减半计收取525元，由被告吴兰兵元。\n" +
				"\n" +
				"\n" +
				"\t如不服本判决，可在判决书送达之日起十五日内，向本院递交上诉状，并按对方当事人人数提交副本，上诉于江西省九江市中级人民法院。\n" +
				"\n" +
				"\n" +
				"\t审判员　　吕颖\n" +
				"\n" +
				"\n" +
				"\t二〇一八年十月二十三日\n" +
				"\n" +
				"\n" +
				"\t书记员　　刘盼";

//		String line = get(Fields.In, "fileContent").getString(r);
		boolean bool1 = false;
		boolean bool2 = false;
		line=line.replaceAll("本案受理费","案件受理费");
		line=line.replaceAll("本案诉讼费","案件受理费");
		line=line.replaceAll("本诉诉讼费","案件受理费");
		line=line.replaceAll("案件诉讼费","案件受理费");
		Pattern findMainContent = Pattern.compile("(?<=案件受理费).*(原告|被告).*担.*");
		Pattern mainContent = Pattern.compile("(?<=原告|被告).+(?=本案现已审理终结)");
		Matcher matcher3 = mainContent.matcher(line);
		if (matcher3.find()) {
			String beigaorenyuangao = line.substring(0,line.indexOf(matcher3.group()));
			beigaorenyuangao = beigaorenyuangao.replaceAll("[,，.。 ]","\n");
			beigaorenyuangao = beigaorenyuangao.replaceAll("原告：","原告");
			beigaorenyuangao = beigaorenyuangao.replaceAll("原告:","原告");
			beigaorenyuangao = beigaorenyuangao.replaceAll("被告：","被告");
			beigaorenyuangao = beigaorenyuangao.replaceAll("被告:","被告");
			Pattern findName = Pattern.compile("(?<=被告).+");
			Matcher findNameMatcher = findName.matcher(beigaorenyuangao);

			while (findNameMatcher.find()) {
				String beigao = findNameMatcher.group();

				line = line.replace(beigao,"被告"+beigao).trim();
			}
			Pattern findName1 = Pattern.compile("(?<=原告).+");
			Matcher findNameMatcher1 = findName1.matcher(beigaorenyuangao);

			while (findNameMatcher1.find()) {
				String beigao = findNameMatcher1.group();

				line = line.replace(beigao,"原告"+beigao).trim();

			}
		}


		Matcher matcher2 = findMainContent.matcher(line);
		if(matcher2.find()){
			line = matcher2.group();
			while(line.length()>100&&matcher2.find()){
				line = matcher2.group();
			}
			line = line.replaceAll("[,，.。 ]","\n");
			String patternString = "原告.*担{1}";
			Pattern pattern = Pattern.compile(patternString);
			Matcher matcher = pattern.matcher(line);
			bool1 = matcher.find();
			if(bool1){
//				get(Fields.Out, "caseCondition").setValue(r, 2);
			}

			String patternString1 = "被告.*担{1}";
			Pattern pattern1 = Pattern.compile(patternString1);
			Matcher matcher1 = pattern1.matcher(line);
			bool2 = matcher1.find();
			if(bool2){
//				get(Fields.Out, "caseCondition").setValue(r, 1);
			}
			if(bool2&&bool1){
//				get(Fields.Out, "caseCondition").setValue(r, 3);
			}
		}







	}
}
