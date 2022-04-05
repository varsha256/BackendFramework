package Config;

import Builder.RequestBuilder;
import Helper.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;



@ContextConfiguration(classes={TestConfig.class})
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
 protected   RequestBuilder requestBuilder;


    @Autowired
  protected  Environment environment;


    @Autowired
   protected  ResponseHelper responseHelper;




}
