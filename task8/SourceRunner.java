class SourceRunner{
	public static void main(String args[]){
		String src="Shoe";
		int price=Source.SourcePrice(src);
		
		System.out.println("Src"+src+" Price "+price);
		
		src="Musambi";
		price=Source.SourcePrice(src);
		
		System.out.println("Src"+src+" Price "+price);
	}
}