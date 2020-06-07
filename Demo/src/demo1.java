import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 
public class demo1 {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3307/sql_store";
		String uname="root";
		String pass="vinothsql";
		
		String query="SELECT * FROM sql_store.shippers"; 		
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery(query);
		String name="";
		while(rs.next())
		{
		name= rs.getString("shipper_id")+ "\t:\t" +rs.getString("name");
		System.out.println(name);
		}
		st.close();
		con.close();
	}

}
