package CommonUtils;

import TestConfig.BaseTest;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;

import java.io.FileReader;
@Component
public class JSONUtils extends BaseTest {


public String getPayLoad(String reqname){
   String jsonFilepath= getJsonFilePath(reqname);
    JSONParser parsor = new JSONParser();
    JSONObject data= null;

    try {
        data= (JSONObject) parsor.parse(new FileReader( jsonFilepath));
    }
    catch (Exception e){
        e.printStackTrace();
    }
    log.testLog().info("Request Body : "+data.toJSONString());
    return data.toJSONString();
}


public String getJsonFilePath(String reqname ){
    return System.getProperty("user.dir")+"/src/main/resources/"+reqname.toLowerCase()+"/requestBody.json";
}


public JsonElement getJsonObject(String fileName){
 String filepath=   System.getProperty("user.dir")+"\\src\\main\\resources\\"+fileName+".json";
 JsonElement ele=null;
 try{
     JsonParser parser= new JsonParser ();
ele= (JsonElement ) parser.parse(new FileReader(filepath));
 }
 catch (Exception e){
     System.out.println("File not found");
 }
return ele;
}
}
