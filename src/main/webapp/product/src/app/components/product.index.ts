import { ProductAddComponent } from './product.add.component';
import { ProductListComponent } from './product.list.component';
import { ProductDetailComponent } from './product.detail.component';

export const PRODUCT_DECLARATIONS = [
  ProductAddComponent,
  ProductListComponent,
  ProductDetailComponent
];

export const PRODUCT_COMPONENTS = {
  add: ProductAddComponent,
  list: ProductListComponent,
  detail: ProductDetailComponent
};
