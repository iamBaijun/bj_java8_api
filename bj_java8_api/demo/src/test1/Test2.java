package test1;

public class Test2 {

	public static void main(String[] args) {
		String idcard = "370983199006073230";
		// System.out.println(idcard.substring(6, 8));
		/*
		 * if((Integer.parseInt(idcard.substring(6,2))+1900) % 4 == 0 ||
		 * ((Integer.parseInt(idcard.substring(6,2))+1900) % 100 == 0 &&
		 * (Integer.parseInt(idcard.substring(6,2))+1900) % 4 == 0 )) {
		 * System.out.println(1); }
		 */

		System.out.println(ceshi(idcard));
	}

	private static Boolean ceshi(String idcard) {

		String ereg = "";
		// String[] Errors=new
		// Array("验证通过!","身份证号码位数不对!","身份证号码出生日期超出范围或含有非法字符!","身份证号码校验错误!","身份证地区非法!");
		Boolean[] Errors = new Boolean[10];
		Errors[0] = true;
		Errors[1] = false;
		Errors[2] = false;
		Errors[3] = false;
		Errors[4] = false;
		String[] area = new String[100];
		area[11] = "北京";
		area[12] = "天津";
		area[13] = "河北";
		area[14] = "山西";
		area[15] = "内蒙古";
		area[21] = "辽宁";
		area[22] = "吉林";
		area[23] = "黑龙江";
		area[31] = "上海";
		area[32] = "江苏";
		area[33] = "浙江";
		area[34] = "安徽";
		area[35] = "福建";
		area[36] = "江西";
		area[37] = "山东";
		area[41] = "河南";
		area[42] = "湖北";
		area[43] = "湖南";
		area[44] = "广东";
		area[45] = "广西";
		area[46] = "海南";
		area[50] = "重庆";
		area[51] = "四川";
		area[52] = "贵州";
		area[53] = "云南";
		area[54] = "西藏";
		area[61] = "陕西";
		area[62] = "甘肃";
		area[63] = "青海";
		area[64] = "宁夏";
		area[65] = "新疆";
		area[71] = "台湾";
		area[81] = "香港";
		area[82] = "澳门";
		area[91] = "国外";
		int Y;
		String JYM;
		int S;
		String M;
		String[] idcard_array = new String[0];
		idcard_array = idcard.split("");
		// 地区检验
		if (area[Integer.parseInt(idcard.substring(0, 2))] == null) {
			return Errors[4];
		}
		// 身份号码位数及格式检验
		if (idcard.length() == 15) {
			if ((Integer.parseInt(idcard.substring(6, 8)) + 1900) % 4 == 0
					|| ((Integer.parseInt(idcard.substring(6, 8)) + 1900) % 100 == 0
							&& (Integer.parseInt(idcard.substring(6, 8)) + 1900) % 4 == 0)) {
				ereg = "^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}$";// 测试出生日期的合法性
			} else {
				ereg = "^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}$";// 测试出生日期的合法性
			}
			if (idcard.matches(ereg))
				return Errors[0];
			else
				return Errors[2];
		}else

		if (idcard.length() == 18) {
			// 18 位身份号码检测
			// 出生日期的合法性检查
			// 闰年月日:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))
			// 平年月日:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))
			if (Integer.parseInt(idcard.substring(6, 10)) % 4 == 0
					|| (Integer.parseInt(idcard.substring(6, 10)) % 100 == 0
							&& Integer.parseInt(idcard.substring(6, 10)) % 4 == 0)) {
				ereg = "^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}[0-9Xx]$";// 闰年出生日期的合法性正则表达式
			} else {
				ereg = "^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}[0-9Xx]$";// 平年出生日期的合法性正则表达式
			}
			if (idcard.matches(ereg)) {// 测试出生日期的合法性
				// 计算校验位
				S = (Integer.parseInt(idcard_array[0]) + Integer.parseInt(idcard_array[10])) * 7
						+ (Integer.parseInt(idcard_array[1]) + Integer.parseInt(idcard_array[11])) * 9
						+ (Integer.parseInt(idcard_array[2]) + Integer.parseInt(idcard_array[12])) * 10
						+ (Integer.parseInt(idcard_array[3]) + Integer.parseInt(idcard_array[13])) * 5
						+ (Integer.parseInt(idcard_array[4]) + Integer.parseInt(idcard_array[14])) * 8
						+ (Integer.parseInt(idcard_array[5]) + Integer.parseInt(idcard_array[15])) * 4
						+ (Integer.parseInt(idcard_array[6]) + Integer.parseInt(idcard_array[16])) * 2
						+ Integer.parseInt(idcard_array[7]) * 1 + Integer.parseInt(idcard_array[8]) * 6
						+ Integer.parseInt(idcard_array[9]) * 3;
				Y = S % 11;
				M = "F";
				JYM = "10X98765432";
				M = JYM.substring(Y, Y+1);// 判断校验位
				if (M.equals(idcard_array[17]))
					return Errors[0]; // 检测ID的校验位
				else
					return Errors[3];
			} else
				return Errors[2];
		}else {
			return false;
		}
		
	}

}
