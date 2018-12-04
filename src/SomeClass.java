
public class SomeClass {
	public static int job(int...ls) {
		int res = 0;
		for (int l : ls)
			res += l;
		
		return res;
	}
	
	@TaskOneAnnotation(a=5,b=6)
	public void selfTest(int a, int b) {
		System.out.println("a = " + a + "b = " + b);
	}
}
