package br.com.filmes.exeception;

public class FilmeException extends RuntimeException {

	private static final long serialVersionUID = 6477427684524243343L;

	public FilmeException(String msg) {
		super(msg);
	}
}
