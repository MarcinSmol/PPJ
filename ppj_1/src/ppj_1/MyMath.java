package ppj_1;

public class MyMath {
	public static final double PI = 3.14159265358979;
	
	public static int f(int val){
		if (val==1){
			return 1;
			
		}
		return (val*f(val-1));
	}
	

}