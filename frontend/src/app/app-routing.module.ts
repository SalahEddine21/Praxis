import { NgModule, ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

const APP_ROUTES: Routes = [
  {
    path: "app/consumer",
    loadChildren: () => import('./consumer/consumer.module').then(m =>     
      m.ConsumerModule)
  },
  {path: '',component:HomeComponent}
];

export const appRouter: ModuleWithProviders = RouterModule.forRoot(APP_ROUTES);

