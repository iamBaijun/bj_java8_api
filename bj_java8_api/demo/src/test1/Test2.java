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
		// Array("��֤ͨ��!","���֤����λ������!","���֤����������ڳ�����Χ���зǷ��ַ�!","���֤����У�����!","���֤�����Ƿ�!");
		Boolean[] Errors = new Boolean[10];
		Errors[0] = true;
		Errors[1] = false;
		Errors[2] = false;
		Errors[3] = false;
		Errors[4] = false;
		String[] area = new String[100];
		area[11] = "����";
		area[12] = "���";
		area[13] = "�ӱ�";
		area[14] = "ɽ��";
		area[15] = "���ɹ�";
		area[21] = "����";
		area[22] = "����";
		area[23] = "������";
		area[31] = "�Ϻ�";
		area[32] = "����";
		area[33] = "�㽭";
		area[34] = "����";
		area[35] = "����";
		area[36] = "����";
		area[37] = "ɽ��";
		area[41] = "����";
		area[42] = "����";
		area[43] = "����";
		area[44] = "�㶫";
		area[45] = "����";
		area[46] = "����";
		area[50] = "����";
		area[51] = "�Ĵ�";
		area[52] = "����";
		area[53] = "����";
		area[54] = "����";
		area[61] = "����";
		area[62] = "����";
		area[63] = "�ຣ";
		area[64] = "����";
		area[65] = "�½�";
		area[71] = "̨��";
		area[81] = "���";
		area[82] = "����";
		area[91] = "����";
		int Y;
		String JYM;
		int S;
		String M;
		String[] idcard_array = new String[0];
		idcard_array = idcard.split("");
		// ��������
		if (area[Integer.parseInt(idcard.substring(0, 2))] == null) {
			return Errors[4];
		}
		// ��ݺ���λ������ʽ����
		if (idcard.length() == 15) {
			if ((Integer.parseInt(idcard.substring(6, 8)) + 1900) % 4 == 0
					|| ((Integer.parseInt(idcard.substring(6, 8)) + 1900) % 100 == 0
							&& (Integer.parseInt(idcard.substring(6, 8)) + 1900) % 4 == 0)) {
				ereg = "^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}$";// ���Գ������ڵĺϷ���
			} else {
				ereg = "^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}$";// ���Գ������ڵĺϷ���
			}
			if (idcard.matches(ereg))
				return Errors[0];
			else
				return Errors[2];
		}else

		if (idcard.length() == 18) {
			// 18 λ��ݺ�����
			// �������ڵĺϷ��Լ��
			// ��������:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))
			// ƽ������:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))
			if (Integer.parseInt(idcard.substring(6, 10)) % 4 == 0
					|| (Integer.parseInt(idcard.substring(6, 10)) % 100 == 0
							&& Integer.parseInt(idcard.substring(6, 10)) % 4 == 0)) {
				ereg = "^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}[0-9Xx]$";// ����������ڵĺϷ���������ʽ
			} else {
				ereg = "^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}[0-9Xx]$";// ƽ��������ڵĺϷ���������ʽ
			}
			if (idcard.matches(ereg)) {// ���Գ������ڵĺϷ���
				// ����У��λ
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
				M = JYM.substring(Y, Y+1);// �ж�У��λ
				if (M.equals(idcard_array[17]))
					return Errors[0]; // ���ID��У��λ
				else
					return Errors[3];
			} else
				return Errors[2];
		}else {
			return false;
		}
		
	}

}
