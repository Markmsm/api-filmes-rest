package br.com.filmes.exeception;

import org.springframework.http.HttpStatus;

public class ErroResponse {

	private HttpStatus httpStatus;
	private String mensagem;

	public ErroResponse(HttpStatus status, String mensagem) {
		this.httpStatus = status;
		this.mensagem = mensagem;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
