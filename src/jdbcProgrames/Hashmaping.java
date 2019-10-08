package jdbcProgrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmaping {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav","root","root");
			Statement statement = con.createStatement();
			ResultSet rs= statement.executeQuery("Select name,salary From drive");
			Map m=new HashMap<>();
			while(rs.next()) {
				m.put(rs.getString(1), rs.getInt(2));
			}
			System.out.println(m);
			Set set = m.entrySet();
			Iterator itr = set.iterator();
			while(itr.hasNext()) {
				//System.out.println(itr.next());
				Map.Entry m2=(Map.Entry) itr.next();
				System.out.println(m2.getKey()+"  "+m2.getValue());
			}
			con.close();
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());

		}

	}

}
