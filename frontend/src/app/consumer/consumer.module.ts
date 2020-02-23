import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import {TableModule} from 'primeng/table';
import {PaginatorModule} from 'primeng/paginator';


import {ConsumerRoutes} from './consumer-routing.module'
import { DashboardComponent } from './dashboard/dashboard.component';
import { ConsumerService } from './consumer.service';

@NgModule({
  declarations: [DashboardComponent],
  imports: [
    CommonModule,
    HttpClientModule,
    ConsumerRoutes,
    TableModule,
    PaginatorModule
  ],
  providers : [ConsumerService]
})
export class ConsumerModule { }
