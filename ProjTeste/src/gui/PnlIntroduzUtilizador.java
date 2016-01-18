package gui;

import javax.swing.JPanel;

import pt.uc.dei.biblioteca.Biblioteca;
import pt.uc.dei.biblioteca.Utilizador;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlIntroduzUtilizador extends JPanel {

	Biblioteca biblioteca;
	private JTextField textCampoNome;
	private JTextField textCampoEmail;
	private JTextField textCampoTlm;
	private JTextField textCampoUser;
	private JTextField textCampoPass;
	
	/**
	 * Create the panel.
	 */
	public PnlIntroduzUtilizador() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		textCampoNome = new JTextField();
		textCampoNome.setBounds(155, 44, 265, 27);
		add(textCampoNome);
		textCampoNome.setColumns(10);
		
		textCampoEmail = new JTextField();
		textCampoEmail.setColumns(10);
		textCampoEmail.setBounds(155, 82, 265, 27);
		add(textCampoEmail);
		
		textCampoTlm = new JTextField();
		textCampoTlm.setColumns(10);
		textCampoTlm.setBounds(155, 120, 265, 27);
		add(textCampoTlm);
		
		textCampoUser = new JTextField();
		textCampoUser.setColumns(10);
		textCampoUser.setBounds(155, 157, 96, 27);
		add(textCampoUser);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(68, 50, 65, 14);
		add(lblNome);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(68, 88, 65, 14);
		add(lblEmail);
		
		JLabel lblTlm = new JLabel("Tlm");
		lblTlm.setBounds(68, 126, 65, 14);
		add(lblTlm);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(68, 163, 65, 14);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(261, 163, 65, 14);
		add(lblPassword);
		
		textCampoPass = new JTextField();
		textCampoPass.setColumns(10);
		textCampoPass.setBounds(324, 158, 96, 27);
		add(textCampoPass);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(68, 202, 65, 14);
		add(lblLogin);
		
		JComboBox cbBoxTipo = new JComboBox();
		cbBoxTipo.setBounds(155, 202, 96, 20);
		add(cbBoxTipo);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAtras.setBounds(331, 242, 89, 23);
		add(btnAtras);
		
		JButton btnConfimar = new JButton("Confirmar");
		btnConfimar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = textCampoNome.getText();
				String email = textCampoEmail.getText();
				String tlm = textCampoTlm.getText();
				String user = textCampoUser.getText();
				String pass = textCampoPass.getText();
				String tipo = cbBoxTipo.getName();
				int num = 1;
				
				//	public Utilizador(String nome, String user, String password, String tipo, int num) {
				biblioteca.addUtilizador(new Utilizador (nome, user, pass, tipo, num));
						//	POPUPS DE AVISO!	
			}
		});
		btnConfimar.setBounds(232, 242, 89, 23);
		add(btnConfimar);
		
	}
}
