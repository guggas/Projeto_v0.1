package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlEstatistica extends JPanel {

	/**
	 * Create the panel.
	 */
	public PnlEstatistica() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JButton btnEmprstimos = new JButton("Empr\u00E9stimos");
		btnEmprstimos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEmprstimos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEmprstimos.setBounds(67, 70, 190, 44);
		add(btnEmprstimos);
		
		JButton btnGerarFicheiros = new JButton("Gerar Ficheiros");
		btnGerarFicheiros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGerarFicheiros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGerarFicheiros.setBounds(67, 127, 190, 43);
		add(btnGerarFicheiros);
		
		JButton button_2 = new JButton("Logout");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(123, 215, 89, 23);
		add(button_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\"O conte\u00FAdo de um livro guarda o poder da educac\u00E7\u00E3o e \u00E9 com esse poder que conseguimos moldar o futuro e  mudar vidas...\"\r\n\r\nMalala Yousafzai");
		textPane.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		textPane.setBounds(286, 59, 108, 178);
		add(textPane);

	}

}
