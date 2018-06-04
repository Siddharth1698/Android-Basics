class Constr{
Constr(int x){
 System.out.println("Constructor called");
x = 10;
System.out.println("After calling value is " + x);
 }
Constr(String z){
	z = "hello";
System.out.println("word is " + z);
 }
 Constr(int x,String z){
 	x = 10;
	z = "hello";
System.out.println("value and word is " + x + " " + z);
 }
}
class ConstProgramOverload{

 public static void main(String[] args){
int x = 5;
String z = "hai";
System.out.println("Value is " + x);
System.out.println("Word is "+ z);
     Constr obj = new Constr(x);
     Constr obj2 = new Constr(z);
     Constr obj3 = new Constr(x,z);



  
}

}