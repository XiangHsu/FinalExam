package dbctest;
import java.sql.*;
public class Test {
	public static void main(String[] args) throws ClassNotFoundException 
    {
        Connection conn = null;
        try
        {
            //連接MySQL
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("連接成功MySQLToJava");
            //建立讀取資料庫 (test 為資料庫名稱; user 為MySQL使用者名稱; passwrod 為MySQL使用者密碼)
            String datasource = "jdbc:mysql://localhost:3306/104021042?user=104021042&password=19970218";
            //以下的資料庫操作請參考本blog中: "使用 Java 連結與存取 access 資料庫 (JDBC)"
            conn = DriverManager.getConnection(datasource);
            System.out.println("連接成功MySQL");
            Statement st = conn.createStatement();
            //撈出剛剛新增的資料
            st.execute("SELECT * FROM book");
            ResultSet rs = st.getResultSet();
            while(rs.next())
            {
                System.out.println(rs.getString("name")+" "+rs.getString("isbn"));
            }
        }catch(Exception e)
        {
            System.out.println("?");
        }
    }
}