package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MainWindow {

	private JFrame janelaGeral;
	private final JPanel panelGeral = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.janelaGeral.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		janelaGeral = new JFrame();
		janelaGeral.setResizable(false);
		janelaGeral.setBounds(100, 100, 450, 300);
		janelaGeral.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaGeral.getContentPane().setLayout(null);
		panelGeral.setBounds(10, 0, 106, 271);
		janelaGeral.getContentPane().add(panelGeral);
		
		JButton botaoLogOut = new JButton("LogOut");
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JButton botVerPub = new JButton("Publica\u00E7\u00F5es");
		
		JButton botVerRequisicoes = new JButton("Rquisi\u00E7\u00F5es");
		
		JButton botaoUitlizadores = new JButton("Utilizadores");
		GroupLayout gl_panelGeral = new GroupLayout(panelGeral);
		gl_panelGeral.setHorizontalGroup(
			gl_panelGeral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelGeral.createSequentialGroup()
					.addGap(10)
					.addComponent(botaoLogOut, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelGeral.createSequentialGroup()
					.addContainerGap()
					.addComponent(botVerRequisicoes, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelGeral.createSequentialGroup()
					.addContainerGap()
					.addComponent(botVerPub)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panelGeral.createSequentialGroup()
					.addContainerGap()
					.addComponent(botaoUitlizadores, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelGeral.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panelGeral.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panelGeral.setVerticalGroup(
			gl_panelGeral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelGeral.createSequentialGroup()
					.addContainerGap()
					.addComponent(botaoUitlizadores)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botVerRequisicoes)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botVerPub)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(87)
					.addComponent(botaoLogOut))
		);
		panelGeral.setLayout(gl_panelGeral);
		
		JPanel panel = new JPanel();
		panel.setBounds(126, 0, 308, 271);
		janelaGeral.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel tipoLogin = new JLabel("Login:");
		tipoLogin.setBounds(0, 0, 298, 25);
		panel.add(tipoLogin);
	}
}
