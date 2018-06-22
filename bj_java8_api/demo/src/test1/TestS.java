package test1;

import java.util.HashMap;
import java.util.Map;

public class TestS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String check(String idCard) {
		String str = "";
		//地区
		int dq = Integer.parseInt(idCard.substring(0, 2));
		if(dq<11||dq>91) {
			return "地区不符合规范";
		}
		//长度
		if(idCard.length()==15&&(Integer.parseInt((idCard.substring(6,2))+1900) % 4 == 0 || (Integer.parseInt(idCard.substring(6,2))+1900) % 100 == 0 && (Integer.parseInt(idCard.substring(6,2))+1900) % 4 == 0)) {
			
			String ereg15 = "^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}$";
			
			
		}
		
		
		
		
		
		
		return str;
		
	}

}
