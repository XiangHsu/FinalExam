package dbctest;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf=new MainFrame();
		mf.setVisible(true);
	}
}
		class MainFrame extends JFrame{
			private Container cp;
			private Container jifcp;
			private JScrollPane jsp;
			private JPanel jpnt;
			private JButton jbtnConnDB=new JButton("Conn. DB");
			private JButton jbtnShowData=new JButton("Show Data");
			private JButton jbtnExit=new JButton("Exti");
			private JDesktopPane jdp=new JDesktopPane();
			private dbc dbconn;
			private JInternalFrame jtf1;
			private ResultSet rs;
			private ResultSetMetaData meta;
			private JTextArea jta=new JTextArea(); 
			
			public MainFrame(){
				initComp();
			}
			
			private void initComp(){
				cp=getContentPane();
				setBounds(200,100,600,600);
				cp.setLayout(new BorderLayout(3,3));
				jpnt=new JPanel(new GridLayout(1,4,3,3));
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				cp.add(jpnt,BorderLayout.NORTH);
				cp.add(jdp,BorderLayout.CENTER);
				jpnt.add(jbtnConnDB);
				jbtnConnDB.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
						dbconnection();
					if(dbconn != null){
						jtf1=new JInternalFrame("DB Connected");
						jifcp=jtf1.getContentPane();
						jtf1.setBounds(0,0,400,300);
						jdp.add(jtf1);
						jtf1.setVisible(true);
					}
					}
					});
				jpnt.add(jbtnShowData);
				jbtnShowData.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
					showData();	
					}
				});
				
				jpnt.add(jbtnExit);
				jbtnExit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
						System.exit(0);
					}
				});
			}
			private void dbconnection(){
				dbconn=new dbc(this,"104021042","19970218");
			}
			private void showData(){
				try{
					rs=dbconn.getData();
					
					int colCount=0;
					if(rs !=null){
						jsp=new JScrollPane(jta);
						
						meta=rs.getMetaData();
						colCount=meta.getColumnCount();
						while(rs.next()){
							String[] record=new String [colCount];
							for(int i=0;i<colCount;i++){
								record[i]=rs.getString(i+1);
								jta.append(record[i]+"\t");
							}
							jta.append("\n");
						}
						jifcp.add(jsp);
					}
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, ex.toString());
				}
			}
	}

