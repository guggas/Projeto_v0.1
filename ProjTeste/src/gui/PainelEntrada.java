package gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PainelEntrada extends JPanel {

	/**
	 * Create the panel.
	 */
	public PainelEntrada() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblBemVindo = new JLabel("Bem vindo!");
		lblBemVindo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
		lblBemVindo.setBounds(106, 65, 238, 99);
		add(lblBemVindo);

	}

//	public void setText(String texto) {
//		this.setName(name);
//		
//	}
}
