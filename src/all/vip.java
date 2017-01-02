package all;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;

public class vip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame4 mf4=new MainFrame4();
		mf4.setVisible(true);
	}
}
		class MainFrame4 extends JFrame{
			private JLabel lab=new JLabel("VIP");
			private JLabel la=new JLabel();
			private JButton a=new JButton("Add");
			private JButton r =new JButton("Remove");
			private JButton s=new JButton("Search");
			private JButton e =new JButton("Exit");
			private JPanel p=new JPanel();
			private JPanel p1=new JPanel();
			private JPanel p2=new JPanel();
			public MainFrame4(){
				initComp();
			}
			
			private void initComp(){
				this.setTitle("Library System");
				this.setLayout(new BorderLayout(3,3));
				this.setBounds(550,330,700,400);
				this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				this.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent we) {
						MainFrame mf = new MainFrame();
						mf.setVisible(true);
					}
				});
				e.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        	  MainFrame4.this.dispose();
			              MainFrame mf = new MainFrame();
			 			  mf.setVisible(true);
				}
				});
				a.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        	  MainFrame4.this.dispose();
			 			  add.setVisible(true);
				}
				});
				r.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        	  MainFrame4.this.dispose();
			 			  remove.setVisible(true);
                    
				}
				});
				s.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        	  MainFrame4.this.dispose();
			 			  search.setVisible(true);
                    
				}
				});
				p.setLayout(new GridLayout(1,5,50,50));
		        p.add(a);
		        p.add(r);
		        p.add(s);
		        p.add(e);
		        this.add(p, BorderLayout.CENTER);
		        p1.add(lab);
		        this.add(p1,BorderLayout.NORTH);
		        p2.add(la);
		        this.add(p2,BorderLayout.SOUTH);
			}
		
			add add=new add();
			class add extends JFrame {
				 private JLabel jlbid = new JLabel("Member ID:",JLabel.CENTER);
				 private JLabel jlbpw = new JLabel("Password:",JLabel.CENTER);
				 private JTextField jtfid = new JTextField();
				 private JTextField jtfpw = new JTextField();
				 private JButton jbtnok = new JButton("OK");
				 private JButton jbtnc = new JButton("CANCEL");
				 private JPanel jpn1 = new JPanel();
				 private JPanel jpn2 = new JPanel();
				 private JPanel jpn3 = new JPanel();
				 private JPanel jpn4 = new JPanel();
				 String id , pw;
				 private TextArea ta=new TextArea();
				
				public add(){
					initComp();
				}
				private void initComp(){
					this.setTitle("Library System");
					this.setLayout(new BorderLayout(1,2));
					this.setBounds(550,330,700,400);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					this.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent we) {
							MainFrame4 mf4 = new MainFrame4();
							mf4.setVisible(true);
						}
					});
					this.add(jpn1, BorderLayout.NORTH);
					jpn1.setLayout(new GridLayout(2,1,50,50));
					
					jpn1.add(jpn2);
					jpn2.setLayout(new GridLayout(1,2,5,5));
					jpn2.add(jlbid);
					jpn2.add(jtfid);
					
					jpn1.add(jpn3);
					jpn3.setLayout(new GridLayout(1,2,5,5));
					jpn3.add(jlbpw);
					jpn3.add(jtfpw);
					this.add(ta,BorderLayout.CENTER);
					this.add(jpn4, BorderLayout.SOUTH);
					jpn4.setLayout(new GridLayout(1,2,5,5));
					jpn4.add(jbtnok);
					jbtnok.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							 String driver = "com.mysql.jdbc.Driver";

				              String url = "jdbc:mysql://120.108.111.149:33306/104021042?useUnicode=true&characterEncoding=utf8";

				              String user = "104021042";

				              String password = "19970218";
			String a=jtfid.getText();
			String b=jtfpw.getText();
			String sqlcreate="create table `"+a+"`"+"(ID TEXT(20), PW TEXT(20), book TEXT(20))";
			String success="Success Register!!!";
			String sql="select * from `"+a+"`";
			
			
				              Connection conn = null;

				              try {

				                  Class.forName(driver);

				                  conn = DriverManager.getConnection(url, user, password);

				                  if (conn != null && !conn.isClosed()) {

				                      System.out.println("資料庫連線測試成功！");

				                       // 建立 statment 物件

				                        Statement stmt = conn.createStatement();                 
                                        
				                        //執行insert語法
                                      stmt.executeUpdate(sqlcreate);
				                     // stmt.executeUpdate(sql);                     
				                         
				                        
				                        // 執行 SQL 指令

				                        ResultSet rs=stmt.executeQuery(sql);

				                        //取出資料庫中的資料

				                        while (rs.next()) {                

				                          ta.append(
				                        		  
                                            success+
                                             
				                            "ID: " + rs.getString(1) + "\n" +

				                            "PW: " + rs.getString(2) + "\n"

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

					jpn4.add(jbtnc);
					jbtnc.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							  add.dispose();
				              MainFrame4 mf4 = new MainFrame4();
				 			  mf4.setVisible(true);
						}
					});
				}
			}
			
			remove remove = new remove();
			class remove extends JFrame {
				 private JLabel jlbid = new JLabel("Member ID:",JLabel.CENTER);
				 private JLabel jlbpw = new JLabel("Password:",JLabel.CENTER);
				 private JTextField jtfid = new JTextField();
				 private JTextField jtfpw = new JTextField();
				 private JButton jbtnok = new JButton("OK");
				 private JButton jbtnc = new JButton("CANCEL");
				 private JPanel jpn1 = new JPanel();
				 private JPanel jpn2 = new JPanel();
				 private JPanel jpn3 = new JPanel();
				 private JPanel jpn4 = new JPanel();
				 String id , pw;
				 private TextArea ta=new TextArea();
				
				public remove(){
					initComp();
				}
				private void initComp(){
					this.setTitle("Library System");
					this.setLayout(new BorderLayout(1,2));
					this.setBounds(550,330,700,400);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					this.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent we) {
							MainFrame4 mf4 = new MainFrame4();
							mf4.setVisible(true);
						}
					});
					this.add(jpn1, BorderLayout.NORTH);
					jpn1.setLayout(new GridLayout(2,1,50,50));
					
					jpn1.add(jpn2);
					jpn2.setLayout(new GridLayout(1,2,5,5));
					jpn2.add(jlbid);
					jpn2.add(jtfid);
					
					jpn1.add(jpn3);
					jpn3.setLayout(new GridLayout(1,2,5,5));
					jpn3.add(jlbpw);
					jpn3.add(jtfpw);
					
					this.add(jpn4, BorderLayout.SOUTH);
					jpn4.setLayout(new GridLayout(1,2,5,5));
					jpn4.add(jbtnok);
					jbtnok.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							 String driver = "com.mysql.jdbc.Driver";

				              String url = "jdbc:mysql://120.108.111.149:33306/104021042?useUnicode=true&characterEncoding=utf8";

				              String user = "104021042";

				              String password = "19970218";
			String a=jtfid.getText();
			String b=jtfpw.getText();
			String sqlcreate="drop table `"+a+"`";
			
			
			
				              Connection conn = null;

				              try {

				                  Class.forName(driver);

				                  conn = DriverManager.getConnection(url, user, password);

				                  if (conn != null && !conn.isClosed()) {

				                      System.out.println("資料庫連線測試成功！");

				                       // 建立 statment 物件

				                        Statement stmt = conn.createStatement();                 
                                       
				                        //執行insert語法
                                     stmt.executeUpdate(sqlcreate);                      
				                        
				                        // 執行 SQL 指令
    
                                     ta.append("Success Delete");
                                     
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
	
					jpn4.add(jbtnc);
					jbtnc.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							  remove.dispose();
				              MainFrame4 mf4 = new MainFrame4();
				 			  mf4.setVisible(true);
						}
					});
				}
	}
			search search = new search();
			class search extends JFrame {
				 private JLabel jlbid = new JLabel("Member ID:",JLabel.CENTER);
				 private JLabel jlbpw = new JLabel("Password:",JLabel.CENTER);
				 private JTextField jtfid = new JTextField();
				 private JTextField jtfpw = new JTextField();
				 private JButton jbtnok = new JButton("OK");
				 private JButton jbtnc = new JButton("CANCEL");
				 private JPanel jpn1 = new JPanel();
				 private JPanel jpn2 = new JPanel();
				 private JPanel jpn3 = new JPanel();
				 private JPanel jpn4 = new JPanel();
				 String id , pw;
				
				public search(){
					initComp();
				}
				private void initComp(){
					this.setTitle("Library System");
					this.setLayout(new BorderLayout(1,2));
					this.setBounds(550,330,700,400);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					this.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent we) {
							MainFrame4 mf4 = new MainFrame4();
							mf4.setVisible(true);
						}
					});
					this.add(jpn1, BorderLayout.NORTH);
					jpn1.setLayout(new GridLayout(2,1,50,50));
					
					jpn1.add(jpn2);
					jpn2.setLayout(new GridLayout(1,2,5,5));
					jpn2.add(jlbid);
					jpn2.add(jtfid);
					
					jpn1.add(jpn3);
					jpn3.setLayout(new GridLayout(1,2,5,5));
					jpn3.add(jlbpw);
					jpn3.add(jtfpw);
					
					this.add(jpn4, BorderLayout.SOUTH);
					jpn4.setLayout(new GridLayout(1,2,5,5));
					jpn4.add(jbtnok);
					jbtnok.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							
						}
					});
					jpn4.add(jbtnc);
					jbtnc.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							  search.dispose();
				              MainFrame4 mf4 = new MainFrame4();
				 			  mf4.setVisible(true);
						}
					});
				}
			}
			}