public class Myclass{
   
 public static void main(String[] args){
  
      Kingfisher k = new Kingfisher();
   
     k.type();
     
   k.who();
        
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
 