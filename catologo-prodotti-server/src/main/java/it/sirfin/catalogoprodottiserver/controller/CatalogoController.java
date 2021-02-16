package it.sirfin.catalogoprodottiserver.controller;

import it.sirfin.catalogoprodottiserver.dto.ListaProdottiDto;
import it.sirfin.catalogoprodottiserver.dto.RichiestaProdottoDto;
import it.sirfin.catalogoprodottiserver.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class CatalogoController {

    @Autowired
    CatalogoService catalogoService;

    @RequestMapping("/trova-prodotti")
    @ResponseBody
    public ListaProdottiDto trovaProdotti() {
        return new ListaProdottiDto(catalogoService.trovaProdotti());
    }

    @RequestMapping("/inserisci-prodotto")
    @ResponseBody

    public ListaProdottiDto inserisciProdotto(@RequestBody RichiestaProdottoDto dto) {
        catalogoService.inserisciProdotto(dto.getProdotto());
        return new ListaProdottiDto(catalogoService.trovaProdotti());

    }

    @RequestMapping("/cancella-prodotto")
    @ResponseBody
    public ListaProdottiDto cancellaProdotto(@RequestBody RichiestaProdottoDto dto) {
        catalogoService.cancellaProdotto(dto.getProdotto());
        return new ListaProdottiDto(catalogoService.trovaProdotti());

    }

    @RequestMapping("/svuota-catalogo")
    @ResponseBody
    public ListaProdottiDto svuotaTabella() {
        catalogoService.svuotaTabella();
        return new ListaProdottiDto(catalogoService.trovaProdotti());
    }

}
