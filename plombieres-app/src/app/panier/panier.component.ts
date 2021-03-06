import { Component, OnInit } from '@angular/core';
import { HttpClientService, Personne} from '../service/http-client.service';

@Component({
  selector: 'app-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent implements OnInit {

  panier : number[];
  nbArticles : number;
  nb1: number;
  nb2: number;
  nb3: number;
  nb4: number;
  total: number;
  private personne: Personne = new Personne(0,"","","");

  constructor(private httpClientService: HttpClientService) { 
    
  }

  ngOnInit(): void {
    const panier_session = sessionStorage.getItem("panier");
    if (panier_session) {
      this.panier = JSON.parse(panier_session);
      this.nbArticles=this.panier.length;
      this.nb1 = this.panier.filter(offre => offre==1).length;
      this.nb2 = this.panier.filter(offre => offre==2).length;
      this.nb3 = this.panier.filter(offre => offre==3).length;
      this.nb4 = this.panier.filter(offre => offre==4).length;
      this.total=this.nb1*470+this.nb2*320+this.nb3*820+this.nb4*520;
    }
    else
    {
      this.panier = [];
      this.nbArticles=0;
      this.nb1 = 0;
      this.nb2 = 0;
      this.nb3 = 0;
      this.nb4 = 0;
      this.total = 0;
    }
  }

  viderPanier(): void {
    sessionStorage.removeItem("panier");
    this.ngOnInit();
  }

  creerPersonne(): void {
    this.httpClientService.creerPersonne(this.personne)
        .subscribe( data => {
          alert("Employe cree");
        });

  };

}
