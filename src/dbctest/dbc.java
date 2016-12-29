package dbctest;
import java.sql.*;

import javax.swing.JOptionPane;
public class dbc {
private String driver="com.mysql.jdbc.Driver";
private String url="jdbc:mysql://210.209.167.242:3306/104021042?useUnicode=true&characterEncoding=utf8";
private Connection dbConn;
private MainFrame mf;

public dbc(MainFrame mf1,String id,String pw){
	mf=mf1;
	try{
		Class.forName(driver);
		dbConn=DriverManager.getConnection(url,id,pw);
		JOptionPane.showMessageDialog(mf, "資料庫連線成功");
	}catch(SQLException ex){
		JOptionPane.showMessageDialog(mf, ex.toString());
	}catch(Exception ex){
		JOptionPane.showMessageDialog(mf, ex.toString());
	}
}
public ResultSet getData(){
	ResultSet rs=null;
	try{
		Statement stm=dbConn.createStatement();
		String sqlStr="select * from book";
		rs=stm.executeQuery(sqlStr);
	}catch(SQLException ex){
		JOptionPane.showMessageDialog(mf, ex.toString());
	}
	return rs;
}
}
