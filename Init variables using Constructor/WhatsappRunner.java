class WhatsappRunner{
	public static void main(String args[]){
		String receiver;
		long phone;
		boolean online;
		
		receiver="Rishi";
		phone=7902837149l;
		online=true;
		Whatsapp whatsapp1=new Whatsapp(receiver,phone,online);
		System.out.println("receiver "+whatsapp1.receiver+" phone "+whatsapp1.phone+" online "+whatsapp1.online);
		
		receiver="Roshan";
		phone=9846792964l;
		online=false;
		Whatsapp whatsapp2=new Whatsapp(receiver,phone,online);
		System.out.println("receiver "+whatsapp2.receiver+" phone "+whatsapp2.phone+" online "+whatsapp2.online);
		
		receiver="Vaibhav";
		phone=9846792965l;
		online=false;
		Whatsapp whatsapp3=new Whatsapp(receiver,phone,online);
		System.out.println("receiver "+whatsapp3.receiver+" phone "+whatsapp3.phone+" online "+whatsapp3.online);
		
		receiver="Abhi";
		phone=9895394987l;
		online=true;
		Whatsapp whatsapp4=new Whatsapp(receiver,phone,online);
		System.out.println("receiver "+whatsapp4.receiver+" phone "+whatsapp4.phone+" online "+whatsapp4.online);
		
		receiver="Ketan";
		phone=987564123l;
		online=false;
		Whatsapp whatsapp5=new Whatsapp(receiver,phone,online);
		System.out.println("receiver "+whatsapp5.receiver+" phone "+whatsapp5.phone+" online "+whatsapp5.online);
	}
}