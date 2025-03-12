class Light{
	public static void main(String args[]){
		boolean livingRoom=true,diningRoom=true,studyRoom=true,bedRoom=true,bathRoom=true;
		System.out.println(livingRoom+","+diningRoom+","+studyRoom+","+bedRoom+","+bathRoom);
		livingRoom=false;
		diningRoom=false;studyRoom=false;bedRoom=false;bathRoom=false;
		System.out.println(livingRoom+","+diningRoom+","+studyRoom+","+bedRoom+","+bathRoom);
	}
}