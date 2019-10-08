package jdbcProgrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class DriverLoad {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from drive");
			ResultSetMetaData rsd=(ResultSetMetaData) rs.getMetaData();
			for(int i=1;i<=rsd.getColumnCount();i++) {
				System.out.println(rsd.getColumnName(i)+" "+rsd.getColumnTypeName(i));
			}
			
		
		
			
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+" "+rs.getString(4));
			con.close();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
