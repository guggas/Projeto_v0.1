package pt.uc.dei.biblioteca;


import java.io.*;
import java.util.*;

public class Requisicao {

	private GregorianCalendar dataDevolvido;		// = dataRequisicao-1dia;
	private GregorianCalendar dataRequisicao;
	private Utilizador leitor;
	private Requisitavel publicacao;
	private GregorianCalendar dataDevolucao;

	public Requisicao(Utilizador leitor, Requisitavel publicacao) {
		
		this.leitor = leitor;
		this.publicacao = publicacao;
		dataRequisicao = new GregorianCalendar();
		dataDevolucao = (GregorianCalendar) dataRequisicao.clone();

		dataDevolucao.add(Calendar.DAY_OF_YEAR, publicacao.getDiasReq());
		
//		dataDevolucao --> em funcao de publicacao.getMaxDiasRequisicao();
	}

	public GregorianCalendar getDataDevolvido() {
		return dataDevolvido;
	}

	public void setDataDevolvido(GregorianCalendar dataDevolvido) {
		this.dataDevolvido = dataDevolvido;
	}

	public GregorianCalendar getDataRequisicao() {
		return dataRequisicao;
	}

	public void setDataRequisicao(GregorianCalendar dataRequisicao) {
		this.dataRequisicao = dataRequisicao;
	}

	public Utilizador getLeitor() {
		return leitor;
	}

	public void setLeitor(Utilizador leitor) {
		this.leitor = leitor;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public GregorianCalendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(GregorianCalendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

}
