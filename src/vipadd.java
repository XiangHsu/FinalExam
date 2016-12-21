import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class vipadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame6 mfrm6 = new MainFrame6();
		mfrm6.setVisible(true);
	}

}
class MainFrame6 extends JFrame {
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
	
	public MainFrame6(){
		initComp();
	}
	private void initComp(){
		this.setTitle("Library System");
		this.setLayout(new BorderLayout(1,2));
		this.setBounds(550,330,500,300);
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
				MainFrame6.this.dispose();
	              MainFrame4 mf4 = new MainFrame4();
	 			  mf4.setVisible(true);
			}
		});
	}
}