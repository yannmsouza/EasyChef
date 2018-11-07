package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class T6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T6 window = new T6();
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
	public T6() {
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
		panel_1.setBackground(new Color(238, 232, 170));
		panel_1.setBounds(50, 27, 897, 620);
		panel.add(panel_1);
		
		JLabel lblInserirNovaReceita = new JLabel("Receita");
		lblInserirNovaReceita.setHorizontalAlignment(SwingConstants.LEFT);
		lblInserirNovaReceita.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		lblInserirNovaReceita.setBounds(12, 12, 272, 33);
		panel_1.add(lblInserirNovaReceita);
		

		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblNome.setBounds(12, 57, 81, 33);
		panel_1.add(lblNome);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescrio.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblDescrio.setBounds(22, 141, 182, 33);
		panel_1.add(lblDescrio);
		
		JLabel lblIngredientes = new JLabel("Ingredientes");
		lblIngredientes.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngredientes.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblIngredientes.setBounds(22, 230, 182, 33);
		panel_1.add(lblIngredientes);
		
		JLabel lblModoDePreparo = new JLabel("Modo de Preparo");
		lblModoDePreparo.setHorizontalAlignment(SwingConstants.LEFT);
		lblModoDePreparo.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblModoDePreparo.setBounds(22, 335, 182, 33);
		panel_1.add(lblModoDePreparo);
		
		JLabel lblObservaes = new JLabel("Observações");
		lblObservaes.setHorizontalAlignment(SwingConstants.LEFT);
		lblObservaes.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblObservaes.setBounds(22, 433, 182, 33);
		panel_1.add(lblObservaes);

		
		JLabel lblTempoDePreparo = new JLabel("Tempo de Preparo");
		lblTempoDePreparo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTempoDePreparo.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblTempoDePreparo.setBounds(499, 241, 187, 33);
		panel_1.add(lblTempoDePreparo);
		
		JLabel lblAvaliao = new JLabel("Avaliação");
		lblAvaliao.setHorizontalAlignment(SwingConstants.LEFT);
		lblAvaliao.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblAvaliao.setBounds(499, 447, 123, 33);
		panel_1.add(lblAvaliao);
		
		JRadioButton rdbtnBom = new JRadioButton("0");
		rdbtnBom.setBackground(new Color(224, 255, 255));
		rdbtnBom.setBounds(497, 488, 44, 23);
		panel_1.add(rdbtnBom);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBackground(new Color(224, 255, 255));
		radioButton.setBounds(545, 488, 44, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBackground(new Color(224, 255, 255));
		radioButton_1.setBounds(593, 488, 44, 23);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBackground(new Color(224, 255, 255));
		radioButton_2.setBounds(642, 488, 44, 23);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.setBackground(new Color(224, 255, 255));
		radioButton_3.setBounds(690, 488, 44, 23);
		panel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.setBackground(new Color(224, 255, 255));
		radioButton_4.setBounds(738, 488, 44, 23);
		panel_1.add(radioButton_4);
		
		JLabel lblTeorCalrico = new JLabel("Teor Calórico");
		lblTeorCalrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblTeorCalrico.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblTeorCalrico.setBounds(499, 335, 187, 33);
		panel_1.add(lblTeorCalrico);
		
		
		JLabel lblImage = new JLabel("Imagem");
		lblImage.setBounds(547, 91, 70, 15);
		panel_1.add(lblImage);
		
		JButton btnSalvar = new JButton("Editar");
		btnSalvar.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnSalvar.setBackground(new Color(204, 255, 255));
		btnSalvar.setBounds(719, 561, 111, 33);
		panel_1.add(btnSalvar);
		
		JTextPane txtpnExemplo_6 = new JTextPane();
		txtpnExemplo_6.setEditable(false);
		txtpnExemplo_6.setText("Exemplo");
		txtpnExemplo_6.setBounds(12, 91, 356, 38);
		panel_1.add(txtpnExemplo_6);
		
		JTextPane txtpnExemplo_4 = new JTextPane();
		txtpnExemplo_4.setEditable(false);
		txtpnExemplo_4.setText("Exemplo");
		txtpnExemplo_4.setBounds(499, 275, 272, 38);
		panel_1.add(txtpnExemplo_4);
		
		JTextPane txtpnExemplo_5 = new JTextPane();
		txtpnExemplo_5.setEditable(false);
		txtpnExemplo_5.setText("Exemplo");
		txtpnExemplo_5.setBounds(499, 366, 272, 38);
		panel_1.add(txtpnExemplo_5);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnVoltar.setBackground(new Color(255, 228, 181));
		btnVoltar.setBounds(566, 561, 111, 33);
		panel_1.add(btnVoltar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 174, 356, 55);
		panel_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLocation(12, 0);
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 268, 356, 55);
		panel_1.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		scrollPane_1.setViewportView(textArea_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 474, 356, 120);
		panel_1.add(scrollPane_2);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		scrollPane_2.setViewportView(textArea_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 366, 356, 55);
		panel_1.add(scrollPane_3);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		scrollPane_3.setViewportView(textArea_3);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1045, 749);
		label.setIcon(new ImageIcon("/home/yann/Downloads/anise-aroma-art-277253.jpg"));
		panel.add(label);
	}
}
