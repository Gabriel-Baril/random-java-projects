package fenetre;

import java.io.*;

public class Sauvegarde {
	public static void read(){
		try {
			InputStream is = new FileInputStream("Sauvegarde.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			try {
				Frame.x = Integer.parseInt(br.readLine());
				Frame.y = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
	
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public static void write(){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Sauvegarde.txt"));
			bw.write(Integer.toString(Frame.x));
			bw.flush();
			bw.newLine();
			bw.write(Integer.toString(Frame.y));
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
