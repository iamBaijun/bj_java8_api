package poi;

import java.io.File;
import java.io.FileOutputStream;

import java.io.OutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**   
 * @ClassName:  CreateWord   
 * @Description: 
 * @author: baijun 
 * @date:   2018年6月19日 上午10:50:37   
 *     
 * @Copyright: 2018  
 */  
public class CreateWord {
	
	public static boolean createWord() {
		String path  = "F:"+File.separator+"poidemo";
		String fileName = "demo1.docx";
		File file = new File(path,fileName);
		try {
		if(!file.exists()) {
			new File(path).mkdirs();
			file.createNewFile();
		}else {
			fileName = file.getName().split("\\.")[0]+System.currentTimeMillis()+"."+file.getName().split("\\.")[1];
			file = new File(path,fileName);
		}
		
			@SuppressWarnings("resource")
			XWPFDocument xdocument = new XWPFDocument();
			OutputStream stream = new FileOutputStream(file);
			xdocument.write(stream);
			stream.close();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
