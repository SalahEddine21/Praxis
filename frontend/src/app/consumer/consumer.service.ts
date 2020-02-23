import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Statique } from '../Util/Statique';

@Injectable({
  providedIn: 'root'
})
export class ConsumerService {

  private apiUrl = environment.apiUrl;
  Statique : Statique;

  constructor(private http : HttpClient) { }

  getNextConsumerPage(page : number, size : number) : Observable<any>{
    let params : string = "?page="+page+"&size="+size;
    return this.http.get(this.apiUrl + Statique.CONSUMER_CONTROLLER + "/data"+params);
  }
}
