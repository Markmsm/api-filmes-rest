package br.com.filmes.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.filmes.domain.Avaliacao;
import br.com.filmes.service.AvaliacaoService;

@RestController
public class AvaliacaoController {

	@Autowired
	private AvaliacaoService avaliacaoService;
	
	@PostMapping("/avalia")
	public void avaliarFilme(@RequestBody Avaliacao avaliacao) {
		avaliacaoService.avaliarFilme(avaliacao);
	}
}
