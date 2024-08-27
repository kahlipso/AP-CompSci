import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Main extends Canvas {
    public static int[][] pos;
    public static Canvas canvas = new Main();

    public static void main(String[] args) {
	pos = new int[4][4];
	startup();

	JFrame frame = new JFrame("My Drawing");

	canvas.setSize(400, 400);
	frame.add(canvas);
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
	frame.addKeyListener(new KeyAdapter() {
    	public void keyPressed(KeyEvent e) {
        	int keyCode = e.getKeyCode();
    		if (keyCode == KeyEvent.VK_P) {
        		showGrid();
		}
		if (keyCode == KeyEvent.VK_UP) {
			// System.out.println("Up Arrrow-Key is pressed!");
			moveUp();
		} else if (keyCode == KeyEvent.VK_DOWN) {
			// System.out.println("Down Arrrow-Key is pressed!");
			moveDown();
		} else if (keyCode == KeyEvent.VK_LEFT) {
			// System.out.println("Left Arrrow-Key is pressed!");
			moveLeft();
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			// System.out.println("Right Arrrow-Key is pressed!");
			moveRight();
		} else if (keyCode == KeyEvent.VK_E) {
			pos[0][0] = 2048;
			canvas.repaint();
		}
			if (checkLose() == "not lose") {
    			spawnTiles();
			} else if (checkLose() == "lose") {
				var lose = JOptionPane.showConfirmDialog(null, "you lose. would you like to play again");
				if (lose == 0) {
					startup();
				}
				if (lose == 1) {
					System.exit(1);
				}
			} else if (checkLose() == "win") {
				var win = JOptionPane.showConfirmDialog(null,
				"you have reached 2048. would you like to play again");
				if (win == 0) {
        				startup();
				}
				if (win == 1) {
					System.exit(1);
				}
			}

			}
		});

	}

	public static void startup() {
		System.out.println("startup");
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				pos[row][col] = 0;
			}
		}
		System.out.println(Arrays.deepToString(pos));
		Random rand = new Random();

		int randomX = rand.nextInt(4);
		int randomY = rand.nextInt(4);
		pos[randomX][randomY] = 2;
		int randX = rand.nextInt(4);
		int randY = rand.nextInt(4);

		while (pos[randX][randY] != 0) {
			randX = rand.nextInt(4);
			randY = rand.nextInt(4);
		}
		pos[randX][randY] = 2;
		canvas.repaint();
	}

	public static void spawnTiles() {
		Random rand = new Random();

		int randomX = rand.nextInt(4);
		int randomY = rand.nextInt(4);

		int r = rand.nextInt(10);

		while (pos[randomX][randomY] != 0) {
			randomX = rand.nextInt(4);
			randomY = rand.nextInt(4);
		}

		if (r > 0) {
			pos[randomX][randomY] = 2;
		} else {
			pos[randomX][randomY] = 4;
		}

	}

	public static void moveUp() {
		for (int row = 0; row < 4; row++) {

			for (int col = 0; col < 4; col++) {
				// System.out.println("rows: " + row);
				// System.out.println("cols: " + col);
				// System.out.println(pos[row][col]);
				int tempr = row - 1;

				while (tempr > 0 && pos[tempr][col] == 0) {
					tempr -= 1;
				}
				System.out.println(tempr);
				if (tempr >= 0 && pos[tempr][col] == pos[row][col]) {
					pos[tempr][col] *= 2;
					pos[row][col] = 0;
				} else if (tempr >= 0 && tempr < row && pos[tempr][col] == 0) {
					// System.out.println("move up");
					pos[tempr][col] = pos[row][col];
					pos[row][col] = 0;
				} else if (tempr >= 0 && tempr < row && pos[tempr + 1][col] == 0) {
					// System.out.println("move down alt");
					pos[tempr + 1][col] = pos[row][col];
					pos[row][col] = 0;
				}
				canvas.repaint();
			}
		}
	}

	public static void moveDown() {
		for (int row = 3; row >= 0; row--) {

			for (int col = 3; col >= 0; col--) {
				if (pos[row][col] != 0) {
					// System.out.println("rows: " + row);
					// System.out.println("cols: " + col);
					// System.out.println(pos[row][col]);
				}

				int tempr = row + 1;

				while (tempr < 3 && pos[tempr][col] == 0) {
					tempr += 1;
				}
				System.out.println(tempr);
				if (tempr <= 3 && pos[tempr][col] == pos[row][col]) {
					pos[tempr][col] *= 2;
					pos[row][col] = 0;
				} else if (tempr <= 3 && tempr > row && pos[tempr][col] == 0) {
					// System.out.println("move down");
					pos[tempr][col] = pos[row][col];
					pos[row][col] = 0;
				} else if (tempr <= 3 && tempr > row && pos[tempr - 1][col] == 0) {
					// System.out.println("move down alt");
					pos[tempr - 1][col] = pos[row][col];
					pos[row][col] = 0;
				}
				canvas.repaint();
			}
		}
	}

	public static void moveLeft() {
		for (int col = 0; col < 4; col++) {

			for (int row = 0; row < 4; row++) {
				// System.out.println("rows: " + row);
				// System.out.println("cols: " + col);
				// System.out.println(pos[row][col]);
				int tempc = col - 1;

				while (tempc > 0 && pos[row][tempc] == 0) {
					tempc -= 1;
				}
				System.out.println(tempc);
				if (tempc >= 0 && pos[row][tempc] == pos[row][col]) {
					pos[row][tempc] *= 2;
					pos[row][col] = 0;
				} else if (tempc >= 0 && tempc < col && pos[row][tempc] == 0) {
					// System.out.println("move left");
					pos[row][tempc] = pos[row][col];
					pos[row][col] = 0;
				} else if (tempc >= 0 && tempc < col && pos[row][tempc + 1] == 0) {
					// System.out.println("move left alt");
					pos[row][tempc + 1] = pos[row][col];
					pos[row][col] = 0;
				}
				canvas.repaint();
			}
		}
	}

	public static void moveRight() {

		for (int col = 3; col >= 0; col--) {
			for (int row = 0; row < 4; row++) {
				// System.out.println("rows: " + row);
				/// System.out.println("cols: " + col);
				// System.out.println(pos[row][col]);
				int tempc = col + 1;

				while (tempc < 3 && pos[row][tempc] == 0) {
					tempc += 1;
				}
				System.out.println(tempc);
				if (tempc <= 3 && pos[row][tempc] == pos[row][col]) {
					pos[row][tempc] *= 2;
					pos[row][col] = 0;
				} else if (tempc <= 3 && tempc > col && pos[row][tempc] == 0) {
					System.out.println("move right");
					pos[row][tempc] = pos[row][col];
					pos[row][col] = 0;
				} else if (tempc <= 3 && tempc > col && pos[row][tempc - 1] == 0) {
					System.out.println("move right alt");
					pos[row][tempc - 1] = pos[row][col];
					pos[row][col] = 0;
				}
				canvas.repaint();
			}
		}
	}

	public static String checkLose() {

		String ans = "lose";
		for (int col = 0; col < 4; col++) {
			for (int row = 0; row < 4; row++) {
				if (pos[col][row] == 0) {
					ans = "not lose";

				} else if (pos[col][row] == 2048) {
					ans = "win";
				}

			}
		}
		System.out.println(ans);
		return ans;
	}

	public static void showGrid() {
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.print(pos[row][col] + ", ");
			}
			System.out.println(" ");
		}
	}

	public void paint(Graphics g) {
		System.out.println("paint");
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				if (pos[row][col] == 2) {
					g.setColor(Color.red);
				} else if (pos[row][col] == 4) {
					g.setColor(Color.orange);
				} else if (pos[row][col] == 8) {
					g.setColor(Color.yellow);
				} else if (pos[row][col] == 16) {
					g.setColor(Color.green);
				} else if (pos[row][col] == 32) {
					g.setColor(Color.cyan);
				} else if (pos[row][col] == 64) {
					g.setColor(Color.blue);
				} else if (pos[row][col] == 128) {
					g.setColor(Color.magenta);
				} else if (pos[row][col] == 256) {
					g.setColor(Color.pink);
				} else if (pos[row][col] == 256) {
					g.setColor(Color.lightGray);
				} else if (pos[row][col] == 512) {
					g.setColor(Color.darkGray);
				} else if (pos[row][col] == 1024) {
					g.setColor(Color.black);
				} else if (pos[row][col] == 2048) {
					g.setColor(Color.red);
				} else {
					g.setColor(Color.white);
				}
				g.fillRect(col * 100, row * 100, 100, 100);
				g.setColor(Color.white);
				g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
				g.drawString(Integer.toString(pos[row][col]), col * 100 + 45, row * 100 + 55);
			}
		}

		/*
		 * g.setColor(Color.green);
		 * g.fillRect(100, 0, 100, 100);
		 * g.setColor(Color.black);
		 * g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		 * g.drawString("2", 45, 55);
		 */
	}

}
