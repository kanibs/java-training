class HidingDemoParent{
	public int instanceVar = 10;
	public static int staticVar = 20;
	public  int hiddenInstanceVarByStatic = 30;
} 
class HidingDemo extends HidingDemoParent{

	public int instanceVar = 100;
	public static int staticVar = 200;
	public static int hiddenInstanceVarByStatic = 300;
	public static void main(String[] args) {
		

		HidingDemo hd = new HidingDemo();
		System.out.println("Child to child Reference Values");
		System.out.println("Instance Var:"+hd.instanceVar);
		System.out.println("static Variable"+hd.staticVar);
		System.out.println("static Variable"+hd.hiddenInstanceVarByStatic);


		HidingDemoParent p = new HidingDemoParent();
		System.out.println("Parent to child Reference Values");
		System.out.println("Instance Var:"+p.instanceVar);
		System.out.println("static Variable"+p.staticVar);	
		System.out.println("static Variable"+p.hiddenInstanceVarByStatic);


	}	
}

