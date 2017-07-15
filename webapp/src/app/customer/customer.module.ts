import { NgModule, Injectable } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, RouterModule } from '@angular/router';
import { Observable } from 'rxjs';
import { CustomerComponent } from './customer/customer.component';
import { LibraryModule } from '../library/library.module';

@Injectable()
export class CustomerResolver implements Resolve<any>{
  constructor(){}
  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    return Observable.of({});
  }
}

const routes: Routes = [
  {path:'',component:CustomerComponent,resolve:{user:CustomerResolver}}
];
@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    LibraryModule
  ],
  declarations: [CustomerComponent],
  providers:[CustomerResolver]
})
export class CustomerModule { }
