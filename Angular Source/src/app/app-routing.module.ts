import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginPageComponent } from './login-page/login-page.component';
import { HomeComponent } from './home/home.component';
import { UserRegisterComponent } from './user-register/user-register.component';

const routes: Routes = [
  { path : '' , component : HomeComponent },
  { path : 'login-page' , component : LoginPageComponent },
  {path : 'register-page', component : UserRegisterComponent}  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
