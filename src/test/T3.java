package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class T3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T3 window = new T3();
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
	public T3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMaximumSize(new Dimension(893, 654));
		frame.setResizable(false);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 255, 224));
		panel_1.setBounds(260, 69, 415, 501);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBackground(new Color(224, 255, 255));
		btnOk.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}	
		});
		btnOk.setBounds(286, 457, 117, 33);
		panel_1.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 77, 391, 33);
		panel_1.add(lblNewLabel);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(224, 255, 255));
		btnCancelar.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnCancelar.setBounds(161, 457, 117, 33);
		panel_1.add(btnCancelar);
		
		textField = new JTextField();
		textField.setBounds(12, 115, 391, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("Cadastre-se");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		label_1.setBounds(12, 19, 397, 33);
		panel_1.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 192, 391, 33);
		panel_1.add(textField_1);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblEmail.setBounds(12, 160, 391, 33);
		panel_1.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 270, 391, 33);
		panel_1.add(textField_2);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblSenha.setBounds(12, 237, 391, 33);
		panel_1.add(lblSenha);
		
		JLabel lblConfirmaoDeSenha = new JLabel("Confirmação de Senha");
		lblConfirmaoDeSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblConfirmaoDeSenha.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblConfirmaoDeSenha.setBounds(12, 315, 391, 33);
		panel_1.add(lblConfirmaoDeSenha);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 348, 391, 33);
		panel_1.add(textField_3);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(604, 265, 12, -265);
		panel.add(verticalGlue);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1045, 749);
		label.setIcon(new ImageIcon("/home/yann/Downloads/anise-aroma-art-277253.jpg"));
		panel.add(label);
		
		
		
	}
}
