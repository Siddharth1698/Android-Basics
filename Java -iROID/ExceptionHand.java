class ExceptionHand{

	static int division(int a,int b){
		int i = b/a;
		return i;
	}
	static int finddivision(int x,int y){
		int result = 0;
		try{
		 	division(x,y);
		}
		catch(NumberFormatException ex){
			System.out.println("NumberFormatException has occured");

		}
		return result;
	}


	public static void main(String[] args){
         int x,y;
            x = 0;
            y = 1;
			try{
				int i = finddivision(x,y);
			}
			catch(ArithmeticException ex){
				System.out.println("division by zero not possible");
			}

	}
}