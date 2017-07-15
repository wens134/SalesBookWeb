import { Component, OnInit } from '@angular/core';
import {LocationStrategy, PlatformLocation, Location} from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  location: Location;
    constructor(location:Location) {
        this.location = location;
    }
    ngOnInit(){

    }
  title = 'app works!';
  menuGroups = [
    {
      code:'users',
      label:'Users',
      menus:[
        {
          code:'usermgmt',
          label:'User Management'
        }
      ]
    }
  ]
}
