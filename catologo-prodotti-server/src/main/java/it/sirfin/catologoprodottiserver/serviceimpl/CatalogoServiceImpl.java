
package it.sirfin.catologoprodottiserver.serviceimpl;

import it.sirfin.catologoprodottiserver.model.Prodotto;
import it.sirfin.catologoprodottiserver.repository.ProdottoRepository;
import it.sirfin.catologoprodottiserver.service.CatalogoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CatalogoServiceImpl implements CatalogoService {
    
    @Autowired
    ProdottoRepository prodottoRepository;
    
    @Override
    public List<Prodotto> inserisciProdotto(Prodotto p){
        prodottoRepository.save(p);
        return trovaProdotti();
        
    }

    @Override
    public void svuotaTabella() {
        prodottoRepository.deleteAllInBatch();
    }

    @Override
    public List<Prodotto> trovaProdotti() {
        return prodottoRepository.findAll();
    }

    @Override
    public List<Prodotto> cancellaProdotto(Prodotto p) {
        prodottoRepository.delete(p);
        return trovaProdotti();
    }
    
}

