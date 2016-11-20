package userui;

import javax.swing.JFrame;

public class testui extends JFrame{
	
	private static int frame_width=800;
	private static int frame_height=600;
	private static int frame_posX=250;
	private static int frame_posY=70;
	
	public static void main(String args[]){
		JFrame frame=new JFrame();
		frame.setBounds(frame_posX,frame_posY,frame_width,frame_height);
		signupui jpanel=new signupui();
				
		frame.add(jpanel);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);;
	}
}
