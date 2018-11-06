package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class T5 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T5 window = new T5();
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
	public T5() {
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
		panel_1.setBounds(50, 27, 897, 620);
		panel.add(panel_1);
		
		JLabel lblInserirNovaReceita = new JLabel("Inserir Nova Receita");
		lblInserirNovaReceita.setHorizontalAlignment(SwingConstants.LEFT);
		lblInserirNovaReceita.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		lblInserirNovaReceita.setBounds(12, 12, 272, 33);
		panel_1.add(lblInserirNovaReceita);
		
		textField = new JTextField();
		textField.setFont(new Font("Ubuntu", Font.PLAIN, 28));
		textField.setColumns(10);
		textField.setBounds(22, 90, 503, 37);
		panel_1.add(textField);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblNome.setBounds(22, 57, 81, 33);
		panel_1.add(lblNome);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescrio.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblDescrio.setBounds(22, 139, 182, 33);
		panel_1.add(lblDescrio);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 169, 503, 131);
		panel_1.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(22, 340, 503, 131);
		panel_1.add(textArea_1);
		
		JLabel lblIngredientes = new JLabel("Ingredientes");
		lblIngredientes.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngredientes.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblIngredientes.setBounds(22, 310, 182, 33);
		panel_1.add(lblIngredientes);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(22, 513, 503, 131);
		panel_1.add(textArea_2);
		
		JLabel lblModoDePreparo = new JLabel("Modo de Preparo");
		lblModoDePreparo.setHorizontalAlignment(SwingConstants.LEFT);
		lblModoDePreparo.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblModoDePreparo.setBounds(22, 483, 182, 33);
		panel_1.add(lblModoDePreparo);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1045, 749);
		label.setIcon(new ImageIcon("/home/yann/Downloads/anise-aroma-art-277253.jpg"));
		panel.add(label);
	}
}
