package gui;

import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlAlterarDados extends JPanel {

	/**
	 * Create the panel.
	 */
	public PnlAlterarDados() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JFormattedTextField caixaEditarNome = new JFormattedTextField();
		caixaEditarNome.setBounds(159, 69, 181, 20);
		add(caixaEditarNome);
		
		JFormattedTextField caixaEditarUsername = new JFormattedTextField();
		caixaEditarUsername.setBounds(159, 100, 181, 20);
		add(caixaEditarUsername);
		
		JFormattedTextField caixaEditarEmail = new JFormattedTextField();
		caixaEditarEmail.setBounds(159, 131, 181, 20);
		add(caixaEditarEmail);
		
		JFormattedTextField caixaEditarTlm = new JFormattedTextField();
		caixaEditarTlm.setBounds(159, 162, 181, 20);
		add(caixaEditarTlm);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(77, 72, 46, 14);
		add(lblNome);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(77, 100, 68, 20);
		add(lblUsername);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(77, 134, 46, 14);
		add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Tlm");
		lblNewLabel.setBounds(77, 165, 46, 14);
		add(lblNewLabel);
		
		//BOTOES
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirmar.setBounds(108, 243, 99, 23);
		add(btnConfirmar);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(217, 243, 97, 23);
		add(btnLogout);

	}
}
