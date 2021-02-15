package it.sirfin.catologoprodottiserver.service;

import it.sirfin.catologoprodottiserver.model.Prodotto;
import java.util.List;

public interface CatalogoService {

    List<Prodotto> inserisciProdotto(Prodotto p);

    void svuotaTabella();

    List<Prodotto> trovaProdotti();

    List<Prodotto> cancellaProdotto(Prodotto p);

}
