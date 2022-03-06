package TestConfig;

import CommonUtils.JSONUtils;
import CommonUtils.RequestHelper;
import CommonUtils.ResponseHelper;
import CommonUtils.RestManager;
import ExecutionReports.CustomLogger;
import Models.Response.BooksHelper;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;


@ContextConfiguration(classes={TestConfig.class})

public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected RestManager restManger;

    @Autowired
    protected Environment environment;

    @Autowired
    protected HashMap<String, Response> responsemap;
    @Autowired
    protected JSONUtils jsonUtils;

    @Autowired
    protected CustomLogger log;

    @Autowired
    protected ResponseHelper responseHelper;


    @Autowired
    protected RequestHelper requestHelper;

    @Autowired
    protected BooksHelper booksHelper;


    @BeforeMethod
    public void beforeTest(){
        log.testLog().info("Test Execution Started ");
    }
    @AfterClass
    public void afterTest(){log.testLog().info("Test Execution Completed ");}

    public  void setResponsemap(String key , Response res) {
        log.testLog().info("Response Body : "+res.getBody().asString());
        responsemap.put(key,res);
    }
    public Response getResponseMap(String key ){
        return responsemap.get(key);
    }



}
