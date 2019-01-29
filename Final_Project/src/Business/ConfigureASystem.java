package Business;

import Business.Book.Book;
import Business.Employee.Employee;
import Business.Enterprise.BookRecycleEnterprise;
import Business.Enterprise.BookStoreEnterprise;
import Business.Item.Item;
import Business.Network.Network;
import Business.Organization.BookManageOrganization;
import Business.Organization.CommunityOrganization;
import Business.Organization.Organization;
import Business.Organization.PricingOrganization;
import Business.Organization.RecyclingOrganization;
import Business.Organization.SalesOrganization;
import Business.Role.Administrator;
import Business.Role.Customer;
import Business.UserAccount.User;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        //sysAdmin
        Administrator admin = new Administrator(0000000,"sysadmin","0000000");
        admin.setType("administrator");
        system.getUserAccountDirectory().getUserAccountList().add(admin);
        //admin
        Administrator admin1 = new Administrator(1111,"Bookstore_admin","111");
        admin1.setType("administrator");
        Administrator admin2 = new Administrator(2222,"recycle-admin","111");
        admin2.setType("administrator");
        Administrator admin3 = new Administrator(3333,"Bookstore_admin","111");
        admin3.setType("administrator");
        Administrator admin4 = new Administrator(4444,"recycle-admin","111");
        admin4.setType("administrator");
        //customer
        User user = new Customer(1234,"TestUser","111");
        user.setType("customer");
        system.getUserAccountDirectory().getUserAccountList().add(user);
        //employee
        Employee bookemployee = new Employee();
        bookemployee.setName("Book_employee");
        bookemployee.setID(111);
        bookemployee.setPassword("111");
        Employee salesemployee = new Employee();
        salesemployee.setName("Sales_employee");
        salesemployee.setID(222);
        salesemployee.setPassword("111");
        Employee communityemployee = new Employee();
        communityemployee.setName("Community_employee");
        communityemployee.setID(333);
        communityemployee.setPassword("111");
        Employee recyemployee = new Employee();
        recyemployee.setName("Recy_employee");
        recyemployee.setID(444);
        recyemployee.setPassword("111");
        Employee priceemployee = new Employee();
        priceemployee.setName("Price_employee");
        priceemployee.setID(555);
        priceemployee.setPassword("111");
        Employee bookemployee1 = new Employee();
        bookemployee1.setName("Book_employee");
        bookemployee1.setID(666);
        bookemployee1.setPassword("111");
        Employee salesemployee1 = new Employee();
        salesemployee1.setName("Sales_employee");
        salesemployee1.setID(777);
        salesemployee1.setPassword("111");
        Employee communityemployee1 = new Employee();
        communityemployee1.setName("Community_employee");
        communityemployee1.setID(888);
        communityemployee1.setPassword("111");
        Employee recyemployee1 = new Employee();
        recyemployee1.setName("Recy_employee");
        recyemployee1.setID(999);
        recyemployee1.setPassword("111");
        Employee priceemployee1 = new Employee();
        priceemployee1.setName("Price_employee");
        priceemployee1.setID(000);
        priceemployee1.setPassword("111");
        
        
        
        Organization salesOrg = new SalesOrganization();
        salesemployee.setOrg(salesOrg);
        salesOrg.setType(Organization.Type.Sales);
        salesOrg.getEmployeeDirectory().getEmployeeList().add(salesemployee);       
        system.getEmployeeDirectory().getEmployeeList().add(salesemployee);
        Organization bookOrg = new BookManageOrganization();
        bookemployee.setOrg(bookOrg);
        bookOrg.setType(Organization.Type.BookManage);
        bookOrg.getEmployeeDirectory().getEmployeeList().add(bookemployee);
        system.getEmployeeDirectory().getEmployeeList().add(bookemployee);
        Organization communityOrg = new CommunityOrganization();
        communityemployee.setOrg(communityOrg);
        communityOrg.setType(Organization.Type.Community);
        communityOrg.getEmployeeDirectory().getEmployeeList().add(communityemployee);
        system.getEmployeeDirectory().getEmployeeList().add(communityemployee);
        Organization recyOrg = new RecyclingOrganization();
        recyemployee.setOrg(recyOrg);
        recyOrg.setType(Organization.Type.Recycling);
        recyOrg.getEmployeeDirectory().getEmployeeList().add(recyemployee);
        system.getEmployeeDirectory().getEmployeeList().add(recyemployee);
        Organization priceOrg = new PricingOrganization();
        priceemployee.setOrg(priceOrg);
        priceOrg.setType(Organization.Type.Pricing);
        priceOrg.getEmployeeDirectory().getEmployeeList().add(priceemployee);
        system.getEmployeeDirectory().getEmployeeList().add(priceemployee);
        
        Organization salesOrg1 = new SalesOrganization();
        salesemployee1.setOrg(salesOrg1);
        salesOrg1.setType(Organization.Type.Sales);
        salesOrg1.getEmployeeDirectory().getEmployeeList().add(salesemployee1);       
        system.getEmployeeDirectory().getEmployeeList().add(salesemployee1);
        Organization bookOrg1 = new BookManageOrganization();
        bookemployee1.setOrg(bookOrg1);
        bookOrg1.setType(Organization.Type.BookManage);
        bookOrg1.getEmployeeDirectory().getEmployeeList().add(bookemployee1);
        system.getEmployeeDirectory().getEmployeeList().add(bookemployee1);
        Organization communityOrg1 = new CommunityOrganization();
        communityemployee1.setOrg(communityOrg1);
        communityOrg1.setType(Organization.Type.Community);
        communityOrg1.getEmployeeDirectory().getEmployeeList().add(communityemployee1);
        system.getEmployeeDirectory().getEmployeeList().add(communityemployee1);
        Organization recyOrg1 = new RecyclingOrganization();
        recyemployee1.setOrg(recyOrg1);
        recyOrg1.setType(Organization.Type.Recycling);
        recyOrg1.getEmployeeDirectory().getEmployeeList().add(recyemployee1);
        system.getEmployeeDirectory().getEmployeeList().add(recyemployee1);
        Organization priceOrg1 = new PricingOrganization();
        priceemployee1.setOrg(priceOrg1);
        priceOrg1.setType(Organization.Type.Pricing);
        priceOrg1.getEmployeeDirectory().getEmployeeList().add(priceemployee1);
        system.getEmployeeDirectory().getEmployeeList().add(priceemployee1);
        //enterprise
        BookStoreEnterprise Bbse = new BookStoreEnterprise("Boston_bookstore");
        admin1.setEnterprise(Bbse);
        Bbse.getAdminList().add(admin1);
        system.getUserAccountDirectory().getUserAccountList().add(admin1);
        Bbse.getOrganizationDirectory().getOrganizationList().add(salesOrg);
        Bbse.getOrganizationDirectory().getOrganizationList().add(bookOrg);
        Bbse.getOrganizationDirectory().getOrganizationList().add(communityOrg);
        BookRecycleEnterprise Bbre = new BookRecycleEnterprise("Boston_recyclestore");
        admin2.setEnterprise(Bbre);
        Bbre.getAdminList().add(admin2);
        system.getUserAccountDirectory().getUserAccountList().add(admin2);
        Bbre.getOrganizationDirectory().getOrganizationList().add(recyOrg);
        Bbre.getOrganizationDirectory().getOrganizationList().add(priceOrg);
        
        BookStoreEnterprise Lbse = new BookStoreEnterprise("London_bookstore");
        admin3.setEnterprise(Lbse);
        Lbse.getAdminList().add(admin3);
        system.getUserAccountDirectory().getUserAccountList().add(admin3);
        Lbse.getOrganizationDirectory().getOrganizationList().add(salesOrg1);
        Lbse.getOrganizationDirectory().getOrganizationList().add(bookOrg1);
        Lbse.getOrganizationDirectory().getOrganizationList().add(communityOrg1);
        BookRecycleEnterprise Lbre = new BookRecycleEnterprise("London_recyclestore");
        admin4.setEnterprise(Lbre);
        Lbre.getAdminList().add(admin4);
        system.getUserAccountDirectory().getUserAccountList().add(admin4);
        Lbre.getOrganizationDirectory().getOrganizationList().add(recyOrg1);
        Lbre.getOrganizationDirectory().getOrganizationList().add(priceOrg1);
        //network
        Network network1 = new Network();
        network1.setName("Boston");
        network1.getEnterpriseDirectory().getEnterpriseList().add(Bbse);
        network1.getEnterpriseDirectory().getEnterpriseList().add(Bbre);
        system.getNetworkList().add(network1);       
        
        Network network2 = new Network();
        network2.setName("London");
        network2.getEnterpriseDirectory().getEnterpriseList().add(Lbse);
        network2.getEnterpriseDirectory().getEnterpriseList().add(Lbre);
        system.getNetworkList().add(network2);
        
        //book
        Book book1 = new Book(1111111,"Gone with the Wind","Margaret Mitchell","xxxxxxxxxxxxxxx");
        book1.setPicture("ItemPictures/1001.png");
        system.getBookDirectory().getBookList().add(book1);
        Book book2 = new Book(1111112,"The Lathe of Heaven","Ursula K. Le Guin","xxxxx");
        book2.setPicture("ItemPictures/1002.png");
        system.getBookDirectory().getBookList().add(book2);
        Book book3 = new Book(1111113,"The Wonderful Things You Will Be Hardcover","Emily Winfield Martin","xxxxxxxxx");
        book3.setPicture("ItemPictures/1003.png");
        system.getBookDirectory().getBookList().add(book3);
        Book book4 = new Book(1111114,"Beastie Boys Book Hardcover","Michael Diamond","xxxxxxx");
        book4.setPicture("ItemPictures/1004.png");
        system.getBookDirectory().getBookList().add(book4);
        Book book5 = new Book(1111115,"Bleak Harbor A Novel","Bryan Gruley","xxxxxxxx");
        book5.setPicture("ItemPictures/1005.png");
        system.getBookDirectory().getBookList().add(book5);      
        Book book6 = new Book(1111116,"Pride and Prejudice","Jane Austen","xxxx");
        book6.setPicture("ItemPictures/1006.png");
        system.getBookDirectory().getBookList().add(book6);       
        Book book7 = new Book(1111117,"The Little Prince","Antoine de Saint-Exupéry","xxxx");
        book7.setPicture("ItemPictures/1007.png");
        system.getBookDirectory().getBookList().add(book7);
        
        Book book8 = new Book(1111118,"The Philosopher's Stone","J. K. Rowling","xxxxxxxxxxxxxxx");
        book8.setPicture("ItemPictures/1008.png");
        system.getBookDirectory().getBookList().add(book8);
        Book book9 = new Book(1111119,"The Chamber of Secrets","J. K. Rowling","xxxxx");
        book9.setPicture("ItemPictures/1009.png");
        system.getBookDirectory().getBookList().add(book9);
        Book book10 = new Book(1111120,"The Prisoner of Azkaban","J. K. Rowling","xxxxxxxxx");
        book10.setPicture("ItemPictures/1010.png");
        system.getBookDirectory().getBookList().add(book10);
        Book book11 = new Book(1111121,"The Goblet of Fire","J. K. Rowling","xxxxxxx");
        book11.setPicture("ItemPictures/1011.png");
        system.getBookDirectory().getBookList().add(book11);
        Book book12 = new Book(1111122,"The Order of the Phoenix","J. K. Rowling","xxxxxxxx");
        book12.setPicture("ItemPictures/1012.png");
        system.getBookDirectory().getBookList().add(book12);      
        Book book13 = new Book(1111123,"The Half-Blood Prince","J. K. Rowling","xxxx");
        book13.setPicture("ItemPictures/1013.png");
        system.getBookDirectory().getBookList().add(book13);       
        Book book14 = new Book(1111124,"The Deathly Hallows","J. K. Rowling","xxxx");
        book14.setPicture("ItemPictures/1014.png");
        system.getBookDirectory().getBookList().add(book14);
        //item
        Item item1 = new Item(111111111,200,18.99,book1);
        item1.setPicture("ItemPictures/1001.png");
        item1.setRating(9.12);
        item1.setDescription("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        item1.setType("Fiction");
        item1.setEnterprise(Bbse);
        Bbse.getItemDirectory().getBookList().add(item1);
        Item item2 = new Item(111111112,208,13.99,book2);
        item2.setPicture("ItemPictures/1002.png");
        item2.setRating(8.62);
        item2.setDescription("xxxxxxx");
        item2.setType("Nonfiction");
        item2.setEnterprise(Bbse);
        Bbse.getItemDirectory().getBookList().add(item2);
        Item item3 = new Item(111111113,120,24.59,book3);
        item3.setPicture("ItemPictures/1003.png");
        item3.setRating(9.23);
        item3.setDescription("xxxxxxxxxxxxxxxxxxxxxxxxx");
        item3.setType("Nonfiction");
        item3.setEnterprise(Bbse);
        Bbse.getItemDirectory().getBookList().add(item3);
        Item item4 = new Item(111111114,267,16.99,book4);
        item4.setPicture("ItemPictures/1004.png");
        item4.setRating(7.88);
        item4.setDescription("xxxxxxxxxxxxxxxx");
        item4.setType("Nonfiction");
        item4.setEnterprise(Bbse);
        Bbse.getItemDirectory().getBookList().add(item4);
        Item item5 = new Item(111111115,195,17.99,book5);
        item5.setPicture("ItemPictures/1005.png");
        item5.setRating(8.51);
        item5.setDescription("xxxxxxxxxx");
        item5.setType("Fiction");
        item5.setEnterprise(Bbse);
        Bbse.getItemDirectory().getBookList().add(item5);
        Item item6 = new Item(111111116,280,28.99,book6);
        item6.setPicture("ItemPictures/1006.png");
        item6.setRating(9.07);
        item6.setDescription("xxxx");
        item6.setType("Fiction");
        item6.setEnterprise(Bbse);
        Bbse.getItemDirectory().getBookList().add(item6);
        
        
        Item item8 = new Item(111111118,200,18.99,book8);
        item8.setPicture("ItemPictures/1008.png");
        item8.setRating(9.12);
        item8.setDescription("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        item8.setType("Fiction");
        item8.setEnterprise(Lbse);
        Lbse.getItemDirectory().getBookList().add(item8);
        Item item9 = new Item(111111119,208,13.99,book9);
        item9.setPicture("ItemPictures/1009.png");
        item9.setRating(8.62);
        item9.setDescription("xxxxxxx");
        item9.setType("Fiction");
        item9.setEnterprise(Lbse);
        Lbse.getItemDirectory().getBookList().add(item9);
        Item item10 = new Item(111111120,120,24.59,book10);
        item10.setPicture("ItemPictures/1010.png");
        item10.setRating(9.23);
        item10.setDescription("xxxxxxxxxxxxxxxxxxxxxxxxx");
        item10.setType("Fiction");
        item10.setEnterprise(Lbse);
        Lbse.getItemDirectory().getBookList().add(item10);
        Item item11 = new Item(111111121,267,16.99,book11);
        item11.setPicture("ItemPictures/1011.png");
        item11.setRating(7.88);
        item11.setDescription("xxxxxxxxxxxxxxxx");
        item11.setType("Fiction");
        item11.setEnterprise(Lbse);
        Lbse.getItemDirectory().getBookList().add(item11);
        Item item12 = new Item(111111122,195,17.99,book12);
        item12.setPicture("ItemPictures/1012.png");
        item12.setRating(8.51);
        item12.setDescription("xxxxxxxxxx");
        item12.setType("Fiction");
        item12.setEnterprise(Lbse);
        Lbse.getItemDirectory().getBookList().add(item12);
        Item item13 = new Item(111111123,280,28.99,book13);
        item13.setPicture("ItemPictures/1013.png");
        item13.setRating(9.07);
        item13.setDescription("xxxx");
        item13.setType("Fiction");
        item13.setEnterprise(Lbse);
        Lbse.getItemDirectory().getBookList().add(item13);
        Item item14 = new Item(111111124,280,28.99,book14);
        item14.setPicture("ItemPictures/1014.png");
        item14.setRating(9.07);
        item14.setDescription("xxxx");
        item14.setType("Fiction");
        item14.setEnterprise(Lbse);
        Lbse.getItemDirectory().getBookList().add(item14);
        return system;
    }
    
}
