class VarArgs {

	 void vaTest(int ...v){
		System.out.println("Number of args: "+v.length);
		System.out.println("Contents: ");
		for(int x: v)
			System.out.println(x+"  ");
			System.out.println();
	}

	void vaTest(long i,int ...v){
				System.out.println("Second");
		System.out.println("Number of args: "+v.length);
		System.out.println("Contents: ");
		for(int x: v)
			System.out.println(x+"  ");
			System.out.println();
	}
/*	void vaTest(int i,int[] v){

		System.out.println("Number of args: "+v.length);
		System.out.println("Contents: ");
		for(int x: v)
			System.out.println(x+"  ");
			System.out.println();
	}*/
	 void vaTest(int a,int b,String s,int ...v1){
		System.out.println("Number of args: "+v1.length);
		System.out.println("Contents: ");
		for(int x: v1)
			System.out.println(x+"  ");
			System.out.println();
	}
	public static void main(String[] args) 
	{
		 VarArgs a= new  VarArgs();
		 
	//    a.vaTest();
	// a.vaTest(1);
		a.vaTest(1,2,3);
	  //  a.vaTest(2,3,4,5,6,7,8);
	//	a.vaTest(1,23,"Hello",12,23);

	}
}
