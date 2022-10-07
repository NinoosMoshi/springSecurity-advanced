import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {


  constructor(private http: HttpClient) { }

  getPlayers(){
    let basicAuthHeaderString = `Basic ` + window.btoa('ninos@gmail.com' + `:` + '111'); //64
    let header = new HttpHeaders({
      Authorization: basicAuthHeaderString
    })
    return this.http.get<any>(`http://localhost:8080/football/start`,{headers : header, responseType: 'text' as 'json'}).pipe(
      map(response =>{
             console.log(response)
             return response
      })
    )
  }



}
