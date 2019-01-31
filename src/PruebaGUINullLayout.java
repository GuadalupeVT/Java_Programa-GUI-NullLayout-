import java.awt.*;
import javax.swing.*;

class VentanaPrincipal extends JFrame{
	public VentanaPrincipal(){
		getContentPane().setLayout(null);
		setSize(700, 650);
		setTitle("Ventana Principal");	
		//setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setVisible(true);
		
		
		JPanel panel1= new JPanel();
		panel1.setBounds(1, 0, 302, 650);
		panel1.setBackground(Color.WHITE);
				
		panel1.add(new JLabel("                                   "));
		Font fuente =new Font("Arial",523,14);
		JLabel label1 = new JLabel("<html><p>The <b>Clasic Form</b> to includes all visible fields for <br> this list </p></html>");
		label1.setFont( fuente );
		panel1.add(label1);
	    
		panel1.add(new JLabel(" "));
		 
		JLabel label2=new JLabel("Form options                                       ");
		label2.setFont( new Font( "Arial", 523, 18 ) );
		panel1.add(label2, BorderLayout.EAST);
		
		JLabel label3=new JLabel ("Include the following:                                        ");
		label3.setFont(fuente);
		panel1.add(label3);
		
		JCheckBox caja1= new JCheckBox("a little for your form                                   ");
		caja1.setAlignmentX(0);
		caja1.setBackground(Color.WHITE);
		caja1.setFont(fuente);
		panel1.add(caja1);
		
		JTextArea areaTexto1 =new JTextArea("Subscribe to our mailing list",1,25);
		areaTexto1.setAlignmentX(SwingConstants.LEFT);
		areaTexto1.setLineWrap(true);
		areaTexto1.setWrapStyleWord(true);
		areaTexto1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		panel1.add(areaTexto1);
		
		panel1.add(new JLabel("                                                                         "));
		
		ButtonGroup bg= new ButtonGroup();
		JRadioButton rboton1=new JRadioButton("only requiered fields                                      ");
		bg.add(rboton1);
		rboton1.setBackground(Color.WHITE);
		rboton1.setFont(fuente);
		panel1.add(rboton1);
		JRadioButton rboton2=new JRadioButton("all fields                                                          ");
		bg.add(rboton2);
		rboton2.setBackground(Color.WHITE);
		rboton2.setFont(fuente);
		panel1.add(rboton2);
		
		JLabel label4=new JLabel ("(edit requiered fields in");
		label4.setFont(fuente);
		panel1.add(label4);
		JLabel label5=new JLabel ("the form builder");
		label5.setFont(fuente);
		label5.setForeground(Color.BLUE);
		panel1.add(label5);
		JLabel label6 =new JLabel(")");
		label6.setFont(fuente);
		panel1.add(label6);
		
		panel1.add(new JLabel("                                                                         "));
		
		JCheckBox caja2= new JCheckBox("interest group fields                                      ");
		caja2.setAlignmentX(0);
		caja2.setBackground(Color.WHITE);
		caja2.setFont(fuente);
		panel1.add(caja2);
		
		JCheckBox caja3= new JCheckBox("requiered field indicators                               ");
		caja3.setAlignmentX(0);
		caja3.setBackground(Color.WHITE);
		caja3.setFont(fuente);
		panel1.add(caja3);
		
		panel1.add(new JLabel("                                                                         "));
		
		
		JLabel label7 =new JLabel("Set form width                                             ");
		label7.setFont(fuente);
		panel1.add(label7);
		
		JTextArea areaTexto2 =new JTextArea("",1,25);
		areaTexto2.setAlignmentX(SwingConstants.LEFT);
		areaTexto2.setLineWrap(true);
		areaTexto2.setWrapStyleWord(true);
		areaTexto2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		panel1.add(areaTexto2);
		
		panel1.add(new JLabel("                                                                         "));
		
		JLabel label8 =new JLabel("Enhance your form                                           ");
		label8.setFont(fuente);
		panel1.add(label8);
		
		JCheckBox caja4= new JCheckBox("<html>enable <b>evil</b> popup mode </html>");
		caja4.setAlignmentX(0);
		caja4.setBackground(Color.WHITE);
		caja4.setFont(fuente);
		panel1.add(caja4);
		panel1.add(new JLabel("                                   "));
		JCheckBox caja5= new JCheckBox("<html>disable all <b>JavaScript</b></html>");
		caja5.setAlignmentX(0);
		caja5.setBackground(Color.WHITE);
		caja5.setFont(fuente);
		panel1.add(caja5);
		panel1.add(new JLabel("                                        "));
		JCheckBox caja6= new JCheckBox("include archive link                                     ");
		caja6.setAlignmentX(0);
		caja6.setBackground(Color.WHITE);
		caja6.setFont(fuente);
		panel1.add(caja6);
		JCheckBox caja7= new JCheckBox("include");
		caja7.setAlignmentX(0);
		caja7.setBackground(Color.WHITE);
		caja7.setFont(fuente);
		panel1.add(caja7);
		JLabel label9=new JLabel ("MonkeyRewards link                      ");
		label9.setFont(fuente);
		label9.setForeground(Color.BLUE);
		panel1.add(label9);
	    add(panel1);
	    
	    JPanel panel2= new JPanel();
		panel2.setBounds(302, 0, 400, 650);
		panel2.setBackground(Color.WHITE);
				
		panel2.add(new JLabel("                                                                       "));
	    
		JLabel label10 = new JLabel("Preview                                                            ");
		label10.setFont(new Font( "Arial", 523, 18 ) );
		panel2.add(label10);
		
		JPanel panel3=new JPanel();
		panel3.setPreferredSize(new Dimension(360,200));
		panel3.setAutoscrolls(true);
		
		JLabel label11=new JLabel("                                             *");
		label11.setFont(fuente);
		label11.setForeground(Color.RED);
		panel3.add(label11);
		JLabel label12=new JLabel("indicates required");
		label12.setFont(fuente);
		panel3.add(label12);
		
		panel3.add(new JLabel("                                             "));
		
		JLabel label13=new JLabel("Email Address                                                              ");
		label13.setFont(fuente);
		panel3.add(label13);
		  
		JTextField cajaEmail = new JTextField(30);
		panel3.add(cajaEmail);
		
		JLabel label14=new JLabel("First Name                                                                  ");
		label14.setFont(fuente);
		panel3.add(label14);
		
		JTextField cajaFN = new JTextField(30);
		panel3.add(cajaFN);
		
		JLabel label15=new JLabel("Last Name                                                                  ");
		label15.setFont(fuente);
		panel3.add(label15);
		
		JTextField cajaLN = new JTextField(30);
		panel3.add(cajaLN);
		
		JButton btn1=new JButton("Subscribe");
		panel3.add(btn1,BorderLayout.PAGE_START);
		
		panel3.add(new JLabel("                                                                           "));
		
		
		
		panel2.add(panel3);
		add(panel2);
	}
	
}

public class PruebaGUINullLayout {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
			
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new VentanaPrincipal();	
				}
			});
		

	}

}
