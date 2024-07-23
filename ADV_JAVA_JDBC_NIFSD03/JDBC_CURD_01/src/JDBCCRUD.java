import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCCRUD {

	public void createEmployeeDetails() throws Exception {

		System.out.println("Load the driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("Establish the conection");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manishnifsd",
				"manishnifsd");

		System.out.println("Get Statment Object");
		Statement stmt = con.createStatement();

		System.out.println("Execute the Query");
		stmt.executeUpdate("INSERT INTO EMPLOYEE " + "VALUES(107,'Surya','800000')");

		con.close();

	}

	public void updateEmployeeDetails() throws Exception {

		System.out.println("Load the driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("Establish the conection");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manishnifsd",
				"manishnifsd");

		System.out.println("Get Statment Object");
		Statement stmt = con.createStatement();

		System.out.println("Execute the Query");
		stmt.executeUpdate("UPDATE EMPLOYEE SET EMP_SALARY=EMP_SALARY/2");

		con.close();

	}

	public void deleteEmployeeDetails() throws Exception {

		System.out.println("Load the driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("Establish the conection");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manishnifsd",
				"manishnifsd");

		System.out.println("Get Statment Object");
		Statement stmt = con.createStatement();

		System.out.println("Execute the Query");
		stmt.executeUpdate("DELETE  FROM EMPLOYEE " + "WHERE EMP_SALARY>300000");

		con.close();

	}

	public void getEmployeeDetail() throws Exception {
		System.out.println("Load the driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("Establish the conection");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manishnifsd",
				"manishnifsd");

		System.out.println("Get Statment Object");
		Statement stmt = con.createStatement();

		System.out.println("Execute the Query");
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");

		while (rs.next()) {
			System.out
					.println(rs.getInt("EMP_ID") + "  " + rs.getString("EMP_NAME") + " " + rs.getString("EMP_SALARY"));
		}

		con.close();

	}

}
