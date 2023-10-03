package edu.ifmt.cadastrovacinacovid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifmt.CadVacinaCovid.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {

	//Entidade que sera usada
		//Tipo do id da entidade Long
	
	
}
