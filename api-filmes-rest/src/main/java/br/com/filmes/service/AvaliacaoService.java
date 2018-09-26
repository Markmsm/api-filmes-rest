package br.com.filmes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.filmes.domain.Avaliacao;

@Service
public class AvaliacaoService {

	@Autowired
	private FilmeService filmeService;
	
	private List<Avaliacao> avaliacaoBanco = new ArrayList<>();
	
	public void avaliarFilme(Avaliacao avaliacao) {
		filmeService.buscarFilme(avaliacao.getFilme().getId());
		avaliacaoBanco.add(avaliacao);
	}
}
