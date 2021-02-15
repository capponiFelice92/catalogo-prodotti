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
  prodotto: Prodotto;
  catalogoVisualizzato: Prodotto[];

  url = "http://localhost:8080/";

  constructor(private http: HttpClient) { }

  aggiungi() {
    let oss: Observable<ResProdottoDto>
    oss = this.http.post<ResProdottoDto>(this.url + "inserisci-prodotto", this.prodotto)
    oss.subscribe(risp => {
      this.catalogoVisualizzato = risp.catalogoProdotti,
        this.prodotto = new Prodotto();
    })
  }

  cancella(prod: Prodotto) {
    let oss: Observable<ResProdottoDto>
    oss = this.http.post<ResProdottoDto>(this.url + "cancella-prodotto", this.prodotto)
    oss.subscribe(risp => {
      this.catalogoVisualizzato = risp.catalogoProdotti;
    });
  }

  aggiorna() {
    let oss: Observable<ResProdottoDto> = this.http
      .get<ResProdottoDto>(this.url + "trova-prodotti");
    oss.subscribe(risp => {
      this.catalogoVisualizzato = risp.catalogoProdotti;
    });
  }

  svuota() {
    let oss: Observable<ResProdottoDto> = this.http
      .get<ResProdottoDto>(this.url + "svuota-catalogo");
    oss.subscribe(risp => {
      this.catalogoVisualizzato = risp.catalogoProdotti;
    });
  }








}
