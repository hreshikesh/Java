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
        vehicle.vehicleInfo();

        System.out.println("2.");
        Appliance appliance = new Fridge();
        appliance.switchOn();
        appliance.switchOff();
        appliance.getStatus();
        appliance.applianceInfo();

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
        light.lightInfo();

        System.out.println("5.");
        Chair chair = new WoodenChair();
        chair.sit();
        chair.stand();
        chair.recline();
        chair.chairInfo();

        System.out.println("6.");
        Table table = new DiningTable();
        table.placeItems();
        table.clean();
        table.fold();
        table.tableInfo();

        System.out.println("7.");
        Door door = new FrontDoor();
        door.open();
        door.close();
        door.lock();
        door.doorInfo();

        System.out.println("8.");
        Window window = new SlidingWindow();
        window.open();
        window.close();
        window.slide();
        window.windowInfo();

        System.out.println("9.");
        Bed bed = new QueenBed();
        bed.sleep();
        bed.takeNap();
        bed.relax();
        bed.bedInfo();

        System.out.println("10.");
        Clock clock = new AlaramClock();
        clock.setAlarm();
        clock.showTime();
        clock.tick();
        clock.clockInfo();

        System.out.println("11.");
        TV tv = new SmartTv();
        tv.turnOn();
        tv.turnOff();
        tv.changeChannel();
        tv.tvInfo();

        System.out.println("12.");
        Speaker speaker = new JBLSpeaker();
        speaker.playSound();
        speaker.increaseVolume();
        speaker.decreaseVolume();
        speaker.speakerInfo();

        System.out.println("13.");
        SmartPhone smartPhone = new Iphone();
        smartPhone.makeCall();
        smartPhone.sendMessage();
        smartPhone.browse();
        smartPhone.smartphoneInfo();

        System.out.println("14.");
        Laptop laptop = new AcerLaptop();
        laptop.powerOn();
        laptop.runProgram();
        laptop.shutDown();
        laptop.laptopInfo();

        System.out.println("15.");
        Printer printer = new Epson();
        printer.print();
        printer.scan();
        printer.copy();
        printer.printerInfo();

        System.out.println("16.");
        Camera camera = new DSLRCamera();
        camera.takePhoto();
        camera.recordVideo();
        camera.filter();
        camera.cameraInfo();

        System.out.println("17.");
        SmartWatch smartWatch = new AppleWatch();
        smartWatch.trackSteps();
        smartWatch.displayTime();
        smartWatch.checkHeartRate();
        smartWatch.watchInfo();

        System.out.println("18.");
        Bicycle bicycle = new HeroCycle();
        bicycle.pedal();
        bicycle.brake();
        bicycle.ringBell();
        bicycle.bicycleInfo();

        System.out.println("19.");
        Bus bus = new KSRTC();
        bus.startEngine();
        bus.stopEngine();
        bus.drive();
        bus.busInfo();

        System.out.println("20.");
        HairDryer hairDryer = new PhilipsHairDryer();
        hairDryer.startDrying();
        hairDryer.stopDrying();
        hairDryer.adjustHeatLevel();
        hairDryer.hairDryerInfo();

        System.out.println("21.");
        OffRoad offRoad = new Thar();
        offRoad.drive();
        offRoad.speedUp();
        offRoad.driveOnRoughTerrain();
        offRoad.offRoadInfo();

        System.out.println("22.");
        Coding coding = new Python();
        coding.writeCode();
        coding.debugCode();
        coding.testCode();
        coding.codingInfo();

        System.out.println("23.");
        Bakery bakery = new IdealBakery();
        bakery.bakeCake();
        bakery.bakeBread();
        bakery.makePastry();
        bakery.bakeryInfo();

        System.out.println("24.");
        Sweet sweet = new Laddu();
        sweet.makeSweet();
        sweet.packSweet();
        sweet.sellSweet();
        sweet.sweetInfo();

        System.out.println("25.");
        Insect insect = new Bee();
        insect.fly();
        insect.sting();
        insect.crawl();
        insect.insectInfo();

        System.out.println("26.");
        Oil oil = new CoconutOil();
        oil.extractOil();
        oil.useOil();
        oil.sellOil();
        oil.oilInfo();

        System.out.println("27.");
        Language language = new Kannada();
        language.read();
        language.write();
        language.speak();
        language.languageInfo();

        System.out.println("28.");
        Pant pant = new PeterPant();
        pant.wearPant();
        pant.foldPant();
        pant.washPant();
        pant.pantInfo();

        System.out.println("29.");
        Shirt shirt = new CollarShirt();
        shirt.wearShirt();
        shirt.designShirt();
        shirt.printShirt();
        shirt.shirtInfo();

        System.out.println("30.");
        Book book = new Novel();
        book.readBook();
        book.writeBook();
        book.publishBook();
        book.bookInfo();

        System.out.println("31.");
        Computer computer = new Dell();
        computer.runProgram();
        computer.installSoftware();
        computer.uninstallSoftware();
        computer.computerInfo();

        System.out.println("32.");
        Room room = new Bathroom();
        room.getRoomColor();
        room.getRoomSize();
        room.getRoomColor();
        room.roomInfo();

        System.out.println("33.");
        Shape shape=new Rectangle();
        shape.draw();
        shape.erase();
        shape.resize();
        shape.shapeInfo();

        System.out.println("34.");
        Browser browser=new Chrome();
        browser.openBrowser();
        browser.closeBrowser();
        browser.refreshBrowser();
        browser.browserInfo();

        System.out.println("35.");
        Car car=new BMW();
        car.drive();
        car.stop();
        car.speedDrive();
        car.carInfo();

        System.out.println("36.");
        Planet planet=new Earth();
        planet.planetType();
        planet.planetColor();
        planet.planetPrice();
        planet.planetInfo();

        System.out.println("37.");
        Rocket rocket=new SLV();
        rocket.landRocket();
        rocket.launchRocket();
        rocket.rocketSpeed();
        rocket.rocketInfo();

        System.out.println("38.");
        Train train=new Matsyagandha();
        train.startTrain();
        train.stopTrain();
        train.trainSpeed();
        train.trainInfo();

        System.out.println("39.");
        WakeUpTimeRules wakeUpTimeRules=new SmartAlarmClock();
        wakeUpTimeRules.checkTime();
        wakeUpTimeRules.wakeUp();
        wakeUpTimeRules.resetAlarm();
        wakeUpTimeRules.wakeUpInfo();

        System.out.println("40.");
        CleaningRules cleaningRules=new Vaccum() ;
        cleaningRules.dust();
        cleaningRules.mop();
        cleaningRules.sweep();
        cleaningRules.cleaningInfo();

        System.out.println("41.");
        SecurityRules securityRules=new SecurityGuard();
        securityRules.checkWindows();
        securityRules.lockDoors();
        securityRules.setAlarm();
        securityRules.securityInfo();

        System.out.println("42.");
        PetRule petRule=new PetOwner();
        petRule.feed();
        petRule.groom();
        petRule.walk();
        petRule.petInfo();

        System.out.println("43.");
        WeldingRules weldingRules=new Welder();
        weldingRules.weld();
        weldingRules.cut();
        weldingRules.grind();
        weldingRules.weldingInfo();

        System.out.println("44.");
        MinerRules minerRules=new Miner();
        minerRules.dig();
        minerRules.blast();
        minerRules.blast();
        minerRules.minerInfo();

        System.out.println("45.");
        HomeRule homeRule=new Father();
        homeRule.checkWindows();;
        homeRule.checkWindows();
        homeRule.setAlarm();
        homeRule.homeInfo();

        System.out.println("46.");
        PgRules pgRules=new SaiBalagiPg();
        pgRules.checkIn();
        pgRules.checkOut();
        pgRules.payRent();
        pgRules.pgInfo();

        System.out.println("47.");
        SchoolRule schoolRule=new StJosephs();
        schoolRule.attendClasses();
        schoolRule.doHomework();
        schoolRule.followDressCode();
        schoolRule.schoolInfo();

        System.out.println("48.");
        CollegeRule collegeRule=new Sdit();
        collegeRule.maintainDiscipline();
        collegeRule.participateInActivities();
        collegeRule.respectFaculty();
        collegeRule.collegeInfo();

        System.out.println("49.");
        HospitalRule hospitalRule=new Fortis();
        hospitalRule.hygiene();
        hospitalRule.treat();
        hospitalRule.provideCare();
        hospitalRule.hospitalInfo();

        System.out.println("50.");
        RestaurantRule restaurantRule=new MTR();
        restaurantRule.serveFood();
        restaurantRule.cookFood();
        restaurantRule.hygiene();
        restaurantRule.restaurantInfo();

        System.out.println("51.");
        HostelRule hostelRule=new SagarHostel();
        hostelRule.clean();
        hostelRule.penalty();
        hostelRule.clean();
        hostelRule.hostelInfo();

        System.out.println("52.");
        GymRule gymRule=new GoldGym();
        gymRule.diet();
        gymRule.timings();
        gymRule.weigth();
        gymRule.gymInfo();

        System.out.println("53.");
        BankRule bankRule=new HDFC();
        bankRule.close();
        bankRule.deposit();
        bankRule.open();
        bankRule.bankInfo();

        System.out.println("54.");
        JavaRules javaRules=new Java();
        javaRules.capital();
        javaRules.indentation();
        javaRules.objectName();
        javaRules.javaInfo();

        System.out.println("55.");
        SongRules songRules=new Arjit();
        songRules.amplify();
        songRules.pay();
        songRules.noise();
        songRules.songInfo();

        System.out.println("56.");
        GuitarRule guitarRule=new Guitar();
        guitarRule.play();
        guitarRule.tune();
        guitarRule.perform();
        guitarRule.guitarInfo();

        System.out.println("57.");
        BMTCRule bmtcRule=new BMTC();
        bmtcRule.route();
        bmtcRule.timing();
        bmtcRule.ticket();
        bmtcRule.bmtcInfo();

        System.out.println("58.");
        MetroRule metroRule=new NammaMetro();
        metroRule.route();
        metroRule.timing();
        metroRule.ticket();
        metroRule.metroInfo();

        System.out.println("59.");
        TaxiRule taxiRule=new Uber();
        taxiRule.taxiBooking();
        taxiRule.taxiFare();
        taxiRule.taxiDriver();
        taxiRule.taxiInfo();

        System.out.println("60.");
        CompanyRule companyRule=new Infosys();
        companyRule.companyInsurance();
        companyRule.companyLeavePolicy();
        companyRule.companyWorkHours();
        companyRule.companyInfo();

        System.out.println("61.");
        EmployeeRule employeeRule=new Employee();
        employeeRule.employeeInsurance();
        employeeRule.employeeLeavePolicy();
        employeeRule.employeeWorkHours();
        employeeRule.employeeInfo();

        System.out.println("62.");
        TraineeRule traineeRule=new Trainee();
        traineeRule.traineeInsurance();
        traineeRule.traineeLeavePolicy();
        traineeRule.traineeWorkHours();
        traineeRule.traineeInfo();

        System.out.println("63.");
        DrivingRules drivingRules=new Driving();
        drivingRules.drivingInsurance();
        drivingRules.drivingSafetyRules();
        drivingRules.drivingEmergencyProcedures();
        drivingRules.drivingInfo();

        System.out.println("64.");
        TrafficRule trafficRule= new Traffic();
        trafficRule.trafficRoadSigns();
        trafficRule.trafficSpeedLimits();
        trafficRule.trafficSafetyRules();
        trafficRule.trafficInfo();

        System.out.println("65.");
        DebugRule debugRule=new Debug();
        debugRule.debugCodeReview();
        debugRule.debugErrorHandling();
        debugRule.debugLogging();
        debugRule.debugInfo();

        System.out.println("66.");
        NetworkRule networkRule=new Network();
        networkRule.networkSecurity();
        networkRule.networkPerformance();
        networkRule.networkMonitoring();
        networkRule.networkInfo();

        System.out.println("67.");
        ExamRule examRule=new Exam();
        examRule.examAuthority();
        examRule.examSyllabus();
        examRule.examPattern();
        examRule.examInfo();

        System.out.println("68.");
        BarberRule barberRule=new Barber();
        barberRule.barberTools();
        barberRule.barberSafety();
        barberRule.barberHygiene();
        barberRule.barberInfo();


        System.out.println("69.");
        SaloonRule saloonRule=new Saloon();
        saloonRule.saloonHygiene();
        saloonRule.saloonCustomerCare();
        saloonRule.saloonServices();
        saloonRule.saloonInfo();

        System.out.println("70.");
        MedicalRule medicalRule=new Medical();
        medicalRule.medicalServices();
        medicalRule.medicalCustomerCare();
        medicalRule.medicalHygiene();
        medicalRule.medicalInfo();

        System.out.println("71.");
        ShowRoomRule showroomRule=new Showroom();
        showroomRule.showRoomCustomerCare();
        showroomRule.showRoomProducts();
        showroomRule.showRoomTools();
        showroomRule.showRoomInfo();

        System.out.println("72.");
        ParkRule parkRule=new HBCSPark();
        parkRule.parkHygiene();
        parkRule.parkSafety();
        parkRule.facility();
        parkRule.parkInfo();

        System.out.println("73.");
        StationRule stationRule=new StationMaster();
        stationRule.maintenance();
        stationRule.safety();
        stationRule.timing();
        stationRule.stationInfo();

        System.out.println("74.");
        Parliment parliment=new LokSabha();
        parliment.debate();
        parliment.discuss();
        parliment.fight();
        parliment.parlimentInfo();

        System.out.println("---------Multi Implementation--------");
        System.out.println("1.");
        Appliance appliance1=new Oven();
        Bakery bakery1=new Oven();
        appliance1.switchOn();
        appliance1.switchOff();
        appliance1.getStatus();
        appliance1.applianceInfo();
        bakery1.bakeCake();
        bakery1.bakeBread();
        bakery1.makePastry();
        bakery1.bakeryInfo();

        System.out.println("2.");
        Browser browser1=new DigitalLibrary();
        Book book1=new DigitalLibrary();
        browser1.openBrowser();
        browser1.closeBrowser();
        browser1.refreshBrowser();
        browser1.browserInfo();
        book1.readBook();
        book1.writeBook();
        book1.publishBook();
        book1.bookInfo();

        System.out.println("3.");
        BMTCRule bmtcRule1=new CityBus();
        Bus bus1=new CityBus();
        bmtcRule1.route();
        bmtcRule1.timing();
        bmtcRule1.ticket();
        bmtcRule1.bmtcInfo();
        bus1.startEngine();
        bus1.stopEngine();
        bus1.drive();
        bus1.busInfo();

        System.out.println("4.");
        Browser browser2=new SmartCamera();
        Camera camera1=new SmartCamera();
        browser2.openBrowser();
        browser2.closeBrowser();
        browser2.refreshBrowser();
        browser2.browserInfo();
        camera1.takePhoto();
        camera1.recordVideo();
        camera1.filter();
        camera1.cameraInfo();

        System.out.println("5.");
        Coding coding1=new ProgrammerClock();
        Clock clock1=new ProgrammerClock();
        coding1.writeCode();
        coding1.debugCode();
        coding1.testCode();
        coding1.codingInfo();
        clock1.setAlarm();
        clock1.showTime();
        clock1.tick();
        clock1.clockInfo();

        System.out.println("6.");
        Coding coding2=new DevelopmentTool();
        DebugRule debugRule1=new DevelopmentTool();
        coding2.writeCode();
        coding2.debugCode();
        coding2.testCode();
        coding2.codingInfo();
        debugRule1.debugCodeReview();
        debugRule1.debugErrorHandling();
        debugRule1.debugLogging();
        debugRule1.debugInfo();

        System.out.println("7.");
        Fan fan1=new SmartFan();
        HomeRule homeRule1=new SmartFan();
        fan1.turnOn();
        fan1.turnOff();
        fan1.rotate();
        fan1.fanInfo();
        homeRule1.checkWindows();
        homeRule1.lockDoors();
        homeRule1.setAlarm();
        homeRule1.homeInfo();

        System.out.println("8.");
        CollegeRule collegeRule1=new CollegeStudent();
        JavaRules javaRules1=new CollegeStudent();
        collegeRule1.maintainDiscipline();
        collegeRule1.participateInActivities();
        collegeRule1.respectFaculty();
        collegeRule1.collegeInfo();
        javaRules1.capital();
        javaRules1.indentation();
        javaRules1.objectName();
        javaRules1.javaInfo();

        System.out.println("9.");
        CleaningRules cleaningRules1=new CleaningStaff();
        SchoolRule schoolRule1=new CleaningStaff();
        cleaningRules1.dust();
        cleaningRules1.mop();
        cleaningRules1.sweep();
        cleaningRules1.cleaningInfo();
        schoolRule1.attendClasses();
        schoolRule1.doHomework();
        schoolRule1.followDressCode();
        schoolRule1.schoolInfo();

        System.out.println("10.");
        MetroRule metroRule1=new MetroDriver();
        DrivingRules drivingRules1=new MetroDriver();
        metroRule1.route();
        metroRule1.timing();
        metroRule1.ticket();
        metroRule1.metroInfo();
        drivingRules1.drivingInsurance();
        drivingRules1.drivingSafetyRules();
        drivingRules1.drivingEmergencyProcedures();
        drivingRules1.drivingInfo();

        System.out.println("11.");
        CompanyRule companyRule1=new Developer();
        Coding coding3=new Developer();
        companyRule1.companyInsurance();
        companyRule1.companyLeavePolicy();
        companyRule1.companyWorkHours();
        companyRule1.companyInfo();
        coding3.writeCode();
        coding3.debugCode();
        coding3.testCode();
        coding3.codingInfo();

        System.out.println("12.");
        Laptop laptop1=new WebApp();
        Coding coding4=new WebApp();
        laptop1.powerOn();
        laptop1.runProgram();
        laptop1.shutDown();
        laptop1.laptopInfo();
        coding4.writeCode();
        coding4.debugCode();
        coding4.testCode();
        coding4.codingInfo();

        System.out.println("13.");
        OffRoad offRoad1=new OffroadVehicle();
        DrivingRules drivingRules2=new OffroadVehicle();
        offRoad1.drive();
        offRoad1.speedUp();
        offRoad1.driveOnRoughTerrain();
        offRoad1.offRoadInfo();
        drivingRules2.drivingInsurance();
        drivingRules2.drivingSafetyRules();
        drivingRules2.drivingEmergencyProcedures();
        drivingRules2.drivingInfo();

        System.out.println("14.");
        SecurityRules securityRules1=new SecurityOfficer();
        SchoolRule schoolRule2=new SecurityOfficer();
        securityRules1.checkWindows();
        securityRules1.lockDoors();
        securityRules1.setAlarm();
        securityRules1.securityInfo();
        schoolRule2.attendClasses();
        schoolRule2.doHomework();
        schoolRule2.followDressCode();
        schoolRule2.schoolInfo();

        System.out.println("15.");
        MinerRules minerRules1=new OilMiner();
        Oil oil1=new OilMiner();
        minerRules1.dig();
        minerRules1.blast();
        minerRules1.blast();
        minerRules1.minerInfo();
        oil1.extractOil();
        oil1.useOil();
        oil1.sellOil();
        oil1.oilInfo();

        System.out.println("16.");
        Sweet sweet1=new DeligthSweet();
        Bakery bakery2=new DeligthSweet();
        sweet1.makeSweet();
        sweet1.packSweet();
        sweet1.sellSweet();
        sweet1.sweetInfo();
        bakery2.bakeCake();
        bakery2.bakeBread();
        bakery2.makePastry();
        bakery2.bakeryInfo();

        System.out.println("17.");
        Speaker speaker1=new SmartSpeaker();
        SongRules songRules1=new SmartSpeaker();
        speaker1.playSound();
        speaker1.increaseVolume();
        speaker1.decreaseVolume();
        speaker1.speakerInfo();
        songRules1.amplify();
        songRules1.pay();
        songRules1.noise();
        songRules1.songInfo();

        System.out.println("18.");
        MinerRules minerRules2=new MiningRobot();
        Planet planet1=new MiningRobot();
        minerRules2.dig();
        minerRules2.drill();
        minerRules2.blast();
        minerRules2.minerInfo();
        planet1.planetType();
        planet1.planetColor();
        planet1.planetPrice();
        planet1.planetInfo();

        System.out.println("19.");
        SmartPhone smartPhone1=new SmartDevice();
        SmartWatch smartWatch1=new SmartDevice();
        smartPhone1.browse();
        smartPhone1.makeCall();
        smartPhone1.sendMessage();
        smartPhone1.smartphoneInfo();
        smartWatch1.checkHeartRate();
        smartWatch1.displayTime();
        smartWatch1.trackSteps();
        smartWatch1.watchInfo();

        System.out.println("20.");
        Train train1=new RailwayIntern();
        TraineeRule traineeRule1=new RailwayIntern();
        train1.trainSpeed();
        train1.startTrain();
        train1.stopTrain();
        train1.trainInfo();
        traineeRule1.traineeInsurance();
        traineeRule1.traineeLeavePolicy();
        traineeRule1.traineeWorkHours();
        traineeRule1.traineeInfo();

        System.out.println("21.");
        Window window1=new AutoCab();
        Vehicle vehicle1=new AutoCab();
        window1.open();
        window1.close();
        window1.slide();
        window1.windowInfo();
        vehicle1.start();
        vehicle1.stop();
        vehicle1.accelerate();
        vehicle1.vehicleInfo();

        System.out.println("22.");
        SecurityRules securityRules2=new Survelliance();
        Camera camera2=new Survelliance();
        securityRules2.checkWindows();
        securityRules2.lockDoors();
        securityRules2.setAlarm();
        securityRules2.securityInfo();
        camera2.takePhoto();
        camera2.recordVideo();
        camera2.filter();
        camera2.cameraInfo();

        System.out.println("23.");
        Shirt shirt1=new Cloth();
        Pant pant1=new Cloth();
        shirt1.wearShirt();
        shirt1.designShirt();
        shirt1.printShirt();
        shirt1.shirtInfo();
        pant1.wearPant();
        pant1.foldPant();
        pant1.washPant();
        pant1.pantInfo();

        System.out.println("24.");
        SongRules songRules2=new Music();
        GuitarRule guitarRule1=new Music();
        songRules2.amplify();
        songRules2.pay();
        songRules2.noise();
        songRules2.songInfo();
        guitarRule1.play();
        guitarRule1.tune();
        guitarRule1.perform();
        guitarRule1.guitarInfo();

        System.out.println("25.");
        Room room1=new Apartment();
        HomeRule homeRule2=new Apartment();
        room1.getRoomColor();
        room1.getRoomSize();
        room1.getRoomColor();
        room1.roomInfo();
        homeRule2.checkWindows();
        homeRule2.lockDoors();
        homeRule2.setAlarm();
        homeRule2.homeInfo();
























































    }
}
