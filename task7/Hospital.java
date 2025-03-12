
class Hospital{
	static void checkup(String patientname,int age,long mobile,String email,String sicknes){
		System.out.println("mobile"+mobile);
		System.out.println("email"+email);
		System.out.println("sickness"+sicknes);
		Doctor.treatment(patientname,age);
		
	}
}