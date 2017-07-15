import { Injectable } from '@angular/core';
import { Http ,RequestOptionsArgs} from '@angular/http';
import { environment } from '../../environments/environment';
import { Observable } from 'rxjs/Rx';
@Injectable()
export class HttpClient {

    constructor(private http:Http){}

    get(url:string,parameter?:any,options?:RequestOptionsArgs):Observable<any>{
        return this.http.get(environment.baseUrl+url,options);
    }
    post(url:string,requestBody?:any,options?:RequestOptionsArgs):Observable<any>{
        return this.http.post(environment.baseUrl+url,requestBody,options);
    }

}
