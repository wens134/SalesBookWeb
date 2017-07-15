import { NgModule, Injectable } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MyProfileComponent } from './my-profile/my-profile.component';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, RouterModule } from '@angular/router';
import { Observable } from 'rxjs/Rx';
import { LibraryModule } from '../library/library.module';

@Injectable()
export class MyProfileResolver implements Resolve<any>{
  constructor(){}
  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    return Observable.of({});
  }
}
const routes: Routes = [
  {path:'my-profile',component:MyProfileComponent,resolve:{user:MyProfileResolver}}
];
@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    LibraryModule
  ],
  declarations: [MyProfileComponent],
  providers:[MyProfileResolver]
})
export class ProfileModule { }
