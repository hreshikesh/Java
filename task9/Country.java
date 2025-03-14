class Country{
	
	public static void countrys(String country[]){
		for(String ref:country){
			int r=ref.length();
			char last=ref.charAt(r-1);
			if(last=='a'|| last=='A'){
				System.out.println("Country"+ref);
			}
		}
	}

}