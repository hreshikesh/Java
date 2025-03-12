
class RegionalPostOffice{
	public static void deliver(String customername,String address){
		System.out.println("Running RegionalPostOffice");
		PostHeadMaster.master(customername,address);
	}
}