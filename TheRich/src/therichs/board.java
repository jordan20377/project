package therichs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.geom.*;

public class board extends JPanel {
	
	JButton dice1,dice2,roll;
	JButton[] place=new JButton[36];
	
	public board(){
		
		setLayout(new GridBagLayout());
		
		for(int i=0;i<36;i++){
			place[i]=new JButton(String.valueOf(i));
			addcover(this,place[i],placeLocation[i]);
			place[i].addActionListener(new BoardListener());
		}
		dice1=new JButton("1");
		dice2=new JButton("2");
		roll=new JButton("Roll");
		roll.addActionListener(new RollListener());
		addcover(this,dice1,dice1Location);
		addcover(this,dice2,dice2Location);
		addcover(this,roll,rollLocation);
		
	}
	
	int[] dice1Location={5,5,1,1,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER};
	int[] dice2Location={6,5,1,1,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER};
	int[] rollLocation={5,6,2,1,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER};
	
	int[][] placeLocation={
			
				{0,0,2,2,720/12*2,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{2,0,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{3,0,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{4,0,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{5,0,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{6,0,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{7,0,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{8,0,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{9,0,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
			
				{10,0,2,2,720/12*2,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{10,2,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{10,3,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{10,4,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{10,5,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{10,6,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{10,7,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{10,8,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{10,9,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
			
				{10,10,2,2,720/12*2,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{9,10,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{8,10,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{7,10,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{6,10,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{5,10,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{4,10,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{3,10,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{2,10,1,2,720/12*1,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
			
				{0,10,2,2,720/12*2,720/12*2,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{0,9,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{0,8,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{0,7,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{0,6,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{0,5,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{0,4,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{0,3,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
				{0,2,2,1,720/12*2,720/12*1,GridBagConstraints.BOTH,GridBagConstraints.CENTER}
			
		};
	
	private void addcover(JPanel jf, Component b, int a[]){  //ADD 元件
		GridBagConstraints cons = new GridBagConstraints();
		cons.gridx = a[0];       //X
		cons.gridy = a[1];		 //Y
		cons.gridwidth = a[2];	 //寬的格數
		cons.gridheight = a[3];  //長的格數
		cons.weightx = a[4];	 //大小是幾倍
		cons.weighty = a[5];	 //大小是幾倍
		cons.fill = a[6];		 //填滿格式
		cons.anchor = a[7];		 //元件擺放位置
		jf.add(b, cons);             
	}
/*
	public static void main(String[] args) {
		JFrame j=new JFrame();
		board test=new board();
		
		j.getContentPane().add(test);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
		j.setBounds(200,10,720,720);
	}
*/
}