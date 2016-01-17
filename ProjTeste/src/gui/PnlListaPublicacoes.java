package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PnlListaPublicacoes extends JPanel {
	private JTable tableListaPublicacoes;

	/**
	 * Create the panel.
	 */
	public PnlListaPublicacoes() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 23, 391, 216);
		add(scrollPane);
		
		tableListaPublicacoes = new JTable();
		tableListaPublicacoes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Título", "Autor", "Edição", "Temas"
			}
		));
		scrollPane.setViewportView(tableListaPublicacoes);
		
		JButton btnNovaPublicao = new JButton("Nova Publica\u00E7\u00E3o");
		btnNovaPublicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovaPublicao.setBounds(25, 250, 129, 23);
		add(btnNovaPublicao);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.setBounds(164, 250, 119, 23);
		add(btnConsultar);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(297, 250, 119, 23);
		add(btnLogout);

	}
}
