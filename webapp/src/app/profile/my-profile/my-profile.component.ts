import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { HttpClient } from '../../common/http-client';
import { AuthHttpClient } from '../../common/auth-http-client';
import { AuthHttp } from 'angular2-jwt';

@Component({
  selector: 'app-my-profile',
  templateUrl: './my-profile.component.html',
  styleUrls: ['./my-profile.component.css']
})
export class MyProfileComponent implements OnInit {

  constructor(private fb:FormBuilder,private http: HttpClient,private authHttp: AuthHttpClient) { }
  formGroup:FormGroup;
  ngOnInit() {
    this.formGroup=this.fb.group({
      firstName:'Admin',
      lastName:'Nistrator'
    });
  }
  httpCall(){
    this.http.get('/users/getCurrentUser').subscribe(
      (ret)=>{console.log(ret)},
      (ret)=>{console.log(ret)}
    )
  }
  authHttpCall(){
    this.authHttp.get('/users/getCurrentUser').subscribe(
      (ret)=>{console.log(ret)},
      (ret)=>{console.log(ret)}
    )
  }

}
