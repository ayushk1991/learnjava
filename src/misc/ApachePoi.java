package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		filein();
		Thread.sleep(2000);
		
	}
	
	public static void filein() throws IOException
	{
		
		String filelocation=System.getProperty("user.dir")+"\\data.xlsx";
		System.out.println(filelocation);
		
		File xlfile=new File(filelocation);
		FileInputStream filein=new FileInputStream(xlfile);
		
		Workbook wb= new XSSFWorkbook(filein);
		
		Sheet xlsheet= wb.getSheet("Sheet1");
		Row xlrow=xlsheet.getRow(0);
		System.out.println(xlrow.getCell(0).getStringCellValue());
		
		filein.close();		
	}
	
	public static void fileout() throws IOException
	{
		
		String filelocation=System.getProperty("user.dir")+"\\data.xlsx";
		System.out.println(filelocation);
		
		File xlfile=new File(filelocation);
		FileOutputStream fileout=new FileOutputStream(xlfile);
		//FileInputStream filein=new FileInputStream(xlfile);
		
		Workbook wb= new XSSFWorkbook(filein);
		
		Sheet xlsheet= wb.getSheet("Sheet1");
		Row xlrow=xlsheet.getRow(0);
		System.out.println(xlrow.getCell(0).getStringCellValue());
		
		filein.close();		
	}

}
