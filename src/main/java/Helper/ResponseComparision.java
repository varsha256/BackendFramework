package Helper;


import Config.BaseTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.io.FileReader;
import java.io.IOException;

public class ResponseComparision extends BaseTest {


    public void compareJSons() throws JsonProcessingException {
        JSONObject obj1=null;
        JSONObject obj2=null;
        try {
             obj1= (JSONObject) new JSONParser().parse(new FileReader("D:\\MyTutorial\\code\\TestAutomation_Backend\\src\\main\\resources\\json1.json"));
             obj2= (JSONObject) new JSONParser().parse(new FileReader("D:\\MyTutorial\\code\\TestAutomation_Backend\\src\\main\\resources\\json2.json"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ObjectMapper mapper= new ObjectMapper();

        Assert.assertEquals(mapper.readTree(obj1.toJSONString()),mapper.readTree(obj2.toJSONString()));
    }

}
