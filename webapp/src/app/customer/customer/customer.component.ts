import { Component, OnInit } from '@angular/core';
import { Customer } from '../../domain/customer/customer';
import { CustomerService } from '../../service/customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customers :Customer[];

  constructor(private customerService:CustomerService) { 
    this.customers = [
      {name:'Customer 1'},
      {name:'Customer 2'}
    ]
  }

  ngOnInit() {
  }

  save(){
    var customer:Customer = {name:'My Name',address:{city:'City'}};
    this.customerService.save(customer);
  }

}
