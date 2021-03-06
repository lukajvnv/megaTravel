import { API_RESERVATION } from './../../globals';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RezervacijaKorisnika } from 'src/app/rezervacijaKorisnika';

@Injectable({
  providedIn: 'root'
})
export class ReservationService {
  
  cancel(id: number) {
    //return this.http.get('http://localhost:8020/client', { responseType: 'text' });
    return this.http.get(API_RESERVATION + 'cancel/' + id, { responseType: 'text' });
  }

  constructor(private http: HttpClient) { }

  getReport(id: number): Observable<any> { 

    const headers = new HttpHeaders();

    return this.http.get(API_RESERVATION + 'reservation/report/' + id, {headers, responseType: 'text'});

  }

  putReservation(reserv: RezervacijaKorisnika): Observable<any> {
    return this.http.put(API_RESERVATION,reserv);
  }

  getReservation(id: number): Observable<any> {
    return this.http.get(API_RESERVATION + id);
  }

  makeReservation(res: RezervacijaKorisnika): Observable<any> {
    return this.http.post(API_RESERVATION, res);
  }

  makeReservation2(rezervacija: RezervacijaKorisnika, more: Boolean) {
    return this.http.post(API_RESERVATION + more, rezervacija);
  }


}
