package all;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
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
			private JLabel lab=new JLabel("MEMBER");
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
				 private TextArea ta = new TextArea();
				
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
							Connection conn = null;
							String url = "jdbc:mysql://120.108.111.149:33306/104021042?user=104021042&password=19970218";
							String ID = jtfid.getText();
							String PW = jtfpw.getText();
							String success="Register Successful!!!";
							String create="CREATE TABLE `"+ID+"`"+"(ID VARCHAR(200), PW TEXT(20), book TEXT(20), PRIMARY KEY (`ID`))";
							String insert="INSERT IGNORE INTO `"+ID+"`"+"(ID,PW,book) values('"+ID+"','"+PW+"',null)";
							String select="SELECT * FROM `"+ID+"`";
							try{
					            Class.forName("com.mysql.jdbc.Driver");
					            System.out.println("連接成功MySQLToJava");
					            conn = DriverManager.getConnection(url);
					            System.out.println("連接成功MySQL");
					            Statement stmt = conn.createStatement();
								stmt.executeUpdate(create);
								stmt.executeUpdate(insert);
								ResultSet rs=stmt.executeQuery(select);
								while (rs.next()) {
									ta.append(success+"\n"+"ID:"+rs.getString(1)+"\n"+"\n");
								}
								stmt.close();
								conn.close();
							}catch(ClassNotFoundException e){
					        	System.out.println("找不到驅動程式類別");
				                e.printStackTrace();
					        }catch(Exception e){
					        	e.printStackTrace();
					        	ta.append("ID already exists!!!"+"\n"+"\n");
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
				 private TextArea ta = new TextArea();
				
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
					
					this.add(ta,BorderLayout.CENTER);
					this.add(jpn4, BorderLayout.SOUTH);
					jpn4.setLayout(new GridLayout(1,2,5,5));
					jpn4.add(jbtnok);
					jbtnok.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							Connection conn = null;
					        try{
					            Class.forName("com.mysql.jdbc.Driver");
					            System.out.println("連接成功MySQLToJava");
					            String url = "jdbc:mysql://120.108.111.149:33306/104021042?user=104021042&password=19970218";
					            conn = DriverManager.getConnection(url);
					            System.out.println("連接成功MySQL");
					            Statement stmt = conn.createStatement();
					            String ID = jtfid.getText();
								String PW = jtfpw.getText();
								String success = "Delete Successful!!!";
								String delete="DROP TABLE `"+ID+"`";
								stmt.executeUpdate(delete);
								ta.append(success+"\n"+"ID:"+ID+"\n"+"\n");
								stmt.close();
								conn.close();
					        }catch(ClassNotFoundException e){
					        	System.out.println("找不到驅動程式類別");
				                e.printStackTrace();
					        }catch(Exception e){
					        	e.printStackTrace();
					        	ta.append("Didn't find this ID!!!"+"\n"+"\n");
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
				 //private JLabel jlbpw = new JLabel("Password:",JLabel.CENTER);
				 private JTextField jtfid = new JTextField();
				 //private JTextField jtfpw = new JTextField();
				 private JButton jbtnok = new JButton("OK");
				 private JButton jbtnc = new JButton("CANCEL");
				 private JPanel jpn1 = new JPanel();
				 private JPanel jpn2 = new JPanel();
				 private JPanel jpn3 = new JPanel();
				 private JPanel jpn4 = new JPanel();
				 private TextArea ta = new TextArea();
				
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
					jpn3.setLayout(new GridLayout(1,1,5,5));
					//jpn3.add(jlbpw);
					//jpn3.add(jtfpw);
					
					this.add(ta,BorderLayout.CENTER);
					this.add(jpn4, BorderLayout.SOUTH);
					jpn4.setLayout(new GridLayout(1,2,5,5));
					jpn4.add(jbtnok);
					jbtnok.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							Connection conn = null;
					        try{
					            Class.forName("com.mysql.jdbc.Driver");
					            System.out.println("連接成功MySQLToJava");
					            String url = "jdbc:mysql://120.108.111.149:33306/104021042?user=104021042&password=19970218";
					            conn = DriverManager.getConnection(url);
					            System.out.println("連接成功MySQL");
					            Statement stmt = conn.createStatement();
					            String ID = jtfid.getText();
								//String PW = jtfpw.getText();
								String select = "SELECT * FROM `"+ID+"`";
								stmt.executeQuery(select);
								ta.append("ID Existence!!!"+"\n"+"\n");
								stmt.close();
								conn.close();
					        }catch(ClassNotFoundException e){
					        	System.out.println("找不到驅動程式類別");
				                e.printStackTrace();
					        }catch(Exception e){
					        	e.printStackTrace();
					        	ta.append("Didn't find this ID!!!"+"\n"+"\n");
					        }
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