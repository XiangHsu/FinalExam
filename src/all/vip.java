package all;
import java.awt.*;
import java.awt.event.*;
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
			ArrayList<vipdb> vip =new ArrayList<vipdb>();
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
					
					this.add(jpn4, BorderLayout.SOUTH);
					jpn4.setLayout(new GridLayout(1,2,5,5));
					jpn4.add(jbtnok);
					jbtnok.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							vip.add(new vipdb(jtfid.getText(),jtfpw.getText()));
							for(vipdb i:vip){
							     System.out.println(i.getid()+i.getpw());
							    }
							//id = jtfid.getText();
							//pw = jtfpw.getText();
							//System.out.println(id+pw);
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
							id = jtfid.getText();
							pw = jtfpw.getText();
							//System.out.println(id+pw);
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
							//vip.add(new vipdb(jtfid.getText(),jtfpw.getText()));
							//for(vipdb i:vip){
							    // System.out.println(i.getid()+i.getpw());
							    //}
							//id = jtfid.getText();
							//pw = jtfpw.getText();
							//System.out.println(id+pw);
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