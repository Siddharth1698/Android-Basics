class Constr{
Constr(int x){
 System.out.println("Constructor called");
x = 10;
System.out.println("After calling value is " + x);
 }
}
class ConstProgramPara{

 public static void main(String[] args){
int x = 5;
System.out.println("Value is " + x);
     Constr obj = new Constr(x);



  
}

}