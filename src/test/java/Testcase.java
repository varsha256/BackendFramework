//import CommonUtils.RestClient;

import CommonUtils.Endpoints;
import ExecutionReports.CustomReporter;
import TestConfig.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(CustomReporter.class)
class Testcase extends BaseTest {


@Test(enabled=true )
    public void getRequest() throws IOException {
   Response res= restManger.setBaseUri("getRequest", Endpoints.getRequest)
    .setQueryparamers("pincode","560100")
    .setQueryparamers("date","15-02-2022")
    .build().getRequest();
    setResponsemap("getResponse", res);
    Assert.assertEquals(getResponseMap("getResponse").getBody().jsonPath().get("sessions[0].name"),"Bettadaspura SC Singsandra");
    Assert.assertEquals(getResponseMap("getResponse").getStatusCode(),200);

}
    @Test(enabled=true )
    public void getRequestAgain() throws IOException {
        Response res= restManger.setBaseUri("getRequest", Endpoints.getRequest)
                .setQueryparamers("pincode","560100")
                .setQueryparamers("date","15-02-2022")
                .build().getRequest();
        setResponsemap("getResponse2", res);
        Assert.assertEquals(getResponseMap("getResponse2").getBody().jsonPath().get("sessions[1].name"),"Doddathogur SC Singsandra");
        Assert.assertEquals(getResponseMap("getResponse2").getStatusCode(),200);

    }

    @Test(enabled=true )
    public void getUpdatedBodyRequestAgain() throws IOException  {
        String body= jsonUtils.getPayLoad("getRequest");
        Response res= restManger.setBaseUri("getRequest", Endpoints.getRequest)
                .setQueryparamers("pincode","560100")
                .setQueryparamers("date","15-02-2022")
                .setBody(body)
                .build().postRequest();
        setResponsemap("getResponse2", res);
        Assert.assertEquals(getResponseMap("getResponse2").getStatusCode(),404);

    }

    @Test(enabled=true )

    public void compareResponse() throws IOException {
//this is just and illustration if u wanto compare entire response againts some baseline response
//        Assert.assertTrue( responseHelper.compareUnorderedResponse("res1","res3")); //res 1 and res 3are diffrent in order
        Assert.assertTrue( responseHelper.compareResponse("res1","res1"));
        Assert.assertTrue( responseHelper.compareResponse("res1","res2"));

    }

    @Test(enabled=true )

    public void postRequest() throws IOException {
     String requestBody= jsonUtils.getPayLoad("books");//Method 1 to crete request using json
    Response res2= restManger.setBaseUri("books", Endpoints.books).setBody(requestBody).build().postRequest();

    Assert.assertEquals(res2.getStatusCode(),200);
    }


    @Test(enabled=true )

    public void postRequestUsingPojoPayLoad() throws IOException {

    }
}
