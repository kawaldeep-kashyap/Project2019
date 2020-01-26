import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-testing',
  templateUrl: './testing.component.html',
  styleUrls: ['./testing.component.css']
})
export class TestingComponent implements OnInit {
  fullname: String;
  constructor() { }

  ngOnInit() {
    if(sessionStorage['fullname']!=null)
    {
        this.fullname = sessionStorage['fullname'];
    }
  }

  logout(){
    debugger
    sessionStorage.clear();
  }

}
