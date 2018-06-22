import java.sql.*;

public class Jdbctest {
	public static void main(String args[]) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			Statement stmt = con.createStatement();
			Resultset rs = stmt.executeQuery("select * from students");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" - "+rs.getInt(2));
			}
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}