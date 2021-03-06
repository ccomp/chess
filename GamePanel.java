import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

import javax.swing.JPanel;

public class GamePanel extends JPanel 
	implements Runnable, MouseListener{

	// dimensions 
	public static final int WIDTH = 640;
	public static final int HEIGHT = 640;
	public static final int SCALE = 1;

	// game thread
	private Thread thread;
	private boolean running;
	private int FPS = 60;
	private long targetTime = 1000 / FPS;

	// image
	private BufferedImage image;
	private Graphics2D g;

	// game state manager
	private static Board board;

	public GamePanel() {
		super();
		setPreferredSize(
			new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setFocusable(true);
		requestFocus();
	}

	public void addNotify() {
		super.addNotify();
		if(thread == null) {
			thread = new Thread(this);
			addMouseListener(this);
			thread.start();
		}
	}

	public static Board getBoard(){
		return board;
	} 

	private void init() {
		image = new BufferedImage(
					WIDTH, HEIGHT,
					BufferedImage.TYPE_INT_RGB
				);
		g = (Graphics2D) image.getGraphics();

		running = true;

		board = new Board();

	}

	public void run() {

		init();

		long start;
		long elapsed;
		long wait;

		// game loop
		while(running) {

			start = System.nanoTime();

			update();
			draw();
			drawToScreen();

			elapsed = System.nanoTime() - start;

			wait = targetTime - elapsed / 1000000;
			if(wait < 0) wait = 5;

			try {
				Thread.sleep(wait);
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		}

	}

	private void update() {
		board.update();
	}
	public void draw() {
		g.setColor(Color.BLACK);
		g.fillRect(0,0,WIDTH,HEIGHT);
		board.draw(g);
	}
	private void drawToScreen() {
		Graphics g2 = getGraphics();
		g2.drawImage(image, 0, 0,
				WIDTH * SCALE, HEIGHT * SCALE,
				null);
		g2.dispose();
	}

    public void mousePressed(MouseEvent e) {
	board.mousePressed(e);
    }

    public void mouseReleased(MouseEvent e) {
	board.mouseReleased(e);		
    }

    public void mouseEntered(MouseEvent e) {
	board.mouseEntered(e);		
    }

    public void mouseExited(MouseEvent e) {
	board.mouseExited(e);		
    }

    public void mouseClicked(MouseEvent e) {
	board.mouseClicked(e);		
    }
}
