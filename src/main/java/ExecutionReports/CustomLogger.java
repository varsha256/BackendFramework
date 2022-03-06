package ExecutionReports;

import TestConfig.BaseTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Component
public class CustomLogger extends BaseTest {

    public Logger testLog(){
        Logger log= Logger.getLogger(CustomLogger.class);
        Properties pro= new Properties();
        try{
            pro.load(new FileInputStream("log4j.properties"));
            PropertyConfigurator.configure(pro);

        } catch (IOException e) {
            e.printStackTrace();
        }
    return log;
    }
}
