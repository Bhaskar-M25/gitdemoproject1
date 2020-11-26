package gitdemoproject;

public class Testlead 
{ 
    int a; 
    int b; 
  
    //Default constructor 
public Testlead() 
    { 
        a = 10; 
        b = 20; 
    } 
      
    //Method that returns current class instance 
public Testlead get() 
    { 
       return this; 
    } 
      
    //Displaying value of variables a and b 
public void display() 
    { 
        System.out.println("a = " + a + "  b = " + b); 
    } 
  

public static void main(String[] args) 
    { 
        Testlead object = new Testlead(); 
        object.display();
    } 
}