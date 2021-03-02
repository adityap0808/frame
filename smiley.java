package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class smiley extends Frame{
	smiley(){
		this.addWindowListner(new WindowAdapter()
		{
			@Override 
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		g.setcolor(Color.black);
		g.drawRect(40,40,200,200);
		g.drawRect(90,70,80,80);
		g.drawRect(110,95,5,5);
		g.drawRect(145,95,5,5);
		g.drawRect(130,95,130,115);
		g.drawRect(113,115,35,200,-180);
		
	}
	public static void main(String[] args){
		smiley d=new smiley();
		d.setSize(400,400);
		d.setTitle("smile");
		d.setVisible(true);
	}
}