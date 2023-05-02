public class Bar{
	
	static String[] alcohol = {"RoyalStag", "BlackLabel", "Black&White", "100Pipers", "Budwiser", "Bira", "Ballentines", "Tuborg", "Signature", "Teachers", "Amrut", "KingFisher", "OldMOnk", "BlackDog", "BroCode"};
	
	public static void main(String[] bar){
		
		System.out.println("List of brands available in store");
		System.out.println("1:"+alcohol[0] + "\n"+"2:"+alcohol[1] + "\n"+"3:"+alcohol[2] + "\n"+"4:"+alcohol[3] + "\n"+"5:"+alcohol[4] + "\n"+"6:"+alcohol[5] + "\n"+"7:"+alcohol[6] + "\n"+"8:"+alcohol[7] +"\n" +"9:"+alcohol[8] + "\n"+"10:"+alcohol[9] + "\n"+"11:"+alcohol[10] + "\n"+"12:"+alcohol[11] + "\n"+"13:"+alcohol[12] + "\n"+"14:"+alcohol[13] + "\n"+"15:"+alcohol[14]);
		
		//for--looping statements OR Fetching all the data present in the array at once;
		System.out.println("List of brands available here");
		for (int index=0; index<=alcohol.length; index++){ //OR ++index(Post Increment), index++(PreIncrement);
		System.out.println(alcohol[index]); 
		
		}
	
	}
	
}


		
		//for  int index=0; index<Alcohol.length; index++)  ((++Itiration))
		//(index=0) --> Initiolizing the declaration
		//(index<alcohol.length) -> Condition using relation
		//relational operator --> (<=, >=, ==, ;=, <, >) if its true will print the value
		//(index++)  -->increment statements

		
		//relatinal operator = <
	
	// 