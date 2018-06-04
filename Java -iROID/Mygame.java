interface creed{
void play();
}
class origins implements creed{
public void play(){
System.out.println("Play Origins");
}
}
class blackflag implements creed{
public void play(){
System.out.println("Play Blackflag");
}
}
public class Mygame{
 public static void main(String[] args){
  creed o = new origins();
  o.play();
}
}