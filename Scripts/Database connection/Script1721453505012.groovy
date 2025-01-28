import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import internal.GlobalVariable

import com.opencsv.CSVWriter

import groovy.sql.DataSet

import java.io.File
import java.io.FileWriter

// Database connection parameters
String url = 'jdbc:mysql://172.24.2.216:51759/UnifiedDB'
String user = 'jatin.pandey'
String password = '3D82VLmkktCP'

// Initialize an empty list to store data
//List<String> productCodeList = new ArrayList<String>()

// Load JDBC driver
Class.forName('com.mysql.cj.jdbc.Driver')
Connection connection = DriverManager.getConnection(url, user, password)

// Execute a query
 			String query = "SELECT * FROM tbl_InvoiceLine ORDER BY ID DESC LIMIT 1";
		//	String query ="SELECT * FROM tbl_Product where id";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

			
			String CSV_productscanresult = "C:\\Users\\Lenovo\\Katalon Studio\\Unified Testing\\CSVproductscanresult.csv"
			CSVWriter writer = new CSVWriter(new FileWriter(CSV_productscanresult))
//			writer.writeNext(["While doing bill save, we compare the Expected Result from UI with the Actual Result from DB."])
//			writer.writeNext(["NetAmount from UI", "NetAmount from DB", "Result"])
  
//		writer.writeNext(["While doing bill save, we compare the Expected Result from UI with the Actual Result from DB."])
//		writer.writeNext(["NetAmount from UI", "NetAmount from DB", "Result"])
//		writer.writeNext(new String[] { "While doing bill save,we compare the Expected Result from UI with  the Actual Result from DB." })
//		writer.writeNext(new String[] { "NetAmount from UI", "NetAmount from DB", "Result" })
                String actualData = rs.getString("LineNetAmt")
				String expectedData = GlobalVariable.extractedText
				TestData testData =  
				println(testData)
			//	println(expectedData)
				
          
rs.close()
stmt.close()
connection.close()


