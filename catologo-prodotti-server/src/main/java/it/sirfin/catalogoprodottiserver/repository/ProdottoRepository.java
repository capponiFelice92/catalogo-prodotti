
package it.sirfin.catalogoprodottiserver.repository;

import it.sirfin.catalogoprodottiserver.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long>{
}

