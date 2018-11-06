package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Label;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import javax.swing.SwingConstants;


import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class T2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T2 window = new T2();
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
	public T2() {
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
		panel_1.setBounds(308, 198, 357, 249);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		lblNewLabel.setBounds(6, 6, 345, 33);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(48, 70, 264, 37);
		textField.setFont(new Font("Ubuntu", Font.PLAIN, 28));
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(48, 109, 264, 37);
		textField_1.setFont(new Font("Ubuntu", Font.PLAIN, 28));
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}	
		});
		btnOk.setBounds(127, 158, 117, 33);
		panel_1.add(btnOk);
		
		Label label_1 = new Label("Não possui conta? Cadastre-se");
		label_1.setBounds(12, 218, 232, 21);
		panel_1.add(label_1);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(604, 265, 12, -265);
		panel.add(verticalGlue);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1045, 749);
		label.setIcon(new ImageIcon("/home/yann/Downloads/anise-aroma-art-277253.jpg"));
		panel.add(label);
		
		
	}
}
