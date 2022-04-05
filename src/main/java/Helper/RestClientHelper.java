package Helper;

import Builder.RequestBuilder;
import Config.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestClientHelper extends BaseTest {

    RequestSpecification reqSpec;

    public RestClientHelper(RequestBuilder requestBuilder) {
        reqSpec= RestAssured.given();
        reqSpec.baseUri(requestBuilder.getBaseuri());
        if(requestBuilder.getHeaderMap()!=null)reqSpec.headers(requestBuilder.getHeaderMap());
        if(requestBuilder.getBody()!=null)reqSpec.body(requestBuilder.getBody());
    }


    public Response getRequest(){
        return reqSpec.get();
    }
    public Response postRequest(){
        return reqSpec.get();
    }

}
