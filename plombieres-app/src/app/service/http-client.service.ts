import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Personne{
  constructor(
    public idPersonne:number,
    public nom:string,
    public prenom:string,
    public mail:string,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private http: HttpClient) { }

  public creerPersonne(personne) {
    personne.idPersonne = 1;
    personne.nom="voinea";
    personne.prenom="loris";
    personne.email="loris@loris.fr";
    console.log(personne);
    return this.http.post("http://localhost:8080/plombieres_app/api/personne", personne);
  }
}
