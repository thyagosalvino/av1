package avaliacao1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField qtd;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questao2 frame = new questao2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public questao2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA BOVINA");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel.setBounds(133, 25, 185, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblValoDaArroba = new JLabel("Valo da Arroba");
		lblValoDaArroba.setFont(new Font("Arial", Font.BOLD, 10));
		lblValoDaArroba.setBounds(52, 67, 91, 14);
		contentPane.add(lblValoDaArroba);
		
		valor = new JTextField();
		valor.setBounds(153, 64, 86, 20);
		contentPane.add(valor);
		valor.setColumns(10);
		
		JLabel lblQuantidadeDeArrobas = new JLabel("Quantidade de Arrobas");
		lblQuantidadeDeArrobas.setFont(new Font("Arial", Font.BOLD, 10));
		lblQuantidadeDeArrobas.setBounds(52, 97, 123, 14);
		contentPane.add(lblQuantidadeDeArrobas);
		
		qtd = new JTextField();
		qtd.setBounds(176, 95, 63, 20);
		contentPane.add(qtd);
		qtd.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int valor1, qtd1, total1;
				int total=integer.parseInt(lblValoDaArroba.getText())*Integer.parseInt(lblQuantidadeDeArrobas.getText());
				
				//valor1=valor.getText();
				//qtd1=qtd.getText();
				//total1 = valor1*qtd1;	
				JOptionPane.showMessageDialog(null, "total1");
				
				}
		});
		btnNewButton.setBounds(170, 158, 89, 23);
		contentPane.add(btnNewButton);
		
		

}

}