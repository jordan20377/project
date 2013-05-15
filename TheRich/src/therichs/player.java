package therichs;

public class player{
	String name;
	int money=500000;
	int[] place=new int[36];
	
	void setName(String str){
		name=str;
	}
	String getName(){
		return name;
	}
	
	void setMoney(boolean b,int i){
		if(b==true){money=money+i;}
		if(b==false){money=money-i;}
	}
	String getMoney(){
		return String.valueOf(money);
	}
	void go(int roll){		//ROLL後 移動步數
		
	}
}
