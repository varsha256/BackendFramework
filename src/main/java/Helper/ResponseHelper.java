package Helper;

import Config.BaseTest;
import io.restassured.response.Response;
import lombok.Getter;

import java.util.HashMap;
@Getter
public class ResponseHelper extends BaseTest {



HashMap<String, Response> responseMap;


public void setResponseMap(String key, Response res){
    if(responseMap==null){
        responseMap=new HashMap<>();
    }
    responseMap.put(key, res);

}


}
