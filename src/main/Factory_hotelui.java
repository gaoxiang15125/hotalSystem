package main;

import hotelui.signupui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hotelui.inforui;
import hotelui.loginui;
/*
 * 初始化酒店的所有界面
 */
public class Factory_hotelui {
	private signupui signup=new signupui();
	private inforui infor=new inforui();
	private loginui login=new loginui();
	
	Factory_hotelui(){
		signup.setVisible(false);
		infor.setVisible(false);
		login.setVisible(false);
	}
	
	public JPanel getsignupui(){
		return this.signup;
	}
	public JPanel getinforui(){
		return this.infor;
	}
	public JPanel getloginui(){
		return this.login;
	}
}
