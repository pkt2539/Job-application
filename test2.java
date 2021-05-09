import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class test2  {
	private static final String String = null;
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {	
				test2 d = new test2();
			}
		});		
	}	
	
 public test2()  {            
		JLabel label = new JLabel();
		label.setText("บริษัท TEC จำกัด");
		label.setFont(new Font("tahoma",Font.PLAIN,20));
		label.setBounds(290, 25, 400, 100);		
		JLabel label1 = new JLabel();
		label1.setText("แบบฟอร์มสมัครพนักงาน");
		label1.setFont(new Font("tahoma",Font.PLAIN,16));
		label1.setBounds(300, 70, 500, 100);		
		JLabel label2 = new JLabel();
		label2.setText("ใบสมัครสำหรับงานด้าน ICT นี้ ให้ผู้สมัครกรอกรายละเอียดต่อไปนี้เพื่อที่");
		label2.setFont(new Font("tahoma",Font.PLAIN,16));
		label2.setBounds(150, 90, 500, 100);
		JLabel label3 = new JLabel();
		label3.setText("บริษัท TEC จำกัด จะทำการคัดเลือกตามความเหมาะสม");
		label3.setFont(new Font("tahoma",Font.PLAIN,16));
		label3.setBounds(190, 120, 500, 100);		
			JLabel label31 = new JLabel("เลขประจำตัวของผู้สมัคร (AP_ID) :");				
			label31.setFont(new Font("tahoma",Font.PLAIN,12));
			label31.setBounds(20, 160, 500, 100);				
			JTextField tf31 = new JTextField();
			tf31.getText();
			tf31.setText(String);
			tf31.setFont(new Font("tahoma",Font.PLAIN,12));
			tf31.setBounds(195, 200, 500, 20);		
			JLabel label32 = new JLabel();
			label32.setText("ชื่อ-นามสกุล          (AP_NAME) :");
			label32.setFont(new Font("tahoma",Font.PLAIN,12));
			label32.setBounds(20, 185, 500, 100);			
			JTextField tf32 = new JTextField();
			tf32.getText();
			tf32.setText(String);
			tf32.setFont(new Font("tahoma",Font.PLAIN,12));
			tf32.setBounds(195, 225, 500, 20);			
			JLabel label33 = new JLabel();
			label33.setText("ที่อยู่              (AP_ADDRESS) :");
			label33.setFont(new Font("tahoma",Font.PLAIN,12));
			label33.setBounds(20, 210, 500, 100);			
			JTextField tf33 = new JTextField();
			tf33.getText();
			tf33.setText(String);
			tf33.setFont(new Font("tahoma",Font.PLAIN,12));
			tf33.setBounds(195, 250, 500, 20);			
			JLabel label34 = new JLabel();
			label34.setText("จังหวัด                 (AP_CHW) :");
			label34.setFont(new Font("tahoma",Font.PLAIN,12));
			label34.setBounds(20, 235, 500, 100);			
			JTextField tf34 = new JTextField();
			tf34.getText();
			tf34.setText(String);
			tf34.setFont(new Font("tahoma",Font.PLAIN,12));
			tf34.setBounds(195, 275, 500, 20);			
			JLabel label35 = new JLabel();
			label35.setText("เพศ                     (AP_SEX) :");
			label35.setFont(new Font("tahoma",Font.PLAIN,12));
			label35.setBounds(20, 260, 500, 100);			
			JRadioButton male = new JRadioButton("ชาย");			
			male.setFocusable(false);
			male.setFont(new Font("tahoma",Font.PLAIN,12));
			male.setBounds(195, 300,50, 20);			 
			JRadioButton female = new JRadioButton();
			female.setText("หญิง");
			female.setFocusable(false);
			female.setFont(new Font("tahoma",Font.PLAIN,12));
			female.setBounds(250, 300,50, 20);			
			JLabel label36 = new JLabel();
			label36.setText("วุฒิการศึกษาขั้นสูงสุด (AP_ED) :");
			label36.setFont(new Font("tahoma",Font.PLAIN,12));
			label36.setBounds(20, 285, 500, 100);
			JTextField tf36 = new JTextField();
			tf36.getText();
			tf36.setText(String);
			tf36.setFont(new Font("tahoma",Font.PLAIN,12));
			tf36.setBounds(195, 325, 500, 20);			
			JLabel label37 = new JLabel();
			label37.setText("(เช่น B.S.,B.A.,M.S.,M.BA,M.A.)");
			label37.setFont(new Font("tahoma",Font.PLAIN,12));
			label37.setBounds(20, 310, 500, 100);			
			JLabel label38 = new JLabel();
			label38.setText("วิชาเอก                (AP_MAJ) :");
			label38.setFont(new Font("tahoma",Font.PLAIN,12));
			label38.setBounds(20, 335, 500, 100);			
			JTextField tf38 = new JTextField();
			tf38.getText();
			tf38.setText(String);
			tf38.setFont(new Font("tahoma",Font.PLAIN,12));
			tf38.setBounds(195, 375, 500, 20);					
		JLabel label4 = new JLabel ();
		label4.setText("ความรู้ความสามรถหรือคุณสมบัติเฉพาะตำแหน่ง (QUAL_DESC)(ตอบได้ไม่เกิน 5 รายการ)");
		label4.setFont(new Font("tahoma",Font.BOLD,16));
		label4.setBounds(40,360, 800, 100);			
			JLabel label41 = new JLabel();
			label41.setText("ความรู้ความสามารถ 1             :");
			label41.setFont(new Font("tahoma",Font.PLAIN,12));
			label41.setBounds(20,385, 500, 100);		
			String[] qualString41 = {"เลือกความรู้ความสามรถ","Web_ASP","C++","Database Administrator,DB2"
			,"Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network"
			,"Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1"
			,"System Analyst, Level 2","Visual Basic"};			
			String[] qualString42 = {"เลือกความรู้ความสามรถ","Web_ASP","C++","Database Administrator,DB2"
					,"Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network"
					,"Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1"
					,"System Analyst, Level 2","Visual Basic"};			
			String[] qualString43 = {"เลือกความรู้ความสามรถ","Web_ASP","C++","Database Administrator,DB2"
					,"Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network"
					,"Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1"
					,"System Analyst, Level 2","Visual Basic"};			
			String[] qualString44 = {"เลือกความรู้ความสามรถ","Web_ASP","C++","Database Administrator,DB2"
					,"Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network"
					,"Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1"
					,"System Analyst, Level 2","Visual Basic"};			
			String[] qualString45 = {"เลือกความรู้ความสามรถ","Web_ASP","C++","Database Administrator,DB2"
					,"Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network"
					,"Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1"
					,"System Analyst, Level 2","Visual Basic"};			 
			JComboBox combobox41 = new JComboBox(qualString41);
			combobox41.setFont(new Font("tahoma",Font.PLAIN,12));
			combobox41.getSelectedIndex();
			combobox41.setBounds(195, 425, 500, 20);			
			JLabel label42 = new JLabel();
			label42.setText("ความรู้ความสามารถ 2             :");
			label42.setFont(new Font("tahoma",Font.PLAIN,12));
			label42.setBounds(20,410, 500, 100);			
			JComboBox combobox42 = new JComboBox(qualString41);
			combobox42.setFont(new Font("tahoma",Font.PLAIN,12));
			combobox42.getSelectedIndex();
			combobox42.setBounds(195, 450, 500, 20);			
			JLabel label43 = new JLabel();
			label43.setText("ความรู้ความสามารถ 3             :");
			label43.setFont(new Font("tahoma",Font.PLAIN,12));
			label43.setBounds(20,435, 500, 100);			
			JComboBox combobox43 = new JComboBox(qualString41);
			combobox43.setFont(new Font("tahoma",Font.PLAIN,12));
			combobox43.getSelectedIndex();
			combobox43.setBounds(195, 475, 500, 20);
			JLabel label44 = new JLabel();
			label44.setText("ความรู้ความสามารถ 4             :");
			label44.setFont(new Font("tahoma",Font.PLAIN,12));
			label44.setBounds(20,460, 500, 100);			
			JComboBox combobox44 = new JComboBox(qualString41);
			combobox44.setFont(new Font("tahoma",Font.PLAIN,12));
			combobox44.getSelectedIndex();
			combobox44.setBounds(195, 500, 500, 20);
			JLabel label45 = new JLabel();
			label45.setText("ความรู้ความสามารถ 5             :");
			label45.setFont(new Font("tahoma",Font.PLAIN,12));
			label45.setBounds(20,485, 500, 100);			
			JComboBox combobox45 = new JComboBox(qualString41);
			combobox45.setFont(new Font("tahoma",Font.PLAIN,12));
			combobox45.getSelectedIndex();
			combobox45.setBounds(195, 525, 500, 20);			
		JLabel label5 = new JLabel();
		label5.setText("ตำแหน่งที่ต้องการสมัคร (POS_NAME) : (ตอบได้ไม่เกิน 3 ตำแหน่ง)");
		label5.setFont(new Font("tahoma",Font.BOLD,16));
		label5.setBounds(40, 510, 500, 100);			
			JLabel label51 = new JLabel();
			label51.setText("ตำแหน่งที่ต้องการสมัคร 1        :");
			label51.setFont(new Font("tahoma",Font.PLAIN,12));
			label51.setBounds(20,535, 500, 100);			
			String[] posString51 = {"เลือกตำแหน่งที่ต้องการสมัคร","Technical Programmer","Web Developer"
					,"General Manager","ICT Speciallist","E-Business Analyst","ICT Documenter"
					,"Database Administrator","PC Administrator","Network Specialist"
					,"ICT Manager"};			
			String[] posString52 = {"เลือกตำแหน่งที่ต้องการสมัคร","Technical Programmer","Web Developer"
					,"General Manager","ICT Speciallist","E-Business Analyst","ICT Documenter"
					,"Database Administrator","PC Administrator","Network Specialist"
					,"ICT Manager"};			
			String[] posString53 = {"เลือกตำแหน่งที่ต้องการสมัคร","Technical Programmer","Web Developer"
					,"General Manager","ICT Speciallist","E-Business Analyst","ICT Documenter"
					,"Database Administrator","PC Administrator","Network Specialist"
					,"ICT Manager"};			
			JComboBox combobox51 = new JComboBox(posString51);
			combobox51.setFont(new Font("tahoma",Font.PLAIN,12));
			combobox51.getSelectedIndex();
			combobox51.setBounds(195, 575, 500, 20);			
			JLabel label52 = new JLabel();
			label52.setText("ตำแหน่งที่ต้องการสมัคร 2        :");
			label52.setFont(new Font("tahoma",Font.PLAIN,12));
			label52.setBounds(20,560, 500, 100);			
			JComboBox combobox52 = new JComboBox(posString51);
			combobox52.setFont(new Font("tahoma",Font.PLAIN,12));
			combobox52.getSelectedIndex();
			combobox52.setBounds(195, 600, 500, 20);			
			JLabel label53 = new JLabel();
			label53.setText("ตำแหน่งที่ต้องการสมัคร 3        :");
			label53.setFont(new Font("tahoma",Font.PLAIN,12));
			label53.setBounds(20,585, 500, 100);			
			JComboBox combobox53 = new JComboBox(posString51);
			combobox53.setFont(new Font("tahoma",Font.PLAIN,12));
			combobox53.getSelectedIndex();
			combobox53.setBounds(195, 625, 500, 20);		
		JFrame frame = new JFrame("แบบฟอร์มใบสมัครพนักงาน บริษัท TEC จำกัด");		
		frame.setSize(840,840);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		 		frame.add(label);
		 		frame.add(label1);
		 		frame.add(label2);
		 		frame.add(label3);
		 			frame.add(label31);
		 			frame.add(tf31);
		 			frame.add(label32);
		 			frame.add(tf32);
		 			frame.add(label33);
		 			frame.add(tf33);
		 			frame.add(label34);
		 			frame.add(tf34);
		 			frame.add(label35);
		 			frame.add(male);
		 			frame.add(female);
		 			frame.add(label36);
		 			frame.add(tf36);
		 			frame.add(label37);
		 			frame.add(label38);
		 			frame.add(tf38);
		 		frame.add(label4);
		 			frame.add(label41);
		 			frame.add(combobox41);
		 			frame.add(label42);
		 			frame.add(combobox42);
		 			frame.add(label43);
		 			frame.add(combobox43);
		 			frame.add(label44);
		 			frame.add(combobox44);
		 			frame.add(label45);
		 			frame.add(combobox45);
		 		frame.add(label5);
		 			frame.add(label51);
		 			frame.add(combobox51);
		 		frame.add(label52);
		 			frame.add(combobox52);
		 			frame.add(label53);
		 			frame.add(combobox53);		 			
		 				JLabel m = new JLabel("ชาย");
		 			m.setFocusable(false);
					m.setFont(new Font("tahoma",Font.PLAIN,12));
					m.setBounds(195, 300,50, 20);			
						JLabel fm = new JLabel("หญิง");
					fm.setFocusable(false);
					fm.setFont(new Font("tahoma",Font.PLAIN,12));
					fm.setBounds(195, 300,50, 20);		
		 JButton button = new JButton();
		 button.setBounds(400,750,60,30);
		 button.setText("ตกลง");
		 button.setFont(new Font("tahoma",Font.PLAIN,11));
		 button.setFocusable(false);
		 button.setBorder(BorderFactory.createLineBorder(Color.black,1));
		 button.setBackground(Color.white);
		 button.addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent event ) {					
				if(event.getSource()==button)	{					
						frame.dispose();						
						test4 t = new test4();					
						t.lb31.setText(tf31.getText());
						t.lb32.setText(tf32.getText());
						t.lb33.setText(tf33.getText());
						t.lb34.setText(tf34.getText());
						t.lb36.setText(tf36.getText());
						t.lb38.setText(tf38.getText());						
					String qualString41 = combobox41.getSelectedItem().toString();
					t.cb41.setText(qualString41);					
					String qualString42 = combobox42.getSelectedItem().toString();
					t.cb42.setText(qualString42);					
					String qualString43 = combobox43.getSelectedItem().toString();
					t.cb43.setText(qualString43);				
					String qualString44 = combobox44.getSelectedItem().toString();
					t.cb44.setText(qualString44);				
					String qualString45 = combobox45.getSelectedItem().toString();
					t.cb45.setText(qualString45);					
					String posString51 = combobox51.getSelectedItem().toString();
					t.cb51.setText(posString51);					
					String posString52 = combobox52.getSelectedItem().toString();
					t.cb52.setText(posString52);					
					String posString53 = combobox53.getSelectedItem().toString();
					t.cb53.setText(posString53);						
				if (male.isSelected()) { 
					t.frame.add(m);
				}
				if (female.isSelected()) {
					t.frame.add(fm);
				}								
					}				
								}
							 });		 
		 ButtonGroup gender = new ButtonGroup();
		 gender.add(male);
		 gender.add(female);			
		frame.add(button);		
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(null);
	}

}
	


