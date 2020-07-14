import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AccueilComponent } from './accueil/accueil.component';
import { OffresComponent } from './offres/offres.component';
import { FooterComponent } from './footer/footer.component';
import { PanierComponent } from './panier/panier.component';
import { ContactComponent } from './contact/contact.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpClientService } from './service/http-client.service';
import { FormsModule } from '@angular/forms'
import { ReactiveFormsModule } from '@angular/forms'

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    AccueilComponent,
    OffresComponent,
    FooterComponent,
    PanierComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,    
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [HttpClientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
