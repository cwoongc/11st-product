import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import {ProductService} from '../service/product.service';
import {Product} from '../model/product';

@Component({
  selector: 'product-detail',
  templateUrl: './product.detail.component.html'
  // styleUrls: ['./product.detail.component.css']
})
export class ProductDetailComponent implements OnInit {

  prdNo: number;
  private sub: any;

  product: Product;

  constructor(private route: ActivatedRoute, private productService: ProductService) {}

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.prdNo = +params['prdNo']; // (+) converts string 'id' to a number
    });


    this.productService.getProduct(this.prdNo).subscribe(
      data => {
        console.log(data);
        this.product = data;
      }
      , error => {
        console.log(error);
      }
    );
  }
}
