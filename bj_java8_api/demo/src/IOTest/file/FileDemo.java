package IOTest.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

import util.properties.PropertiesUtil;

public class FileDemo {

	private String path = PropertiesUtil.getVal("path");
	private String fileName = PropertiesUtil.getVal("fileName");
	
	public FileDemo() {}
	public FileDemo(String path,String fileName) {
		
		if (StringUtils.isNotEmpty(path)) {
			this.path = path;
		}
		if (StringUtils.isNotEmpty(fileName)) {
			this.fileName = fileName;
		}
	}
	// ����һ���ļ�
	public boolean createFile() {

		File file = new File(this.path);

		if (!file.exists()) {
			file.mkdirs();
		}
		File file1 = new File(file, this.fileName);
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
		} else {
			return false;
		}

		return true;

	}
	//ɾ���ļ�
	public boolean deleteFile() {		
		File file = new File(path,fileName);
		if(file.exists()) {
			file.delete();
			return true;
		}else {
			try {		
				throw new Exception("ɾ��ʧ�ܣ��ļ��Ѿ�������");
			} catch (java.lang.Exception e) {
				
				e.printStackTrace();
			}
		}
		return false;
		
	}

}
