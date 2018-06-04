class Keys1{
 int value = 100;
}
class Keys2 extends Keys1{
	int value = 200;
	void showvalue(){
		System.out.println(value);
		System.out.println(super.value);
	}
}

class KeysSuper{
	public static void main(String[] args){
		Keys2 k = new Keys2();
		k.showvalue();
	}
}