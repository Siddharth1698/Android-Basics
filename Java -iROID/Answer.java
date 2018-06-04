interface adding{
 void add();
}

interface subtracting{
 void sub();
}

interface dividing{
 void divide();
}

class operations impements adding,subtracting,dividing{
int c;

  public void add(int a, int b){
c = a + b;
System.out.println(c);

}


  public void sub(int a, int b){
c = a - b;
System.out.println(c);

}


  public void divide(int a, int b){
c = a / b;
System.out.println(c);

}
}

public class Answer{
 public static void main(String[] args){
  operations obj = new operations();
obj.add(20,10);
obj.sub(20,10);
obj.divide(20,10);
}
}