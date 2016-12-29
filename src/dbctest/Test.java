package dbctest;
import java.sql.*;
public class Test {
	public static void main(String[] args) throws ClassNotFoundException 
    {
        Connection conn = null;
        try
        {
            //�s��MySQL
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("�s�����\MySQLToJava");
            //�إ�Ū����Ʈw (test ����Ʈw�W��; user ��MySQL�ϥΪ̦W��; passwrod ��MySQL�ϥΪ̱K�X)
            String datasource = "jdbc:mysql://localhost:3306/104021042?user=104021042&password=19970218";
            //�H�U����Ʈw�ާ@�аѦҥ�blog��: "�ϥ� Java �s���P�s�� access ��Ʈw (JDBC)"
            conn = DriverManager.getConnection(datasource);
            System.out.println("�s�����\MySQL");
            Statement st = conn.createStatement();
            //���X���s�W�����
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