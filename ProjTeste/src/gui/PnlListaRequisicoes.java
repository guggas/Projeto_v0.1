package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;

public class PnlListaRequisicoes extends JPanel {

	/**
	 * Create the panel.
	 */
	public PnlListaRequisicoes() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JButton btnRegRequisicao = new JButton("Nova Requisi\u00E7\u00E3o");
		btnRegRequisicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegRequisicao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRegRequisicao.setBounds(77, 84, 190, 44);
		add(btnRegRequisicao);
		
		JButton btnDevolucao = new JButton("Devolu\u00E7\u00E3o");
		btnDevolucao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDevolucao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDevolucao.setBounds(77, 141, 190, 43);
		add(btnDevolucao);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(133, 229, 89, 23);
		add(btnLogout);
		
		JTextPane txtpnoContedoDe = new JTextPane();
		txtpnoContedoDe.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtpnoContedoDe.setText("\"O conte\u00FAdo de um livro guarda o poder da educac\u00E7\u00E3o e \u00E9 com esse poder que conseguimos moldar o futuro e  mudar vidas...\"\r\n\r\nMalala Yousafzai");
		txtpnoContedoDe.setBounds(296, 73, 108, 178);
		add(txtpnoContedoDe);

	}
}
