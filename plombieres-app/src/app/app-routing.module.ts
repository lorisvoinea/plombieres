import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OffresComponent } from './offres/offres.component';
import { ContactComponent } from './contact/contact.component';
import { AccueilComponent } from './accueil/accueil.component';
import { PanierComponent } from './panier/panier.component';


const routes: Routes = [
  {path:'', component:AccueilComponent},
  {path:'offres', component:OffresComponent},
  {path:'contact', component:ContactComponent},
  {path:'accueil', component:AccueilComponent},
  {path:'panier', component:PanierComponent}
]
  ;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
