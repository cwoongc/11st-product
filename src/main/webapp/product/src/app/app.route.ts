import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {PRODUCT_COMPONENTS} from "./components/product.index";

const routes: Routes = [
  { path: '', redirectTo: '/product/list', pathMatch: 'full' },
  { path: 'product/list', component: PRODUCT_COMPONENTS.list },
  { path: 'product/add', component: PRODUCT_COMPONENTS.add },
  { path: 'product/:prdNo', component: PRODUCT_COMPONENTS.detail }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes, { useHash: true })],
  exports: [ RouterModule ]
})

export class AppRouteModule {}
