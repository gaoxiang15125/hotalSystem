package main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import rmi.RMIClient;

public class ClientRunner {
//	static JFrame frame=new JFrame();
//
	
	private RMIClient rmic;
	
	private ClientRunner(){
		linkToServer();
		initui();
	}
	
	private void linkToServer(){
		try{
			rmic = RMIClient.getInstance();
			rmic.setRemote(Naming.lookup("rmi://localhost:1099/dataRemote"));
			System.out.println("连接服务器");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	
	private void initui(){
		final int frame_width=800;
		final int frame_height=600;
		final int frame_posX=250;
		final int frame_posY=70;
		
		Factory_hotelui fhotel = new Factory_hotelui();
		JFrame frame = new JFrame();
		JPanel jpanel = new JPanel();
		jpanel = fhotel.getsignupui();
		jpanel.setVisible(true);
		
		frame.add(jpanel);
		frame.setVisible(true);
		frame.setSize(frame_width, frame_height);
		frame.setLocation(frame_posX,frame_posY);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
	
	public static void main(String args[]){
		ClientRunner ui = new ClientRunner();
		try{
			RMIClient.getInstance().gethotelserve().sayhello();
		}catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
