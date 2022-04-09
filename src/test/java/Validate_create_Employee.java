import Config.BaseTest;
import Endpoints.Endpoint_Employee;
import Model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validate_create_Employee extends BaseTest {


    @Test
    public void create_post_Req() throws JsonProcessingException {
        Employee emp=Employee.builder().age("32").name("harshdeep").salary("500").build();
        ObjectMapper map= new ObjectMapper();
        String body= map.writeValueAsString(emp);

        Response res= requestBuilder.setBaseUri(environment.getProperty("employee")+ Endpoint_Employee.POST_EMPLOYEE)
                .setBody(body).build().postRequest();
        System.out.println(res.getBody().asPrettyString());
        Assert.assertEquals(res.getStatusCode(),200);


    }
}
