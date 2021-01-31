class GenDemo {

	public static void main(String[] args) {

		//Create a Gen reference for Integers
		
		Gen<Integer> iOb;
        Gen<String> iOb1;
		//Create a Gen<Integer> object and assign its
		//reference to iob.Notice the use of autoboxing
		//to encapsulate the value 88 within an Integer object.

		iOb=new Gen<Integer>(88);
		iOb1=new Gen<String>("88");
		
		//iOb=iOb1;
		//Show the type of data used by iOb.
		iOb.showType();

		//Get the value in iOb.Notice that 
		//no cast is needed.
		int v=iOb.getob();
		System.out.println("value: "+v);

		System.out.println();

		//Create a Gen object for Strings.
//		Gen<String> strob=new Gen<String>("Generics Test");

		//Show the value of strOb.Again, notice
		//that no cast is needed.
		iOb1.showType();
		String str=iOb1.getob();
		System.out.println("value:"+str);
	}

}
