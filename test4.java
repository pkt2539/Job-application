import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class test4   {
	private static final String String = null;
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				test4 d = new test4();				
			}
		});		
	}		
	JFrame frame = new JFrame("Ẻ?????????Ѥþ?ѡ?ҹ ????ѷ TEC ?ӡѴ");
	JLabel lb31 =new JLabel();
	JLabel lb32 = new JLabel();
	JLabel lb33 = new JLabel();
	JLabel lb34 = new JLabel();
	JLabel lb36 = new JLabel();
	JLabel lb38 = new JLabel();
	JLabel cb41 = new JLabel();
	JLabel cb42 = new JLabel();
	JLabel cb43 = new JLabel();
	JLabel cb44 = new JLabel();
	JLabel cb45 = new JLabel();
	JLabel cb51 = new JLabel();
	JLabel cb52 = new JLabel();
	JLabel cb53 = new JLabel();		
 public test4()  {     	 
	 	test2 t2 = new test2 (); 	 	
	    JLabel label = new JLabel("????ѷ TEC ?ӡѴ");
	 	label.setFont(new Font("tahoma",Font.PLAIN,20));
		label.setBounds(290, 25, 400, 100);		
		JLabel label1 = new JLabel("Ẻ???????Ѥþ?ѡ?ҹ");		
		label1.setFont(new Font("tahoma",Font.PLAIN,16));
		label1.setBounds(300, 70, 500, 100);		
		JLabel label2 = new JLabel("????Ѥ?????Ѻ?ҹ??ҹ ICT ??? ????????Ѥá?͡????????´???仹??????ͷ??");	
		label2.setFont(new Font("tahoma",Font.PLAIN,16));
		label2.setBounds(150, 90, 500, 100);		
		JLabel label3 = new JLabel("????ѷ STOU-TEC ?ӡѴ ?зӡ?äѴ???͡??????????????");
		label3.setFont(new Font("tahoma",Font.PLAIN,16));
		label3.setBounds(190, 120, 500, 100);			
		    JLabel label31 = new JLabel("?Ţ??Шӵ?Ǣͧ?????Ѥ? (AP_ID) :");
			label31.setFont(new Font("tahoma",Font.PLAIN,12));
			label31.setBounds(20, 160, 500, 100);				
				lb31.setFont(new Font("tahoma",Font.PLAIN,12));
				lb31.setBounds(195, 200, 500, 20);				
			JLabel label32 = new JLabel("????-???ʡ??          (AP_NAME) :");
			label32.setFont(new Font("tahoma",Font.PLAIN,12));
			label32.setBounds(20, 185, 500, 100);					
				lb32.setFont(new Font("tahoma",Font.PLAIN,12));
				lb32.setBounds(195, 225, 500, 20);			
			JLabel label33 = new JLabel("???????              (AP_ADDRESS) :");			
			label33.setFont(new Font("tahoma",Font.PLAIN,12));
			label33.setBounds(20, 210, 500, 100);					
				lb33.setFont(new Font("tahoma",Font.PLAIN,12));
				lb33.setBounds(195, 250, 500, 20);			
			JLabel label34 = new JLabel("?ѧ??Ѵ                 (AP_CHW) :");			
			label34.setFont(new Font("tahoma",Font.PLAIN,12));
			label34.setBounds(20, 235, 500, 100);					
				lb34.setFont(new Font("tahoma",Font.PLAIN,12));
				lb34.setBounds(195, 275, 500, 20);			
			JLabel label35 = new JLabel("???                     (AP_SEX) :");
			label35.setFont(new Font("tahoma",Font.PLAIN,12));
			label35.setBounds(20, 260, 500, 100);				
			JLabel label36 = new JLabel("?زԡ???֡?Ң????٧?ش (AP_ED) :");			
			label36.setFont(new Font("tahoma",Font.PLAIN,12));
			label36.setBounds(20, 285, 500, 100);			
				lb36.setFont(new Font("tahoma",Font.PLAIN,12));
				lb36.setBounds(195, 325, 500, 20);			
			JLabel label37 = new JLabel("(???? B.S.,B.A.,M.S.,M.BA,M.A.)");			
			label37.setFont(new Font("tahoma",Font.PLAIN,12));
			label37.setBounds(20, 310, 500, 100);			
			JLabel label38 = new JLabel("?Ԫ??͡                (AP_MAJ) :");			
			label38.setFont(new Font("tahoma",Font.PLAIN,12));
			label38.setBounds(20, 335, 500, 100);			
				lb38.setFont(new Font("tahoma",Font.PLAIN,12));
				lb38.setBounds(195, 375, 500, 20);					
		JLabel label4 = new JLabel ("??????????????ö???ͤس???ѵ?੾?е??˹?? (QUAL_DESC)(?ͺ????????Թ 5 ??¡??)");		
		label4.setFont(new Font("tahoma",Font.BOLD,16));
		label4.setBounds(40,360, 800, 100);				
			JLabel label41 = new JLabel("???????????????ö 1             :");			
			label41.setFont(new Font("tahoma",Font.PLAIN,12));
			label41.setBounds(20,385, 500, 100);		
				cb41.setFont(new Font("tahoma",Font.PLAIN,12));			
				cb41.setBounds(195, 425, 500, 20);			
			JLabel label42 = new JLabel("???????????????ö 2             :");			
			label42.setFont(new Font("tahoma",Font.PLAIN,12));
			label42.setBounds(20,410, 500, 100);			
				cb42.setFont(new Font("tahoma",Font.PLAIN,12));			
				cb42.setBounds(195, 450, 500, 20);			
			JLabel label43 = new JLabel("???????????????ö 3             :");			
			label43.setFont(new Font("tahoma",Font.PLAIN,12));
			label43.setBounds(20,435, 500, 100);			
				cb43.setFont(new Font("tahoma",Font.PLAIN,12));			
				cb43.setBounds(195, 475, 500, 20);			
			JLabel label44 = new JLabel("???????????????ö 4             :");			
			label44.setFont(new Font("tahoma",Font.PLAIN,12));
			label44.setBounds(20,460, 500, 100);			
				cb44.setFont(new Font("tahoma",Font.PLAIN,12));			
				cb44.setBounds(195, 500, 500, 20);		
			JLabel label45 = new JLabel("???????????????ö 5             :");			
			label45.setFont(new Font("tahoma",Font.PLAIN,12));
			label45.setBounds(20,485, 500, 100);			
				cb45.setFont(new Font("tahoma",Font.PLAIN,12));			
				cb45.setBounds(195, 525, 500, 20);			
		JLabel label5 = new JLabel("???˹觷????ͧ?????Ѥ? (POS_NAME) : (?ͺ????????Թ 3 ???˹??)");		
		label5.setFont(new Font("tahoma",Font.BOLD,16));
		label5.setBounds(40, 510, 500, 100);			
			JLabel label51 = new JLabel("???˹觷????ͧ?????Ѥ? 1        :");			
			label51.setFont(new Font("tahoma",Font.PLAIN,12));
			label51.setBounds(20,535, 500, 100);						
				cb51.setFont(new Font("tahoma",Font.PLAIN,12));			
				cb51.setBounds(195, 575, 500, 20);			
			JLabel label52 = new JLabel("???˹觷????ͧ?????Ѥ? 2        :");			
			label52.setFont(new Font("tahoma",Font.PLAIN,12));
			label52.setBounds(20,560, 500, 100);			
				cb52.setFont(new Font("tahoma",Font.PLAIN,12));			
				cb52.setBounds(195, 600, 500, 20);			
			JLabel label53 = new JLabel("???˹觷????ͧ?????Ѥ? 3        :");			
			label53.setFont(new Font("tahoma",Font.PLAIN,12));
			label53.setBounds(20,585, 500, 100);			
				cb53.setFont(new Font("tahoma",Font.PLAIN,12));			
				cb53.setBounds(195, 625, 500, 20);					
		frame.setSize(840,840);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 		frame.add(label);
		 		frame.add(label1);
		 		frame.add(label2);
		 		frame.add(label3);
		 			frame.add(label31);
		 				frame.add(lb31);
		 			frame.add(label32);
		 				frame.add(lb32);
		 			frame.add(label33);
		 				frame.add(lb33);
		 			frame.add(label34);
		 				frame.add(lb34);
		 			frame.add(label35);		 			
		 			frame.add(label36);
		 				frame.add(lb36);
		 			frame.add(label37);
		 			frame.add(label38);
		 				frame.add(lb38);
		 		frame.add(label4);
		 			frame.add(label41);	
		 				frame.add(cb41);
		 			frame.add(label42);
		 				frame.add(cb42);
		 			frame.add(label43);
		 				frame.add(cb43);
		 			frame.add(label44);	
		 				frame.add(cb44);
		 			frame.add(label45);
		 				frame.add(cb45);
		 		frame.add(label5);
		 			frame.add(label51);
		 				frame.add(cb51);
		 			frame.add(label52);
		 				frame.add(cb52);
		 			frame.add(label53);
		 				frame.add(cb53);		 				
		 JButton button = new JButton();
		 button.setBounds(400,750,60,30);
		 button.setText("?????");
		 button.setFont(new Font("tahoma",Font.PLAIN,11));
		 button.setFocusable(false);
		 button.setBorder(BorderFactory.createLineBorder(Color.black,1));
		 button.setBackground(Color.white);
		 button.addActionListener(new ActionListener() {				
				public void actionPerformed(ActionEvent event) {				
				if(event.getSource()==button) {
						frame.dispose();
						test2 t2 = new test2();						
					}					
				}				 
			 });	 			
		frame.add(button);		
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(null); 	
	}	
	}

	