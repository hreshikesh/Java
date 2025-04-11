package com.xworkz.tostring.Runner;

import com.xworkz.tostring.Internal.*;

public class EqualsRunner {
    public static void main(String[] args) {

        System.out.println("1-------------");
        Fan fan1 = new Fan("Ceiling", 1500, 100);
        Fan fan2=new Fan("Table",2000,20);
        System.out.println("fan1 fan2 are same:"+fan1.equals(fan2));

        System.out.println("2---------------");
        Light light1 = new Light("Philips", "LED", 800);
        Light light2 = new Light("Syska", "Tube", 800);
        System.out.println("light1 and light2 are same: " + light1.equals(light2));


        System.out.println("3----------------");
        Shirt shirt1 = new Shirt("Arrow", "Blue", 1200);
        Shirt shirt2 = new Shirt("Levis", "Red", 1210);
        System.out.println("shirt1 and shirt2 are same: " + shirt1.equals(shirt2));

        System.out.println("4-----------------");
        Pant pant1 = new Pant("Peter England", "Black", 1800);
        Pant pant2 = new Pant("Allen Solly", "Grey", 1800);
        System.out.println("pant1 and pant2 are same: " + pant1.equals(pant2));

        System.out.println("5-------------------");
        Bag bag1 = new Bag("Wildcraft", "Black", 30);
        Bag bag2 = new Bag("Skybags", "Red", 50);
        System.out.println("bag1 and bag2 are same: " + bag1.equals(bag2));


        System.out.println("6-------------------");
        Book book1 = new Book("Cambridge", 300, 500);
        Book book2 = new Book("Oxford", 250, 500);
        System.out.println("book1 and book2 are same: " + book1.equals(book2));

        System.out.println("7--------------------");
        IceCream ice1 = new IceCream("Amul", "Vanilla", 120);
        IceCream ice2 = new IceCream("Kwality Walls", "Chocolate", 150);
        System.out.println("ice1 and ice2 are same: " + ice1.equals(ice2));

        System.out.println("8-------------------");
        Zoo zoo1 = new Zoo("Bannerghatta", "ForestDept", 200);
        Zoo zoo2 = new Zoo("Mysore Zoo", "CityCorp", 200);
        System.out.println("zoo1 and zoo2 are same: " + zoo1.equals(zoo2));

        System.out.println("9---------------------");

        TV tv1 = new TV("Sony", 55, 50000);
        TV tv2 = new TV("Samsung", 50, 50200);
        System.out.println("tv1 and tv2 are same: " + tv1.equals(tv2));

        System.out.println("10----------------------");
        Cake cake1 = new Cake("JustBake", "Vanilla", 800);
        Cake cake2 = new Cake("CakeZone", "Chocolate", 800);
        System.out.println("cake1 and cake2 are same: " + cake1.equals(cake2));

        System.out.println("11---------------------");
        Samosa samosa1 = new Samosa("Aloo", "Triangle", 20);
        Samosa samosa2 = new Samosa("Paneer", "Triangle", 25);
        System.out.println("Samosa1 and Samosa2 are same: " + samosa1.equals(samosa2));

        System.out.println("12----------------------");
        Language language1 = new Language("Kannada", "South India", 2000);
        Language language2 = new Language("Tamil", "South India", 1000);
        System.out.println("Language1 and Language2 are same: " + language1.equals(language2));

        System.out.println("13---------------------");
        BMTC bmtc1 = new BMTC("Bengaluru", "Majestic to Whitefield", 10);
        BMTC bmtc2 = new BMTC("Bengaluru", "Majestic to Hebbal", 12);
        System.out.println("BMTC1 and BMTC2 are same: " + bmtc1.equals(bmtc2));

        System.out.println("14---------------------");
        WoodenBox woodenBox1 = new WoodenBox("Teak", "Square", 150);
        WoodenBox woodenBox2 = new WoodenBox("Sandal", "Rectangle", 50);
        System.out.println("WoodenBox1 and WoodenBox2 are same: " + woodenBox1.equals(woodenBox2));


        System.out.println("15----------------------");
        Bottle bottle1 = new Bottle("Milton", "Blue", 750);
        Bottle bottle2 = new Bottle("Cello", "Red", 750);
        System.out.println("Bottle1 and Bottle2 are same: " + bottle1.equals(bottle2));


        System.out.println("16---------------------");
        Park park1 = new Park("Cubbon", "Bangalore", 200);
        Park park2 = new Park("Lalbagh", "Bangalore", 200);
        System.out.println("Same area: " + park1.equals(park2));

        System.out.println("17-----------------------");
        Laptop laptop1 = new Laptop("Dell", "i5", 55000);
        Laptop laptop2 = new Laptop("HP", "i7", 60000);
        System.out.println("Same processor: " + laptop1.equals(laptop2));;

        System.out.println("18------------------------");
        Mobile mobile1 = new Mobile("Samsung", "M13", 13000);
        Mobile mobile2 = new Mobile("Samsung", "M23", 23000);
        System.out.println("Same model " + mobile1.equals(mobile2));

        System.out.println("19-------------------------");
        KeyBoard keyBoard1 = new KeyBoard("Logitech", 104, 2000);
        KeyBoard keyBoard2 = new KeyBoard("Zebronics", 108, 1800);
        System.out.println("Same no of keys: " + keyBoard1.equals(keyBoard2));

        System.out.println("20--------------------------");
        Shoe shoe1 = new Shoe("Nike", 9, 5000);
        Shoe shoe2 = new Shoe("Adidas", 9, 6000);
        System.out.println("Same size: " + shoe1.equals(shoe2));

        System.out.println("21-------------------------");
        Console console1 = new Console("PS5", "Sony", 50000);
        Console console2 = new Console("Xbox", "Microsoft", 48000);
        System.out.println("Same manufacturer: " + console1.equals(console2));

        System.out.println("22------------------------");
        Bed bed1 = new Bed("King", "Wood", 15000);
        Bed bed2 = new Bed("Queen", "Metal", 15000);
        System.out.println("Same price: " + bed1.equals(bed2));

        System.out.println("23------------------------");
        Metro metro1 = new Metro("Bangalore", "Purple", 60);
        Metro metro2 = new Metro("Delhi", "Yellow", 60);
        System.out.println("Same ticket price: " + metro1.equals(metro2));

        System.out.println("24---------------------------");
        Money money1 = new Money("Rupee", "India", 1000);
        Money money2 = new Money("Dollar", "USA", 1000);
        System.out.println("Same amount: " + money1.equals(money2));


        System.out.println("25----------------------------");
        Bank bank1 = new Bank("SBI", "MG Road", 50000);
        Bank bank2 = new Bank("ICICI", "Indiranagar", 51000);
        System.out.println("Same balance: " + bank1.equals(bank2));

        System.out.println("26----------------------------");
        ATM atm1 = new ATM("SBI", "BTM Layout", 1001);
        ATM atm2 = new ATM("ICICI", "BTM Layout", 1002);
        System.out.println("Same location: " + atm1.equals(atm2));

        System.out.println("27------------------------------");
        PetrolPump pump1 = new PetrolPump("HSR", "Petrol", 102);
        PetrolPump pump2 = new PetrolPump("HSR", "Diesel", 90);
        System.out.println("Same location: " + pump1.equals(pump2));


        System.out.println("28--------------------------------");
        SunGlasses glass1 = new SunGlasses("RayBan", "Black", 2000);
        SunGlasses glass2 = new SunGlasses("Oakley", "Brown", 1500);
        System.out.println("Same price: " + glass1.equals(glass2));

        System.out.println("29---------------------------------");
        Scooter scooter1 = new Scooter("Honda", "Activa", 85000);
        Scooter scooter2 = new Scooter("TVS", "Jupiter", 85000);
        System.out.println("Same price: " + scooter1.equals(scooter2));

        System.out.println("30---------------------------------");
        Lamp lamp1 = new Lamp("Table", "White", 1000);
        Lamp lamp2 = new Lamp("Floor", "White", 1500);
        System.out.println("Same color: " + lamp1.equals(lamp2));

        System.out.println("31-----------------------------------");
        Stand stand1 = new Stand("Tripod", "Black", 600);
        Stand stand2 = new Stand("Tripod", "Silver", 650);
        System.out.println("Stand equal: " + stand1.equals(stand2));

        System.out.println("32-----------------------------------");
        Remote remote1 = new Remote("Sony", "Black", 1200);
        Remote remote2 = new Remote("Sony", "Black", 1100);
        System.out.println("Remote equal: " + remote1.equals(remote2));

        System.out.println("33-----------------------------------");
        Battery battery1 = new Battery("Lithium", "Duracell", 9);
        Battery battery2 = new Battery("Lithium", "Duracell", 9);
        System.out.println("Battery equal: " + battery1.equals(battery2));

        System.out.println("34-----------------------------------");
        Tshirt tshirt1 = new Tshirt("Puma", "Red", 899);
        Tshirt tshirt2 = new Tshirt("Puma", "Blue", 899);
        System.out.println("Tshirt equal: " + tshirt1.equals(tshirt2));

        System.out.println("35-----------------------------------");
        Chess chess1 = new Chess("Wood", "Black", 1500);
        Chess chess2 = new Chess("Wood", "Black", 1800);
        System.out.println("Chess equal: " + chess1.equals(chess2));

        System.out.println("36-----------------------------------");
        Pen pen1 = new Pen("Parker", "Blue", 50);
        Pen pen2 = new Pen("Parker", "Blue", 60);
        System.out.println(" pen1 and pen2 brand and inkColor: " + pen1.equals(pen2));

        System.out.println("37-----------------------------------");
        Pencil pencil1 = new Pencil("Apsara", "HB", 10);
        Pencil pencil2 = new Pencil("Apsara", "2B", 12);
        System.out.println(" pencil1 and pencil2  brand and price: " + pencil1.equals(pencil2));

        System.out.println("38-----------------------------------");
        Chappal chappal1 = new Chappal("Bata", "9", 300);
        Chappal chappal2 = new Chappal("Bata", "10", 350);
        System.out.println(" chappal1 and chappal2 brand and size: " + chappal1.equals(chappal2));

        System.out.println("39-----------------------------------");
        Driver driver1 = new Driver("Ravi", "KA123456", 5);
        Driver driver2 = new Driver("Kavi", "KA123456", 8);
        System.out.println(" driver1 and driver2  name and licenseNumber: " + driver1.equals(driver2));

        System.out.println("40-----------------------------------");
        Table table1 = new Table("Round", "Wood", 5000);
        Table table2 = new Table("Round", "plastic", 6000);
        System.out.println(" table1 and table2  shape and material: " + table1.equals(table2));

        System.out.println("41--------------------------------------");
        Watch watch1 = new Watch("Fossil", "Analog", 5000);
        Watch watch2 = new Watch("Titan", "Digital", 5000);
        System.out.println(" watch1 and watch2  brand and price: " + watch1.equals(watch2));

        System.out.println("42---------------------------------------");
        Oven oven1 = new Oven("Microwave", 25, 10000);
        Oven oven2 = new Oven("Grill", 25, 12000);
        System.out.println("oven1 and oven2  capacity and price: " + oven1.equals(oven2));

        System.out.println("43-----------------------------------------");
        Speaker speaker1 = new Speaker("JBL", "Bluetooth", 4500);
        Speaker speaker2 = new Speaker("JBL", "Wired", 4500);
        System.out.println("speaker1 and speaker2  brand and price: " + speaker1.equals(speaker2));

        System.out.println("44-------------------------------------------");
        HeadPhone headPhone1 = new HeadPhone("Sony", "Over-ear", 3000);
        HeadPhone headPhone2 = new HeadPhone("Boat", "In-ear", 3000);
        System.out.println("headPhone1 and headPhone2  brand and price: " + headPhone1.equals(headPhone2));

        System.out.println("45-------------------------------------------");
        NoteBook noteBook1 = new NoteBook("Classmate", 200, "A4");
        NoteBook noteBook2 = new NoteBook("Doms", 200, "A3");
        System.out.println("noteBook1 and noteBook2  brand and pages: " + noteBook1.equals(noteBook2));

        System.out.println("46---------------------------------------------");
        Socks socks1 = new Socks("Nike", "Black", 100);
        Socks socks2 = new Socks("Jockey", "White", 100);
        System.out.println("socks1 and socks2  brand and price: " + socks1.equals(socks2));

        System.out.println("47----------------------------------------------");
        Wallet wallet1 = new Wallet("Puma", "Leather", 500);
        Wallet wallet2 = new Wallet("Nike", "Nylon", 1500);
        System.out.println("wallet1 and wallet2  brand and price: " + wallet1.equals(wallet2));

        System.out.println("48-----------------------------------------------");
        ToothPaste paste1 = new ToothPaste("Colgate", "Mint", 50);
        ToothPaste paste2 = new ToothPaste("Dabur", "Herbal", 30);
        System.out.println("paste1 and paste2  brand and price: " + paste1.equals(paste2));

        System.out.println("49------------------------------------------------");
        Soap soap1 = new Soap("Dove", "Gentle", 30);
        Soap soap2 = new Soap("Pears", "Moisture", 40);
        System.out.println("soap1 and soap2  brand and price: " + soap1.equals(soap2));


        System.out.println("50------------------------------------------------");
        Drone drone1 = new Drone("DJI", "4K", 60000);
        Drone drone2 = new Drone("Sony", "HD", 60000);
        System.out.println("drone1 and drone2  brand and price: " + drone1.equals(drone2));

        System.out.println("51------------------------------------------------");
        Belt belt1 = new Belt("Leather", "M", 500);
        Belt belt2 = new Belt("Plastic", "M", 600);
        System.out.println("belt1 and belt2 material and size: " + belt1.equals(belt2));

        System.out.println("52-------------------------------------------------");
        Torch torch1 = new Torch("Eveready", 800, 300);
        Torch torch2 = new Torch("Eveready", 800, 250);
        System.out.println("torch1 and torch2 brand and lumens: " + torch1.equals(torch2));

        System.out.println("53-------------------------------------------------");
        PowerBank powerBank1 = new PowerBank("Mi", 10000, 1500);
        PowerBank powerBank2 = new PowerBank("Mi", 10000, 1300);
        System.out.println("powerBank1 and powerBank2 brand and capacity: " + powerBank1.equals(powerBank2));

        System.out.println("54--------------------------------------------------");
        IronBox ironBox1 = new IronBox("Philips", 1200, 1400);
        IronBox ironBox2 = new IronBox("Philips", 1200, 1450);
        System.out.println("ironBox1 and ironBox2 brand and wattage: " + ironBox1.equals(ironBox2));

        System.out.println("55---------------------------------------------------");
        Clock clock1 = new Clock("Titan", "Analog", 999);
        Clock clock2 = new Clock("Sonata", "Digital", 1099);
        System.out.println("clock1 and clock2 brand and style: " + clock1.equals(clock2));

        System.out.println("56----------------------------------------------------");
        Ticket ticket1 = new Ticket("Concert", "2025-05-01", 500);
        Ticket ticket2 = new Ticket("Cricket", "2025-07-01", 600);
        System.out.println("ticket1 and ticket2 event and date: " + ticket1.equals(ticket2));

        System.out.println("57-----------------------------------------------------");
        Coin coin1 = new Coin("Dollar", "Silver", 1990);
        Coin coin2 = new Coin("1rupee", "Gold", 2000);
        System.out.println("coin1 and coin2 coinName and material: " + coin1.equals(coin2));

        System.out.println("58-----------------------------------------------------");
        Fridge fridge1 = new Fridge("LG", 250, 22000);
        Fridge fridge2 = new Fridge("LG", 250, 24000);
        System.out.println("fridge1 and fridge2 brand and capacity: " + fridge1.equals(fridge2));

        System.out.println("59------------------------------------------------------");
        Mouse mouse1 = new Mouse("Logitech", "Wireless", 1500);
        Mouse mouse2 = new Mouse("ArticFox", "Wired", 1700);
        System.out.println("mouse1 and mouse2 brand and type: " + mouse1.equals(mouse2));


        System.out.println("60--------------------------------------------------------");
        Fridge fridge = new Fridge("LG", 30, 50000);
        System.out.println("Fridge Details " + fridge);
        System.out.println("Hash code " + fridge.hashCode());
        System.out.println("Original Value " + System.identityHashCode(fridge));

        System.out.println("61----------------------------------------------------------");
        Pharmacy pharmacy1 = new Pharmacy("MediPlus", "Jayanagar", 4);
        Pharmacy pharmacy2 = new Pharmacy("MediClinic", "VijayaNagar", 5);
        System.out.println("pharmacy1 and pharmacy2 name and location: " + pharmacy1.equals(pharmacy2));

        System.out.println("62------------------------------------------------------------");
        USB usb = new USB("SanDisk", 64, "USB 3.0");
        System.out.println("USB Details " + usb);
        System.out.println("Hash code " + usb.hashCode());
        System.out.println("Original Value " + System.identityHashCode(usb));

        System.out.println("63------------------------------------------------------------");
        Wire wire = new Wire("Copper", 10, "Red");
        System.out.println("Wire details " + wire);
        System.out.println("Hash code " + wire.hashCode());
        System.out.println("Original Value " + System.identityHashCode(wire));

        System.out.println("64------------------------------------------------------------");
        Shampoo shampoo = new Shampoo("Head & Shoulders", 180, "Mint");
        System.out.println("Shampoo Details " + shampoo);
        System.out.println("Hash code " + shampoo.hashCode());
        System.out.println("Original Value " + System.identityHashCode(shampoo));

        System.out.println("65------------------------------------------------------------");
        Helmet helmet = new Helmet("Vega", "M", "Red");
        System.out.println("Helmat Details " + helmet);
        System.out.println("Hash code " + helmet.hashCode());
        System.out.println("Original Value " + System.identityHashCode(helmet));

        System.out.println("66-------------------------------------------------------------");
        Printer printer = new Printer("HP", true, 20);
        System.out.println("Printer Details " + printer);
        System.out.println("Hash code " + printer.hashCode());
        System.out.println("Original Value " + System.identityHashCode(printer));

        System.out.println("67------------------------------------------------------------");
        Camera camera = new Camera("Canon", 24, true);
        System.out.println("Camera Details " + camera);
        System.out.println("Hash code " + camera.hashCode());
        System.out.println("Original Value " + System.identityHashCode(camera));

        System.out.println("68-------------------------------------------------------------");
        Mat mat = new Mat("Rubber", "Rectangle", 5);
        System.out.println("Mat Details " + mat);
        System.out.println("Hash code " + mat.hashCode());
        System.out.println("Original Value " + System.identityHashCode(mat));

        System.out.println("69--------------------------------------------------------------");
        Dustbin bin = new Dustbin("Plastic", 15, "Green");
        System.out.println("Dustbin details " + bin);
        System.out.println("Hash code " + bin.hashCode());
        System.out.println("Original Value " + System.identityHashCode(bin));

        System.out.println("70---------------------------------------------------------------");
        Mixer mixer = new Mixer("Preethi", 3, 3200);
        System.out.println("Mixer Details " + mixer);
        System.out.println("Hash code " + mixer.hashCode());
        System.out.println("Original Value " + System.identityHashCode(mixer));

        System.out.println("71---------------------------------------------------------------");
        LunchBox lunchBoxox = new LunchBox("Cello", 3, 600);
        System.out.println("LunchBox Details " + lunchBoxox);
        System.out.println("Hash code " + lunchBoxox.hashCode());
        System.out.println("Original Value " + System.identityHashCode(lunchBoxox));

        System.out.println("72-----------------------------------------------------------------");
        Calender calender = new Calender("2025", "Nature", 150);
        System.out.println("Calender Details " + calender);
        System.out.println("Hash code " + calender.hashCode());
        System.out.println("Original Value " + System.identityHashCode(calender));

        System.out.println("73------------------------------------------------------------------");
        Mug mug = new Mug("Ceramic", "Blue", 250);
        System.out.println("Mug Details " + mug);
        System.out.println("Hash code " + mug.hashCode());
        System.out.println("Original Value " + System.identityHashCode(mug));

        System.out.println("74----------------------------------------------------------------");
        Mirror mirror = new Mirror("Oval", 60, 900);
        System.out.println("Mirror Details " + mirror);
        System.out.println("Hash code " + mirror.hashCode());
        System.out.println("Original Value " + System.identityHashCode(mirror));

        System.out.println("75----------------------------------------------------------------");
        Plate plate = new Plate("Steel", 28, 120);
        System.out.println("Plate Details " + plate);
        System.out.println("Hash code " + plate.hashCode());
        System.out.println("Original Value " + System.identityHashCode(plate));

        System.out.println("76-----------------------------------------------------------------");
        Stapler stapler = new Stapler("Kangaroo", 100, 90);
        System.out.println("Stapler Details " + stapler);
        System.out.println("Hash code " + stapler.hashCode());
        System.out.println("Original Value " + System.identityHashCode(stapler));

        System.out.println("77-----------------------------------------------------------------");
        Cap cap = new Cap("Black", "Puma", 500);
        System.out.println("Cap Details " + cap);
        System.out.println("Hash code " + cap.hashCode());
        System.out.println("Original Value " + System.identityHashCode(cap));

        System.out.println("78-------------------------------------------------------------------");
        Umbrella umbrella = new Umbrella("Blue", 60, 350);
        System.out.println("Umbrella Details " + umbrella);
        System.out.println("Hash code " + umbrella.hashCode());
        System.out.println("Original Value " + System.identityHashCode(umbrella));

        System.out.println("78---------------------------------------------------------------------");
        Charger charger = new Charger("Samsung", 25, 1200);
        System.out.println("Charger Details " + charger);
        System.out.println("Hash code " + charger.hashCode());
        System.out.println("Original Value " + System.identityHashCode(charger));

        System.out.println("79--------------------------------------------------------------------");
        Marker marker = new Marker("Blue", "Faber-Castell", 30);
        System.out.println("Marker details" + marker);
        System.out.println("Hash code " + marker.hashCode());
        System.out.println("Original Value " + System.identityHashCode(marker));

        System.out.println("80----------------------------------------------------------------------");
        Sofa sofa = new Sofa("Leather", 3, 9500);
        System.out.println("Sofa Details " + sofa);
        System.out.println("Hash code " + sofa.hashCode());
        System.out.println("Original Value " + System.identityHashCode(sofa));

        System.out.println("81-----------------------------------------------------------------------");
        Tripod tripod = new Tripod("Aluminum", 150, 1200);
        System.out.println("Tripod Details " + tripod);
        System.out.println("Hash code " + tripod.hashCode());
        System.out.println("Original Value " + System.identityHashCode(tripod));

        System.out.println("82----------------------------------------------------------------------");
        Guitar guitar = new Guitar("Rock", "Yamaha", 4500);
        System.out.println("Guitar Details " + guitar);
        System.out.println("Hash code " + guitar.hashCode());
        System.out.println("Original Value " + System.identityHashCode(guitar));

        System.out.println("83---------------------------------------------------------------------");
        ToyCar toyCar = new ToyCar("Blue", "HotWheels", 150);
        System.out.println("ToyCar" + toyCar);
        System.out.println("Hash code " + toyCar.hashCode());
        System.out.println("Original Value " + System.identityHashCode(toyCar));

        System.out.println("84----------------------------------------------------------------------");
        Ruler ruler = new Ruler(30, "Plastic", 20);
        System.out.println("Ruler Details " + ruler);
        System.out.println("Hash code " + ruler.hashCode());
        System.out.println("Original Value " + System.identityHashCode(ruler));

        System.out.println("85-----------------------------------------------------------------------");
        Candle candle = new Candle("Lavender", 150, 299);
        System.out.println("Candle Details " + candle);
        System.out.println("Hash code " + candle.hashCode());
        System.out.println("Original Value " + System.identityHashCode(candle));

        System.out.println("86------------------------------------------------------------------------");
        Door door = new Door("Wood", 210, 5500);
        System.out.println("Door Details " + door);
        System.out.println("Hash code " + door.hashCode());
        System.out.println("Original Value " + System.identityHashCode(door));

        System.out.println("87------------------------------------------------------------------------");
        DiningTable diningTable = new DiningTable("Round", 4, 8900);
        System.out.println("Dining Table details " + diningTable);
        System.out.println("Hash code " + diningTable.hashCode());
        System.out.println("Original Value " + System.identityHashCode(diningTable));

        System.out.println("88--------------------------------------------------------------------");
        Facewash facewash = new Facewash("Himalaya", 100, 150);
        System.out.println("Face Wash Details " + facewash);
        System.out.println("Hash code " + facewash.hashCode());
        System.out.println("Original Value " + System.identityHashCode(facewash));

        System.out.println("89---------------------------------------------------------------------");
        Ipl ipl = new Ipl("Chennai Super Kings", "MS Dhoni", 5);
        System.out.println("IPL details " + ipl);
        System.out.println("Hash code " + ipl.hashCode());
        System.out.println("Original Value " + System.identityHashCode(ipl));

        System.out.println("90----------------------------------------------------------------------");
        CreditCard creditCard = new CreditCard("HDFC", 12345678, 150000);
        System.out.println("Card details" + creditCard);
        System.out.println("Hash code " + creditCard.hashCode());
        System.out.println("Original Value " + System.identityHashCode(creditCard));

        System.out.println("91------------------------------------------------------------------------");
        Rice rice = new Rice("Basmati", 5, 450);
        System.out.println("Rice details " + rice);
        System.out.println("Hash code " + rice.hashCode());
        System.out.println("Original Value " + System.identityHashCode(rice));

        System.out.println("92---------------------------------------------------------------------");
        Chapati chapati = new Chapati("Wheat", 10, 50);
        System.out.println(chapati);
        System.out.println("Hash code " + chapati.hashCode());
        System.out.println("Original Value " + System.identityHashCode(chapati));

        System.out.println("93-----------------------------------------------------------------------");
        Milk milk = new Milk("Nandini", 500, 25);
        System.out.println("Milk details " + milk);
        System.out.println("Hash code " + milk.hashCode());
        System.out.println("Original Value " + System.identityHashCode(milk));

        System.out.println("94-----------------------------------------------------------------------");
        Apple apple = new Apple("Fuji", 200, 35);
        System.out.println("Apple details " + apple);
        System.out.println("Hash code " + apple.hashCode());
        System.out.println("Original Value " + System.identityHashCode(apple));

        System.out.println("95---------------------------------------------------------------------");
        Browser browser = new Browser("Chrome", "123.4", 2024);
        System.out.println("Browser Details " + browser);
        System.out.println("Hash code " + browser.hashCode());
        System.out.println("Original Value " + System.identityHashCode(browser));

        System.out.println("96-------------------------------------------------------------------");
        Port port = new Port("USB", 3, 400);
        System.out.println("Port details " + port);
        System.out.println("Hash code " + port.hashCode());
        System.out.println("Original Value " + System.identityHashCode(port));

        System.out.println("97---------------------------------------------------------------------");
        Adapter adapter = new Adapter("Lenovo", 65, 1200);
        System.out.println("Adapter details " + adapter);


        System.out.println("98------------------------------------------------------------------");
        Jet jet = new Jet("F-22 Raptor", 2410, 1);
        System.out.println("Jet Details " + jet);
        System.out.println("Hash code " + jet.hashCode());
        System.out.println("Original Value " + System.identityHashCode(jet));

        System.out.println("99---------------------------------------------------------------------");
        Star star = new Star("Sirius", 9940, 8);
        System.out.println("Star details " + star);
        System.out.println("Hash code " + star.hashCode());
        System.out.println("Original Value " + System.identityHashCode(star));

        System.out.println("100---------------------------------------------------------------------");
        Ocean ocean = new Ocean("Pacific", 10911, 168723000);
        System.out.println("Ocean Details " + ocean);
        System.out.println("Hash Code " + ocean.hashCode());
        System.out.println("Original Value " + System.identityHashCode(ocean));


    }
}


