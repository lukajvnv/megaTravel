import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
//dlet url = string = "//localhost:8080/api/test";

@Injectable({
  providedIn: 'root'
})
export class TestService {

  constructor(private http: HttpClient) { }

  test(temp): Observable<any> {
    alert("Service!")
    return this.http.get("//localhost:8888/api/test/proba");
  }

}
