package Exercise8;
import java.sql.*;
class MakeConnection1{
	Connection connection;
	Statement statement;
	ResultSet resultset;
	MakeConnection1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost/sample","root","root@nu2");
			statement=connection.createStatement();
			int create=statement.executeUpdate("create table John(empno int, empname varchar(20), deptno int)");
			System.out.println("Table created successfully...");
		}catch(Exception e) {
			System.out.println("Table already exists...");
		}
	}
}
public class TestConnection1 {
	public static void main(String[] args) {
		new MakeConnection1();
	}
}
