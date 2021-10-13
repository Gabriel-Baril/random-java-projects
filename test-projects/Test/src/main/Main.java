package main;

public class Main {

	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		long n = 0;
		while(true){
			n++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(System.currentTimeMillis() - t >= 2000){
				System.out.println(n);
				System.exit(0);
			}
		}
	}

}
