/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class BookRecycleWorkRequest extends WorkRequest{
    
    private String checkResult;

    public String getTestResult() {
        return checkResult;
    }

    public void setTestResult(String testResult) {
        this.checkResult = testResult;
    }
       
}
