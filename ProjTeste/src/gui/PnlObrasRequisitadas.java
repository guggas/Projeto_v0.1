package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlObrasRequisitadas extends JPanel {
	private JTable tableObrasRequisitadas;

	/**
	 * Create the panel.
	 */
	public PnlObrasRequisitadas() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 11, 401, 213);
		add(scrollPane);
		
		tableObrasRequisitadas = new JTable();
		tableObrasRequisitadas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(tableObrasRequisitadas);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(201, 235, 89, 23);
		add(btnLogout);

	}

}
