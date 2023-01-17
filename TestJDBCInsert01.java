import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBCInsert01 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.h2.Driver");
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		String q = "INSERT INTO emp(empno, ename) VALUES(7997, 'NEWARUN')";
		stmt.executeUpdate(q);
		System.out.println("Inserted New Record Successfully.......");
		
		stmt.close();
		conn.close();
	}
}
