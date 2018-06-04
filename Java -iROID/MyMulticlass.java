public class MyMulticlass{
    
public static void main(String[] args){

        BabyKingFisher k = new BabyKingFisher();
    
k.who();
  
k.type();
   
k.typer();
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
 
class BabyKingFisher extends Kingfisher{
 void typer(){
  
  System.out.println("baby bird");
  
  }}
 
