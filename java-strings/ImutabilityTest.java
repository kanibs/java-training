class ImmutabilityTest{


	public static void main(String[] args) {
		
		String s1 = "Java";
		
		System.out.println("s1.length():"+s1.length());
		System.out.println("Before appending:"+s1);

		String s2= s1+" World ";
		String s3 = s1.concat(" World ");

		System.out.println("After Appending:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);

		System.out.println("(s2==s3):"+(s2 == s3));


		String s4 = new String("Java");
		System.out.println("(s1==s4):"+(s1 == s4));
		System.out.println("(s1.equals(s4)):"+(s1.equals(s4)));

		String s5 = "Java" + " World";
		String s6 = "Java" + " World";
		System.out.println("(s5==s6):"+(s5 == s6));
	}
}