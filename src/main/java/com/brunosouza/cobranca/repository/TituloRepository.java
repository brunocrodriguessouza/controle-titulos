package com.brunosouza.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.brunosouza.cobranca.model.Titulo;

@Service
public interface TituloRepository extends JpaRepository<Titulo, Long>{

}
