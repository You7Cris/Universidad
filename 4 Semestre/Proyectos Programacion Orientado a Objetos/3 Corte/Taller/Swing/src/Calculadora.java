import java.awt.Color;
import java.awt.EventQueue;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JPanel;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class Calculadora extends JFrame {

	private JFrame frame;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
		
		
		
	}
	
	float numero1;
	float numero2;
	float resultado;
	String operacion;
	
	JPanel panel = new JPanel();
	
	
	
	//Locale spanish = new Locale("es","ES");
	//NumberFormat nf = NumberFormat.getInstance(spanish);

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 472, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"1");
			}
		});
		button1.setBounds(32, 179, 89, 49);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"2");
			}
		});
		button2.setBounds(131, 179, 89, 49);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"3");
			}
			
			
		});
		button3.setBounds(232, 179, 89, 49);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"4");
			}
		});
		button4.setBounds(32, 239, 89, 49);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"5");
			}
		});
		button5.setBounds(131, 239, 89, 49);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"6");
			}
		});
		button6.setBounds(232, 239, 89, 49);
		frame.getContentPane().add(button6);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"8");
			}
		});
		button8.setBounds(131, 299, 89, 49);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"9");
			}
		});
		button9.setBounds(232, 299, 89, 49);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"0");
			}
		});
		button0.setBounds(32, 359, 89, 49);
		frame.getContentPane().add(button0);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText("");
				
			}
		});
		btnCE.setBounds(232, 112, 89, 49);
		frame.getContentPane().add(btnCE);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cadena;
				cadena = txtResultado.getText();
				
				if(cadena.length()<=0)
				{
					
					
				}else
				{
					operacion="+";
					numero1 = Float.parseFloat(txtResultado.getText());
					txtResultado.setText("");
				}
				
				
				
			}
		});
		btnSuma.setBounds(351, 112, 89, 49);
		frame.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena = txtResultado.getText();
				
				if(cadena.length()<=0)
				{
					
					
				}else
				{
					operacion="-";
					numero1 = Float.parseFloat(txtResultado.getText());
					txtResultado.setText("");
				}
			}
		});
		btnResta.setBounds(351, 179, 89, 49);
		frame.getContentPane().add(btnResta);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String cadena;
				cadena = txtResultado.getText();
				
				if(cadena.length()<=0)
				{
					
					
				}else
				{
					operacion="/";
					numero1 = Float.parseFloat(txtResultado.getText());
					txtResultado.setText("");
				}
			}
		});
		btnDividir.setBounds(351, 239, 89, 49);
		frame.getContentPane().add(btnDividir);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cadena;
				cadena = txtResultado.getText();
				
				if(cadena.length()<=0)
				{
					
					
				}else
				{
					String cadena2;
					cadena2 = txtResultado.getText();
					if(cadena2.length()<=0)
					{
						
					}else {
						numero2 = Float.parseFloat(txtResultado.getText());
						txtResultado.setText("");
						switch(operacion)
						{
						case "+":
							resultado = numero1 + numero2;
							txtResultado.setText(String.valueOf(resultado));
							break;
						case "-":
							resultado = numero1 - numero2;
							txtResultado.setText(String.valueOf(resultado));
							break;
						case "*":
							resultado = numero1 * numero2;
							txtResultado.setText(String.valueOf(resultado));
						case "/":
							if(numero1 == 0)
							{
								txtResultado.setText("Error");
							}else {
								resultado = numero1 / numero2;
								txtResultado.setText(String.valueOf(resultado));
							}
							break;
						}
					}
					
				}
			}
		});
		btnIgual.setBounds(131, 359, 190, 49);
		frame.getContentPane().add(btnIgual);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtResultado.setText(txtResultado.getText()+"7");
			}
		});
		button7.setBounds(32, 299, 89, 49);
		frame.getContentPane().add(button7);
		
		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setEditable(false);
		txtResultado.setBounds(232, 52, 197, 49);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cadena;
				cadena = txtResultado.getText();
				
				if(cadena.length()<=0)
				{
					
					
				}else
				{
					operacion="*";
					numero1 = Float.parseFloat(txtResultado.getText());
					txtResultado.setText("");
				}
			}
		});
		btnMultiplicar.setBounds(351, 299, 89, 49);
		frame.getContentPane().add(btnMultiplicar);
		
		JButton button = new JButton(",");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cadena;
				cadena = txtResultado.getText();
				
				if(cadena.length()<=0)
				{
					txtResultado.setText("0. ");
				}
				else {
					if(!existepunto(txtResultado.getText()))
					{
						txtResultado.setText(txtResultado.getText()+".");
					}
				}
			}
		});
		button.setBounds(351, 359, 89, 49);
		frame.getContentPane().add(button);
		
	}
	
	public static boolean existepunto(String cadena)
	{
		boolean f;
		f = false;
		
		for(int i=0;i<cadena.length();i++)
		{
			if(cadena.substring(i,i+1).equals(".")) //empieza desde la posicion i hasta la longitud de la cadena, va a comparar la cadena si se encuentra un punto.
			{
				f = true;
				break;
			}
		}
		return f;
	}
	
	/*
	private void iniciar() {
		JPanel panel = new JPanel(); //Se crea el panel
		
		this.getContentPane().add(panel); //Agregar el panel
		
		panel.setBackground(Color.cyan);
		
		
		
		
		
		
	}*/ //Crear Panel
	
	

}
