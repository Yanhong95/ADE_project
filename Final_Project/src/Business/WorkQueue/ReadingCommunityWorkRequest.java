/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Book.Book;
import Business.Comment.BookComment;

/**
 *
 * @author yanhongchen
 */
public class ReadingCommunityWorkRequest extends WorkRequest {
    private BookComment bookComment ; 

    public BookComment getBookComment() {
        return bookComment;
    }

    public void setBookComment(BookComment bookComment) {
        this.bookComment = bookComment;
    }
 
}
