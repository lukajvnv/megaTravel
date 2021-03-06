import { API_USER } from './../../globals';
import { AuthLoginInfo } from './../../forms/loginForm';
import { SignUpInfo } from './../../forms/registerForm';
import { JwtResponse } from './../../jwt-response';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable({
  providedIn: 'root'
})
export class AuthService {
  //private loginUrl = API_USER + 'api/auth/signin/'; 
  private loginUrl = API_USER  + 'api/auth/signin/';
  private signupUrl = API_USER + 'api/auth/signup/';
  private admin = 'admin';
  
  constructor(private http: HttpClient) {
  }
  
  attemptAuth(credentials: AuthLoginInfo): Observable<JwtResponse> {
    //alert("LDAFKJDSLKFJ");
    return this.http.post<JwtResponse>(this.loginUrl + this.admin, credentials, httpOptions);
  }

  signUp(info: SignUpInfo): Observable<any> {
    return this.http.post<string>(this.signupUrl + this.admin, info, httpOptions);
  }
}
