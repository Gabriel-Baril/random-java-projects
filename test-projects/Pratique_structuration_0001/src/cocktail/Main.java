package cocktail;

public class Main {
	public static <T> void test(T[] arr){
		for(T b : arr){
			System.out.println(b);
		}
	}
	
	public static void main(String[] args){
		Integer[] i = {1,2,3,4,5,6,7,8,9,0};
		test(i);
	}
}