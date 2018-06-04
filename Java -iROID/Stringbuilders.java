class  Stringbuilders{
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("hai");
		s.append(" world");
		System.out.println(s);
		s.insert(1,"java");
		System.out.println(s);
		s.replace(1,3,"game");
		System.out.println(s);
		s.delete(1,3);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.capacity());
		s.ensureCapacity(25);
		System.out.println(s.capacity());
	}
}