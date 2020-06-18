package com.yuntu.basis_learn.pattern;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator
 */
public class TestRE {
	public static final String line = "黄春秀、陈桥华等与郑步等机动车交通事故责任纠纷一审民事判决书\n" +
			"江西省定南县人民法院\n" +
			"民 事 判 决 书\n" +
			"（2018）赣0728民初1608号\n" +
			"原告：黄春秀，女，1961年4月3日生，汉族，住江西省定南县，系受害人陈家添妻子。\n" +
			"原告:陈桥华,男，1983年9月28日生，汉族，住江西省定南县，系受害人陈家添长子。\n" +
			"原告：陈荣贵，男，1987年7月12日生，汉族，住江西省定南县，系受害人陈家添次子。\n" +
			"三原告共同委托诉讼代理人:叶频耀，男，定南县正泰法律服务所法律工作者，特别授权。\n" +
			"被告：郑步，男，1991年10月5日生，汉族，住江西省定南县，系赣Ｂ×××××小型轿车驾驶人。\n" +
			"被告：柳金容，女，1973年10月25日生，汉族，住江西省定南县，系赣Ｂ×××××小型轿车车主。\n" +
			"被告：中国平安财产保险股份有限公司东莞分公司，住所地：东莞市南城街道三元路2号粤丰大厦办公2001.2101号。\n" +
			"负责人：陈青松，公司经理。\n" +
			"委托诉讼代理人：张华宝，男，江西英华律师事务所专职律师，一般代理。\n" +
			"委托诉讼代理人：施丽，女，江西英华律师事务所专职律师，一般代理。\n" +
			"原告黄春秀、陈桥华、陈荣贵与被告郑步、柳金容、中国平安财产保险股份有限公司东莞分公司（以下简称平安财保东莞分公司）机动车交通事故责任纠纷一案，本院立案受理后依法适用简易程序进行了公开开庭审理。原告陈桥华及三原告的委托诉讼代理人叶频耀、被告郑步、被告柳金容及被告平安财保东莞分公司的委托诉讼代理人施丽到庭参加诉讼。本案现已审理终结。\n" +
			"原告黄春秀、陈桥华、陈荣贵向本院提起诉讼请求：1、判令被告赔偿原告各项费用共计707693.80元；2、诉讼费由被告承担。事实与理由：2018年5月24日7时30分许，原告黄春秀的丈夫、原告陈桥华、陈荣贵的父亲陈家添在定南县城广州大道打扫卫生时，被被告郑步驾驶的柳金容所有的赣Ｂ×××××小轿车撞倒，送医院救治无效死亡，被告郑步对事故承担全部责任。涉事车辆在平安财保东莞分公司投保了交强险和第三者责任商业保险。事故发生后被告至今没有向原告赔偿陈家添死亡的损失。现原告向法院起诉，请依法裁判。\n" +
			"被告郑步、柳金容辩称，受害人陈家添在医院抢救的所有医疗费用被告支付了2000元，被告还支付了10000元的丧葬费。\n" +
			"被告天安财保赣州支公司辩称：1、被告承保的与本案有关的险种为交强险和商业第三者责任保险（限额为30万，投保了不计免赔）；2、被告人陈家添的户籍地为农村，应按江西省的农村标准计算各项赔偿费用；3、根据定南县人民检察院起诉状，驾驶员郑步酒精检查结果为18.63mg/100ml，属于酒后驾驶，答辩人不承担第三者责任保险的保险责任，交强险赔偿后，有权向侵权人追偿；4、本案驾驶员郑步涉嫌犯罪，依法不赔偿精神损害抚慰金；5、原告主张的部分赔偿项目费用过高；6、答辩人不承担本案诉讼费用。\n" +
			"经审理查明的事实认定如下：2018年5月24日7时30分许，被告郑步驾驶赣Ｂ×××××小型轿车沿定南县历市镇广州大道由北往南方向行驶，当行驶至广州大道北第一人民医院路段时，与前方公路行人原告黄春秀的丈夫、原告陈桥华、陈荣贵的父亲陈家添发生碰撞，造成赣Ｂ×××××小型轿车受损、陈家添受伤后经医院抢救无效死亡的交通事故。该事故经定南县公安局交通管理大队认定：被告郑步驾驶机动车行驶至事发路段时，未注意观察路面情况按照操作规范确保安全驾驶，是造成此次交通事故发生的根本原因，应负事故全部责任；受害人陈家添没有与此次交通事故发生存在因果关系的过错行为，在此次事故中无责任。陈家添受伤后经医院抢救无效死亡，抢救费用已由被告郑步支付2000元，被告已支付原告丧葬费用10000元。被告郑步因涉嫌交通肇事罪已被我院判处有期徒刑一年二个月。\n" +
			"另查明，事发当日赣Ｂ×××××小型轿车驾驶人系被告郑步，车辆登记所有人系被告柳金容。本次交通事故发生时已向被告平安财保东莞分公司投保了机动车交强险和商业第三者险30万（含不计免赔），事故发生在保险期间。\n" +
			"明，受害人陈家添系农业家庭户口，其2015年10月5日至2016年2月12日在定南县环卫所从事保洁员工作，后在定南玉禾田环境发展有限公司从事保洁员工作，并于2017年12月参保了定南县城镇职工医疗保险。江西省上一年度人均可支配收入为31198元／年，江西省上一年度在岗职工年平均工资为57470元。\n" +
			"上述事实有原告向法庭提交的交通事故认定书、死亡医学证明书、驾驶证、行驶证、保险单、劳务合同、定南县城市管理局证明、城镇职工医疗保险证、定南玉禾田环境发展有限公司住宿证明、户口本等证据，业经庭审质证和认证，与待证事实相关联，本院予以采信和认定。\n" +
			"本院认为，本案中发生的交通事故，被告郑步驾驶机动车行驶至事发路段时，未注意观察路面情况按照操作规范确保安全驾驶，造成受害人陈家添受伤后救治无效死亡，交警部门依据道路交通安全法律法规作出由被告郑步负事故全部责任，陈家添无责任的责任事故认定于法有据，本院予以采信。因被告郑步驾驶的赣Ｂ×××××小型轿车已向被告平安财保东莞分公司投保了机动车交强险，事故发生在保险期间，对造成原告的损害费用首先应由被告平安财保东莞分公司在机动车交强险责任限额范围内予以赔偿；超出部分按照责任比例（100%）由被告郑步承担全部赔偿责任，其承担部分由被告平安财保东莞分公司在承保的商业第三者险中赔付，不足部分由被告郑步承担。被告柳金容将赣Ｂ×××××车辆交由被告郑步驾驶已尽审查义务，被告柳金容不承担民事赔偿责任。被告平安财保东莞分公司辩称被告郑步系酒后驾驶机动车，保险公司不承担商业第三者责任保险的保险责任，经法院刑事部分审理查明被告郑步酒精含量未到达到酒后驾驶情节，故对被告该辩称不予采纳。原告的损害费用经核算：抢救费用2000元，被告郑步提供了医疗费票据；死亡赔偿金，根据受害人陈家添年龄60周岁计算即623960元（20年×31198元/年），原告提供了城镇务工证明予以支持；丧葬费，参照江西省上一年度在岗职工年平均工资为57470元计算6个月即28735元；精神抚慰金，被告郑步已被刑事处罚，该请求不予支持；办理后事误工费，不符合法律规定，不予支持。\n" +
			"为维护当事人的合法权益，依照《中华人民共和国侵权责任法》第六条、第十六条，《中华人民共和国道路交通安全法》第七十六条，《最高人民法院关于审理人身损害赔偿案件适用法律问题若干问题的解释》第二十七条、第二十九条；《中华人民共和国保险法》第六十五条、第六十六条、《中华人民共和国民事诉讼法》第六十四条第一款判决如下：\n" +
			"一、原告黄春秀、陈桥华、陈荣贵的损失：抢救费用2000元、死亡赔偿金623960元、丧葬费28735元，总计654695元由被告平安财产保险股份有限公司东莞分公司在机动车交强险和商业第三者险责任限额范围内赔付412000元；超出部分242695元由被告郑步承担。于本判决生效后十日内付清。\n" +
			"二、驳回原告黄春秀、陈桥华、陈荣贵的其他诉讼请求。\n" +
			"如果未按本判决指定的期间履行给付金钱义务，应当依照《中华人民共和国民事诉讼法》第二百五十三条之规定，加倍支付迟延履行期间的债务利息。\n" +
			"案件受理费10876元，减半收取5438元由被告郑步承担。\n" +
			"如不服本判决，可在判决书送达之日起十五日内，向本院递交上诉状，并按对方当事人的人数提出副本，同时预交上诉费，上诉于江西省赣州市中级人民法院。\n" +
			"审判员　　郭贤安\n" +
			"二〇一八年九月八日\n" +
			"书记员　　胡永峰";
	
	@Test
	public void yiliaofei() {
		double swpcj = 0;
		double szf = 0;
		double yiliaoPrice = 0;
		double jsfwj = 0;
		int jslcmIndex = line.indexOf("经审理查明");
		if (jslcmIndex == -1) {
			jslcmIndex = line.indexOf("经审理认定");
		}
		int byrwIndex = line.indexOf("本院认为，");
		int pjrxIndex = line.indexOf("判决如下");
		if (jslcmIndex > 1 && byrwIndex > 1 && pjrxIndex > 1) {
			// 审理查明
			String slcm = line.substring(jslcmIndex, byrwIndex);
			yiliaoPrice = getYLFBySLCM(slcm);
			// 本院认为
			String byrw = line.substring(byrwIndex,pjrxIndex);
			double swpcjByByrw = getSWPCJByByrw(byrw);
			swpcj=getSWPCJByByrw(byrw);
			szf=getSZFByByrw(byrw);
			// 判决内容
			String pjnr = line.substring(pjrxIndex);
			System.out.println(pjnr);
			double cjpcj = getCJPCJ(pjnr);
			if (pjnr.matches("[\\s\\S]*医疗费\\d*\\.?\\d*元[\\s\\S]*")) {
				yiliaoPrice = getYLFByPJNR(pjnr);
			}
			if(pjnr.matches("[\\s\\S]*死亡赔偿金\\d*\\.?\\d*元[\\s\\S]*")){
					swpcj=getSWPCJByPjnr(pjnr);
			}
			if(pjnr.matches("[\\s\\S]*丧葬费\\d*\\.?\\d*元[\\s\\S]*")){
					szf=getSZFByPjnr(pjnr);
				System.out.println(szf);
			}
		}
		Pattern compile = Pattern.compile("精神抚慰金(\\d*\\.?\\d*)元");
		Matcher matcher = compile.matcher(line);
		if(matcher.find()){
			String group = matcher.group(1);
			jsfwj = Double.parseDouble(group);
		}

		System.out.println("死亡赔偿金"+swpcj);
		System.out.println("丧葬费"+szf);
		DecimalFormat df = new DecimalFormat("#.00");
		String format = df.format(yiliaoPrice);
	}
	public double getSWPCJByPjnr(String pjnr){
		double price = 0;
		Pattern compile = Pattern.compile("死亡赔偿金(\\d*\\.?\\d*)元");
		Matcher matcher = compile.matcher(pjnr);
		if (matcher.find()&&matcher.group(1).length()>0) {
			String group = matcher.group(1);
			price = Double.parseDouble(group);
		}
		return price;
	}
	public double getSWPCJByByrw(String byrw){
		double price = 0;
		Pattern compile = Pattern.compile("死亡赔偿金(\\d*\\.?\\d*)元");
		Matcher matcher = compile.matcher(byrw);
		if(matcher.find()&&matcher.group(1).length()>0){
			price = Double.parseDouble(matcher.group(1));
		}
		return price;
	}
	public double getSZFByPjnr(String pjnr){
		double price = 0;
		Pattern compile = Pattern.compile("丧葬费(\\d*\\.?\\d*)元");
		Matcher matcher = compile.matcher(pjnr);
		if (matcher.find()&&matcher.group(1).length()>0) {
			String group = matcher.group(1);
			price = Double.parseDouble(group);
		}
		return price;
	}
	public double getSZFByByrw(String byrw){
		double price = 0;
		Pattern compile = Pattern.compile("丧葬费(\\d*\\.?\\d*)元");
		Matcher matcher = compile.matcher(byrw);
		if(matcher.find()&&matcher.group(1).length()>0){
			price = Double.parseDouble(matcher.group(1));
		}
		return price;
	}
	private double getCJPCJ(String pjnr){
		double  cjpcj = 0;
		Pattern compile = Pattern.compile("残疾赔偿金(\\d*\\.?\\d*)元");
		Matcher matcher = compile.matcher(pjnr);
		if (matcher.find()) {
			String group = matcher.group(1);
			cjpcj=Double.parseDouble(group);
		}
		return cjpcj;
	}
	private double getYLFByPJNR(String pjnr) {
		double yiliaoPrice = 0;
		Pattern pattern1 = Pattern.compile("医疗费(\\d*\\.?\\d*)元");
		Matcher matcher1 = pattern1.matcher(pjnr);
		if(matcher1.find()&&matcher1.group(1).length()>0){
			String group = matcher1.group(1);
			yiliaoPrice = Double.parseDouble(group);
		}
		return yiliaoPrice;
	}
	private double getYLFBySLCM(String slcm) {
		Set set = new HashSet();
		double yiliaoPrice = 0;
		Pattern pattern = Pattern.compile("医疗费(\\d*\\.?\\d*)元");
		Matcher matcher = pattern.matcher(slcm);
		while (matcher.find() && matcher.group(1).length() > 0) {
			String group = matcher.group(1);
			set.add(Double.parseDouble(group));
			System.out.println(matcher.group());
		}
		matcher.usePattern(Pattern.compile("(?<![含])门诊费[\\u4e00-\\u9fa5]*(\\d*.?\\d*)元"));
		while (matcher.find() && matcher.group(1).length() > 0) {
			String group = matcher.group(1);
			set.add(Double.parseDouble(group));
		}
		Object[] o = set.toArray();
		for( int i = 0;i<o.length;i++){
			yiliaoPrice+=Double.parseDouble(o[i].toString());
		}
		return yiliaoPrice;
	}
}




