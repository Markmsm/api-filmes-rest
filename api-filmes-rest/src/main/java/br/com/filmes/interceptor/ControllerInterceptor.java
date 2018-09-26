package br.com.filmes.interceptor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.filmes.exeception.ErroResponse;
import br.com.filmes.exeception.FilmeException;

@ControllerAdvice
public class ControllerInterceptor extends ResponseEntityExceptionHandler {

	@ExceptionHandler(FilmeException.class)
	public ResponseEntity<ErroResponse> assertionException(final FilmeException e) {
		ErroResponse response = new ErroResponse(HttpStatus.BAD_REQUEST, e.getMessage());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
