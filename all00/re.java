package all00;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame2 mf3=new MainFrame2();
		mf3.setVisible(true);
	}
	}
 class MainFrame3 extends JFrame{
	private JLabel la=new JLabel("");
	private JLabel n=new JLabel("Member ID:",JLabel.CENTER);
	private JTextField tf=new JTextField();
	private JLabel isbn=new JLabel("Book's ISBN:",JLabel.CENTER);
	private JTextField tf1=new JTextField();
	private JButton t =new JButton("Return");
	private JButton e =new JButton("Exit");
	private JTextArea ta=new JTextArea();
	private JPanel p=new JPanel();
	private JPanel p1=new JPanel();
	private JPanel p2=new JPanel();
	private JPanel p3=new JPanel();
	private JPanel p4=new JPanel();
	public MainFrame3(){
		initComp();
	}
	
	private void initComp(){
		this.setTitle("Library System");
		this.setLayout(new BorderLayout(5,5));
		this.setLocation(550,330);
		this.setSize(700, 400);	
		p.setLayout(new GridLayout(3,1,50,50));
		p1.setLayout(new GridLayout(1,2,5,5));
		p1.add(n);
		p1.add(tf);
		p2.setLayout(new GridLayout(1,2,5,5));
		p2.add(isbn);
		p2.add(tf1);
		p3.setLayout(new GridLayout(1,2,5,5));
		p3.add(t);
		p3.add(e);
		p.add(p1);
		p.add(p2);
		p.add(p3);
		this.add(p,BorderLayout.NORTH);
		this.add(ta,BorderLayout.CENTER);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				MainFrame mf = new MainFrame();
				mf.setVisible(true);
			}
		});
        e.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            	MainFrame3.this.dispose();
           	    MainFrame mf = new MainFrame();
				mf.setVisible(true);
            }
        });

t.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		String driver = "com.mysql.jdbc.Driver";

        String url = "jdbc:mysql://120.108.111.149:33306/104021042?useUnicode=true&characterEncoding=utf8";

        String user = "104021042";

        String password = "19970218";
String a=tf.getText();
String b=tf1.getText();
String sqlbr="delete from `"+a+"`"+"where book='"+b+"'";
String sqlup="update Book set state='館藏'"+"where ISBN='"+b+"'";
String sql="select * from Book where ISBN='"+b+"'";
String sql1="select * from `"+a+"`";

        Connection conn = null;

        try {

            Class.forName(driver);

            conn = DriverManager.getConnection(url, user, password);

            if (conn != null && !conn.isClosed()) {

                System.out.println("資料庫連線測試成功！");

                 // 建立 statment 物件

                  Statement stmt = conn.createStatement();                 

                  //執行insert語法

                  stmt.executeUpdate(sqlbr);                     
                   

                  stmt.close();

                  conn.close();

            }

        } catch (ClassNotFoundException e) {

            System.out.println("找不到驅動程式類別");

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();

        }


        try {

            Class.forName(driver);

            conn = DriverManager.getConnection(url, user, password);

            if (conn != null && !conn.isClosed()) {

                System.out.println("資料庫連線測試成功！");

                 // 建立 statment 物件

                  Statement stmt = conn.createStatement();                 

                  //執行insert語法

                  stmt.executeUpdate(sqlup);                     
               

                  stmt.close();

                  conn.close();

            }

        } catch (ClassNotFoundException e) {

            System.out.println("找不到驅動程式類別");

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();

        }

        try {

            Class.forName(driver);

            conn = DriverManager.getConnection(url, user, password);

            if (conn != null && !conn.isClosed()) {

                System.out.println("資料庫連線測試成功！");

                 // 建立 statment 物件

                  Statement stmt = conn.createStatement();                 

                  //執行insert語法

                  stmt.executeUpdate(sqlbr);                     
                   
                  
                  // 執行 SQL 指令

                  ResultSet rs=stmt.executeQuery(sql);

                  //取出資料庫中的資料

                  while (rs.next()) {                

                    ta.append(

                  	"Book: "+"\n"+
                  		  
                      "Name: " + rs.getString(1) + "\n" +

                      "ISBN: " + rs.getString(2) + "\n"  +
                      
                      "State: "+rs.getString(3) +  "\n"

                      );

                  }

                  stmt.close();

                  conn.close();

            }

        } catch (ClassNotFoundException e) {

            System.out.println("找不到驅動程式類別");

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();

        }

        
        try {

            Class.forName(driver);

            conn = DriverManager.getConnection(url, user, password);

            if (conn != null && !conn.isClosed()) {

                System.out.println("資料庫連線測試成功！");

                 // 建立 statment 物件

                  Statement stmt = conn.createStatement();                 

                  //執行insert語法

                  stmt.executeUpdate(sqlbr);                     
                   
                  
                  // 執行 SQL 指令

                  ResultSet rs=stmt.executeQuery(sql1);

                  //取出資料庫中的資料

                  while (rs.next()) {                

                    ta.append(
                      "Member: "+"\n"+
                  		  
                      "Name: " + rs.getString(1) + "\n" +

                      "Book: " + rs.getString(3) + "\n" 


                      );

                  }

                  stmt.close();

                  conn.close();

            }

        } catch (ClassNotFoundException e) {

            System.out.println("找不到驅動程式類別");

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();

        }



      }
    });




	}
}