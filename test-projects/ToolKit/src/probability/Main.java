package probability;

public class Main {
	public static void main(String[] args){
//		int loop = 2;
//		int attempt = 10000;
//		double percent = 0;
//		
//		for(int i = 0;i < attempt;i++){
//			int x = 0;
//			for(int j = 0;j < loop;j++){
//				int rand = Prob.GaussianRandomInt(30, 100);
//				if(rand < 0){
//					x++;
//				}
//				//System.out.println("	" + (j + 1) + "/" + loop);
//			}
//			System.out.println((i + 1) + "/" + attempt);
//			percent += (double)100/loop * x;
//		}
//		System.out.println(percent/attempt + "%");
		double nb = Prob.PerlinNoiseDouble(30, 3);
		for(int i = 0;i < 50;i++){
			System.out.println(Prob.PerlinNoiseDouble(nb, 3));
			nb = Prob.PerlinNoiseDouble(nb, 3);
		}
	}
}
