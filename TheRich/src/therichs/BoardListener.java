package therichs;

import java.awt.event.*;

import javax.swing.JButton;
public class BoardListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton getButton=(JButton)e.getSource();
		new dialog(getButton.getText());
		/*
		switch(getButton.getText()){
			case "0":
				System.out.println("0");
				break;
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
				
		
		}*/
		
	}

}
