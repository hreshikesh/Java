class FestivalRunner{
	public static void main(String mainp[]){
		String name,location,month;
		
		name="Holi";location="Banglore";month="March";
		Festival fest=new Festival(name,location,month);
		System.out.println("Name: "+fest.name+" Location: "+fest.location+" month: "+fest.month);
		
		name="Bakrid";location="Hydrabad";month="March";
		Festival fest2=new Festival(name,location,month);
		System.out.println("Name: "+fest2.name+" Location: "+fest2.location+" month: "+fest2.month);
		
		name="Ram Navami";location="Ayodhya";month="April";
		Festival fest3=new Festival(name,location,month);
		System.out.println("Name: "+fest3.name+" Location: "+fest3.location+" month: "+fest3.month);
		
		name="Navratri";location="Mangalore";month="October";
		Festival fest4=new Festival(name,location,month);
		System.out.println("Name: "+fest4.name+" Location: "+fest4.location+" month: "+fest4.month);
		
		name="Chritmas";location="Goa";month="December";
		Festival fest5=new Festival(name,location,month);
		System.out.println("Name: "+fest5.name+" Location: "+fest5.location+" month: "+fest5.month);
	}
}