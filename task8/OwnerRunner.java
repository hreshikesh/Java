public class OwnerRunner{
	public static void main(String args[]){
		String cname="Google";
		String oname=Owner.comapanyName(cname);
		System.out.println("Company "+cname+" Owner "+oname);
		
		 cname="Nvidia";
		oname=Owner.comapanyName(cname);
		System.out.println("Company "+cname+" Owner "+oname);
	}
}