//A Simple generic class
//Here T is type parameter that
//will be replaced by real type
//when an object of type Gen is created
class Gen<T>{

T ob; //declare an oject of type T

Gen(T  o){
	ob=o;
}

T getob(){
	return ob;
}

void showType(){
	System.out.println("Type of T is "+ob.getClass());
}

}