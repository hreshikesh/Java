package com.xworkz.OOPS.TypesOfInheritence.Runner;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External.*;
import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.*;
import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External.*;
import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.*;
import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.BrandedBag;
import com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External.*;
import com.xworkz.OOPS.TypesOfInheritence.MultiLevel.Internal.*;
import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.External.*;
import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.Internal.*;


public class InheritanceRunner {


    public static void main(String[] args) {
        System.out.println("------------------SingleLevel Inheritence-------------------");
        System.out.println("1.");

        Shape shape = new Rectangle();
        shape.fit();
        Shape shape1 = new Shape();
        shape1.fit();

        System.out.println("2.");
        Bus bus = new Bus();
        bus.drop();
        Bus bus1 = new Airavat();
        bus1.drop();

        System.out.println("3.");
        Brush brush = new Brush();
        brush.clean();
        Brush brush1 = new ToothBrush();
        brush1.clean();

        System.out.println("4.");
        Shampoo shampoo = new Shampoo();
        shampoo.apply();
        Shampoo shampoo1 = new Medimix();
        shampoo1.apply();

        System.out.println("5.");
        Plate plate = new Plate();
        plate.wash();
        Plate plate1 = new SteelPlate();
        plate1.wash();

        System.out.println("6.");
        Laptop laptop = new Laptop();
        laptop.on();
        Laptop laptop1 = new Asus();
        laptop1.on();

        System.out.println("7.");
        Bag bag = new Bag();
        bag.zip();
        Bag bag1 = new SkyBag();
        bag1.zip();

        System.out.println("8.");
        Balm balm = new Balm();
        balm.cure();
        Balm balm1 = new TigerBalm();
        balm1.cure();
        ;

        System.out.println("9.");
        Adapter adapter = new Adapter();
        adapter.connect();
        Adapter adapter1 = new WifiAdapter();
        adapter1.connect();

        System.out.println("10.");
        Charger charger = new Charger();
        charger.charge();
        Charger charger1 = new MobileCharger();
        charger1.charge();

        System.out.println("11.");
        Book book = new Book();
        book.read();
        Book book1 = new NoteBook();
        book1.read();

        System.out.println("==================================================================");

        System.out.println("----------------------Multilevel Inheretence----------------------------------");
        System.out.println("1.");
        Food food = new Food();
        food.prepare();
        Chapati chapati = new Chapati();
        chapati.prepare();
        chapati.eat();
        Roti roti = new Roti();
        roti.prepare();
        roti.eat();

        System.out.println("2.");
        Appliance appliance = new Appliance();
        appliance.grind();
        KitchenAppliance kitchenAppliance = new KitchenAppliance();
        kitchenAppliance.grind();
        kitchenAppliance.mix();
        Grinder grinder = new Grinder();
        grinder.grind();
        grinder.mix();

        System.out.println("3.");
        Plant plant = new Plant();
        plant.grow();
        Tree tree = new Tree();
        tree.grow();
        MangoTree mangoTree = new MangoTree();
        mangoTree.grow();

        System.out.println("4.");
        Person person = new Person();
        person.request();
        Employee employee = new Employee();
        employee.request();
        employee.work();
        Manager manager = new Manager();
        manager.request();
        manager.work();

        System.out.println("5.");
        Tshirt tshirt = new Tshirt();
        tshirt.wear();
        Tshirt tshirt1 = new UsPolo();
        tshirt1.wear();
        UsPolo usPolo = new TshirtBrand();
        usPolo.wear();

        System.out.println("6.");
        Pant pant = new Pant();
        pant.buy();
        Pant pant1 = new MudJeans();
        pant1.buy();
        Pant pant2 = new PantBrand();
        pant2.buy();


        System.out.println("7.");
        Device device = new Device();
        device.start();
        Device device1 = new Speaker();
        device1.start();
        Device device2 = new Speaker();
        device2.start();

        System.out.println("8.");
        Snacks snacks = new Snacks();
        snacks.eat();
        Snacks snacks1 = new Lays();
        snacks1.eat();
        Lays lays = new PackedFood();
        lays.eat();

        System.out.println("9.");
        Furniture furniture = new Furniture();
        furniture.place();
        Chair chair = new Chair();
        chair.place();
        Chair chair1 = new OfficeChair();
        chair1.place();

        System.out.println("10.");
        Gadget gadget = new Gadget();
        gadget.operate();
        Gadget gadget1 = new Watch();
        gadget1.operate();
        Gadget gadget2 = new SmartWatch();
        gadget2.operate();

        System.out.println("11.");
        Beverage beverage=new Beverage();
        beverage.drink();
        Beverage beverage1=new HotBeverage();
        beverage1.drink();
        HotBeverage hotBeverage=new Coffee();
        hotBeverage.drink();

        System.out.println("------------HierarchyLevel Inheritence-------------------------------");

        System.out.println("1.");
        Animal animal=new Animal();
        animal.chase();
        Animal animal1=new Dog();
        animal1.chase();
        Animal animal2=new Tiger();
        animal2.chase();

        System.out.println("2.");
        Fruit fruit=new Fruit();
        fruit.juice();
        Fruit fruit1=new Moosambi();
        fruit1.juice();
        Fruit fruit2=new Apple();
        fruit2.juice();

        System.out.println("3.");
        ToothPaste toothPaste=new ToothPaste();
        toothPaste.brush();
        ToothPaste toothPaste1=new Dabur();
        toothPaste1.brush();
        ToothPaste toothPaste2=new Colgate();
        toothPaste2.brush();

        System.out.println("4.");
        WashingMachine washingMachine=new WashingMachine();
        washingMachine.washCloth();
        WashingMachine washingMachine1=new SamsungWashingMachine();
        washingMachine1.washCloth();
        WashingMachine washingMachine2=new LgWashingMachine();
        washingMachine2.washCloth();

        System.out.println("5.");
        Account account=new Account();
        account.deposit();
        Account account1=new SavingsAccount();
        account1.deposit();
        Account account2=new LoanAccount();
        account2.deposit();

        System.out.println("6.");
        Soap soap=new Soap();
        soap.foam();
        Soap soap1=new Pears();
        soap1.foam();
        Soap soap2=new Santoor();
        soap2.foam();;

        System.out.println("7.");
        Website website=new Website();
        website.browse();
        Website website1=new Shopsy();
        website1.browse();
        Website website2=new Wikipedia();
        website2.browse();

        System.out.println("8.");
        Bat bat=new Bat();
        bat.hit();
        Bat bat1=new CricketBat();
        bat1.hit();
        Bat bat2=new HockeyBat();
        bat2.hit();

        System.out.println("9.");
        SoftDrink softDrink=new SoftDrink();
        softDrink.drink();
        SoftDrink softDrink1=new Sprite();
        softDrink1.drink();
        SoftDrink softDrink2=new Fanta();
        softDrink2.drink();

        System.out.println("10.");
        Table table=new Table();
        table.place();
        Table table1=new WoodenTable();
        table1.place();
        Table table2=new PlasticTable();
        table2.place();

        System.out.println("11.");
        Fan fan=new Fan();
        fan.rotate();
        Fan fan1=new CeilingFan();
        fan1.rotate();
        Fan fan2=new WallFan();
        fan2.rotate();


        System.out.println("-------------------HybridLevel Inheritence-------------------------------");

        System.out.println("1");
        Skill skill=new Skill();
        TechnicalSkill technicalSkill=new TechnicalSkill();
        technicalSkill.skillUp();
        technicalSkill.coding();
        SoftSkill softSkill=new SoftSkill();;
        softSkill.skillUp();
        TechnicalSkill technicalSkill1=new Java();
        technicalSkill1.skillUp();
        technicalSkill1.coding();


        System.out.println("2.");
        Vehicle vehicle=new Vehicle();
        vehicle.drive();
        Car car=new Car();
        car.drive();
        car.speed();
        Truck truck=new Truck();
        truck.drive();
        Car car1=new ElectricCar();
        car1.drive();
        car1.speed();


        System.out.println("3.");
        Tool tool=new Tool();
        tool.useTool();
        HandTool handTool=new HandTool();
        handTool.useTool();
        handTool.hold();
        PoweredTool poweredTool=new PoweredTool();
        poweredTool.useTool();
        HandTool handTool1=new Hammer();
        handTool1.useTool();
        handTool1.hold();


        System.out.println("4.");
        Insect insect=new Insect();
        insect.bite();
        FlyingInsect flyingInsect=new FlyingInsect();
        flyingInsect.bite();
        flyingInsect.fly();
        LandInsect landInsect=new LandInsect();
        landInsect.bite();
        FlyingInsect flyingInsect1=new Bee();
        flyingInsect1.bite();
        flyingInsect1.fly();


        System.out.println("5.");
        Country country=new Country();
        country.population();
        DevelopedCountry developedCountry=new DevelopedCountry();
        developedCountry.population();
        UnderDevelopedCountry underDevelopedCountry=new UnderDevelopedCountry();
        underDevelopedCountry.population();
        underDevelopedCountry.development();
        AsianCountry asianCountry=new AsianCountry();
        asianCountry.population();
        asianCountry.development();


        System.out.println("6.");
        Language language=new Language();
        language.understand();
        LocalLanguage localLanguage=new LocalLanguage();
        localLanguage.understand();
        localLanguage.speak();
        StateLanguage stateLanguage=new StateLanguage();
        stateLanguage.understand();
        Tulu tulu=new Tulu();
        tulu.understand();
        tulu.speak();

        System.out.println("7.");
        Transport transport=new Transport();
        transport.travel();
        LandTransport landTransport=new LandTransport();
        landTransport.travel();
        landTransport.ticket();
        AirTransport airTransport=new AirTransport();
        airTransport.travel();
        Train train=new Train();
        train.ticket();
        train.travel();


        System.out.println("8.");
        Processor processor=new Processor();
        processor.compute();
        Intel intel=new Intel();
        intel.compute();
        AMD amd=new AMD();
        amd.compute();
        amd.process();
        Ryzen ryzen=new Ryzen();
        ryzen.compute();
        ryzen.process();


        System.out.println("9.");
        Hotel hotel=new Hotel();
        hotel.book();
        LuxuryHotel luxuryHotel=new LuxuryHotel();
        luxuryHotel.book();
        luxuryHotel.getPrice();
        BudgetHotel budgetHotel=new BudgetHotel();
        budgetHotel.book();
        RajMahalHotel rajMahalHotel=new RajMahalHotel();
        rajMahalHotel.book();
        rajMahalHotel.getPrice();

        System.out.println("10.");
        BrandedBag brandedBag=new BrandedBag();
        brandedBag.wearBag();
        CarryBrandedBag carryBrandedBag=new CarryBrandedBag();
        carryBrandedBag.wearBag();
        SchoolBrandedBag schoolBrandedBag=new SchoolBrandedBag();
        schoolBrandedBag.wearBag();
        schoolBrandedBag.capcity();
        Skybag skybag=new Skybag();
        skybag.wearBag();
        skybag.capcity();

        System.out.println("11.");
        Brand brand=new Brand();
        brand.status();
        ShoeBrand shoeBrand=new ShoeBrand();
        shoeBrand.status();
        ClothBrand clothBrand=new ClothBrand();
        clothBrand.status();
        clothBrand.brandValue();
        AllenSolly allenSolly=new AllenSolly();
        allenSolly.status();
        allenSolly.brandValue();

























    }
}
