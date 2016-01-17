package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PainelLogout extends JPanel {

	/**
	 * Create the panel.
	 */
	public PainelLogout() {
		setLayout(null);
		
		JLabel lblDesejaSair = new JLabel("Deseja sair?");
		lblDesejaSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesejaSair.setBounds(195, 110, 127, 17);
		add(lblDesejaSair);

	}

}
