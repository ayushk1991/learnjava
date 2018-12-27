package misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Getpropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties obj=new Properties();
		FileInputStream fileobj=new FileInputStream("D:\\workspace\\learnjava\\testdata.properties");
		obj.load(fileobj);
		System.out.println(obj.getProperty("username"));
		System.out.println(obj.getProperty("password"));	
	}

}
