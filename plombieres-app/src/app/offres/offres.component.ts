import { Component, OnInit } from '@angular/core';
import { PanierComponent } from '../panier/panier.component';

@Component({
  selector: 'app-offres',
  templateUrl: './offres.component.html',
  styleUrls: ['./offres.component.scss']
})
export class OffresComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  ajoutPanier(offre:number) {

    const panier = sessionStorage.getItem("panier");
    if (panier) {
      const panier_array : number[] = JSON.parse(panier);
      panier_array.push(offre);
      sessionStorage.setItem("panier", JSON.stringify(panier_array));
    } else {
      const list: number[] = [offre];
      sessionStorage.setItem("panier", JSON.stringify(list));
    }

    console.log("panier: "+sessionStorage.getItem("panier"));
  }

}
