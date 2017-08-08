import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';

import {NgModule} from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {HttpModule} from '@angular/http';
import {AppRouteModule} from "./app.route";

import {SERVICES} from './service/index';
import {AppComponent} from './app.component';
import {PRODUCT_DECLARATIONS} from './components/product.index';


@NgModule({
  declarations: [
    AppComponent,
    PRODUCT_DECLARATIONS
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRouteModule,
    HttpModule,
    NgbModule.forRoot()
  ],
  providers: [
    SERVICES
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
