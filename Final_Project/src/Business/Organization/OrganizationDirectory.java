/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Sales.getValue())){
            organization = new SalesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Community.getValue())){
            organization = new CommunityOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.BookManage.getValue())){
            organization = new BookManageOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Recycling.getValue())){
            organization = new RecyclingOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Pricing.getValue())){
            organization = new PricingOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}