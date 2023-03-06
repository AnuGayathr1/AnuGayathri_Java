package Exercise8;

import java.sql.*;

class MakeConnection{
	Connection connection;
	Statement statement;
	ResultSet resultset;
	MakeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost/sample","root","root@nu2");
			statement=connection.createStatement();
			resultset=statement.executeQuery("select * from employee");
			while(resultset.next()) {
				System.out.println(resultset.getString(1)+" "+resultset.getString(2)+" "+resultset.getString(3));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class TestConnection {
	public static void main(String[] args) {
		new MakeConnection();
	}
}
