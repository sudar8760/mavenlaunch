package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel extends baseClass{
public static void main(String[] args) throws IOException {
	baseClass b = new baseClass();
	File file = new File("C:\\mavenlaunch\\Excel\\Book1.xlsx");
	
	FileInputStream Stream = new FileInputStream(file);
	Workbook w = new XSSFWorkbook(Stream);
	Sheet S = w.getSheet("Sheet1");
	Row r = S.getRow(3);
	Cell c = r.getCell(1);
	System.out.println(c);
	int count = r.getPhysicalNumberOfCells();
	System.out.println("no of coloumn "+count);
    System.out.println("number of rows "+S.getPhysicalNumberOfRows());
    for (int i = 0; i <S.getPhysicalNumberOfRows(); i++) {
    	Row r1 = S.getRow(i);
    	for (int j = 0; j < count ; j++) {
			Cell c1=r1.getCell(j);
			System.out.println(c1);
			
		}}
    	b.StringType("C:\\mavenlaunch\\Excel\\Book1.xlsx", "Sheet1",1, 2);
    	c.setCellValue("Sudarvannan");
    	FileOutputStream out = new FileOutputStream(file);
    	w.write(out);
    	System.out.println("Done");
    	
	}
	
	
	
	
}

