package net.ReynBryant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//设置窗口效果
class Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private int WIDTH = 300,HEIGHT = 300;
	private int Pointer_X = 0;
	private int Pointer_Y = 0;
	private int image_x = 0;
	private int image_y = 0;
	private JPanel mainPanel;
	private String backgroundPath = null;
	private boolean opaque = false;
	public JLabel label;
	
	Frame(){
		frame = new JFrame();
		mainPanel = new JPanel();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		mainPanel = new JPanel();
		
		frame.add(mainPanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(false);
	}
	
	Frame(String s,int WIDTH,int HEIGHT){
		frame = new JFrame(s);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		mainPanel = new JPanel();
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
	
		frame.add(mainPanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	Frame(int WIDTH,int HEIGHT){
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		mainPanel = new JPanel();
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
	
		frame.add(mainPanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	Frame(int WIDTH,int HEIGHT,LayoutManager layoutMgr){
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		mainPanel = new JPanel();
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
	
		frame.add(mainPanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	Frame(int WIDTH,int HEIGHT,int Pointer_X,int Pointer_Y){
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		mainPanel = new JPanel();
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
	
		frame.add(mainPanel);
		frame.setLocation(Pointer_X, Pointer_Y);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	Frame(int WIDTH,int HEIGHT,int Pointer_X,int Pointer_Y,LayoutManager layoutMgr){
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		mainPanel = new JPanel();
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
	
		frame.add(mainPanel);
		frame.setLocation(Pointer_X, Pointer_Y);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	Frame(String s,int WIDTH,int HEIGHT,int Pointer_X,int Pointer_Y){
		frame = new JFrame(s);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		mainPanel = new JPanel();
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
	
		frame.add(mainPanel);
		frame.setLocation(Pointer_X, Pointer_Y);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	Frame(int WIDTH,int HEIGHT,int Pointer_X,int Pointer_Y,String backgroundPath,boolean opaque){
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		// set the background image
		Icon bk = new ImageIcon(backgroundPath);
		JLabel label = new JLabel();
		label.setIcon(bk);
		mainPanel = new JPanel();
		mainPanel.add(label);
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
	
		frame.add(mainPanel);
		frame.setLocation(Pointer_X, Pointer_Y);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	Frame(int WIDTH,int HEIGHT,int Pointer_X,int Pointer_Y,String backgroundPath,boolean opaque,LayoutManager layoutMgr){
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		// set the background image
		Icon bk = new ImageIcon(backgroundPath);
		JLabel label = new JLabel();
		label.setIcon(bk);
		mainPanel = new JPanel();
		mainPanel.add(label);
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
	
		frame.add(mainPanel);
		frame.setLocation(Pointer_X, Pointer_Y);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}

	Frame(String s,int WIDTH,int HEIGHT,int Pointer_X,int Pointer_Y,String backgroundPath,boolean opaque){
		frame = new JFrame(s);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		// set the background image
		Icon bk = new ImageIcon(backgroundPath);
		JLabel label = new JLabel();
		label.setIcon(bk);
		mainPanel = new JPanel();
		mainPanel.add(label);
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
	
		frame.add(mainPanel);
		frame.setLocation(Pointer_X, Pointer_Y);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	Frame(String s,int WIDTH,int HEIGHT,int Pointer_X,int Pointer_Y,String backgroundPath,boolean opaque,LayoutManager layoutMgr){
		frame = new JFrame(s);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		// set the background image
		Icon bk = new ImageIcon(backgroundPath);
		label = new JLabel();
		label.setIcon(bk);
		mainPanel = new JPanel();
		mainPanel.add(label);
		
		// set the Opaque
		label.setOpaque(opaque);
		
		frame.add(mainPanel);
		frame.setLocation(Pointer_X, Pointer_Y);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(Pointer_X, Pointer_Y);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	Frame(String s,int WIDTH,int HEIGHT,int Pointer_X,int Pointer_Y,LayoutManager layoutMgr){
		frame = new JFrame(s);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // close the window
		
		mainPanel = new JPanel();
		
		// set the Opaque
		mainPanel.setOpaque(opaque);
		mainPanel.setLayout(layoutMgr);
		frame.add(mainPanel);
		frame.setLocation(Pointer_X, Pointer_Y);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	/* memeber methods */
	// set the opaque --> setter and getter methods
	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
	public boolean getOpaque() {
		return opaque;
	}
	// set the background image --> setter and getter methods
	public void setBackGroundPath(String backgroundPath) {
		if(!backgroundPath.isEmpty()) {
			this.backgroundPath = backgroundPath;
		}
	}
	public String getBackGroundPath() {
		return backgroundPath;
	}
	// Width-->setter and getter methods
	public void setWidth(int WIDTH) {
		if(WIDTH >= 0) {
			this.WIDTH = WIDTH;
		}
		
	}
	public int getWidth() {
		return WIDTH;
	}
	// Height-->setter and getter methods
	public void setHeight(int HEIGHT) {
		if(HEIGHT >= 0) {
			this.HEIGHT = HEIGHT;
		}
	}
	public int getHeight() {
		return HEIGHT;
	}
	// Pointer_X-->setter and getter methods
	public void setPointer_X(int Pointer_X) {
		if(Pointer_X >= 0) {
			this.Pointer_X = Pointer_X;
		}
	}
	public int getPointer_X() {
		return Pointer_X;
	}
	// Pointer_Y-->setter and getter methods
	public void setPointer_Y(int Pointer_Y) {
		if(Pointer_Y >= 0) {
			this.Pointer_Y = Pointer_Y;
		}
	}
	public int getPointer_Y() {
		return Pointer_Y;
	}
	// image_x and image_y --> setter and getter methods
	public void setImage_X(int image_x) {
		if(image_x >= 0) {
			this.image_x = image_x;
		}
		
	}
	public int getImage_X() {
		return image_x;
	}
	public void setImage_Y(int image_y) {
		if(image_y >= 0) {
			this.image_y = image_y;
		}
	}
	public int getImage_Y() {
		return image_y;
	}
	// set the paint methods
	public void paint(Graphics g) {
		Image image = new ImageIcon(backgroundPath).getImage();
		g.drawImage(image,image_x,image_y,this);
	}
}


public class FrameGUI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试窗体
	}
}

