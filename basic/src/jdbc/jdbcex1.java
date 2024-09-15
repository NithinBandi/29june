package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcex1 {
	static Connection con=null;
	jdbcex1()
	{
		try {
			Class.forName("oracle.jdbc.driver.oracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",".system","Luffy");
			System.out.println("connection created:"+con);
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
public void CreateTable()throws SQLException{
	Statement st=con.createStatement();
	String query="Create table emp(empid number,ename varchar2(25),sal number)";
	st.execute(query);
}
public void insert_Data()throws SQLException{
	Statement st=con.createStatement();
	String query="insert into employee values"+"(1,'A',3000,'HYD',10)";
	int i=st.executeUpdate(query);
	System.out.println(i+"records Inserted");
}

	public static void main(String[] args) throws SQLException {
	try{
	jdbcexample obj=new jdbcexample();
	obj.insert_Data();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
}
	}



