import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class book {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			//protected Component mf4;
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
			         
				}
				});
				r.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        
                    
				}
				});
				s.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        
                    
				}
				});
				t.addActionListener(new ActionListener(){
			          public void actionPerformed(ActionEvent ae){
			        
                  
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
		}