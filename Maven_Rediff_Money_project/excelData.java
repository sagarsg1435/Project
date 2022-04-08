package rediffTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excelData {

	public static String[] data = new String[5];

	public static String[] readXL1() throws IOException {
		File file = new File("C:\\Java Program\\Rediff_Money_Project\\Maven\\MoneyRediff_sheet.xls");
		FileInputStream inputStream = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = wb.getSheet("sheet");
		HSSFRow row1 = sheet.getRow(1);

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println(rowCount);

		for (int i = 0; i <= rowCount; i++) {

			int cellcount = sheet.getRow(i).getLastCellNum();
			System.out.println(cellcount);

			System.out.println("Row " + i + " data is ");

			for (int j = 0; j < cellcount; j++) {
				data[i] = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + ".");

			}
			System.out.println();

		}
		for (int i = 1; i < data.length; i++)
			System.out.println("Search Element is " + data[i]);
		return data;

	}

	public static void main(String[] args) throws IOException {
		String[] terms = readXL1();
		System.out.println();
	}

}