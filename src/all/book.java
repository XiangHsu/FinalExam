package all;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;


public class book {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		MainFrame5 mf5=new MainFrame5();
		mf5.setVisible(true);
	}
}
		 class MainFrame5 extends JFrame{
			
			private JLabel lab=new JLabel("BOOKS");
			private JLabel la=new JLabel();
			private JButton a=new JButton("Add");
			private JButton r =new JButton("Remove");
			private JButton s=new JButton("Search");
			private JButton e =new JButton("Exit");
			private JPanel p=new JPanel();
			private JPanel p1=new JPanel();
			private JPanel p2=new JPanel();
			
			Scanner scn = new Scanner(System.in);
			
			public MainFrame5(){
				initComp();
			}
			
			private void initComp(){
				this.setTitle("Library System");
				this.setLayout(new BorderLayout(3,3));
				this.setLocation(550,330);
				this.setSize(700, 400);	
				this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				this.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent we) {
						MainFrame mf = new MainFrame();
						mf.setVisible(true);
					}
				});
				e.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        	  MainFrame5.this.dispose();
			              MainFrame mf = new MainFrame();
			 			  mf.setVisible(true);
				}
				});
				a.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        	  MainFrame5.this.setVisible(false);
			              add.setVisible(true);
				}
				});
				r.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        	  MainFrame5.this.setVisible(false);
			        	  remove.setVisible(true);
				}
				});
				s.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        	  MainFrame5.this.setVisible(false);
			        	  search.setVisible(true);
                    
				}
				});
				
				p.setLayout(new GridLayout(1,4,50,50));
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
			class add extends JFrame{
			private Connection dbConn;
			private dbc rs;
			private dbc  stm;
			private String driver="com.mysql.jdbc.Driver";
				private JLabel la=new JLabel("");
				private JLabel n=new JLabel("Book's Name:",JLabel.CENTER);
				private JTextField tf=new JTextField();
				private JLabel isbn=new JLabel("Book's ISBN:",JLabel.CENTER);
				private JTextField tf1=new JTextField();
				private JButton a =new JButton("Add");
				private JButton e =new JButton("Exit");
				private JTextArea ta=new JTextArea();
				private JPanel p=new JPanel();
				private JPanel p1=new JPanel();
				private JPanel p2=new JPanel();
				private JPanel p3=new JPanel();
				private JPanel p4=new JPanel();
				Scanner scn = new Scanner(System.in);
				
				public add(){
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
					p3.add(a);
					p3.add(e);
					p.add(p1);
					p.add(p2);
					p.add(p3);
					this.add(p,BorderLayout.NORTH);
					this.add(ta,BorderLayout.CENTER);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 add.this.dispose();
			            	 MainFrame5.this.setVisible(true);
			            }
			        });
					a.addActionListener(new ActionListener(){	
			          public void actionPerformed(ActionEvent ae){
			        	  
			        	  String driver = "com.mysql.jdbc.Driver";

			              String url = "jdbc:mysql://120.108.111.149:33306/104021042?useUnicode=true&characterEncoding=utf8";

			              String user = "104021042";

			              String password = "19970218";
String a=tf.getText();
String b=tf1.getText();
String sql="insert into Book(Name,ISBN) values('"+a+"','"+b+"')";
			              Connection conn = null;

			              try {

			                  Class.forName(driver);

			                  conn = DriverManager.getConnection(url, user, password);

			                  if (conn != null && !conn.isClosed()) {

			                      System.out.println("資料庫連線測試成功！");

			                       // 建立 statment 物件

			                        Statement stmt = conn.createStatement();                 

			                        //執行insert語法

			                        stmt.executeUpdate(sql);                     
			                         
			                        
			                        // 執行 SQL 指令

			                        ResultSet rs=stmt.executeQuery("select * from Book");

			                        //取出資料庫中的資料

			                        while (rs.next()) {                

			                          ta.append(

			                            "Name:: " + rs.getString(1) + "\n" +

			                            "ISBN: " + rs.getInt(2) + "\n" 

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
			
			remove remove=new remove();
			class remove extends JFrame{
				private JLabel la=new JLabel("Choose one what method do you want to search?");
				private JLabel la1=new JLabel("");
				private JButton n =new JButton("Name");
				private JButton i =new JButton("ISBN");
				private JButton e=new JButton("Exit");
				private JTextArea ta=new JTextArea();
				private JPanel p=new JPanel();
				private JPanel p1=new JPanel();
				private JPanel p2=new JPanel();
				private JPanel p3=new JPanel();
				private JPanel p4=new JPanel();
				Scanner scn = new Scanner(System.in);
				
				public remove(){
					initComp();
				}
				
				private void initComp(){
					this.setTitle("Library System");
					this.setLayout(new BorderLayout(2,2));
					this.setLocation(550,330);
					this.setSize(700, 400);	
					p.add(la);
					p1.add(n);
					p2.add(i);
					p4.add(la1);
					this.add(p,BorderLayout.NORTH);
					this.add(p3,BorderLayout.CENTER);
					p3.setLayout(new GridLayout(1,3,50,50));
					p3.add(n,BorderLayout.WEST);
					p3.add(i,BorderLayout.CENTER);
					p3.add(e,BorderLayout.EAST);
					this.add(p4,BorderLayout.SOUTH);
					
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 remove.this.dispose();
			            	 MainFrame5.this.setVisible(true);
			            }
			        });
					n.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 remove.this.dispose();
			            	 removename.setVisible(true);
			            }
			        });
					i.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 remove.this.dispose();
			            	 removeisbn.setVisible(true);
			            }
			        });

		}
			}
			
			removename removename=new removename();
			class removename extends JFrame{
				private JLabel la=new JLabel("");
				private JLabel n=new JLabel("Book's Name:",JLabel.CENTER);
				private JTextField tf=new JTextField();
				private JButton r =new JButton("Remove");
				private JButton e =new JButton("Exit");
				private JTextArea ta=new JTextArea();
				private JPanel p=new JPanel();
				private JPanel p1=new JPanel();
				private JPanel p2=new JPanel();
				private JPanel p3=new JPanel();
				private JPanel p4=new JPanel();
				
				public removename(){
					initComp();
				}
				
				private void initComp(){
					this.setTitle("Library System");
					this.setLayout(new BorderLayout(5,5));
					this.setLocation(550,330);
					this.setSize(700, 400);	
					p.setLayout(new GridLayout(3,1,50,50));
					p1.setLayout(new GridLayout(1,1,5,5));
					p1.add(n);
					p1.add(tf);
					p3.setLayout(new GridLayout(1,2,5,5));
					p3.add(r);
					p3.add(e);
					p.add(p4);
					p.add(p1);
					p.add(p3);
					this.add(p,BorderLayout.NORTH);
					this.add(ta,BorderLayout.CENTER);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 removename.this.dispose();
			            	 remove.setVisible(true);
			            }
			        });
					r.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 String driver = "com.mysql.jdbc.Driver";

				              String url = "jdbc:mysql://120.108.111.149:33306/104021042?useUnicode=true&characterEncoding=utf8";

				              String user = "104021042";

				              String password = "19970218";
	String a=tf.getText();
	String sql="Delete from Book where Name='"+a+"'";
				              Connection conn = null;

				              try {

				                  Class.forName(driver);

				                  conn = DriverManager.getConnection(url, user, password);

				                  if (conn != null && !conn.isClosed()) {

				                      System.out.println("資料庫連線測試成功！");

				                       // 建立 statment 物件

				                        Statement stmt = conn.createStatement();                 

				                        //執行insert語法

				                        stmt.executeUpdate(sql);                     
				                         
				                        
				                        // 執行 SQL 指令

				                        ResultSet rs=stmt.executeQuery("select * from Book");

				                        //取出資料庫中的資料

				                        while (rs.next()) {                

				                          ta.append(

				                            "Name:: " + rs.getString(1) + "\n" +

				                            "ISBN: " + rs.getInt(2) + "\n" 

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
			
			removeisbn removeisbn=new removeisbn();
			class removeisbn extends JFrame{
				private JLabel la=new JLabel("");
				private JLabel n=new JLabel("Book's ISBN:",JLabel.CENTER);
				private JTextField tf=new JTextField();
				private JButton r =new JButton("Remove");
				private JButton e =new JButton("Exit");
				private JTextArea ta=new JTextArea();
				private JPanel p=new JPanel();
				private JPanel p1=new JPanel();
				private JPanel p2=new JPanel();
				private JPanel p3=new JPanel();
				private JPanel p4=new JPanel();
				
				public removeisbn(){
					initComp();
				}
				
				private void initComp(){
					this.setTitle("Library System");
					this.setLayout(new BorderLayout(5,5));
					this.setLocation(550,330);
					this.setSize(700, 400);	
					p.setLayout(new GridLayout(3,1,50,50));
					p1.setLayout(new GridLayout(1,1,5,5));
					p1.add(n);
					p1.add(tf);
					p3.setLayout(new GridLayout(1,2,5,5));
					p3.add(r);
					p3.add(e);
					p.add(p4);
					p.add(p1);
					p.add(p3);
					this.add(p,BorderLayout.NORTH);
					this.add(ta,BorderLayout.CENTER);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 removeisbn.this.dispose();
			            	 remove.setVisible(true);
			            }
			        });
					r.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 String driver = "com.mysql.jdbc.Driver";

				              String url = "jdbc:mysql://120.108.111.149:33306/104021042?useUnicode=true&characterEncoding=utf8";

				              String user = "104021042";

				              String password = "19970218";
	String a=tf.getText();
	String sql="Delete from Book where ISBN='"+a+"'";
				              Connection conn = null;

				              try {

				                  Class.forName(driver);

				                  conn = DriverManager.getConnection(url, user, password);

				                  if (conn != null && !conn.isClosed()) {

				                      System.out.println("資料庫連線測試成功！");

				                       // 建立 statment 物件

				                        Statement stmt = conn.createStatement();                 

				                        //執行insert語法

				                        stmt.executeUpdate(sql);                     
				                         
				                        
				                        // 執行 SQL 指令

				                        ResultSet rs=stmt.executeQuery("select * from Book");

				                        //取出資料庫中的資料

				                        while (rs.next()) {                

				                          ta.append(

				                            "Name:: " + rs.getString(1) + "\n" +

				                            "ISBN: " + rs.getInt(2) + "\n" 

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
			
			search search=new search();
			class search extends JFrame{
				private JLabel la=new JLabel("Choose one what method do you want to search?");
				private JLabel la1=new JLabel("");
				private JButton n =new JButton("Name");
				private JButton i =new JButton("ISBN");
				private JButton e=new JButton("Exit");
				private JTextArea ta=new JTextArea();
				private JPanel p=new JPanel();
				private JPanel p1=new JPanel();
				private JPanel p2=new JPanel();
				private JPanel p3=new JPanel();
				private JPanel p4=new JPanel();
				Scanner scn = new Scanner(System.in);
				
				public search(){
					initComp();
				}
				
				private void initComp(){
					this.setTitle("Library System");
					this.setLayout(new BorderLayout(2,2));
					this.setLocation(550,330);
					this.setSize(700, 400);	
					p.add(la);
					p1.add(n);
					p2.add(i);
					p4.add(la1);
					this.add(p,BorderLayout.NORTH);
					this.add(p3,BorderLayout.CENTER);
					p3.setLayout(new GridLayout(1,3,50,50));
					p3.add(n,BorderLayout.WEST);
					p3.add(i,BorderLayout.CENTER);
					p3.add(e,BorderLayout.EAST);
					this.add(p4,BorderLayout.SOUTH);
					
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 search.this.dispose();
			            	 MainFrame5.this.setVisible(true);
			            }
			        });
					n.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 search.this.dispose();
			            	 searchname.setVisible(true);
			            }
			        });
					i.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 search.this.dispose();
			            	 searchisbn.setVisible(true);
			            }
			        });

		}
			}
			
			searchname searchname=new searchname();
			class searchname extends JFrame{
				private JLabel la=new JLabel("");
				private JLabel n=new JLabel("Book's Name:",JLabel.CENTER);
				private JTextField tf=new JTextField();
				private JButton s =new JButton("Search");
				private JButton e =new JButton("Exit");
				private JTextArea ta=new JTextArea();
				private JPanel p=new JPanel();
				private JPanel p1=new JPanel();
				private JPanel p2=new JPanel();
				private JPanel p3=new JPanel();
				private JPanel p4=new JPanel();
				Scanner scn = new Scanner(System.in);
				
				public searchname(){
					initComp();
				}
				
				private void initComp(){
					this.setTitle("Library System");
					this.setLayout(new BorderLayout(5,5));
					this.setLocation(550,330);
					this.setSize(700, 400);	
					p.setLayout(new GridLayout(3,1,50,50));
					p1.setLayout(new GridLayout(1,1,5,5));
					p1.add(n);
					p1.add(tf);
					p3.setLayout(new GridLayout(1,2,5,5));
					p3.add(s);
					p3.add(e);
					p.add(p4);
					p.add(p1);
					p.add(p3);
					this.add(p,BorderLayout.NORTH);
					this.add(ta,BorderLayout.CENTER);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 searchname.this.dispose();
			            	 search.setVisible(true);
			            }
			        });
					s.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 String driver = "com.mysql.jdbc.Driver";

				              String url = "jdbc:mysql://120.108.111.149:33306/104021042?useUnicode=true&characterEncoding=utf8";

				              String user = "104021042";

				              String password = "19970218";
				              String a=tf.getText();
				 
                           String sql2="select * from Book where Name='"+a+"'";
                          
				              Connection conn = null;

				              try {

				                  Class.forName(driver);

				                  conn = DriverManager.getConnection(url, user, password);

				       

				                  if (conn != null && !conn.isClosed()) {

				                      System.out.println("資料庫連線測試成功！");

				                       // 建立 statment 物件

				                        Statement stmt = conn.createStatement();

				                        // 執行 SQL 指令

				                        ResultSet rs=stmt.executeQuery(sql2);

				                        //取出資料庫中的資料

				                        while (rs.next()) {                

				                          ta.append(

				                            "書名: " + rs.getString(1) + "\n" +

				                            "ISBN: " + rs.getInt(2) + "\n" 

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
			
			searchisbn searchisbn=new searchisbn();
			class searchisbn extends JFrame{
				private JLabel la=new JLabel("");
				private JLabel isbn=new JLabel("Book's ISBN:",JLabel.CENTER);
				private JTextField tf1=new JTextField();
				private JButton s =new JButton("Search");
				private JButton e =new JButton("Exit");
				private JTextArea ta=new JTextArea();
				private JPanel p=new JPanel();
				private JPanel p1=new JPanel();
				private JPanel p2=new JPanel();
				private JPanel p3=new JPanel();
				private JPanel p4=new JPanel();
				Scanner scn = new Scanner(System.in);
				
				public searchisbn(){
					initComp();
				}
				
				private void initComp(){
					this.setTitle("Library System");
					this.setLayout(new BorderLayout(5,5));
					this.setLocation(550,330);
					this.setSize(700, 400);	
					p.setLayout(new GridLayout(3,1,50,50));
					p1.setLayout(new GridLayout(1,1,5,5));
					p1.add(isbn);
					p1.add(tf1);
					p3.setLayout(new GridLayout(1,2,5,5));
					p3.add(s);
					p3.add(e);
					p.add(p4);
					p.add(p1);
					p.add(p3);
					this.add(p,BorderLayout.NORTH);
					this.add(ta,BorderLayout.CENTER);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 searchisbn.this.dispose();
			            	 search.setVisible(true);
			            }
			        });
					s.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 String driver = "com.mysql.jdbc.Driver";

				              String url = "jdbc:mysql://120.108.111.149:33306/104021042?useUnicode=true&characterEncoding=utf8";

				              String user = "104021042";

				              String password = "19970218";
				              String b=tf1.getText();
                           String sql1="select * from Book where ISBN='"+b+"'";
                          
				              Connection conn = null;

				              try {

				                  Class.forName(driver);

				                  conn = DriverManager.getConnection(url, user, password);

				       

				                  if (conn != null && !conn.isClosed()) {

				                      System.out.println("資料庫連線測試成功！");

				                       // 建立 statment 物件

				                        Statement stmt = conn.createStatement();

				                        // 執行 SQL 指令

				                        ResultSet rs=stmt.executeQuery(sql1);

				                        //取出資料庫中的資料

				                        while (rs.next()) {                

				                          ta.append(

				                            "書名: " + rs.getString(1) + "\n" +

				                            "ISBN: " + rs.getInt(2) + "\n" 

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
			
		 }