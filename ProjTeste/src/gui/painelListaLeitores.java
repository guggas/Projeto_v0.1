package gui;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class painelListaLeitores extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public painelListaLeitores() {
		setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nome", "Username", "N\u00FAmero", "Login"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(46, 40, 378, 155);
		add(table);
		
		JButton button = new JButton("Novo utilizador");
		button.setBounds(142, 245, 124, 23);
		add(button);
		
		JButton button_1 = new JButton("Editar");
		button_1.setBounds(279, 245, 124, 23);
		add(button_1);

	}

}
