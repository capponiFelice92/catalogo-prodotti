package it.sirfin.catologoprodottiserver.dto;

import it.sirfin.catologoprodottiserver.model.Prodotto;

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
