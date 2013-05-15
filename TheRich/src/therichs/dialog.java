package therichs;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class dialog extends JDialog{
	public dialog(String m){
		JPanel jp=new JPanel();
		set(m);
		setVisible(true);
		setBounds(450,200,500,300);
		setAlwaysOnTop(true);
		setResizable(false);
	}
	private void set(String m){
		switch(m){
		case "0":
			setTitle(m);
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
			setTitle(m);
			break;
		}
		
	}
}
