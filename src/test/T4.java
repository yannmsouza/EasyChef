package test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;




public class T4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T4 window = new T4();
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
	public T4() {
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
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 255, 224));
		panel_1.setBounds(50, 27, 844, 102);
		panel.add(panel_1);
		
		JLabel lblBemVindoChef = new JLabel("Bem Vindo Chef");
		lblBemVindoChef.setHorizontalAlignment(SwingConstants.LEFT);
		lblBemVindoChef.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		lblBemVindoChef.setBounds(6, 6, 345, 33);
		panel_1.add(lblBemVindoChef);
		
		JButton btnNovaReceita = new JButton("Nova Receita");
		btnNovaReceita.setBackground(new Color(153, 255, 153));
		btnNovaReceita.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnNovaReceita.setBounds(6, 57, 160, 33);
		panel_1.add(btnNovaReceita);
		
		JButton btnEditarReceita = new JButton("Editar Receita");
		btnEditarReceita.setBackground(new Color(204, 255, 255));
		btnEditarReceita.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnEditarReceita.setBounds(178, 57, 160, 33);
		panel_1.add(btnEditarReceita);
		
		JButton btnExcluirReceita = new JButton("Excluir Receita");
		btnExcluirReceita.setBackground(new Color(255, 153, 51));
		btnExcluirReceita.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnExcluirReceita.setBounds(354, 57, 166, 33);
		panel_1.add(btnExcluirReceita);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(264, 0, 11, 21);
		panel.add(verticalGlue);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(43, 76, -45, 0);
		panel.add(horizontalGlue);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalGlue_1.setBounds(457, 130, 12, 64);
		panel.add(verticalGlue_1);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1045, 749);
		label.setIcon(new ImageIcon("/home/yann/Downloads/anise-aroma-art-277253.jpg"));
		panel.add(label);
		
		
	}
}
