package br.com.filmes.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.filmes.domain.Filme;
import br.com.filmes.service.FilmeService;

@RestController
public class FilmesController {

	@Autowired
	private FilmeService filmeService; 
	
	@PostMapping("/cadastra")
	public void cadastrarFilme(@RequestBody Filme filme) {
		filmeService.inserirFilme(filme);
	}
	
	@PutMapping("/atualiza")
	public void atualizarFilme(@RequestBody Filme filme) {
		filmeService.atualizarFilme(filme);
	}
	
	@DeleteMapping("/{id}")
	public void excluirFilme(@PathVariable Integer id) {
		filmeService.removerFilme(id);
	}
	
	@GetMapping("/{id}")
	public Filme buscarFilme(@PathVariable Integer id) {
		return filmeService.buscarFilme(id);
	}
	
	@GetMapping
	public List<Filme> listarFilmes() {
		return filmeService.listarFilmes();		
	}
	
}
