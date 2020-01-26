import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dailymenu',
  templateUrl: './dailymenu.component.html',
  styleUrls: ['./dailymenu.component.css']
})

export class DailymenuComponent implements OnInit {


   
  constructor(private http : HttpClient, private route : Router) { }
  fooditems:any
  ngOnInit() {
    this.showItems()
  }

  showItems(){
    var url = "http://localhost:8080/createMenu"
    this.http.get(url).subscribe(data=>{
      this.fooditems=data
        console.log(data)
    }
     
    
      
    )
    
  }
  
  
}
