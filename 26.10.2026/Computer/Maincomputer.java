class Maincomputer{
	public static void main(String [] args){
		
		Computer C;
		C = new Computer();
		
		C.color = "black";
		C.brand = "asus";
		C.procosser = "i3";
		C.ram = 8;
		C.price = 235000.00;
		
		System.out.println("Color: " + C.color);
		System.out.println("Brand: " + C.brand);
		System.out.println("Procosser: " + C.procosser);
		System.out.println("Ram: " + C.ram);
		System.out.println("Price: " + C.price);
	
		
		C.write();
		C.code();
		C.game();
		
		
	
		

	}
}	