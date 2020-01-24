import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AdminLogin } from '../shared/admin-login.model';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  login : AdminLogin = new AdminLogin();
  constructor(private http : HttpClient, private router : Router) { }

  ngOnInit() {
   
  }

  checkUser(){
    var url = "http://localhost:8080/login";
    alert(JSON.stringify(this.login))
    this.http.post(url, this.login).subscribe(data => {
      alert(JSON.stringify(data));
      // if(data.statusCode == 103){
         alert("Hello");
        this.router.navigate(['/home']);
      //}
    })
  }
}
