import { Injectable } from '@angular/core';
import { Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/Rx';
import { ApiService } from './api.service';

@Injectable()
export class ProductService {

  constructor(private apiService: ApiService) { }

  getProduct(prdNo) {
    return this.apiService.get('/product/'+prdNo).map((response: Response) => response.json());
  }

}
