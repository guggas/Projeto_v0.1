package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PainelLogin extends JPanel {

	/**
	 * 
	 */
	
	private JTextField caixaTextoUser;
	private JPasswordField passField;

	/**
	 * Create the panel.
	 */
	public PainelLogin() {

		setBackground(Color.WHITE);
		setLayout(null);

		caixaTextoUser = new JTextField();
		caixaTextoUser.setColumns(10);
		caixaTextoUser.setBounds(196, 103, 145, 20);
		add(caixaTextoUser);

		JLabel labelUser = new JLabel("username");
		labelUser.setBounds(97, 106, 106, 14);
		add(labelUser);

		JLabel labelPass = new JLabel("password");
		labelPass.setBounds(97, 131, 76, 14);
		add(labelPass);

		passField = new JPasswordField();
		passField.setBounds(196, 134, 145, 20);
		add(passField);

		JLabel lblBemvindo = new JLabel("Bem-Vindo!");
		lblBemvindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemvindo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBemvindo.setBounds(153, 36, 131, 41);
		add(lblBemvindo);

		// .txt com dados de utilizadores

		FicheiroDeTexto loginInfo = new FicheiroDeTexto();

		// if(check.exists()){
		//
		// //Checks if the file exists. will not add anything if the file does
		// exist.
		// }else{
		// try{
		// File texting = new File("userPass.txt");
		// writer = new BufferedWriter(new FileWriter(texting));
		// writer.write("message");
		// }catch(IOException e){
		// e.printStackTrace();
		// }
		// }
		//

		// Botoes Ok e Sair
		JButton btnOkLogin = new JButton("Ok");
		btnOkLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					loginInfo.abreLeitura("loginUtilizadores.txt");

					// loginInfo.abreEscrita("loginUtilizadores.txt");

					String user = "";
					String pass = "";
					String tipo = ""; // tipo de utilizador para direcionar janelas

					String userInt = caixaTextoUser.getText();
					char[] passInt = passField.getPassword(); 
//					passInt.toString();

//					// Le cada linha
//					boolean continua = true;
				
					while (loginInfo.leLinha() != null) {

						StringTokenizer divisor = new StringTokenizer(loginInfo.leLinha());
						System.out.println(divisor);
						while (divisor.hasMoreElements()) {
							user = divisor.nextToken();
							pass = divisor.nextToken();
							tipo = divisor.nextToken();
							System.out.println(user + ", " + pass + ", " + tipo);
						}

						// Verificacao do login
						if (userInt.equals(user) && passInt.equals(pass) && tipo.equals("1")) {
							JOptionPane.showMessageDialog(null, "Entrou");
							// PainelBiblitecario .....
						}
						else if (userInt.equals(user) && passInt.equals(pass) && tipo.equals("2")) {
							JOptionPane.showMessageDialog(null, "Entrou");
							// PainelColaborador .....
						}
						else if (userInt.equals(user) && passInt.equals(pass) && tipo.equals("3")) {
							JOptionPane.showMessageDialog(null, "Entrou");
							// PainelLeitor .....
						}
						else if (userInt.equals("") || passInt.equals("")) {
							JOptionPane.showMessageDialog(null, "Por favor, preencha ambos os campos");
							
						} 
						else {
							JOptionPane.showMessageDialog(null, "Username ou password incorretos!");
							caixaTextoUser.setText("");
							passField.setText("");
//							labelUser.requestFocus();  ---> ver melhor: foco no campo a verificar
						}
					}

//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//					JOptionPane.showMessageDialog(null, "Ocorreu um erro no ficheiro.");
//				}
//
//				//ORDEM CORRETA DE CATH?
				try {
					loginInfo.fechaLeitura();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				} catch (IOException d) {
			          d.printStackTrace();
			        }
			}
		});

		btnOkLogin.setBounds(187, 200, 89, 23);
		add(btnOkLogin);

	}
}
