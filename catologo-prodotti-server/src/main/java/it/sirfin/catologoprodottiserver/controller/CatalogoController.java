
package it.sirfin.catologoprodottiserver.controller;

import it.sirfin.catologoprodottiserver.dto.ListaProdottiDto;
import it.sirfin.catologoprodottiserver.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class CatalogoController {
    
    @Autowired
    CatalogoService catalogoService;
    
    @RequestMapping("trova-prodotti")
    @ResponseBody
    public ListaProdottiDto trovaProdotti(){
        
    }
}
