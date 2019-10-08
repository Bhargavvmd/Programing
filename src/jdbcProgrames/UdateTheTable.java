package jdbcProgrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UdateTheTable {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav","root","root");
			String sqlUdate="UPDATE drive SET name=? WHERE id=?";
			PreparedStatement prepareStatement = con.prepareStatement(sqlUdate);
			String name="akka";
			int id=5;
			prepareStatement.setString(1, name);
			prepareStatement.setInt(2, id);
			prepareStatement.executeUpdate();
        
            name="papa";
            id=3;
            prepareStatement.setString(1, name);
            prepareStatement.setInt(2, id);
            prepareStatement.executeUpdate();
         System.out.println("done");

		con.close();
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());

		}

	}
}