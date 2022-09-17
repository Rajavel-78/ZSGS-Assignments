class Program8{
	static{
		System.out.println("static block displayed in class run");
	}
	static int a=10;
	int b=10;
	public static void main(String[] args) {
		Program8 obj=new Program8();
		System.out.println("functionality of static keywords");
        System.out.println("static variable to not create object "+a++);
        System.out.println("not static variable to not create object "+obj.b++);

        System.out.println("1 static keywords used variable to asces in the class in all methods");
        System.out.println("2 static keywords used to method to not call the object");
	}
}