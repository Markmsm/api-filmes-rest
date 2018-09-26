package br.com.filmes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.filmes.domain.Filme;
import br.com.filmes.exeception.FilmeException;

@Service
public class FilmeService {

	private List<Filme> filmesBanco = new ArrayList<>();
	private int identificadorFilme;
	
	public FilmeService() {
		filmesBanco.add(new Filme(identificadorFilme++, "VELOZES E FURIOISOS"));
		filmesBanco.add(new Filme(identificadorFilme++, "CLUBE DA LUTA"));
		filmesBanco.add(new Filme(identificadorFilme++, "O AUTO DA COMPADECIDA"));
	}
	
	public void inserirFilme(Filme filme) {
		filme.setId(identificadorFilme++);
		filmesBanco.add(filme);
	}
	
	public Filme atualizarFilme(Filme filme) {
		boolean achou = false;
		Filme filmeOriginal = null;
		
		for (Filme auxFilme : filmesBanco) {
			achou = auxFilme.getId() == filme.getId();
			filmeOriginal = buscarFilme(filme.getId());
			break;	
		}
		
		if(achou) {
			filmesBanco.remove(filmeOriginal);
			filmesBanco.add(filme);
		}
		
		return filme;
	}

	public void removerFilme(Integer id) {
		filmesBanco.remove(buscarFilme(id));
	}
	
	public List<Filme> listarFilmes(){
		return filmesBanco;
	}
	
	
	public Filme buscarFilme(Integer id) {
		
		for (Filme filme : filmesBanco) {
			
			if(filme.getId() == id) {
				return filme;
			}
		}
		
		throw new FilmeException("Filme não encontrado!");
	}
	
}
