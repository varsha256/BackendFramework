package TestConfig;

import CommonUtils.JSONUtils;
import CommonUtils.RequestHelper;
import CommonUtils.ResponseHelper;
import CommonUtils.RestManager;
import ExecutionReports.CustomLogger;
import Models.Response.BooksHelper;
import io.restassured.response.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;

@PropertySource("classpath:qa-Config.properties")
@Configuration
public class TestConfig {


    @Bean
    public RestManager restManager(){
        return new RestManager();
    }

    @Bean
    public HashMap<String, Response> responseMap(){
        return new HashMap<String, Response>();
    }

    @Bean
    public JSONUtils jsonUtils(){
        return new JSONUtils();
    }

@Bean
public ResponseHelper responseHelper(){
        return new ResponseHelper();
}
@Bean
public RequestHelper requestHelper(){
        return new RequestHelper();
}

    @Bean
    public BooksHelper booksHelper(){
        return new BooksHelper();
    }

    @Bean
    public CustomLogger customLogger(){
        return new CustomLogger();
    }
}
