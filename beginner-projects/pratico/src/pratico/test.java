package pratico;

public class test {
	
	public static double arrPs(double a){
		
		int b = (int) a;
		double c = a - b;
		double d = 1 - c;
		
		if(b == a){
			return a;
		}
		
		return a + d;
	}
	
	public static double arrNg(double a){
		
		return (int) a;
	}
	
	public static double arrNm(double a){
		
		int b = (int) a;
		double c = a - b;
		double d = 1 - c;
		
		if(c >= 0.5){
			return a + d;
		} else {
			return (int) a;
		}
		
	}
	
	public static int calculNbText(String text){
		
		int textNb = text.length();
		
		return textNb;
	}
	
	

	public static void main(String[] args) {
	
		System.out.println(calculNbText("tes"));
		
        } 
		
	}


