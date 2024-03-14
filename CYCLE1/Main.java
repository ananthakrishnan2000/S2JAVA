class product{
int pcode;
String pname;
double price;

public product(int pcode,String pname,double price) {
this.pcode=pcode;
this.pname=pname;
this.price=price;
  }
}
  
public class Main {
    public static void main(String[] args) {
      System.out.println("A S Ananthakrishnan \n 23MCA001 \n 13-FEBRUARY-2024");
      product p1= new product(1, "Apple",100);
      product p2= new product(2, "Grapes",50);
      product p3= new product(3, "pineapple",70);
      product cheapestproduct = p1;
      
      if(p2.price<cheapestproduct.price){
      cheapestproduct=p2;
      
     }
      if(p3.price<cheapestproduct.price){
      cheapestproduct=p3;
      
     }          
     
     System.out.println("The product with the lowest price is " +cheapestproduct.pname+ " with a price of " + cheapestproduct.price);
     }
  }   
