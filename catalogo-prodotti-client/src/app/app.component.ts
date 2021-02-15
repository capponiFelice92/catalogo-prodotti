import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Prodotto } from './prodotto';
import { ReqProdottoDto } from './req-prodotto-dto';
import { ResProdottoDto } from './res-prodotto-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto: Prodotto = new Prodotto();
  catalogoVisualizzato: Prodotto[];

  url = "http://localhost:8080/";

  constructor(private http: HttpClient) { }

  aggiungi() {
    let dtoReq: ReqProdottoDto = new ReqProdottoDto();
    dtoReq.prodotto = this.prodotto;
    console.log(dtoReq);
    let oss: Observable<ResProdottoDto>
    oss = this.http.post<ResProdottoDto>(this.url + "inserisci-prodotto", dtoReq)
    oss.subscribe(risp => {
      this.catalogoVisualizzato = risp.listaProdotti,
        this.prodotto = new Prodotto();
    })
  }

  cancella(inx: number) {
    let dtoReq: ReqProdottoDto = new ReqProdottoDto();
    dtoReq.prodotto = this.catalogoVisualizzato[inx];
    let oss: Observable<ResProdottoDto>
    oss = this.http.post<ResProdottoDto>(this.url + "cancella-prodotto", dtoReq)
    oss.subscribe(risp => {
      this.catalogoVisualizzato = risp.listaProdotti;
    });
  }

  aggiorna() {
    let oss: Observable<ResProdottoDto> = this.http
      .get<ResProdottoDto>(this.url + "trova-prodotti");
    oss.subscribe(risp => {
      this.catalogoVisualizzato = risp.listaProdotti;
      console.log(risp.listaProdotti);
    });
  }

  svuota() {
    let oss: Observable<ResProdottoDto> = this.http
      .get<ResProdottoDto>(this.url + "svuota-catalogo");
    oss.subscribe(risp => {
      this.catalogoVisualizzato = risp.listaProdotti;
    });
  }








}
