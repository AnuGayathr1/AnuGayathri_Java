package Exercise8;

import java.sql.*;

public class TransactionPairs {
	public static void main(String[] args) {
		//String url = "jdbc:mySubprotocol:myDataSource";
		Connection con = null;
		Statement stmt;
		PreparedStatement updateSales;
		PreparedStatement updateTotal;
		String updateString = "update coffees " + "set sales = ? where cof_name like ?";
		String updateStatement = "update coffees " + "set total = total + ? where cof_name like ?";
		String query = "select cof_name, sales, total from coffees";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/sample\",\"root\",\"root@nu2");
			updateSales = con.prepareStatement(updateString);
			updateTotal = con.prepareStatement(updateStatement);
			int[] salesForWeek = { 175, 150, 60, 155, 90 };
			String[] coffees = { "Colombian", "French_Roast", "Espresso", "Colombian_Decaf", "French_Roast_Decaf" };
			int len = coffees.length;
			con.setAutoCommit(false);
			for (int i = 0; i < len; i++) {
				updateSales.setInt(1, salesForWeek[i]);
				updateSales.setString(2, coffees[i]);
				updateSales.executeUpdate();
				updateTotal.setInt(1, salesForWeek[i]);
				updateTotal.setString(2, coffees[i]);
				updateTotal.executeUpdate();
				con.commit();
			}
			con.setAutoCommit(true);
			updateSales.close();
			updateTotal.close();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String c = rs.getString("cof_name");
				int s = rs.getInt("sales");
				int t = rs.getInt("total");
				System.out.println(c + " " + s + " " + t);
			}
			stmt.close();
			con.close();
		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
		if (con != null) {
			try {
				System.err.print("Transaction is being ");
				System.err.println("Rolled back");
				con.rollback();
			} catch (SQLException excep) {
				System.err.print("SQLException: ");
				System.err.println(excep.getMessage());
			}
		}
	}
}