package all;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.Book;
import java.awt.color.*;
import javax.swing.*;
import java.sql.*;


public class home extends Book{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf=new MainFrame();
		mf.setVisible(true);
	}
}
		class MainFrame extends JFrame{
			/*private Container cp;
			private Container jifcp;
			private JScrollPane jsp;*/
			private JLabel lab=new JLabel("Main",JLabel.CENTER);
			private JLabel la=new JLabel("");
			private JButton b =new JButton("Borrow");
			private JButton r=new JButton("Return");
			private JButton v =new JButton("Member");
			private JButton bk =new JButton("Books");
			private JButton e =new JButton("Exit");
			private JPanel p=new JPanel();
			private JPanel p1=new JPanel();
			private JPanel p2=new JPanel();
			public MainFrame(){
				initComp();
			}
			
			private void initComp(){
				this.setTitle("Library System");
				this.setLayout(new BorderLayout(3,3));
				this.setLocation(550,330);
				this.setSize(700, 400);	
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
        e.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
				System.exit(0);
	}
	});
        b.addActionListener(new ActionListener(){
    	 public void actionPerformed(ActionEvent ae){
    		MainFrame2 borrow = new MainFrame2();
    		borrow.setVisible(true);
    		MainFrame.this.setVisible(false);
    	 }
    });
        r.addActionListener(new ActionListener(){
       	 public void actionPerformed(ActionEvent ae){
       		MainFrame3 re = new MainFrame3();
       		re.setVisible(true);
       		MainFrame.this.setVisible(false);
       	 }
    });
        v.addActionListener(new ActionListener(){
       	 public void actionPerformed(ActionEvent ae){
       		MainFrame4 re = new MainFrame4();
       		re.setVisible(true);
       		MainFrame.this.setVisible(false);
       	 }
    });
        bk.addActionListener(new ActionListener(){
       	 public void actionPerformed(ActionEvent ae){
       		MainFrame5 re = new MainFrame5();
       		re.setVisible(true);
       		MainFrame.this.setVisible(false);
       	 }
    });
        p.setLayout(new GridLayout(1,5,50,50));
        p.add(b);
        p.add(r);
        p.add(v);
        p.add(bk);
        p.add(e);
        this.add(p, BorderLayout.CENTER);
        p1.add(lab);
        this.add(p1,BorderLayout.NORTH);
        p2.add(la);
        this.add(p2,BorderLayout.SOUTH);
        
			}
}