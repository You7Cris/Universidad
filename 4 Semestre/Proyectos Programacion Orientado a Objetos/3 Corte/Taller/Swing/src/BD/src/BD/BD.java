package BD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BD {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_matricula;
	private JLabel lblresp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BD window = new BD();
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
	public BD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 483, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 11, 83, 14);
		frame.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(144, 8, 176, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(20, 47, 102, 14);
		frame.getContentPane().add(lblMatricula);
		
		textField_matricula = new JTextField();
		textField_matricula.setBounds(144, 44, 176, 20);
		frame.getContentPane().add(textField_matricula);
		textField_matricula.setColumns(10);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class .forName("com.mysql.jdbc.Driver");
					
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/universidad", "root", "");
					
					if(conexion!=null)
					{
						Statement st = conexion.createStatement();
						//System.out.println("Conexion a base de datos");
						lblresp.setText("Conexion a base de datos correcta");
						
					}else {
						System.out.println(" Conexion Fallida");
					}
				}
				catch ( SQLException e) {e .printStackTrace();}
				catch ( ClassNotFoundException e) {e .printStackTrace();}
				catch ( Exception e) { e .printStackTrace();
				}
			}
		});
		btnConectar.setBounds(58, 95, 89, 23);
		frame.getContentPane().add(btnConectar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Universidad", "root", "");
					
					Statement statement = conexion.createStatement();
					
					if(conexion !=null)
					{
						String nombre = textField.getText();
						String matricula = textField_matricula.getText();
						((java.sql.Statement)statement).executeUpdate("insert into alumnos(matricula,nombre) values('"+matricula+"','"+nombre+"')");
						lblresp.setText("Registro exitoso");
						conexion.close();
					}else {
						lblresp.setText("Error....");
					}
				}catch(ClassNotFoundException o)
				{
					o.printStackTrace();
				}catch(SQLException l)
				{
					l.printStackTrace();
				}
			}
		});
		btnAgregar.setBounds(149, 95, 89, 23);
		frame.getContentPane().add(btnAgregar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id = Integer.parseInt(textField_matricula.getText());
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Universidad", "root", "");
					Statement statement = conexion.createStatement();
					ResultSet resultSet = statement.executeQuery("Select nombre from alumnos where matricula="+id);
					
					if(resultSet.next() == true) {
						lblresp.setText(resultSet.getString("nombre"));
					}
					
					conexion.close();
					
				}
				catch(ClassNotFoundException e1) {
					e1.printStackTrace();
				}catch(SQLException e1)
				{
					e1.printStackTrace();
					
				}
				
			}
		});
		btnBuscar.setBounds(242, 95, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id = Integer.parseInt(textField_matricula.getText());
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Universidad","root", "");
					Statement statement = conexion.createStatement();
					
					if(conexion !=null)
					{
						String query = "Delete from alumnos where matricula ="+id;
						lblresp.setText("Alumno eliminado");
						statement.executeUpdate(query);
						
					}else {
						lblresp.setText("Error...");
					}
					
					
					conexion.close();
				}catch(ClassNotFoundException e1) {
					e1.printStackTrace();
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBorrar.setBounds(335, 95, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		lblresp = new JLabel("");
		lblresp.setBounds(58, 141, 366, 109);
		frame.getContentPane().add(lblresp);
	}
}
