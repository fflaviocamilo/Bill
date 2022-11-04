package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		return (feeding() > 30.0)? 0.0 : 4.0; 
			
	}

	public double feeding() {

		return beer * 5.0 + barbecue * 7.0 + softDrink * 3;

	}

	public double ticket() {
		return (gender == 'M')? 10.0 : 8.0;  

	}
	
	public double total() {
		return  cover() + feeding() + ticket();
	}

	
}
