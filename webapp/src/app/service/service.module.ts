import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AuthService } from './auth.service';
import { CustomerService } from './customer.service';

@NgModule({
  imports: [
    CommonModule
  ],
  providers: [AuthService,CustomerService]
})
export class ServiceModule { }
