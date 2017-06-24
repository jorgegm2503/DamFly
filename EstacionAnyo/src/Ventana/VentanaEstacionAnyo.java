package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.JButton;


/*
 * By Paco Gomez
 * Esta ventana tendrá dos JTextFields
 * El primero recojerá el DNI
 * El segundo calculará la letra al apretar el botón
 * 
 * */
public class VentanaEstacionAnyo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;



	/**
	 * Create the frame.
	 */
	public VentanaEstacionAnyo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 5, 0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Introduce el numero del mes:");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Validar");
		panel.add(btnNewButton);
		
		Component verticalGlue = Box.createVerticalGlue();
		contentPane.add(verticalGlue);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel lblLaEstacionDel = new JLabel("La estacion del a\u00F1o es:");
		panel_1.add(lblLaEstacionDel);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
	}

}
