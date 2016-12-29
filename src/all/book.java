package all;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



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
			private JButton t=new JButton("Track");
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
				t.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        	  MainFrame5.this.setVisible(false);
			        	  track.setVisible(true);
                  
				}
				});
				p.setLayout(new GridLayout(1,5,50,50));
		        p.add(a);
		        p.add(r);
		        p.add(s);
		        p.add(t);
		        p.add(e);
		        this.add(p, BorderLayout.CENTER);
		        p1.add(lab);
		        this.add(p1,BorderLayout.NORTH);
		        p2.add(la);
		        this.add(p2,BorderLayout.SOUTH);
			}
			
			add add=new add();
			class add extends JFrame{
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
					this.add(ta,BorderLayout.SOUTH);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 add.this.dispose();
			            	 MainFrame5.this.setVisible(true);
			            }
			        });
					a.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 
			            }
			        });

		}
			}
			remove remove=new remove();
			class remove extends JFrame{
				private JLabel la=new JLabel("");
				private JLabel n=new JLabel("Book's Name:",JLabel.CENTER);
				private JTextField tf=new JTextField();
				private JLabel isbn=new JLabel("Book's ISBN:",JLabel.CENTER);
				private JTextField tf1=new JTextField();
				private JButton r =new JButton("Remove");
				private JButton e =new JButton("Exit");
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
					p3.add(r);
					p3.add(e);
					p.add(p1);
					p.add(p2);
					p.add(p3);
					this.add(p,BorderLayout.NORTH);
					this.add(ta,BorderLayout.SOUTH);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 remove.this.dispose();
			            	 MainFrame5.this.setVisible(true);
			            }
			        });
					r.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 
			            }
			        });

		}
			}
			search search=new search();
			class search extends JFrame{
				private JLabel la=new JLabel("");
				private JLabel n=new JLabel("Book's Name:",JLabel.CENTER);
				private JTextField tf=new JTextField();
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
				
				public search(){
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
					p3.add(s);
					p3.add(e);
					p.add(p1);
					p.add(p2);
					p.add(p3);
					this.add(p,BorderLayout.NORTH);
					this.add(ta,BorderLayout.SOUTH);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 search.this.dispose();
			            	 MainFrame5.this.setVisible(true);
			            }
			        });
					s.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 
			            }
			        });

		}
			}
			track track=new track();
			class track extends JFrame{
				private JLabel la=new JLabel("");
				private JLabel n=new JLabel("Book's Name:",JLabel.CENTER);
				private JTextField tf=new JTextField();
				private JLabel isbn=new JLabel("Book's ISBN:",JLabel.CENTER);
				private JTextField tf1=new JTextField();
				private JButton t =new JButton("Track");
				private JButton e =new JButton("Exit");
				private JTextArea ta=new JTextArea();
				private JPanel p=new JPanel();
				private JPanel p1=new JPanel();
				private JPanel p2=new JPanel();
				private JPanel p3=new JPanel();
				private JPanel p4=new JPanel();
				Scanner scn = new Scanner(System.in);
				
				public track(){
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
					this.add(ta,BorderLayout.SOUTH);
					this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					
					e.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 track.this.dispose();
			            	 MainFrame5.this.setVisible(true);
			            }
			        });
					t.addActionListener(new ActionListener(){
			             public void actionPerformed(ActionEvent ae){
			            	 
			            }
			        });

		}
			}
		 }