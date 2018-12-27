package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filelocation=System.getProperty("user.dir")+"\\data.xlsx";
		System.out.println(filelocation);
		
		File xlfile=new File(filelocation);
		FileInputStream filein=new FileInputStream(xlfile);
		
		Workbook wb= new XSSFWorkbook(filein);
		
		Sheet xlsheet= wb.getSheet("Sheet1");

	}

}
