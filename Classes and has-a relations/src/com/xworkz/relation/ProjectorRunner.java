package com.xworkz.relation;

public class ProjectorRunner {
    public static void main(String[] args) {
        Lens lens=new Lens("M","Concave");


        Warranty warranty=new Warranty("12/12/21","12/12/22");
        Lamp lamp=new Lamp(warranty,"bulb",100);

        PortType type=new PortType("C-type",2202);
        Port port=new Port(type,"Laptop","Thunderbolt");

        Quality quality=new Quality("Good",'A');
        Wire wire=new Wire(quality,"Copper",120);

        Capacitor capacitor=new Capacitor("Ceramic",1500);
        Board board=new Board(capacitor,"Micro Controller",5000);

        Material material=new Material("Plastic","Good");
        Button button=new Button(material,"On/off",2);

        Panel panel=new Panel("LED",10);

        Voltage voltage=new Voltage(220.2,200.5);
        Battery battery=new Battery(voltage,5000,"lithium-ion");
        Remote remote=new Remote(battery,"Sony",10);

        Screw screw=new Screw(10,"Steel");


        Projector projector=new Projector("Epson",15000,lens,lamp,port,wire,board,button,panel,remote,screw);
        projector.play();
    }
}
