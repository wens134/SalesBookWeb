import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClient } from './http-client';
import { AuthGuard } from './auth-guard';
import { AuthHttpClient } from './auth-http-client';
import { AuthHttp, AUTH_PROVIDERS, AuthConfig } from 'angular2-jwt';
import { RequestOptions, Http } from '@angular/http';

export function authHttpServiceFactory(http: Http, options: RequestOptions) {
  return new AuthHttp(new AuthConfig({
    tokenName: 'token',
		tokenGetter: (() => sessionStorage.getItem('token')),
		globalHeaders: [{'Content-Type':'application/json'}],
	}), http, options);
}

@NgModule({
  imports: [
    CommonModule
  ],
  providers:[HttpClient,AuthGuard,AuthHttpClient,AUTH_PROVIDERS,{
    provide: AuthHttp,
    useFactory: authHttpServiceFactory,
    deps: [Http, RequestOptions]
  }],
  declarations: []
})
export class AppCommonModule { }
