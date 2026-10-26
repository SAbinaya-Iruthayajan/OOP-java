class Mainpen1{
	public static void main(String args[]){
		Pen P;
		P=new Pen();
		
		P.color = "red";
		P.height = 5;
		P.weight = 0.5;
		P.brand = "Ten";
		P.madein = "Japan";
		P.price = 20.00;
		
		P.write();
		
		System.out.println("Color: " + P.color);
		System.out.println("Height: " + P.height);
		System.out.println("Weight: " + P.weight);
		System.out.println("Brand: " + P.brand);
		System.out.println("Madein: " + P.madein);
		System.out.println("Price: " + P.price);
	
	}
}