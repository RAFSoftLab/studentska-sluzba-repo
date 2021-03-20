package org.raflab.studsluzba.repositories;

import java.util.List;


import org.raflab.studsluzba.model.DrziPredmet;
import org.raflab.studsluzba.model.Predmet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DrziPredmetRepository extends CrudRepository<DrziPredmet, Long> {
	
	
	@Query("select dp from DrziPredmet dp where dp.skolskaGodina.id = :skolskaGodinaId")
	List<DrziPredmet> getDrziPredmetForSkolskaGodina(Long skolskaGodinaId);
	
	
	@Query("select dp from DrziPredmet dp where dp.skolskaGodina.aktivna = 1")
	List<DrziPredmet> getDrziPredmetAktivnaSkolskaGodina();
	
	/*
	 * vraca predmete koje nastavnik drzi u skolskoj godini, prosledjuje se id nastavnika
	 */
	
	@Query("select dp.predmet from DrziPredmet dp where dp.skolskaGodina.aktivna = 1 and dp.nastavnik.id = :idNastavnika")
	List<Predmet> getPredmetiZaNastavnikaUAktivnojSkolskojGodini(Long idNastavnika);

}
