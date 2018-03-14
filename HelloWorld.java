public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World, Java");
		HelloTwo.wow();
	}
}

class HelloTwo{
	public static void wow(){
		int a = 1;
		System.out.println(a);
	}
}