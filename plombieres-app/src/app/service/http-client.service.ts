import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Personne{
  constructor(
    public nom:string,
    public prenom:string,
    public email:string,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private http: HttpClient) { }

  public creerPersonne(personne) {
    return this.http.post("http://localhost:8080/plombieres_app/api/personne", personne);
  }
}
