package consummable;

import java.awt.Color;

public class Coin extends ConsummableEntity{
	public Coin(double x, double y, int width, int height, Color color) {
		super(x, y, width, height, color);
	}

	public void effect() {
		System.out.println("CooperCoin");
	}

}
