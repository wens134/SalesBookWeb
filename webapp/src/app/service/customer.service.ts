import { Injectable } from '@angular/core';
import { AuthHttp } from 'angular2-jwt';
import { Customer } from '../domain/customer/customer';

@Injectable()
export class CustomerService {

  constructor(private authHttp:AuthHttp) { }

  save(customer:Customer){
    this.authHttp.post('/api/customers',customer).subscribe(
     (ret)=>console.log(ret) ,
     (ret)=>console.log(ret)
    );
  }

}
