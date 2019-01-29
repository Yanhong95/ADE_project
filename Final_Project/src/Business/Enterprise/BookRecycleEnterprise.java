/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Item.SecondItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenchen
 */
public class BookRecycleEnterprise extends Enterprise {
    private List<SecondItem> reItemList;
    
    public BookRecycleEnterprise(String name){
        super(name,Enterprise.EnterpriseType.BookRecycle);
        this.reItemList = new ArrayList<>();
    }

    public List<SecondItem> getReItemList() {
        return reItemList;
    }

    public void setReItemList(List<SecondItem> reItemList) {
        this.reItemList = reItemList;
    }
    
}
