package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MainWindowV2 {

	private JFrame janelaGeralV2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowV2 window = new MainWindowV2();
					window.janelaGeralV2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindowV2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Definicao do layout da janela principal
		
		janelaGeralV2 = new JFrame();
		janelaGeralV2.setResizable(false);
		janelaGeralV2.setBounds(100, 100, 509, 366);
		janelaGeralV2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaGeralV2.getContentPane().setLayout(null);
		
		
		//Cria painel de tabs
		
		JTabbedPane painelTabs = new JTabbedPane(JTabbedPane.TOP);
		painelTabs.setBounds(10, 11, 483, 315);
		janelaGeralV2.getContentPane().add(painelTabs);
		
		//Tab Login
		PainelLogin pLogin = new PainelLogin();
		painelTabs.addTab("Login", null, pLogin, null);
		
		//Utilizadores
		JPanel panelUtilBack = new JPanel();
		painelTabs.addTab("Utilizadores", null, panelUtilBack, null);
		panelUtilBack.setLayout(null);
		
		JPanel panelRequisicoes = new JPanel();
		painelTabs.addTab("Requisi\u00E7\u00F5es", null, panelRequisicoes, null);
		panelRequisicoes.setLayout(null);
		
		JButton btnNovoEmprestimo = new JButton("Novo Empr\u00E9stimo");
		btnNovoEmprestimo.setBounds(185, 90, 124, 23);
		panelRequisicoes.add(btnNovoEmprestimo);
		
		JButton btnDevolucao = new JButton("Devolu\u00E7\u00E3o");
		btnDevolucao.setBounds(185, 124, 124, 23);
		panelRequisicoes.add(btnDevolucao);
		
		JPanel panelPublicacoes = new JPanel();
		painelTabs.addTab("Publica\u00E7\u00F5es", null, panelPublicacoes, null);
		
		JPanel panelLogout = new JPanel();
		painelTabs.addTab("LogOut", null, panelLogout, null);
		
		JPanel panelEstatistica = new JPanel();
		painelTabs.addTab("Estat\u00EDsticas", null, panelEstatistica, null);
		
		JPanel panelPesquisarObra = new JPanel();
		painelTabs.addTab("Pesquisar Obra", null, panelPesquisarObra, null);
		
		JPanel panelListaPub = new JPanel();
		painelTabs.addTab("Lista de Publica\u00E7\u00F5es", null, panelListaPub, null);
		
		JPanel panelObrasReq = new JPanel();
		painelTabs.addTab("Obras Requisitadas", null, panelObrasReq, null);
		
		JPanel panelAlterarDados = new JPanel();
		painelTabs.addTab("Alterar Dados", null, panelAlterarDados, null);
		
		JPanel panelRegistoEmprestimo = new JPanel();
		painelTabs.addTab("Registo de Empr\u00E9stimo", null, panelRegistoEmprestimo, null);
		
		JPanel panelRegistoDev = new JPanel();
		painelTabs.addTab("Registo de Devolu\u00E7\u00E3o", null, panelRegistoDev, null);
	}
}
