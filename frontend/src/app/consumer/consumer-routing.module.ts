import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';

export const CONSUMER_ROUTES: Routes = [
    {
        path:'',
        children : [
            {
                path : 'dashboard',
                component : DashboardComponent
            }
        ]
    }
];

export const ConsumerRoutes = RouterModule.forChild(CONSUMER_ROUTES);

