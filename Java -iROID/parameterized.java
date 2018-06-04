
class game{
	int x;
	String y;
	game(int a, String b){
		x = a;
		y = b;
		System.out.println("parameterized constructor called");
		System.out.println("your sting is " + y +" and value is " + x);
	}
}







class parameterized{
	public static void main(String[] args) {
		int a = 10;
		String b = "hai";
		game g = new game(a,b);
		
	}

}