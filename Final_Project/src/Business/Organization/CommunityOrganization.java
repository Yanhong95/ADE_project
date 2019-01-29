/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Comment.BookComment;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class CommunityOrganization extends Organization{
    private ArrayList<BookComment> bookCommentList;
    public CommunityOrganization() {
        super(Organization.Type.Community.getValue());
        this.bookCommentList = new ArrayList<>();
    }

    public ArrayList<BookComment> getBookCommentList() {
        return bookCommentList;
    }

    public void setBookCommentList(ArrayList<BookComment> bookCommentList) {
        this.bookCommentList = bookCommentList;
    }
     
}
