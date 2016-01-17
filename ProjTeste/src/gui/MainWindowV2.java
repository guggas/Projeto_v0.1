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
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Rectangle;

public class MainWindowV2 {

	private JFrame janelaGeralV2;
	private JTabbedPane painelTabs;

	
	//Tabs
	
	private PainelLogin pLogin;
	private PainelLogout pLogout;		//???
	private PainelEntrada pEntrada;
	private PnlListaUtilizadores panelUtilBack;
	private PnlListaRequisicoes panelRequisicoes;
	private PnlListaPublicacoes panelPublicacoes;
	private PnlEstatistica panelEstatistica;
	private PnlAlterarDados panelAlterarDados;
	private PnlPesquisarObra panelPesquisarObra;
	private PnlObrasRequisitadas panelObrasReq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowV2 window = new MainWindowV2();
					window.getJanelaGeralV2().setVisible(true);
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
	
//		//Cria painel de tabs
//		painelTabs = new JTabbedPane(JTabbedPane.TOP);
//		painelTabs.setBounds(10, 11, 483, 315);
//		janelaGeralV2.getContentPane().add(painelTabs);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Definicao do layout da janela principal
		
		setJanelaGeralV2(new JFrame());
		getJanelaGeralV2().setBounds(new Rectangle(500, 500, 500, 500));
		getJanelaGeralV2().setTitle("\u00C0 volta dos livros");
		getJanelaGeralV2().setResizable(false);
		getJanelaGeralV2().setBounds(100, 100, 509, 366);
		getJanelaGeralV2().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getJanelaGeralV2().getContentPane().setLayout(null);
		
		
	//Cria painel de tabs
	
		this.painelTabs = new JTabbedPane(JTabbedPane.TOP);
		painelTabs.setBounds(10, 11, 483, 315);
		getJanelaGeralV2().getContentPane().add(painelTabs);
		
		//Tab Login
		PainelLogin pLogin = new PainelLogin(this);
		painelTabs.addTab("Login", null, pLogin, null);
		
//		//Tab Entrada
		this.pEntrada = new PainelEntrada();
		
			
		//Utilizadores
		this. panelUtilBack = new PnlListaUtilizadores();
		panelUtilBack.setLayout(null);
		
		
		//Requisicoes
		this. panelRequisicoes = new PnlListaRequisicoes();
		panelRequisicoes.setLayout(null);
		
		//Publicacoes
		this. panelPublicacoes = new PnlListaPublicacoes();		
		
		//Estatistica
		this. panelEstatistica = new PnlEstatistica();
		
		
		//Alterar Dados
		this. panelAlterarDados = new PnlAlterarDados();
		
		this. panelPesquisarObra = new PnlPesquisarObra();
//		painelTabs.addTab("Pesquisar Obra", null, panelPesquisarObra, null);
		

		this. panelObrasReq = new PnlObrasRequisitadas();
//		painelTabs.addTab("Obras Requisitadas", null, panelObrasReq, null);
//		
//		
//		
//		JPanel panelRegistoEmprestimo = new JPanel();
//		painelTabs.addTab("Registo de Empr\u00E9stimo", null, panelRegistoEmprestimo, null);
//		
//		JPanel panelRegistoDev = new JPanel();
//		painelTabs.addTab("Registo de Devolu\u00E7\u00E3o", null, panelRegistoDev, null);
	}
	
	public void direcionaUtilizador (String tipo){
		
		
		if (tipo.equals("1")){
			this.painelTabs.removeAll();
			this.painelTabs.addTab("Login: Bibliotecário Chefe ", null, pEntrada, null);
			this.painelTabs.addTab("Utilizadores", null, panelUtilBack, null);
			this.painelTabs.addTab("Requisi\u00E7\u00F5es", null, panelRequisicoes, null);
			this.painelTabs.addTab("Publica\u00E7\u00F5es", null, panelPublicacoes, null);
			this.painelTabs.addTab("Estat\u00EDsticas", null, panelEstatistica, null);
			
			
		}
		else if (tipo.equals("2")){
			this.painelTabs.removeAll();
			this.painelTabs.addTab("Login ", null, pEntrada, null);
			this.painelTabs.addTab("Requisi\u00E7\u00F5es", null, panelRequisicoes, null);
			
		}
		else if (tipo.equals("3")){
			this.painelTabs.removeAll();
			this.painelTabs.addTab("Login: Leitor", null, pEntrada, null);		//A COLOCAR NOME DO LEITOR ?
			this.painelTabs.addTab("Lista de Publicações", null, panelPublicacoes, null);
			this.painelTabs.addTab("Pesquisar obra", null, panelPesquisarObra , null);
			this.painelTabs.addTab("As minhas requisições", null, panelObrasReq, null);
			
		}
		
		this.painelTabs.addTab("Alterar Dados", null, panelAlterarDados, null);
		
		this.getJanelaGeralV2() .validate();
		this.getJanelaGeralV2() .repaint();
	}

	// GETTERS E SETTERS PARA JANELA
	public JFrame getJanelaGeralV2() {
		return janelaGeralV2;
	}

	public void setJanelaGeralV2(JFrame janelaGeralV2) {
		this.janelaGeralV2 = janelaGeralV2;
	}
	
}

