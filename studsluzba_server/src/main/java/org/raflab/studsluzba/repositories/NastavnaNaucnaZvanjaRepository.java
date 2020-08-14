package org.raflab.studsluzba.repositories;

import org.raflab.studsluzba.model.NastavnaNaucnaZvanja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NastavnaNaucnaZvanjaRepository extends CrudRepository<NastavnaNaucnaZvanja, Long> {
	
	

}
