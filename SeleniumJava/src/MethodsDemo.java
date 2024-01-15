
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getUser();	
		getData2();
		
	}
	
	public String getData () {
		System.out.println("hello");
		return  "welcome";
	}
	
	public static String getData2 () {
		System.out.println("hello3");
		return  "welcome";
	}

}
