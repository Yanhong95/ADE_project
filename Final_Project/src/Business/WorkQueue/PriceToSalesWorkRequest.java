/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Item.SecondItem;

/**
 *
 * @author chenchen
 */
public class PriceToSalesWorkRequest extends WorkRequest {
    private SecondItem seItem;

    public SecondItem getSeItem() {
        return seItem;
    }

    public void setSeItem(SecondItem seItem) {
        this.seItem = seItem;
    }
    
    
}
