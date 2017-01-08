package all00;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame mf8=new Frame();
		mf8.setVisible(true);
	}
}
		class Frame extends JFrame{
			private JLabel a=new JLabel("請輸入帳號: ",JLabel.CENTER);
			private JTextField tf=new JTextField();
			private JLabel b=new JLabel("請輸入密碼: ",JLabel.CENTER);
			private JPasswordField tf1=new JPasswordField();
			private JButton login =new JButton("Login");
			private JButton exit=new JButton("Exit");
			private TextArea ta=new TextArea();
			private JPanel p=new JPanel();
			private JPanel p1=new JPanel();
			private JPanel p2=new JPanel();
			private JPanel p3=new JPanel();
			private JPanel p4=new JPanel();
			private JLabel s=new JLabel("");
			String root,pass;
			public Frame(){
				initComp();
			}
			
			private void initComp(){
				this.setTitle("Library System");
				this.setLocation(550,330);
				this.setSize(700, 400);	
				this.setLayout(new GridLayout(3,1,5,5));
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				this.add(p, BorderLayout.CENTER);
				p.setLayout(new GridLayout(2,1,50,50));
				
				p.add(p1);
				p1.setLayout(new GridLayout(1,2,5,5));
				p1.add(a);
				p1.add(tf);
				
				p.add(p2);
				p2.setLayout(new GridLayout(1,2,5,5));
				p2.add(b);
				p2.add(tf1);
				p4.add(s);
				this.add(p4,BorderLayout.NORTH);
				this.add(p3);
				p3.setLayout(new GridLayout(1,2,5,5));
				p3.add(login);
				p3.add(exit);
				exit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
					System.exit(0);
					}
					});
				login.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
						String password = new String(tf1.getPassword());
						String id=new String(tf.getText());
                     if(id.equals("root")){
					    if (password.equals("0000")){
					      JLabel label = new JLabel("認証成功");
					      JOptionPane.showMessageDialog(label, "成功");
					      Frame.this.dispose();
					      MainFrame mf=new MainFrame();
					      mf.setVisible(true);
					    }else{
					      JLabel label = new JLabel("認証失敗");
					      JOptionPane.showMessageDialog(label, "失敗");
					      tf.setText("");
					      tf1.setText("");
					    }
					}else{
						JLabel label = new JLabel("認証失敗");
					      JOptionPane.showMessageDialog(label, "失敗");
					      tf.setText("");
					      tf1.setText("");
					}
					}
						//System.out.print("請輸入帳號: ");
						//root = input.readLine();
						//System.out.print("請輸入密碼: ");
						//pass = input.readLine();
						
					
					});
				
			}
		}