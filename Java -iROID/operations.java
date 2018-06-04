interface adding{
 void add();
}

interface subtracting extends adding{
 void sub();
}

interface dividing extends subtracting{
 void divide();
}

class operations implements dividing{


  public void add(int a, int b){
int c;
c = a + b;
System.out.println(c);

}


  public void sub(int a, int b){
int c;
c = a - b;
System.out.println(c);

}


  public void divide(int a, int b){
int c;
c = a / b;
System.out.println(c);

}


 public static void main(String[] args){
  operations obj = new operations();
obj.add(20,10);
obj.sub(20,10);
obj.divide(20,10);
}
}