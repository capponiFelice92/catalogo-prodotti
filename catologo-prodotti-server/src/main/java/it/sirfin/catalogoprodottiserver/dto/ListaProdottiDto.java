package it.sirfin.catalogoprodottiserver.dto;

import it.sirfin.catalogoprodottiserver.model.Prodotto;
import java.util.List;

public class ListaProdottiDto {

    private List<Prodotto> listaProdotti;

    public ListaProdottiDto() {

    }

    public ListaProdottiDto(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    @Override
    public String toString() {
        return "ListaProdottiDto{" + "listaProdotti=" + listaProdotti + '}';
    }

}
