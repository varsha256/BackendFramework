package Models;

import CommonUtils.RequestHelper;
import Models.Response.BooksHelper;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Books extends RequestHelper {



    private String userId;
    private String  isbn;


    public Books(BooksHelper booksHelper) {
        this.userId=booksHelper.getUserId();
        this.isbn=booksHelper.getIsbn();
    }
}
