package Exercise4;
public class SingletonDemo {
	public static void main(String[] args) {
		Database db = Database.getInstance();
		db.ID = "101";
		Database db1 = Database.getInstance();
		db1.ID = "201";
		System.out.println(db.ID + " " + db1.ID);
	}
}
class Database {
	String ID;
	private static Database instance;

	private Database() {
		System.out.println("Database object is created...");
	}

	synchronized public static Database getInstance() {
		if (instance != null) {
			return instance;
		} else {
			instance = new Database();
			return instance;
		}
	}
}
