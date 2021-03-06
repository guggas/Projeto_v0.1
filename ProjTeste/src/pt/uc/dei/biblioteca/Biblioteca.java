package pt.uc.dei.biblioteca;


import java.io.*;
import java.util.*;

public class Biblioteca {

	private ArrayList<Area> areas;
	private String nome;
	private ArrayList <Requisicao> requisicoes;	//alteracao permitida? !!!!!!
	private ArrayList<Utilizador> utilizadores;
	private ArrayList<Publicacao> publicacoes;
	private int countUtilizador;
	
	public Biblioteca() {	
		
		this.areas = new ArrayList<Area>();
		
		this.requisicoes = new ArrayList <Requisicao> ();	
		this.utilizadores = new  ArrayList<Utilizador> ();
		this.publicacoes = new ArrayList<Publicacao>();
	}
	public Biblioteca(String nome) {		//??
		
		this.nome = nome;
		this.areas = new ArrayList<Area>();
	
		this.requisicoes = new ArrayList <Requisicao> ();	
		this.utilizadores = new  ArrayList<Utilizador> ();
		this.publicacoes = new ArrayList<Publicacao>();
		
		this.countUtilizador = 0;
	}

	public ArrayList <Requisicao> getObrasRequisitadas() {
		return requisicoes;
	}

	public boolean addArea(Area novaArea) {
		
		Area area = findArea (novaArea);
		
		if (area==null){
			areas.add(novaArea);
			return true;
		}
		else System.out.println("Tema j� registado na Base de Dados");
		return false;
	}

	private Area findArea(Area novaArea) {
		
		for (Area area:areas){
			
			if (area.getNome().equals(novaArea.getNome())){  //Comparacao apenas do nome?
				return area;
			}
		}
		return null;
	}

	public int addUtilizador(Utilizador novoUtilizador) {
		
//		Utilizador util = findUtilizador (novoUtilizador);
		int msg = 0;
		
		for (Utilizador u : utilizadores){
			
			if (novoUtilizador.getNum()==u.getNum()){
				System.out.println("N�mero de utilizador j� registado!");
				msg = 1;
			}
			else if (novoUtilizador.getUser().equals(u.getUser())){
				System.out.println("Nome de utilizador j� registado!");
				msg = 2;
			}
			else{
				utilizadores.add(novoUtilizador);
				System.out.println("Utilizador registado com sucesso!");
				countUtilizador++;
			}
		}
		
		return msg;
	}

	
	public int getCountUtilizador(){
		return countUtilizador;
	}
//	private Utilizador findUtilizador(Utilizador novoUtilizador) {
//		
//		for (Utilizador u : utilizadores){
//			
//			if (novoUtilizador.getNum()==u.getNum()){
//				System.out.println("N�mero de utilizador j� registado!");
//				return u;
//			}
//			else if (novoUtilizador.getUser().equals(u.getUser())){
//				System.out.println("Nome de utilizador j� registado!");
//				return u;
//			}
//			
//		}
//		return null;
//	}

	public boolean addRequisicao (Requisicao novaReq){
		
		Requisicao req = findRequisicao (novaReq);
		
		if (req == null){
			requisicoes.add(novaReq);
			System.out.println("Requisi��o registada");
			return true;
		}
		
		return false;
	}
	
	private Requisicao findRequisicao(Requisicao novaReq) {
		
		for (Requisicao req : requisicoes){
			
			if(req.equals(novaReq)){
//				System.out.println("Requisicao ja registada"); //necessario apenas para efeitos de teste
				return req;
			}
		}
		return null;
	}
	
	public boolean addPublicacao (Publicacao novaPublicacao){
		
		Publicacao pub = findPublicacao (novaPublicacao);
		
		if (pub == null){
			publicacoes.add(novaPublicacao); // --> ADICAO EM AREAS??
			System.out.println("Publicacao registada");
			return true;
		}
		return false;
	}
	
	private Publicacao findPublicacao(Publicacao novaPublicacao) {
		
		for (Publicacao pub : publicacoes){
			
			if(pub.getId().equals(novaPublicacao.getId())){  //-->DECIDIR MODO DE CONSULTA(ID, CODIGOBARRAS...)
				System.out.println("Publicacao ja registada"); //necessario apenas para efeitos de teste
				return pub;
			}
		}
		return null;
	}
	
	
	//REMOVES !!
	
	
	public ArrayList <Publicacao> getListaPub() {

		return publicacoes;
	}

	public ArrayList <Utilizador> getListaUtilizadores() {
		return utilizadores;
	}

	public ArrayList <Publicacao> getReqPorLeitor(Utilizador leitor) { //leitor (permite qualquer dado) ou numero?
		
		ArrayList <Publicacao> pubLeitor = new ArrayList <Publicacao>();
		
		for (Requisicao req : requisicoes){
			
			if (req.getLeitor().getNum()== leitor.getNum()){
				pubLeitor.add(req.getPublicacao());
			}
			
		}
		
		return pubLeitor;
	}

	public Publicacao getPublicacao(String id) {
		
	
		for (Publicacao pub : publicacoes){
			
			if(pub.getId().equals(id)){
				
				return pub;
			}
			else{
				System.out.println("Publicacao n�o encontrada");
				return null;
			}
		}
		
		return null;
	}

	public Utilizador getUtilizador(int numero) {
		
		for (Utilizador util : utilizadores){  //repetida parte do find ??
			
			if(util.getNum()== numero){
				
				return util;
			}
			else{
				System.out.println("Utilizador n�o registado");
				return null;
			}
		}
		
		return null;
	}

//	public String findUserName(String userName) {
//		throw new UnsupportedOperationException("The method is not implemented yet.");
//	}
//
//	public String findNumUtilizador(String userName) {
//		throw new UnsupportedOperationException("The method is not implemented yet.");
//	}
	
}