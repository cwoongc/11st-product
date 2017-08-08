import {Injectable} from "@angular/core";
import {Http, RequestOptions, URLSearchParams} from "@angular/http";
import {environment} from "../../environments/environment";

@Injectable()
export class ApiService {

  constructor(private http: Http) { }

  get(apiUrl, paramsObj?) {
    console.log(environment.apiHost+apiUrl);
    return this.http.get(environment.apiHost + apiUrl, this.options(paramsObj));
  }

  post(apiUrl, dataObj?) {
    return this.http.post(environment.apiHost + apiUrl, dataObj, this.options());
  }

  put(apiUrl, dataObj?) {
    return this.http.put(environment.apiHost + apiUrl, dataObj, this.options());
  }

  del(apiUrl) {
    return this.http.delete(environment.apiHost + apiUrl, this.options());
  }

  private options(paramsObj?) {
    paramsObj = paramsObj || {};

    let params = this.objToParams(paramsObj);
    return new RequestOptions({ /* headers: headers, */ search: params });
  }

  private objToParams(obj): URLSearchParams {
    let params: URLSearchParams = new URLSearchParams();
    for (var key in obj) {
      if (obj.hasOwnProperty(key)) {
        params.set(key, JSON.stringify(obj[key]));
      }
    }
    return params;
  }
}
