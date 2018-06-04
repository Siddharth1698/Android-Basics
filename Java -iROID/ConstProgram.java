class Constr{
int m;
Constr(){
 System.out.println("Constructor called");
 }
}
class ConstProgram{
 public static void main(String[] args){
     Constr obj = new Constr();
System.out.println(obj.m);
  
}

}