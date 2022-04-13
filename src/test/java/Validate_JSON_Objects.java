import Config.BaseTest;
import Helper.ResponseComparision;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.testng.annotations.Test;

public class Validate_JSON_Objects extends BaseTest {
    @Test
    public void compare() throws JsonProcessingException {
        responseComparision.compareJSons();
    }
}
