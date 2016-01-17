package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PnlPesquisarObra extends JPanel {
	private JTextField pesquisaTítulo;
	private JTextField pesquisaAutor;

	/**
	 * Create the panel.
	 */
	public PnlPesquisarObra() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		pesquisaAutor = new JTextField();
		pesquisaAutor.setBounds(225, 126, 159, 20);
		add(pesquisaAutor);
		pesquisaAutor.setColumns(10);
		
		JComboBox comboBTemas = new JComboBox();
		comboBTemas.setBounds(225, 172, 159, 20);
		add(comboBTemas);
		
		pesquisaTítulo = new JTextField();
		pesquisaTítulo.setBounds(225, 83, 159, 20);
		add(pesquisaTítulo);
		pesquisaTítulo.setColumns(10);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo");
		lblTitulo.setBounds(129, 86, 46, 14);
		add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(129, 129, 59, 14);
		add(lblAutor);
		
		JLabel lblTemas = new JLabel("Temas");
		lblTemas.setBounds(129, 175, 59, 14);
		add(lblTemas);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(295, 245, 89, 23);
		add(btnLogout);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(163, 245, 89, 23);
		add(btnPesquisar);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
