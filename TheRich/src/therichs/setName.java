package therichs;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class setName extends JDialog{
	
	JPanel north=new JPanel();
	JLabel play1=new JLabel("Playr 1 Name");
	JTextField p1=new JTextField();
	JLabel play2=new JLabel("Playr 2 Name");
	JTextField p2=new JTextField();
	JButton send=new JButton("½T»{");
	
	public setName(final player person1,final player person2){
		getContentPane().add(send,BorderLayout.SOUTH);
		getContentPane().add(north,BorderLayout.NORTH);
		north.setLayout(new GridLayout(2,2));
		north.add(play1);
		north.add(p1);
		north.add(play2);
		north.add(p2);
		
		setTitle("TheRich");
		setVisible(true);
		setBounds(600,300,200,110);
		setAlwaysOnTop(true);
		setResizable(false);
		
		send.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(p1.getText().equals(null)||p2.getText().equals(null)){
						setVisible(true);
						JDialog a=new JDialog();
						a.setTitle(getWarningString());
					}else if(p1.getText().length()>0 && p2.getText().length()>0){
						person1.setName(p1.getText());
						person2.setName(p2.getText());
						setVisible(false);
						TheRich richer=new TheRich(person1,person2);
					}
				}
			}
		);
	}
	
	public static void main(String[] args) {
		player person1=new player();
		player person2=new player();
		setName bor=new setName(person1,person2);
	}
}