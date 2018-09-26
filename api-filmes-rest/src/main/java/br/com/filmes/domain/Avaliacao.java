package br.com.filmes.domain;

public class Avaliacao {

	private Filme filme;

	private Integer nota;

	public Avaliacao(Filme filme, Integer nota) {
		this.filme = filme;
		this.nota = nota;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

}
