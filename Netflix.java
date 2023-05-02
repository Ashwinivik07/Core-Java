public class Netflix{
	
	public static void main(String[] args){
	
		String[] netflixSeries = {"Wednesday", "MoneyHeist", "Mismatched", "SquidGame", "NeverHaveIEver", "StrangeThings", "Friends", "VampireDiaries", "EmilyInParis", 
			"ManVsBee", "BigBangTheory", "Dracula", "Narcos", "DearWhitePeople", "TheStranger"}; 
		String[] netflixHindiMovies = {"Chennai Express", "Khoobsurat", "Mission Majnu", "Mili", "Dear Zindagi", "Kapoor & Sons", "Gunjan Saxena", "Major", "Dilwale", 
			"Happy New Year", "Dear Zindagi", "Queen", "Barfi", "Zero", "Hit"};
		String netflixKoreanDrama[] = {"Penthouse", "More Than Friends", "True Beauty", "Little Women", "Nevertheless", "Mr Queen", "Start Up", "The Royal Treatment", 
		"Good Morning Call", "Touch Your Heart", "Healer", "Meteor Garden", "CoffePrince", "The Glory", "Kingdom"};
			
	
		System.out.println("-----*series on netflix:"+netflixSeries.length);
			
		for (int i=0; i<netflixSeries.length; i++){
		System.out.println(netflixSeries[i]);	
		}
		
		System.out.println("-----*Movies on netflix:"+netflixHindiMovies.length);
		
		for (int i=0; i<netflixHindiMovies.length; i++){
		System.out.println(netflixHindiMovies[i]);
		}
		
		System.out.println("-----*Dramas on netflix:"+netflixKoreanDrama.length);
					
		for (int i=0; i<netflixKoreanDrama.length; i++){
		System.out.println(netflixKoreanDrama[i]);		
		}
				
	}
	
}	

	
