package Models.Response;

import Models.Books;
import TestConfig.BaseTest;
import lombok.Getter;

@Getter
public class BooksHelper extends BaseTest {

    private String userId;
    private String  isbn;


    public Books build(){
        return new Books(this);
    }

public BooksHelper setUserid(String id){

         this.userId=id;
         return this;
}
    public BooksHelper setIsbn(String isbn){

        this.isbn=isbn;
        return this;
    }

}
