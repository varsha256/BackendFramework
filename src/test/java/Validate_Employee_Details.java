import Config.BaseTest;
import Endpoints.Endpoint_Employee;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validate_Employee_Details extends BaseTest {

@Test(priority=0)
    public void validate_get_Employee_Status(){

   Response res=  requestBuilder.setBaseUri(environment.getProperty("employee")+ Endpoint_Employee.GET_EMPLOYEE+"1").build().getRequest();
   responseHelper.setResponseMap("EMP", res);
    Assert.assertEquals(responseHelper.getResponseMap().get("EMP").getStatusCode(),200);
}
@Test(priority=1)
    public void validate_employee_name(){
    responseHelper.getResponseMap().get("EMP").getBody().prettyPrint();
    String actualEmpName=responseHelper.getResponseMap().get("EMP").getBody().jsonPath().get("data.employee_name");
    Assert.assertEquals(actualEmpName, "Tiger Nixon");
}



}
