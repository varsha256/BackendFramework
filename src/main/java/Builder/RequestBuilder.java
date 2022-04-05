package Builder;

import Config.BaseTest;
import Helper.RestClientHelper;
import lombok.Getter;

import java.util.HashMap;
@Getter
public class RequestBuilder extends BaseTest {

    private String baseuri;
    private HashMap<String,String> headerMap;
    private String body;

    public RequestBuilder setBaseUri(String base){
        this.baseuri=base;
        return this;
    }
    public RequestBuilder setBody(String body){
        this.body=body;
        return this;
    }

    public RequestBuilder setHeader(String key, String value){
        if( headerMap==null){
            headerMap=new HashMap<>();
        }
       this.headerMap.put(key,value);
        return this;
    }


    public RestClientHelper build(){
        return new RestClientHelper(this);
    }
}
