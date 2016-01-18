package gui;

import pt.uc.dei.biblioteca.Biblioteca;
import pt.uc.dei.biblioteca.Utilizador;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class PnlListaUtilizadores extends JPanel {
	
	MainWindowV2 app;  //private??????

	Biblioteca biblioteca;
	
	private JTable tableListaUtil;

	/**
	 * Create the panel.
	 */
	public PnlListaUtilizadores() {
		
		this.biblioteca = new Biblioteca();
		
		setBackground(Color.WHITE);
		setLayout(null);
 
		JButton btnNovoUtilizador = new JButton("Adicionar");
		btnNovoUtilizador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			JanelaAddUtilizador addUtilizador = new JanelaAddUtilizador();
				addUtilizador.setVisible(true);
			}
		});
		btnNovoUtilizador.setBounds(22, 234, 89, 30);
		add(btnNovoUtilizador);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setBounds(121, 234, 89, 30);
		add(btnEditar);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(336, 234, 89, 30);
		add(btnLogout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 11, 403, 196);
		add(scrollPane);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemover.setBounds(220, 234, 89, 30);
		add(btnRemover);
		
		String[] colunas = {"Nome", "Username", "Email", "Tlf", "Login"};
		
		//SIMULAÇÃO DADOS
		this.biblioteca.addUtilizador(new Utilizador ("nome", "n.nome", "jhkjkj@kjh", "2", 2));
		//SIMULACAO DADOS
		
		Object [][]dadosUtilizadores = new Object [biblioteca.getListaUtilizadores().size()][5];
		dadosUtilizadores = extraiDados (biblioteca);
		
			
		tableListaUtil = new JTable();
		tableListaUtil.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableListaUtil.setModel(new DefaultTableModel(dadosUtilizadores, colunas));
		scrollPane.setViewportView(tableListaUtil);
		
		

	}

	private String[][] extraiDados(Biblioteca biblioteca) {
		
		String [][]dados = new String [biblioteca.getListaUtilizadores().size()][5];
		int it=0;
		for (Utilizador ut : biblioteca.getListaUtilizadores()){
			dados[it][0]=ut.getNome();
			dados[it][1]=ut.getUser();
//			dados[it][2]=ut.getEmail();
//			dados[it][3]=ut.getTlf();
			dados[it][4]=ut.getTipo();
		}
		return dados;
	}
}
