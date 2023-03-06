package Exercise8;
import java.sql.*;
class MakeConnection3{
	Connection connection;
	Statement statement;
	ResultSet resultset;
	MakeConnection3() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost/sample\",\"root\",\"root@nu2");
			statement=connection.createStatement();
			int insert1=statement.executeUpdate("insert into John values(001,'Tom',23)");
			int insert2=statement.executeUpdate("insert into John values(002,'Lucy',24)");
			int insert3=statement.executeUpdate("insert into John values(003,'Sebastian',25)");
			resultset=statement.executeQuery("select * from John");
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getInt(3));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class TestConnection3 {
	public static void main(String[] args) {
		new MakeConnection3();
	}
}
