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
import javax.swing.JTextPane;

public class PainelLogin extends JPanel{//  implements ActionListener {

	/**
	 * 
	 */
	
	private MainWindowV2 app;
	private JTextField caixaTextoUser;
	private JPasswordField passField;
	private boolean entrou;
//	private String tipo;

	/**
	 * Create the panel.
	 */
	public PainelLogin(MainWindowV2 app) {
		
		this.app = app;
		
		setBackground(Color.WHITE);
		setLayout(null);

		caixaTextoUser = new JTextField();
		caixaTextoUser.setColumns(10);
		caixaTextoUser.setBounds(279, 104, 145, 20);
		add(caixaTextoUser);

		JLabel labelUser = new JLabel("username");
		labelUser.setBounds(210, 107, 62, 14);
		add(labelUser);

		JLabel labelPass = new JLabel("password");
		labelPass.setBounds(210, 138, 62, 14);
		add(labelPass);

		passField = new JPasswordField();
		passField.setBounds(279, 135, 145, 20);
		add(passField);

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

		// Botao Ok 
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
					String passInt = passField.getText(); 
//					passInt.toString();

//					// Le cada linha
					
					 entrou = false;
					 String linha = "";
					while ((linha=loginInfo.leLinha()) != null) {

						StringTokenizer divisor = new StringTokenizer(linha);
				
						while (divisor.hasMoreElements()) {
							user = divisor.nextToken();
							pass = divisor.nextToken();
							tipo = divisor.nextToken();
							System.out.println(user + ", " + pass + ", " + tipo);
						}

						// Verificacao do login
						if (userInt.equals(user) && passInt.equals(pass) ){//&& tipo.equals("1")) {
							JOptionPane.showMessageDialog(null, "Entrou");							
							entrou = true;
							app.direcionaUtilizador(tipo);
						}
					}

					if(entrou == false){
						if (userInt.equals("") || passInt.equals("")) {
							JOptionPane.showMessageDialog(null, "Por favor, preencha ambos os campos");
							
						} 
						else {
						JOptionPane.showMessageDialog(null, "Username ou password incorretos!");
						caixaTextoUser.setText("");
						passField.setText("");
//						labelUser.requestFocus();  ---> ver melhor: foco no campo a verificar
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

		btnOkLogin.setBounds(313, 214, 89, 23);
		add(btnOkLogin);
		
		JTextPane txtTextoBV = new JTextPane();
		txtTextoBV.setFont(new Font("Monotype Corsiva", Font.PLAIN, 14));
		txtTextoBV.setText("\"No Egito, as bibliotecas eram chamadas de 'tesouro dos rem\u00E9dios da alma'.\r\nDe facto, nelas se curava a ignor\u00E2ncia, a mais perigosa das enfermidades e a origem de todas as outras.\"\r\n\r\nJaques Benigno Bossuet");
		txtTextoBV.setBounds(30, 56, 141, 181);
		add(txtTextoBV);

	}
}
