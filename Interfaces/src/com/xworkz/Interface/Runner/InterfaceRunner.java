package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Implementation.*;
import com.xworkz.Interface.External.Implementation1.*;
import com.xworkz.Interface.Internal.Rules.*;

public class InterfaceRunner {
    public static  void main(String[] args) {

        System.out.println("---Single Implementation--------");

        System.out.println("1.");
        Vehicle vehicle = new Bike();
        vehicle.start();
        vehicle.stop();
        vehicle.accelerate();

        System.out.println("2.");
        Appliance appliance = new Fridge();
        appliance.switchOn();
        appliance.switchOff();
        appliance.getStatus();

        System.out.println("3.");
        Fan fan = new CeilingFan();
        fan.turnOn();
        fan.turnOff();
        fan.rotate();

        System.out.println("4.");
        Light light = new LedLight();
        light.turnOn();
        light.turnOff();
        light.dim();

        System.out.println("5.");
        Chair chair = new WoodenChair();
        chair.sit();
        chair.stand();
        chair.recline();

        System.out.println("6.");
        Table table = new DiningTable();
        table.placeItems();
        table.clean();
        table.fold();

        System.out.println("7.");
        Door door = new FrontDoor();
        door.open();
        door.close();
        door.lock();

        System.out.println("8.");
        Window window = new SlidingWindow();
        window.open();
        window.close();
        window.slide();
        System.out.println("9.");
        Bed bed = new QueenBed();
        bed.sleep();
        bed.takeNap();
        bed.relax();

        System.out.println("10.");
        Clock clock = new AlaramClock();
        clock.setAlarm();
        clock.showTime();
        clock.tick();

        System.out.println("11.");
        TV tv = new SmartTv();
        tv.turnOn();
        tv.turnOff();
        tv.changeChannel();

        System.out.println("12.");
        Speaker speaker = new JBLSpeaker();
        speaker.playSound();
        speaker.increaseVolume();
        speaker.decreaseVolume();

        System.out.println("13.");
        SmartPhone smartPhone = new Iphone();
        smartPhone.makeCall();
        smartPhone.sendMessage();
        smartPhone.browse();

        System.out.println("14.");
        Laptop laptop = new AcerLaptop();
        laptop.powerOn();
        laptop.runProgram();
        laptop.shutDown();

        System.out.println("15.");
        Printer printer = new Epson();
        printer.print();
        printer.scan();
        printer.copy();

        System.out.println("16.");
        Camera camera = new DSLRCamera();
        camera.takePhoto();
        camera.recordVideo();
        camera.filter();

        System.out.println("17.");
        SmartWatch smartWatch = new AppleWatch();
        smartWatch.trackSteps();
        smartWatch.displayTime();
        smartWatch.checkHeartRate();

        System.out.println("18.");
        Bicycle bicycle = new HeroCycle();
        bicycle.pedal();
        bicycle.brake();
        bicycle.ringBell();

        System.out.println("19.");
        Bus bus = new KSRTC();
        bus.startEngine();
        bus.stopEngine();
        bus.drive();

        System.out.println("20.");
        HairDryer hairDryer = new PhilipsHairDryer();
        hairDryer.startDrying();
        hairDryer.stopDrying();
        hairDryer.adjustHeatLevel();

        System.out.println("21.");
        OffRoad offRoad = new Thar();
        offRoad.drive();
        offRoad.speedUp();
        offRoad.driveOnRoughTerrain();

        System.out.println("22.");
        Coding coding = new Python();
        coding.writeCode();
        coding.debugCode();
        coding.testCode();

        System.out.println("23.");
        Bakery bakery = new IdealBakery();
        bakery.bakeCake();
        bakery.bakeBread();
        bakery.makePastry();

        System.out.println("24.");
        Sweet sweet = new Laddu();
        sweet.makeSweet();
        sweet.packSweet();
        sweet.sellSweet();

        System.out.println("25.");
        Insect insect = new Bee();
        insect.fly();
        insect.sting();
        insect.crawl();

        System.out.println("26.");
        Oil oil = new CoconutOil();
        oil.extractOil();
        oil.useOil();
        oil.sellOil();

        System.out.println("27.");
        Language language = new Kannada();
        language.read();
        language.write();
        language.speak();

        System.out.println("28.");
        Pant pant = new PeterPant();
        pant.wearPant();
        pant.foldPant();
        pant.washPant();

        System.out.println("29.");
        Shirt shirt = new CollarShirt();
        shirt.wearShirt();
        shirt.designShirt();
        shirt.printShirt();

        System.out.println("30.");
        Book book = new Novel();
        book.readBook();
        book.writeBook();
        book.publishBook();

        System.out.println("31.");
        Computer computer = new Dell();
        computer.runProgram();
        computer.installSoftware();
        computer.uninstallSoftware();

        System.out.println("32.");
        Room room = new Bathroom();
        room.getRoomColor();
        room.getRoomSize();
        room.getRoomColor();

        System.out.println("33.");
        Shape shape=new Rectangle();
        shape.draw();
        shape.erase();
        shape.resize();

        System.out.println("34.");
        Browser browser=new Chrome();
        browser.openBrowser();
        browser.closeBrowser();
        browser.refreshBrowser();

        System.out.println("35.");
        Car car=new BMW();
        car.drive();
        car.stop();
        car.speedDrive();

        System.out.println("36.");
        Planet planet=new Earth();
        planet.planetType();
        planet.planetColor();
        planet.planetPrice();

        System.out.println("37.");
        Rocket rocket=new SLV();
        rocket.landRocket();
        rocket.launchRocket();
        rocket.rocketSpeed();

        System.out.println("38.");
        Train train=new Matsyagandha();
        train.startTrain();
        train.stopTrain();
        train.trainSpeed();

        System.out.println("39.");
        WakeUpTimeRules wakeUpTimeRules=new SmartAlarmClock();
        wakeUpTimeRules.checkTime();
        wakeUpTimeRules.wakeUp();
        wakeUpTimeRules.checkTime();

        System.out.println("40.");
        CleaningRules cleaningRules=new Vaccum() ;
        cleaningRules.dust();
        cleaningRules.mop();
        cleaningRules.sweep();

        System.out.println("41.");
        SecurityRules securityRules=new SecurityGuard();
        securityRules.checkWindows();
        securityRules.lockDoors();
        securityRules.setAlarm();

        System.out.println("42.");
        PetRule petRule=new PetOwner();
        petRule.feed();
        petRule.groom();
        petRule.walk();

        System.out.println("43.");
        WeldingRules weldingRules=new Welder();
        weldingRules.weld();
        weldingRules.cut();
        weldingRules.grind();

        System.out.println("44.");
        MinerRules minerRules=new Miner();
        minerRules.dig();
        minerRules.blast();
        minerRules.blast();

        System.out.println("45.");
        HomeRule homeRule=new Father();
        homeRule.checkWindows();;
        homeRule.checkWindows();
        homeRule.setAlarm();

        System.out.println("46.");
        PgRules pgRules=new SaiBalagiPg();
        pgRules.checkIn();
        pgRules.checkOut();
        pgRules.payRent();

        System.out.println("47.");
        SchoolRule schoolRule=new StJosephs();
        schoolRule.attendClasses();
        schoolRule.doHomework();
        schoolRule.followDressCode();

        System.out.println("48.");
        CollegeRule collegeRule=new Sdit();
        collegeRule.maintainDiscipline();
        collegeRule.participateInActivities();
        collegeRule.respectFaculty();

        System.out.println("49.");
        HospitalRule hospitalRule=new Fortis();
        hospitalRule.hygiene();
        hospitalRule.treat();
        hospitalRule.provideCare();

        System.out.println("50.");
        RestaurantRule restaurantRule=new MTR();
        restaurantRule.serveFood();
        restaurantRule.cookFood();
        restaurantRule.hygiene();

        System.out.println("51.");
        HostelRule hostelRule=new SagarHostel();
        hostelRule.clean();
        hostelRule.penalty();
        hostelRule.clean();

        System.out.println("52.");
        GymRule gymRule=new GoldGym();
        gymRule.diet();
        gymRule.timings();
        gymRule.timings();

        System.out.println("53.");
        BankRule bankRule=new HDFC();
        bankRule.close();
        bankRule.deposit();
        bankRule.open();

        System.out.println("54.");
        JavaRules javaRules=new Java();
        javaRules.capital();
        javaRules.indentation();
        javaRules.objectName();

        System.out.println("55.");
        SongRules songRules=new Arjit();
        songRules.amplify();
        songRules.pay();
        songRules.noise();

        System.out.println("56.");
        GuitarRule guitarRule=new Guitar();
        guitarRule.play();
        guitarRule.tune();
        guitarRule.perform();

        System.out.println("57.");
        BMTCRule bmtcRule=new BMTC();
        bmtcRule.route();
        bmtcRule.timing();
        bmtcRule.ticket();

        System.out.println("58.");
        MetroRule metroRule=new NammaMetro();
        metroRule.route();
        metroRule.timing();
        metroRule.ticket();

        System.out.println("59.");
        TaxiRule taxiRule=new Uber();
        taxiRule.taxiBooking();
        taxiRule.taxiFare();
        taxiRule.taxiDriver();

        System.out.println("60.");
        CompanyRule companyRule=new Infosys();
        companyRule.companyInsurance();
        companyRule.companyLeavePolicy();
        companyRule.companyWorkHours();

        System.out.println("61.");
        EmployeeRule employeeRule=new Employee();
        employeeRule.employeeInsurance();
        employeeRule.employeeLeavePolicy();
        employeeRule.employeeWorkHours();

        System.out.println("62.");
        TraineeRule traineeRule=new Trainee();
        traineeRule.traineeInsurance();
        traineeRule.traineeLeavePolicy();
        traineeRule.traineeWorkHours();

        System.out.println("63.");
        DrivingRules drivingRules=new Driving();
        drivingRules.drivingInsurance();
        drivingRules.drivingSafetyRules();
        drivingRules.drivingEmergencyProcedures();

        System.out.println("64.");
        TrafficRule trafficRule= new Traffic();
        trafficRule.trafficRoadSigns();
        trafficRule.trafficSpeedLimits();
        trafficRule.trafficSafetyRules();

        System.out.println("65.");
        DebugRule debugRule=new Debug();
        debugRule.debugCodeReview();
        debugRule.debugErrorHandling();
        debugRule.debugLogging();

        System.out.println("66.");
        NetworkRule networkRule=new Network();
        networkRule.networkSecurity();
        networkRule.networkPerformance();
        networkRule.networkMonitoring();

        System.out.println("67.");
        ExamRule examRule=new Exam();
        examRule.examAuthority();
        examRule.examSyllabus();
        examRule.examPattern();

        System.out.println("68.");
        BarberRule barberRule=new Barber();
        barberRule.barberTools();
        barberRule.barberSafety();
        barberRule.barberHygiene();

        System.out.println("69.");
        SaloonRule saloonRule=new Saloon();
        saloonRule.saloonHygiene();
        saloonRule.saloonCustomerCare();
        saloonRule.saloonServices();

        System.out.println("70.");
        MedicalRule medicalRule=new Medical();
        medicalRule.medicalHygiene();
        medicalRule.medicalCustomerCare();
        medicalRule.medicalHygiene();

        System.out.println("71.");
        ShowRoomRule showroomRule=new Showroom();
        showroomRule.showRoomCustomerCare();
        showroomRule.showRoomProducts();
        showroomRule.showRoomTools();

        System.out.println("72.");
        ParkRule parkRule=new HBCSPark();
        parkRule.parkHygiene();
        parkRule.parkSafety();
        parkRule.facility();

        System.out.println("73.");
        StationRule stationRule=new StationMaster();
        stationRule.maintenance();
        stationRule.safety();
        stationRule.timing();

        System.out.println("74.");
        Parliment parliment=new LokSabha();
        parliment.debate();
        parliment.discuss();
        parliment.fight();

        System.out.println("---------Multi Implementation--------");
        System.out.println("1.");
        Appliance appliance1=new Oven();
        Bakery bakery1=new Oven();
        appliance1.switchOn();
        appliance1.switchOff();
        appliance1.getStatus();
        bakery1.bakeCake();
        bakery1.bakeBread();
        bakery1.makePastry();

        System.out.println("2.");
        Browser browser1=new DigitalLibrary();
        Book book1=new DigitalLibrary();
        browser1.openBrowser();
        browser1.closeBrowser();
        browser1.refreshBrowser();
        book1.readBook();
        book1.writeBook();
        book1.publishBook();
        System.out.println("3.");
        BMTCRule bmtcRule1=new CityBus();
        Bus bus1=new CityBus();
        bmtcRule1.route();
        bmtcRule1.timing();
        bmtcRule1.ticket();
        bus1.startEngine();
        bus1.stopEngine();
        bus1.drive();
        System.out.println("4.");
        Browser browser2=new SmartCamera();
        Camera camera1=new SmartCamera();
        browser2.openBrowser();
        browser2.closeBrowser();
        browser2.refreshBrowser();
        camera1.takePhoto();
        camera1.recordVideo();
        camera1.filter();
        System.out.println("5.");
        Coding coding1=new ProgrammerClock();
        Clock clock1=new ProgrammerClock();
        coding1.writeCode();
        coding1.debugCode();
        coding1.testCode();
        clock1.setAlarm();
        clock1.showTime();
        clock1.tick();
        System.out.println("6.");
        Coding coding2=new DevelopmentTool();
        DebugRule debugRule1=new DevelopmentTool();
        coding2.writeCode();
        coding2.debugCode();
        coding2.testCode();
        debugRule1.debugCodeReview();
        debugRule1.debugErrorHandling();
        debugRule1.debugLogging();
        System.out.println("7.");
        Fan fan1=new SmartFan();
        HomeRule homeRule1=new SmartFan();
        fan1.turnOn();
        fan1.turnOff();
        fan1.rotate();
        homeRule1.checkWindows();
        homeRule1.lockDoors();
        homeRule1.setAlarm();
        System.out.println("8.");
        CollegeRule collegeRule1=new CollegeStudent();
        JavaRules javaRules1=new CollegeStudent();
        collegeRule1.maintainDiscipline();
        collegeRule1.participateInActivities();
        collegeRule1.respectFaculty();
        javaRules1.capital();
        javaRules1.indentation();
        javaRules1.objectName();
        System.out.println("9.");
        CleaningRules cleaningRules1=new CleaningStaff();
        SchoolRule schoolRule1=new CleaningStaff();
        cleaningRules1.dust();
        cleaningRules1.mop();
        cleaningRules1.sweep();
        schoolRule1.attendClasses();
        schoolRule1.doHomework();
        schoolRule1.followDressCode();
        System.out.println("10.");
        MetroRule metroRule1=new MetroDriver();
        DrivingRules drivingRules1=new MetroDriver();
        metroRule1.route();
        metroRule1.timing();
        metroRule1.ticket();
        drivingRules1.drivingInsurance();
        drivingRules1.drivingSafetyRules();
        drivingRules1.drivingEmergencyProcedures();
        System.out.println("11.");
        CompanyRule companyRule1=new Developer();
        Coding coding3=new Developer();
        companyRule1.companyInsurance();
        companyRule1.companyLeavePolicy();
        companyRule1.companyWorkHours();
        coding3.writeCode();
        coding3.debugCode();
        coding3.testCode();
        System.out.println("12.");
        Laptop laptop1=new WebApp();
        Coding coding4=new WebApp();
        laptop1.powerOn();
        laptop1.runProgram();
        laptop1.shutDown();
        coding4.writeCode();
        coding4.debugCode();
        coding4.testCode();
        System.out.println("13.");
        OffRoad offRoad1=new OffroadVehicle();
        DrivingRules drivingRules2=new OffroadVehicle();
        offRoad1.drive();
        offRoad1.speedUp();
        offRoad1.driveOnRoughTerrain();
        drivingRules2.drivingInsurance();
        drivingRules2.drivingSafetyRules();
        drivingRules2.drivingEmergencyProcedures();
        System.out.println("14.");
        SecurityRules securityRules1=new SecurityOfficer();
        SchoolRule schoolRule2=new SecurityOfficer();
        securityRules1.checkWindows();
        securityRules1.lockDoors();
        securityRules1.setAlarm();
        schoolRule2.attendClasses();
        schoolRule2.doHomework();
        schoolRule2.followDressCode();
        System.out.println("15.");
        MinerRules minerRules1=new OilMiner();
        Oil oil1=new OilMiner();
        minerRules1.dig();
        minerRules1.blast();
        minerRules1.blast();
        oil1.extractOil();
        oil1.useOil();
        oil1.sellOil();
        System.out.println("16.");
        Sweet sweet1=new DeligthSweet();
        Bakery bakery2=new DeligthSweet();
        sweet1.makeSweet();
        sweet1.packSweet();
        sweet1.sellSweet();
        bakery2.bakeCake();
        bakery2.bakeBread();
        bakery2.makePastry();
        System.out.println("17.");
        Speaker speaker1=new SmartSpeaker();
        SongRules songRules1=new SmartSpeaker();
        speaker1.playSound();
        speaker1.increaseVolume();
        speaker1.decreaseVolume();
        songRules1.amplify();
        songRules1.pay();
        songRules1.noise();
        System.out.println("18.");
        MinerRules minerRules2=new MiningRobot();
        Planet planet1=new MiningRobot();
        minerRules2.dig();
        minerRules2.drill();
        minerRules2.blast();
        planet1.planetType();
        planet1.planetColor();
        planet1.planetPrice();
        System.out.println("19.");
        SmartPhone smartPhone1=new SmartDevice();
        SmartWatch smartWatch1=new SmartDevice();
        smartPhone1.browse();
        smartPhone1.makeCall();
        smartPhone1.sendMessage();
        smartWatch1.checkHeartRate();
        smartWatch1.displayTime();
        smartWatch1.trackSteps();
        System.out.println("20.");
        Train train1=new RailwayIntern();
        TraineeRule traineeRule1=new RailwayIntern();
        train1.trainSpeed();
        train1.startTrain();
        train1.stopTrain();
        traineeRule1.traineeInsurance();
        traineeRule1.traineeLeavePolicy();
        traineeRule1.traineeWorkHours();
        System.out.println("21.");
        Window window1=new AutoCab();
        Vehicle vehicle1=new AutoCab();
        window1.open();
        window1.close();
        window1.slide();
        vehicle1.start();
        vehicle1.stop();
        vehicle1.accelerate();
        System.out.println("22.");
        SecurityRules securityRules2=new Survelliance();
        Camera camera2=new Survelliance();
        securityRules2.checkWindows();
        securityRules2.lockDoors();
        securityRules2.setAlarm();
        camera2.takePhoto();
        camera2.recordVideo();
        camera2.filter();
        System.out.println("23.");
        Shirt shirt1=new Cloth();
        Pant pant1=new Cloth();
        shirt1.wearShirt();
        shirt1.designShirt();
        shirt1.printShirt();
        pant1.wearPant();
        pant1.foldPant();
        pant1.washPant();
        System.out.println("24.");
        SongRules songRules2=new Music();
        GuitarRule guitarRule1=new Music();
        songRules2.amplify();
        songRules2.pay();
        songRules2.noise();
        guitarRule1.play();
        guitarRule1.tune();
        guitarRule1.perform();
        System.out.println("25.");
        Room room1=new Apartment();
        HomeRule homeRule2=new Apartment();
        room1.getRoomColor();
        room1.getRoomSize();
        room1.getRoomColor();
        homeRule2.checkWindows();
        homeRule2.lockDoors();
        homeRule2.setAlarm();
























































    }
}
