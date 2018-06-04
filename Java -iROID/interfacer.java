interface gaming{
	void game();
}
interface making{
	void make();

}
interface printing{
    void print();
}
interface selling{
    void sell();
}
class interfacer implements gaming,making,printing,selling{
	        public void game(){
		System.out.println("gaming");
			}

			public void make(){
		System.out.println("making");
			}

			public void sell(){
		System.out.println("selling");
			}

			public void print(){
		System.out.println("printing");
			}


	public static void main(String[] args) {
		interfacer obj = new interfacer();
		obj.game();
		obj.make();
		obj.sell();
		obj.print();
	}
}