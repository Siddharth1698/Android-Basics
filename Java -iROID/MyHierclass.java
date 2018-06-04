public class MyHierclass{
    
public static void main(String[] args){

        Kingfisher k = new Kingfisher();
  
        BabyKingFisher b = new BabyKingFisher();   
    
      
     k.type();
  
     
     b.typer();     
 }
}

class Bird{
   
 void who(){
   
 System.out.println("iam a bird");
  
  }
}

class Kingfisher extends Bird{
  
  void type(){
  
  System.out.println("New bird");
  
  }}
 
class BabyKingFisher extends Bird{
 void typer(){
  
  System.out.println("baby bird");
  
  }}
 
