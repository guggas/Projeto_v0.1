package gui;
import pt.uc.dei.biblioteca.Biblioteca;
import pt.uc.dei.biblioteca.Utilizador;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class JanelaAddUtilizador extends JFrame {

	Biblioteca biblioteca;
	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoEmail;
	private JTextField campoTlm;
	private JTextField campoUser;
	private JTextField campoPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaAddUtilizador frame = new JanelaAddUtilizador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaAddUtilizador() {
		
		this.biblioteca = new Biblioteca(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nome");
		label.setBounds(53, 17, 65, 14);
		contentPane.add(label);
		
		campoNome = new JTextField();
		campoNome.setColumns(10);
		campoNome.setBounds(140, 11, 265, 27);
		contentPane.add(campoNome);
		
		JLabel label_1 = new JLabel("Email");
		label_1.setBounds(53, 55, 65, 14);
		contentPane.add(label_1);
		
		campoEmail = new JTextField();
		campoEmail.setColumns(10);
		campoEmail.setBounds(140, 49, 265, 27);
		contentPane.add(campoEmail);
		
		JLabel label_2 = new JLabel("Tlm");
		label_2.setBounds(53, 93, 65, 14);
		contentPane.add(label_2);
		
		campoTlm = new JTextField();
		campoTlm.setColumns(10);
		campoTlm.setBounds(140, 87, 265, 27);
		contentPane.add(campoTlm);
		
		JLabel label_3 = new JLabel("Username");
		label_3.setBounds(53, 130, 65, 14);
		contentPane.add(label_3);
		
		campoUser = new JTextField();
		campoUser.setColumns(10);
		campoUser.setBounds(140, 124, 96, 27);
		contentPane.add(campoUser);
		
		JLabel label_4 = new JLabel("Password");
		label_4.setBounds(246, 130, 65, 14);
		contentPane.add(label_4);
		
		campoPass = new JTextField();
		campoPass.setColumns(10);
		campoPass.setBounds(309, 125, 96, 27);
		contentPane.add(campoPass);
		
		JLabel label_5 = new JLabel("Login");
		label_5.setBounds(53, 169, 65, 14);
		contentPane.add(label_5);
		
		JComboBox<String> cbBoxTipo = new JComboBox();
		cbBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Bibliotec\u00E1rio", "Colaborador", "Leitor"}));
		cbBoxTipo.setBounds(140, 169, 96, 20);
		contentPane.add(cbBoxTipo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nome = campoNome.getText();
				String email = campoEmail.getText();
				String tlm = campoTlm.getText();
				String user = campoUser.getText();
				String pass = campoPass.getText();
				String tipo;
				int num = 1;
				
			if(cbBoxTipo.getSelectedItem().equals("Bibliotecario")){
				tipo = "1";
			}
			else if (cbBoxTipo.getSelectedItem().equals("Colaborador")){
				tipo = "2";
			}
			else {
				tipo = "3";
			}
					
			if (nome.equals("") || email.equals("") || tlm.equals("") || user.equals("") || pass.equals("")) {
				JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos");
			} 
			else{
		//	public Utilizador(String nome, String user, String password, String tipo, int num) {
				biblioteca.addUtilizador(new Utilizador (nome, user, pass, tipo, num)); 
				/*Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
				at gui_vteste.JanelaAddUtilizador$2.actionPerformed(JanelaAddUtilizador.java:138)
				at javax.swing.AbstractButton.fireActionPerformed(Unknown Source) */
				
							//	POPUPS DE AVISO!	
			}	
		}
	});
		
		btnGuardar.setBounds(316, 205, 89, 23);
		contentPane.add(btnGuardar);
		
//		JButton btnAtras = new JButton("Atr\u00E1s");
//		btnAtras.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnAtras.setBounds(316, 209, 89, 23);
//		contentPane.add(btnAtras);
	}

}
