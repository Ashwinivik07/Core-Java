public class SuperMarket{
	
	public static void main(String[] args){
	
		String[] shampoos = {"Dove", "Tresemme", "Mamaearth", "Loreal", "Pantene", "Himalaya", "Clinicplus", "Head & Sholder", "Vatika", 
			"Indulekha", "Beer", "Nyle", "Ketokem", "Biotique", "Plum"}; 
		String[] chocolates = {"Dairy Milk", "Temptation", "5Star", "Perk", "Munch", "Hersheys", "Snikers", "Gems", "Kitkat", 
			"Dark Fantasy", "Dark Chocolate", "Shots", "Galaxy", "Ferrero Rocker", "Nutties"};
		String[] perfumes = {"Gucci", "Chanel", "Dior", "Tommy Hilfiger", "Calvin Klein", "Hugo", "Azzaro Chrome", "Armani", 
		"Versace", "Renee", "Fogg", "Bella Vita", "Engage", "Dazzle", "BodyCupid"};
		String[] soaps = {"Lifebuoy", "Mysore Sandal", "Pears", "Medimix", "Dove", "Lux", "Himalayan", "Cinthol", "Dettol", 
			"Liril", "Santoor", "MamaEarth", "Park Avenue", "Fiama", "Charcoal"};
		String[] tshirtBrands = {"Van Heusen", "Allen Solly", "Arman Exchange", "Bishop Cotton", "Calvin Klein", "Dnmx", "Fabindia", "Fort Collins", 
		"Jackey", "Lacoste", "Levis", "Lee Cooper", "Louis Philipee", "Mufti", "Nike"};
		String[] groceries = {"Rice", "Sugar", "Salt", "Coffee Powder", "Tea Powder", "Garam Masala", "Sunflower Oil", "Chilly Powder", 
		"Moong Dal", "Maggie", "Spaghetti", "Ketchup", "Broccoli", "SweetCorn", "Wheat"};
			
	
		System.out.println("-----*Shampoo brands available in store:"+shampoos.length);
			
		for (int i=0; i<shampoos.length; i++){
		System.out.println(shampoos[i]);	
		}
		
		System.out.println("-----*Chocolates in supermarket:"+chocolates.length);
		
		for (int i=0; i<chocolates.length; i++){
		System.out.println(chocolates[i]);
		}
		
		System.out.println("-----*perfumes in supermarket:"+perfumes.length);
					
		for (int i=0; i<perfumes.length; i++){
		System.out.println(perfumes[i]);		
		}
		
		System.out.println("-----*Soaps in supermarket:"+soaps.length);
		
		for (int i=0; i<soaps.length; i++){
		System.out.println(soaps[i]);
		}
		
		System.out.println("-----*Tshirt in supermarket:"+tshirtBrands.length);
					
		for (int i=0; i<tshirtBrands.length; i++){
		System.out.println(tshirtBrands[i]);		
		}	
		
		System.out.println("-----*Groceries in supermarket:"+groceries.length);
					
		for (int i=0; i<groceries.length; i++){
		System.out.println(groceries[i]);		
		}	
		
	}
	
}	

	
