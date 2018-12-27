package misc;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Getxmlfile {

	public static void main(String[] args) throws DocumentException {
		// TODO Auto-generated method stub
		
		File inputxml= new File(System.getProperty("user.dir")+"\\testdata.xml");
		SAXReader xmlreader=new SAXReader();
		Document xmldoc=xmlreader.read(inputxml);
		
		System.out.println(xmldoc.selectSingleNode("//menu/username").getText());
		System.out.println(xmldoc.selectSingleNode("//menu/password").getText());
		
	}

}
