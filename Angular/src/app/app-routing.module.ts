import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginPageComponent } from './login-page/login-page.component';
import { HomeComponent } from './home/home.component';
import { UserRegisterComponent } from './user-register/user-register.component';

import { TestingComponent } from './testing/testing.component';
import { DailymenuComponent } from './dailymenu/dailymenu.component';


const routes: Routes = [
  { path : '' , component : HomeComponent },
  {path : 'test-page', component : TestingComponent},
  { path : 'login-page' , component : LoginPageComponent },
  {path : 'register-page', component : UserRegisterComponent},
  {path:'app-dailymenu',component:DailymenuComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
