/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yanhongchen
 */
public class MainMenu {
    public static void main(String args[]){     
        //create coleection of ArrayList,storage the types of product.
        ArrayList<Product> array=new ArrayList<Product>();
        init(array);
        while(true){
        Manu();
        int choose=choose();
        switch(choose){
            case 1:
                showProduct(array);
                break;
            case 2:
                createProduct(array);
                break;
            case 3:
                updateProduct(array);
                break;
            case 4:
                System.out.println("Exit the system");
                return;
            default:
                System.out.println("Wrong Number");
                break;
        }
        }
    }
        public static void init(ArrayList<Product>array){
        Product p1 = new Product();
        p1.setName("Apple");
        p1.setPrice(0.99);
        p1.setAvailNum(5);
        p1.setDescription("sweet");
        p1.getSupplier().setName("farm");
        p1.getSupplier().setAddress("Happy Street");
        
        
        Product p2 = new Product();
        p2.setName("Orange");
        p2.setPrice(1.19);
        p2.setAvailNum(4);
        p2.setDescription("juicy");
        p2.getSupplier().setName("farm");
        p2.getSupplier().setAddress("Happy Street");
        //crate two variable, storage in coleection.
        array.add(p1);
        array.add(p2);
    }
        
    public static void Manu(){
        System.out.println("-------------------------------------------------------");
        System.out.println("1:View Product 2:Create Product 3:Update Product 4:Exit");
        System.out.println("----------------Please enter the number----------------");
    }
    
    public static int choose(){
        Scanner scanner = new Scanner(System.in);
        return scanner. nextInt();
    }
    public static void showProduct(ArrayList<Product> array){
        System.out.println("--------------------------------Show Product----------------------------------------");
        System.out.println("1:Name 2:Price 3:Avaliable Number 4:Description  5:Supplier Name  6:Supplier Address"); 
        for (int i = 0; i < array.size(); i++) {
			Product item = array.get(i);
			System.out.println(item.getName()+"\t"+item.getPrice()+"\t"+"\t"+item.getAvailNum()+"\t"+"\t"+item.getDescription()+"\t"+
                                "\t"+item.getSupplier().getName()+"\t"+"\t"+item.getSupplier().getAddress());
		}
        System.out.println("------------------------------------------------------------------------------------");
    }
     public static void createProduct(ArrayList<Product> array){
         Product newProduct = new Product();
         Scanner scanner =new Scanner(System.in);
         System.out.print("Please enter the product name:");
		newProduct.setName(scanner.next()) ;
		System.out.print("Please enter the product price:");
                newProduct.setPrice(scanner.nextDouble());
                System.out.print("Please enter the product Avaliable Number:");
                newProduct.setAvailNum(scanner.nextInt());
                System.out.print("Please enter the product Description:");
                newProduct.setDescription(scanner.next());
                System.out.print("Please enter the product Supplier Name:");
                newProduct.getSupplier().setName(scanner.next());
                System.out.print("Please enter the product Supplier Address:");
                newProduct.getSupplier().setAddress(scanner.next());
		array.add(newProduct);
                System.out.println("You crate a new product successfully!");
     }       
     public static void updateProduct(ArrayList<Product> array){
         System.out.println("please enter the name of product that you want to update");
         Scanner scanner= new Scanner(System.in);
         String productname=scanner.next();
         for (int i = 0; i < array.size(); i++) {
             Product updateProduct = array.get(i);
             if(updateProduct.getName().equals(productname)){
                 System.out.println("please enter the new name:");
                 updateProduct.setName(scanner.next());
                 System.out.println("please enter the new price:");
                 updateProduct.setPrice(scanner.nextDouble());
                 System.out.println("please enter the new Avaliable Number:");
                 updateProduct.setAvailNum(scanner.nextInt());
                 System.out.println("please enter the new Description:");
                 updateProduct.setDescription(scanner.next());
                 System.out.println("please enter the new Supplier Name:");
                 updateProduct.getSupplier().setName(scanner.next());
                 System.out.println("please enter the new Supplier Address:");
                 updateProduct.getSupplier().setAddress(scanner.next());
                 System.out.println("Thank your for the update!");
             }
         }
         System.out.println("Sorry, can't find the product.");
     }
}
