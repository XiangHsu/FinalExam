import java.awt.*;
import java.awt.event.*;
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
			protected Component mf4;
			public MainFrame4(){
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
			        	  MainFrame4.this.dispose();
			              MainFrame mf = new MainFrame();
			 			  mf.setVisible(true);
				}
				});
				a.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			         //mf4.setVisible(false);
                      // add cc= new add();
				}
				});
				r.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        // mf4.setVisible(false);
                    
				}
				});
				s.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        // mf4.setVisible(false);
                    
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
		}
	/*	
		class add extends Frame{
			private Button e =new Button("Exit");
			public add(){
				initComp();
			}
			private void initComp(){
				this.setTitle("Library System");
				this.setLayout(new BorderLayout(3,3));
				this.setLocation(550,330);
				this.setSize(700, 400);	
				this.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we){
						System.exit(0);
					}
				});
				e.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
							System.exit(0);
				}
				});
				this.add(e);
			}
		}*/
