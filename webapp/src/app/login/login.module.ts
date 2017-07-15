import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login.component';
import { Routes, RouterModule } from '@angular/router';
import { LibraryModule } from '../library/library.module';

const routes: Routes = [
  {path:'',component:LoginComponent}
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    LibraryModule
  ],
  declarations: [LoginComponent]
})
export class LoginModule { }
