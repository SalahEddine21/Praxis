import { Component, OnInit } from '@angular/core';
import { ConsumerService } from '../consumer.service';
import { Consumer } from 'src/app/Model/Consumer';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  page : number = 0;
  size : number = 3;
  totalElements : number;
  consumers : Array<Consumer> = null;

  constructor(
    private consumerService : ConsumerService
  ) { }

  ngOnInit() {    
    this.getConsumerData();
  }

  getConsumerData(){
    this.consumerService.getNextConsumerPage(this.page, this.size).subscribe(data => {
      this.consumers = data.content as Array<Consumer>; // get data
      this.totalElements = data.totalElements; // get totalElements required by primeng paginator
    });
  }

  paginate(event) { // called when user change pagination
    this.page = event.page as number;
    this.getConsumerData();
  } 
}
