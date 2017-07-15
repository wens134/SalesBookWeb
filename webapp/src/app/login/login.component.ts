import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import {Router} from '@angular/router';
import { HttpClient } from '../common/http-client';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(
    private fb:FormBuilder,
    private router:Router,
    private http:HttpClient,
    private authService:AuthService) { }
  formGroup:FormGroup;
  ngOnInit() {
    this.formGroup=this.fb.group({
      username:'',
      password:''
    })
  }
  loginClicked(){
    this.authService.login(this.formGroup.get("username").value,this.formGroup.get('password').value)
      .subscribe(
        (ret)=>{
          console.log(ret);
          localStorage.setItem('token',ret.access_token);
          localStorage.setItem('currentUser',this.formGroup.get('username').value);
          this.router.navigate(['/dashboard']);
        },
        (err)=>{console.log(err)}
      );
    
  }
  registerClicked(){
    this.http.post('/users/register',this.formGroup.value).subscribe((result)=>{
      console.log(result);
    },
    (err)=>{
      console.log(err);
    });
  }

}
