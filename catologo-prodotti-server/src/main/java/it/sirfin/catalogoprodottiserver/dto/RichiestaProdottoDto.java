package it.sirfin.catalogoprodottiserver.dto;

import it.sirfin.catalogoprodottiserver.model.Prodotto;

public class RichiestaProdottoDto {

    private Prodotto prodotto;

    public RichiestaProdottoDto() {
    }

    public RichiestaProdottoDto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    @Override
    public String toString() {
        return "RichiestaProdottoDto{" + "prodotto=" + prodotto + '}';
    }

}
