	class VarArgs2 {
		static void vaTest(int ...v){
		      for(int x: v)
		         System.out.println(x + "  ");
		         System.out.println();
		}
		static void vaTest(boolean a,boolean ...v){
		      for(boolean x: v)
			System.out.println(x + "  ");
			System.out.println();
		}
		public static void main(String[] args) {	
			vaTest(1,2,3);
			vaTest(true,false);
			vaTest(true,false,false);
	
		}
	}
