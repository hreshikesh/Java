class BarRunner{
	public static void main(String args[]){
		
	String name;
	String location;
	int rating;
	
	    name="Ashirwad";
		location="Banglore";
		rating=4;
		Bar bar1=new Bar(name,location,rating);
		System.out.println("name "+bar1.name+" location"+bar1.location+" rating "+bar1.rating);
		
		name="Sphere";
		location="Manipal";
		rating=5;
		Bar bar2=new Bar(name,location,rating);
		System.out.println("name "+bar2.name+" location"+bar2.location+" rating "+bar2.rating);
		
		name="Manoli";
		location="Kasargod";
		rating=2;
		Bar bar3=new Bar(name,location,rating);
		System.out.println("name "+bar3.name+" location"+bar3.location+" rating "+bar3.rating);
		
		name="Shree";
		location="Mangalore";
		rating=4;
		Bar bar4=new Bar(name,location,rating);
		System.out.println("name "+bar4.name+" location"+bar4.location+" rating "+bar4.rating);
		
		name="Spirit";
		location="Banglore";
		rating=5;
		Bar bar5=new Bar(name,location,rating);
		System.out.println("name "+bar5.name+" location"+bar5.location+" rating "+bar5.rating);
	}
}