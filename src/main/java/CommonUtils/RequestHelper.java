package CommonUtils;

import Models.Books;
import TestConfig.BaseTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;

public class RequestHelper extends BaseTest {



    public String updateBooksPayload(String reqBody1,String jsonPath, String value  ) throws IOException {
        Gson g=new Gson();
        ObjectMapper map= new ObjectMapper();

        Books je= map.readValue(reqBody1, Books.class);
        switch (jsonPath) {
            case "userid" :   je.setUserId(value);break;
            case "isbn" :   je.setIsbn(value);break;
        }

        String booksReq = map.writerWithDefaultPrettyPrinter().writeValueAsString(je);
        return booksReq;
    }
}
