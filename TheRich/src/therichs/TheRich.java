package therichs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.geom.*;

public class TheRich  extends JFrame{
	//--------Center--------
	JPanel board=new JPanel();
	GridBagConstraints c0 = new GridBagConstraints();
	GridBagConstraints c1 = new GridBagConstraints();
	GridBagConstraints c2 = new GridBagConstraints();
	
	//--------play1--------
	JPanel play1=new JPanel();
	
	String play_1_place_list[]={"This test","This test","This test"};
	
	JLabel play_1=new JLabel("Playr 1");
	JLabel play_1_name=new JLabel("Name:");
	JLabel play_1_money=new JLabel("Money:");
	JLabel play_1_place=new JLabel("Place:");
	JComboBox play_1_place_box=new JComboBox(play_1_place_list);
	JButton play_1_bank_trading =new JButton("銀行交易");
	JButton play_1_player_trading =new JButton("玩家交易");
	//--------play2--------
	JPanel play2=new JPanel();
	
	String play_2_place_list[]={"This test","This test","This test"};
	
	JLabel play_2=new JLabel("Playr 2");
	JLabel play_2_name=new JLabel("Name:");
	JLabel play_2_money=new JLabel("Money:");
	JLabel play_2_place=new JLabel("Place:");
	JComboBox play_2_place_box=new JComboBox(play_2_place_list);
	JButton play_2_bank_trading =new JButton("銀行交易");
	JButton play_2_player_trading =new JButton("玩家交易");
	//-----------------------------------------------------------------------------------------------------------------------------
	public TheRich(player person1,player person2){
		setTitle("The Rich");
		setResizable(false);							//使視窗無法改變大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(200,10,1024,720);
		setLayout(new GridBagLayout());
		c0.gridx = 0;
	    c0.gridy = 0;
	    c0.gridwidth = 1;
	    c0.gridheight = 5;
	    c0.weightx = 0;
	    c0.weighty = 0;
	    c0.fill=GridBagConstraints.VERTICAL;
		getContentPane().add(play1,c0);
		c1.gridx = 1;
	    c1.gridy = 0;
	    c1.gridwidth = 5;
	    c1.gridheight = 5;
	    c1.weightx = 720;
	    c1.weighty = 720;
	    c1.fill=GridBagConstraints.BOTH;
		getContentPane().add(board,c1);
		c2.gridx = 6;
	    c2.gridy = 0;
	    c2.gridwidth = 1;
	    c2.gridheight = 5;
	    c2.weightx = 0;
	    c2.weighty = 0;
	    c2.fill=GridBagConstraints.VERTICAL;
		getContentPane().add(play2,c2);
		
		//--------Center--------
		board.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		//--------play1--------
		
		play_1_name.setText("Name:"+person1.getName());
		play_1_money.setText("Money:"+person1.getMoney());
		
		play1.setLayout(new GridLayout(10,1,0,40));
		
		play1.add(play_1);
		play1.add(play_1_name);
		play1.add(play_1_money);
		play1.add(play_1_place);
		play1.add(play_1_place_box);
		play1.add(play_1_bank_trading);
		play1.add(play_1_player_trading);
		//--------play2--------
		play_2_name.setText("Name:"+person2.getName());
		play_2_money.setText("Money:"+person2.getMoney());
		
		play2.setLayout(new GridLayout(10,1,0,40));
		
		play2.add(play_2,BorderLayout.NORTH);
		play2.add(play_2_name);
		play2.add(play_2_money);
		play2.add(play_2_place);
		play2.add(play_2_place_box);
		play2.add(play_2_bank_trading);
		play2.add(play_2_player_trading);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------
}