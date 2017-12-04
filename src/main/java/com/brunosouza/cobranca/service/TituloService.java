package com.brunosouza.cobranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.brunosouza.cobranca.model.Titulo;
import com.brunosouza.cobranca.repository.TituloRepository;

@Service
public class TituloService {
	
	@Autowired
	private TituloRepository tituloRepository;
	
	public void salvar(Titulo titulo) {
		try {
			tituloRepository.save(titulo);
		}catch(DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválido");
		}
	}

	public void excluir(Long id) {
		tituloRepository.delete(id);
	}
}
