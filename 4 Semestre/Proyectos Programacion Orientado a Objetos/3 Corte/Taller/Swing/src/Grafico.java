import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grafico {

	private JFrame frame;
	private JTextField txtvalor1;
	private JTextField txtvalor2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafico window = new Grafico();
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
	public Grafico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 352, 233);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngresePrimerValor = new JLabel("Ingrese Primer Valor: ");
		lblIngresePrimerValor.setBounds(10, 11, 135, 14);
		frame.getContentPane().add(lblIngresePrimerValor);
		
		txtvalor1 = new JTextField();
		txtvalor1.setBounds(155, 8, 86, 20);
		frame.getContentPane().add(txtvalor1);
		txtvalor1.setColumns(10);
		
		JLabel lblIngreseSegundoValor = new JLabel("Ingrese Segundo Valor:");
		lblIngreseSegundoValor.setBounds(10, 36, 135, 14);
		frame.getContentPane().add(lblIngreseSegundoValor);
		
		txtvalor2 = new JTextField();
		txtvalor2.setBounds(155, 33, 86, 20);
		frame.getContentPane().add(txtvalor2);
		txtvalor2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(10, 73, 135, 14);
		frame.getContentPane().add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(155, 70, 86, 20);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valor1 = Integer.parseInt(txtvalor1.getText());
				int valor2 = Integer.parseInt(txtvalor2.getText());
				
				int suma = valor1 + valor2;
				
				txtResultado.setText(String.valueOf(suma));;
				
			}
		});
		btnSumar.setBounds(155, 116, 89, 23);
		frame.getContentPane().add(btnSumar);
	}
}
