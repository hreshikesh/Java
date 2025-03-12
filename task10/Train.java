class Train {
    String name;       
    String type;        
    int speed;         
    int capacity;       

    public static void main(String args[]) {
        Train train1=new Train();
        train1.name="Rajdhani Express";
        train1.type="High-Speed";
        train1.speed=130;
        train1.capacity=1200;
        System.out.println("Name:" + train1.name +" Type: " + train1.type + "Speed: " + train1.speed + " Capacity:"  + train1.capacity);

        Train train2=new Train();
        train2.name="Shatabdi Express";
        train2.type="Passenger";
        train2.speed=150;
        train2.capacity=800;
        System.out.println("Name: " + train2.name + "Type: " + train2.type +" Speed: " + train2.speed + " Capacity: " + train2.capacity);

        Train train3=new Train();
        train3.name="Duronto Express";
        train3.type="Non-Stop";
        train3.speed=130;
        train3.capacity=1000;
        System.out.println("Name: " + train3.name + "Type: " + train3.type + "Speed: " + train3.speed + " Capacity: " + train3.capacity);

        Train train4=new Train();
        train4.name="Garib Rath Express";
        train4.type="Affordable";
        train4.speed=130;
        train4.capacity=1200;
        System.out.println("Name: " + train4.name + "Type: " + train4.type + "Speed: " + train4.speed + " Capacity: " + train4.capacity);

        Train train5=new Train();
        train5.name="Vande Bharat Express";
        train5.type="High-Speed ";
        train5.speed=180;
        train5.capacity=1128;
        System.out.println("Name: " + train5.name + "Type: " + train5.type + "Speed: " + train5.speed + " Capacity: " + train5.capacity);

        Train train6=new Train();
        train6.name="Maharajas' Express";
        train6.type="Luxury";
        train6.speed=90;
        train6.capacity=84;
        System.out.println("Name: " + train6.name + "Type: " + train6.type + "Speed: " + train6.speed + " Capacity: " + train6.capacity);

        Train train7=new Train();
        train7.name="Palace on Wheels";
        train7.type="Luxury";
        train7.speed=100;
        train7.capacity=104;
        System.out.println("Name: " + train7.name + "Type: " + train7.type + "Speed: " + train7.speed + " Capacity: " + train7.capacity);

        Train train8=new Train();
        train8.name="Deccan Odyssey";
        train8.type="Luxury";
        train8.speed=110;
        train8.capacity=88;
        System.out.println("Name: " + train8.name + "Type: " + train8.type + "Speed: " + train8.speed + " Capacity: " + train8.capacity);

        Train train9=new Train();
        train9.name="Himsagar Express";
        train9.type="Long-Distanc";
        train9.speed=90;
        train9.capacity=1200;
        System.out.println("Name: " + train9.name + "Type: " + train9.type + "Speed: " + train9.speed + " Capacity: " + train9.capacity);

        Train train10=new Train();
        train10.name="MasyaGandha";
        train10.type="Scenic";
        train10.speed=60;
        train10.capacity=200;
        System.out.println("Name: " + train10.name +" Type: " + train10.type + "Speed: " + train10.speed + " Capacity: " + train10.capacity);
    }
}
