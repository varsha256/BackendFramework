package CommonUtils;

import TestConfig.BaseTest;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

public class ResponseHelper extends BaseTest {



    public boolean compareResponse(String reqBody1,String reqBody2  )  {
        JsonElement obj1=jsonUtils.getJsonObject(reqBody1);
        JsonElement obj2=jsonUtils.getJsonObject(reqBody2);
        Gson g= new Gson();
        Type mpType= new TypeToken<Map<String,Object>>(){}.getType();
        Map<String,Object> map1= g.fromJson(obj1,mpType);
        Map<String,Object> map2= g.fromJson(obj2,mpType);
        MapDifference<String,Object> mapDiff=Maps.difference(map1,map2);
        if(mapDiff.entriesDiffering().entrySet().size()==0 && mapDiff.entriesOnlyOnLeft().entrySet().size()==0
    && mapDiff.entriesOnlyOnRight().entrySet().size()==0){
            return true ;
        }
        else{
            return false;
        }


    }


}
