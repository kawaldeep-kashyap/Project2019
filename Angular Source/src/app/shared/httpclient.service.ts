import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class User{
  constructor(
    public id : number,
    public username : string,
    public fullName : string,
    public password : string,
    public emailId : string
  ){}
}


@Injectable({
  providedIn: 'root'
})
export class HttpclientService {

  // rootUrl : "http://localhost:8080"
  // constructor(private httpClient : HttpClient) { }

  // public createUser(user){
  //   this.httpClient.post()
  }
//}
