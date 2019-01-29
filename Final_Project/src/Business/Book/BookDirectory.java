/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Book;

import java.util.ArrayList;

/**
 *
 * @author chenchen
 */
public class BookDirectory {
    private ArrayList<Book> bookList;
    
    public BookDirectory(){
        bookList = new ArrayList<>();
    }
    
    public ArrayList<Book> getBookList(){
        return bookList;
    }
}
