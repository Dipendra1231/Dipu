	class VarArgs {
		 void vaTest(int ...v){
			System.out.println("Number of args: "+v.length);
			System.out.println("Contents: ");
			for(int x: v)
				System.out.println(x+"  ");
				System.out.println();
		}
	
		public static void main(String[] args) 
		{
			 VarArgs a= new  VarArgs();
			 
		    a.vaTest();
		    a.vaTest(1);
		    a.vaTest(1,2,3);
		}
	   }
