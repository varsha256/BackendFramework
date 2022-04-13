package Config;

import Builder.RequestBuilder;
import Helper.ResponseComparision;
import Helper.ResponseHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:qa_config.properties")
public class TestConfig {


    @Bean
    public RequestBuilder requestBuilder(){
        return new RequestBuilder();
    }

    @Bean
    public ResponseComparision responseComparision(){
       return new ResponseComparision();
    }

    @Bean
    public ResponseHelper responseHelper(){
        return new ResponseHelper();
    }
}
