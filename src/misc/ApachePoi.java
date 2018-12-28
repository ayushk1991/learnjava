package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		fileinto();
		Thread.sleep(2000);
		fileout();
		
	}
	
	public static void fileinto() throws IOException
	{
		
		String filelocation=System.getProperty("user.dir")+"\\data.xlsx";
		System.out.println(filelocation);
		
		File xlfile=new File(filelocation);
		FileInputStream filein=new FileInputStream(xlfile);
		
		Workbook wb= new XSSFWorkbook(filein);
		
		Sheet xlsheet= wb.getSheet("Sheet1");
		int rowcount=xlsheet.getLastRowNum()-xlsheet.getFirstRowNum();
		System.out.println(rowcount+"count");
		Row xlrow=xlsheet.getRow(0);
		System.out.println(xlrow.getCell(0).getStringCellValue());
		
		filein.close();		
	}
	
	public static void fileout() throws IOException, InterruptedException
	{
		
		String filelocation=System.getProperty("user.dir")+"\\data.xlsx";
		System.out.println(filelocation);
		
		File xlfile=new File(filelocation);
		
		FileInputStream filein=new FileInputStream(xlfile);
		
		Workbook wb= new XSSFWorkbook(filein);
		
		Sheet xlsheet= wb.getSheet("Sheet1");
		int rowcount=xlsheet.getLastRowNum()-xlsheet.getFirstRowNum();
		System.out.println(rowcount+"count");
		Row xlrow=xlsheet.createRow(rowcount+1);
		Cell newcell=xlrow.createCell(0);
		newcell.setCellValue("Ayush Kumar");
		//System.out.println(xlrow.getCell(0).getStringCellValue());
		filein.close();		
		Thread.sleep(2000);
		FileOutputStream fileout=new FileOutputStream(xlfile);
		wb.write(fileout);		
		
	}

}
