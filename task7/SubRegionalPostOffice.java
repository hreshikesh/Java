
class SubRegionalPostOffice{
	public static void subRegion(String customername,String address){
		System.out.println("Running SubRegionalPostOffice");
		RegionalPostOffice.deliver(customername,address);
	}
}