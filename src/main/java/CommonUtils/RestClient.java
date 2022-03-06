package CommonUtils;

import TestConfig.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.stereotype.Component;

@Component
public class RestClient extends BaseTest {

    RequestSpecification request;

    public RestClient(RestManager restManager) {
        request = RestAssured.given();
        this.request.baseUri(restManager.baseuri)  ;
       if(restManager.header!=null) this.request.headers(restManager.header)  ;
       if(restManager.query!=null) this.request.queryParams(restManager.query)  ;
       if(restManager.body!=null) this.request.body(restManager.body)  ;

    }

    public Response getRequest() {
        return this.request.get();

    }
    public Response postRequest() {
        return this.request.post();

    }

    public Response putRequest() {
        return this.request.put();

    }


    public Response patchRequest() {
        return this.request.patch();

    }
}
