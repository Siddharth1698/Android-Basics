class Keys{
  int id;
  String name;
  static String engine = "unity";
  Keys(int i,String n){
     id = i;
     name = n;
  }
void display()
{
	System.out.println(id+" "+name+" "+engine);
}  
 public static void main(String args[]){  

Keys k1 = new Keys(1,"Origins");
Keys k2 = new Keys(2,"Black Flag");
   
 k1.display();  
 k2.display();  
 }  
}

