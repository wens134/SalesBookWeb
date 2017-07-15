import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup,FormControl} from '@angular/forms';

@Component({
    selector: 'user-cmp',
    moduleId: module.id,
    templateUrl: 'user.component.html'
})

export class UserComponent implements OnInit{
    constructor(private fb:FormBuilder){}
    group:FormGroup;
    ngOnInit(){
        // $.getScript('../../../assets/js/material-dashboard.js');
        this. group = this.fb.group({
            name:['Name']
        });
    }
}
