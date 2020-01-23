import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent implements OnInit {

  reg: Register = new Register();
  constructor(private http : HttpClient, private router : Router) { }

  ngOnInit() {
  }

  registeruser(){
    var url = "http://localhost:8080/register";
    alert(JSON.stringify(this.reg))
    this.http.post(url, this.reg).subscribe(data => {
      alert(JSON.stringify(data));
      // if(data.statusCode == 103){
         alert("Hello");
        this.router.navigate(['/home']);
      //}
    })
  }
}
class Register
{
  fname : String;
  username : String;
  password : String;
  emailid : String;

}


