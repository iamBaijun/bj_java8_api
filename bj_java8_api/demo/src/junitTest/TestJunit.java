package junitTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import util.properties.PropertiesUtil;

public class TestJunit {
	
	/**   
	 * @Title: test1   
	 * @author:baijun
	 * @Description: ��ȡ�����ļ���Ϣ 
	 * @date:2018��6��19������1:45:20      
	 * void      
	 * @throws   
	 */
	@Test
	public void test1() {
		
		System.out.println(PropertiesUtil.getVal("fileName1"));
	
	}
	/**   
	 * @Title: test2   
	 * @author:baijun
	 * @Description: json    
	 * @date:2018��6��19������4:30:20      
	 * void      
	 * @throws   
	 */
	@Test
	public void test111() {
		String text = "{\"result\":true,\"description\":null,\"errorCode\":null,\"obj\":[{\"ʵ������ʱ��\":\"2017-11-27\",\"������λ\":\"\",\"�����ļ��ĺ�\":\"�����������ã�����[2017]43��\",\"�ƻ�����ʱ��\":\"\",\"������������\":\"���������õ�����������֤\"},{\"ʵ������ʱ��\":\"2017-12-20\",\"������λ\":\"\",\"�����ļ��ĺ�\":\"�����(��ҵ)���ֵ�[2017]4��\",\"�ƻ�����ʱ��\":\"\",\"������������\":\"���̹滮���֤\"},{\"ʵ������ʱ��\":\"2017-11-24\",\"������λ\":\"\",\"�����ļ��ĺ�\":\"�����(��ҵ)���ֵ�[2017]3��\",\"�ƻ�����ʱ��\":\"\",\"������������\":\"�õع滮���֤\"},{\"ʵ������ʱ��\":\"2017-11-23\",\"������λ\":\"\",\"�����ļ��ĺ�\":\"2017-230102-39-03-031525\",\"�ƻ�����ʱ��\":\"\",\"������������\":\"������׼\"}]}";
		JSONObject json = (JSONObject) JSONObject.parse(text);
		//System.out.println(json.getString("obj"));
		//List<Map<String,String>> list = json.getString("obj");
		/*for(Object k : json.keySet()) {
			System.out.println(json.get(k));
		}*/
		//JSONObject json1 = JSONObject.parseObject(json.getString("obj"));
//		JSONArray arrays = JSONArray.parseArray(json.getString("obj"));
//		System.out.println(arrays.get(0));
//		Map map = (Map) arrays.get(0);
//		System.out.println(map.get("������������"));
		JSONArray arrs = com.alibaba.fastjson.JSONArray.parseArray(json.getString("obj"));
		//JSONArray arrs = new JSONArray(json.getString("obj"));
		List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
		for(Object a : arrs) {
			Map map = (Map) a;
			list.add(map);
		}
		System.out.println(list);
		List<Map<Object,Object>> list1 = new ArrayList<Map<Object,Object>>();
		for(Map<Object,Object> m :list) {
			Map<Object,Object> map1 = new HashMap<Object,Object>();
			int count = 1;
			for(Entry<Object,Object> e :m.entrySet()) {
				map1.put("key"+count, e.getKey());
				map1.put("value"+count, e.getValue());
				System.out.println("key"+count+":"+map1.get("key"+count)+"==="+"value"+count+":"+map1.get("value"+count));
				
				count++;
			}
			System.out.println("********************************************************");
			list1.add(map1);
			
		}
		//System.out.println(list1);

//		for(Map<Object,Object> m :list1) {
//			for(Entry<Object,Object> e :m.entrySet()) {
//				System.out.println(e.getKey()+":"+e.getValue());
//			}
//			
//		}

	}

	

}
