import java.awt.*;
import java.awt.event.*;
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
	private JLabel n=new JLabel("ID:",JLabel.CENTER);
	private JTextField tf=new JTextField();
	private JLabel isbn=new JLabel("ISBN:",JLabel.CENTER);
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
		this.add(ta,BorderLayout.SOUTH);
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





	}
}