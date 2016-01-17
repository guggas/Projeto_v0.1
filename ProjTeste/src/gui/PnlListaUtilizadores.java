package gui;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class PnlListaUtilizadores extends JPanel {
	private JTable tableListaUtil;

	/**
	 * Create the panel.
	 */
	public PnlListaUtilizadores() {
		setBackground(Color.WHITE);
		setLayout(null);
//		
//		MainWindowV2 app = new MainWindowV2();
//		PnlIntroduzUtilizador janelaNovoUtilizador = new PnlIntroduzUtilizador(); 
		JButton btnNovoUtilizador = new JButton("Novo Utilizador");
		btnNovoUtilizador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				app.getJanelaGeralV2().add(janelaNovoUtilizador);
//				app.getJanelaGeralV2().setVisible(true);
			}
		});
		btnNovoUtilizador.setBounds(55, 241, 105, 23);
		add(btnNovoUtilizador);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setBounds(178, 241, 105, 23);
		add(btnEditar);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(307, 241, 105, 23);
		add(btnLogout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 32, 370, 187);
		add(scrollPane);
		
		tableListaUtil = new JTable();
		tableListaUtil.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Username", "Email", "Tlf", "Login"
			}
		));
		scrollPane.setViewportView(tableListaUtil);
		
		

	}
}
