package Exercise8;

import java.sql.*;

class MakeConnection{
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	MakeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost/sample","root","root@nu2");
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select * from employee");
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
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
