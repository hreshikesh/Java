class NameRunner{
	public static void main(String args[]){
		String name="Gandhi";
		boolean alive=Name.getAlive(name);
		System.out.println("Name "+name+" Alive"+alive);
		
		
		name="Rahul";
		alive=Name.getAlive(name);
		System.out.println("Name "+name+" Alive "+alive);
	}
}