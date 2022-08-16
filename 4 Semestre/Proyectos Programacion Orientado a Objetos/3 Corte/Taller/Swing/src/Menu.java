import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.SwingConstants;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;
import java.awt.*;
import javax.swing.AbstractAction;
import javax.swing.Action;




public class Menu {

	private JFrame frame;
	
	JMenuBar barraMenu = new JMenuBar();
	String opcion;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar MenuBar = new JMenuBar();
		frame.setJMenuBar(MenuBar);
		
		JMenu mnColor = new JMenu("Color");
		MenuBar.add(mnColor);
		
		JMenuItem mntmAzul = new JMenuItem("Azul");
		mntmAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getContentPane().setBackground(Color.BLUE);
			}
		});
		mntmAzul.setBackground(Color.BLUE);
		mnColor.add(mntmAzul);
		
		JMenuItem mntmRojo = new JMenuItem("Rojo");
		mntmRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getContentPane().setBackground(Color.RED);
			}
		});
		mntmRojo.setBackground(Color.RED);
		mnColor.add(mntmRojo);
		
		JMenuItem mntmNegro = new JMenuItem("Negro");
		mntmNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getContentPane().setBackground(Color.BLACK);
			}
		});
		mntmNegro.setBackground(Color.BLACK);
		mnColor.add(mntmNegro);
		
		JMenuItem mntmVerde = new JMenuItem("Verde");
		mntmVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getContentPane().setBackground(Color.GREEN);
			}
		});
		mntmVerde.setBackground(Color.GREEN);
		mnColor.add(mntmVerde);
		
		
	}
	

}
