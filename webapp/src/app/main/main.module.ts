import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RouterModule, Route } from '@angular/router';
import { MainComponent } from './main.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { NavbarComponent } from './navbar/navbar.component';

export const MODULE_ROUTES: Route[] =[
    { path: '',
      component:MainComponent,
      children:[
        { path: '', loadChildren: '../dashboard/dashboard.module#DashboardModule' },
        { path: 'profile', loadChildren: '../profile/profile.module#ProfileModule'},
        { path: 'customer', loadChildren: '../customer/customer.module#CustomerModule'}
      ]
    }
    
]

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(MODULE_ROUTES),
  ],
  declarations: [MainComponent,SidebarComponent,NavbarComponent]
})
export class MainModule { }
