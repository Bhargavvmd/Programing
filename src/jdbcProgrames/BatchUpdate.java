package jdbcProgrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav","root","root");
		String sql="insert into drive(id,name,salary,l_name) values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<3;i++) {
			int id=scan.nextInt();
			ps.setInt(1, id);
			String name=scan.next();
			ps.setString(2, name);
			int salary=scan.nextInt();
			ps.setInt(3, salary);
			String l_name=scan.next();
			ps.setString(4,l_name);
			ps.addBatch();
		}
		System.out.println(ps.executeBatch());
	}

}
