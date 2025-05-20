package com.xworkz.useInterface.main;

import com.xworkz.useInterface.impl.*;
import com.xworkz.useInterface.interfaces.*;
import com.xworkz.useInterface.users.*;

public class Main {
    public static void main(String[] args) {

        Icc icc = new IndianCricketTeamIccImpl();
        BCCI userIcc = new BCCI(icc);
        userIcc.use();

        Constitution constitution = new CitizenConstitutionImpl();
        Government userConstitution = new Government(constitution);
        userConstitution.use();

        Laptop Laptop = new DellLaptopImpl();
        OperatingSystem userLaptop = new OperatingSystem(Laptop);
        userLaptop.use();

        SpaceAgency SpaceAgency = new MarsMissionImpl();
        NASA userSpaceAgency = new NASA(SpaceAgency);
        userSpaceAgency.use();

        RBIRegulations RBIRegulations = new SbiBankImpl();
        Bank userRBIRegulations = new Bank(RBIRegulations);
        userRBIRegulations.use();

        HealthcareSystem HealthcareSystem = new DoctorImpl();
        Hospital userHealthcareSystem = new Hospital(HealthcareSystem);
        userHealthcareSystem.use();

        EducationBoard EducationBoard = new CbseSchoolImpl();
        School userEducationBoard = new School(EducationBoard);
        userEducationBoard.use();

        FoodService FoodService = new IndianRestaurantImpl();
        Restaurant userFoodService = new Restaurant(FoodService);
        userFoodService.use();

        Entertainment Entertainment = new PvrCinemaImpl();
        CinemaHall userEntertainment = new CinemaHall(Entertainment);
        userEntertainment.use();

        HRPolicy HRPolicy = new EmployeeImpl();
        Company userHRPolicy = new Company(HRPolicy);
        userHRPolicy.use();

        AirTrafficControl AirTrafficControl = new IndigoAirlineImpl();
        Airline userAirTrafficControl = new Airline(AirTrafficControl);
        userAirTrafficControl.use();

        LawSystem LawSystem = new HighCourtImpl();
        Court userLawSystem = new Court(LawSystem);
        userLawSystem.use();

        AnimalCare AnimalCare = new ZookeeperImpl();
        Zoo userAnimalCare = new Zoo(AnimalCare);
        userAnimalCare.use();

        CulturalHeritage CulturalHeritage = new HistoryMuseumImpl();
        Museum userCulturalHeritage = new Museum(CulturalHeritage);
        userCulturalHeritage.use();

        Machine Machine = new CarFactoryImpl();
        Factory userMachine = new Factory(Machine);
        userMachine.use();

        BookManagement BookManagement = new PublicLibraryImpl();
        Library userBookManagement = new Library(BookManagement);
        userBookManagement.use();

        BillingSystem BillingSystem = new SmartSupermarketImpl();
        Supermarket userBillingSystem = new Supermarket(BillingSystem);
        userBillingSystem.use();

        AccreditationBody AccreditationBody = new OxfordUniversityImpl();
        University userAccreditationBody = new University(AccreditationBody);
        userAccreditationBody.use();

        AgriculturePolicy AgriculturePolicy = new OrganicFarmImpl();
        Farm userAgriculturePolicy = new Farm(AgriculturePolicy);
        userAgriculturePolicy.use();

        DramaAssociation DramaAssociation = new BroadwayImpl();
        Theatre userDramaAssociation = new Theatre(DramaAssociation);
        userDramaAssociation.use();

        CharityRegulation CharityRegulation = new RedCrossImpl();
        NGO userCharityRegulation = new NGO(CharityRegulation);
        userCharityRegulation.use();

        RailwaySignalSystem RailwaySignalSystem = new ExpressTrainImpl();
        Train userRailwaySignalSystem = new Train(RailwaySignalSystem);
        userRailwaySignalSystem.use();

        BroadcastAuthority BroadcastAuthority = new BbcNewsImpl();
        NewsChannel userBroadcastAuthority = new NewsChannel(BroadcastAuthority);
        userBroadcastAuthority.use();

        Charger Charger = new SamsungChargerImpl();
        MobilePhone userCharger = new MobilePhone(Charger);
        userCharger.use();

        CodingStandard CodingStandard = new TcsDeveloperImpl();
        SoftwareCompany userCodingStandard = new SoftwareCompany(CodingStandard);
        userCodingStandard.use();

        RoadRules RoadRules = new TrafficWardenImpl();
        TrafficPolice userRoadRules = new TrafficPolice(RoadRules);
        userRoadRules.use();

        InventorySystem InventorySystem = new AmazonImpl();
        OnlineStore userInventorySystem = new OnlineStore(InventorySystem);
        userInventorySystem.use();

        Logistics Logistics = new FedExImpl();
        DeliveryService userLogistics = new DeliveryService(Logistics);
        userLogistics.use();

        FareSystem FareSystem = new UberImpl();
        TaxiService userFareSystem = new TaxiService(FareSystem);
        userFareSystem.use();

        FitnessPlan FitnessPlan = new PersonalTrainerImpl();
        Gym userFitnessPlan = new Gym(FitnessPlan);
        userFitnessPlan.use();

        EventPlan EventPlan = new LuxuryWeddingsImpl();
        WeddingPlanner userEventPlan = new WeddingPlanner(EventPlan);
        userEventPlan.use();

        VideoPlatform VideoPlatform = new CreatorImpl();
        YouTube userVideoPlatform = new YouTube(VideoPlatform);
        userVideoPlatform.use();

        StreamingService StreamingService = new SpotifyPodcastImpl();
        PodcastPlatform userStreamingService = new PodcastPlatform(StreamingService);
        userStreamingService.use();

        MarketRegulator MarketRegulator = new NseImpl();
        StockExchange userMarketRegulator = new StockExchange(MarketRegulator);
        userMarketRegulator.use();

        FranchiseAgreement FranchiseAgreement = new McdonaldsFranchiseImpl();
        RestaurantChain userFranchiseAgreement = new RestaurantChain(FranchiseAgreement);
        userFranchiseAgreement.use();

        ClimateMonitoring ClimateMonitoring = new LocalStationImpl();
        WeatherStation userClimateMonitoring = new WeatherStation(ClimateMonitoring);
        userClimateMonitoring.use();

        RecordingSystem RecordingSystem = new SonyMusicImpl();
        MusicStudio userRecordingSystem = new MusicStudio(RecordingSystem);
        userRecordingSystem.use();

        HospitalityService HospitalityService = new TajHotelImpl();
        Hotel userHospitalityService = new Hotel(HospitalityService);
        userHospitalityService.use();

        Firewall Firewall = new NortonFirewallImpl();
        CyberSecurityFirm userFirewall = new CyberSecurityFirm(Firewall);
        userFirewall.use();

        PublishingGuideline PublishingGuideline = new PenguinPublisherImpl();
        BookPublisher userPublishingGuideline = new BookPublisher(PublishingGuideline);
        userPublishingGuideline.use();

        HiringPolicy HiringPolicy = new JobPortalImpl();
        RecruitmentAgency userHiringPolicy = new RecruitmentAgency(HiringPolicy);
        userHiringPolicy.use();

        LicenseAuthority LicenseAuthority = new RtoImpl();
        TransportDepartment userLicenseAuthority = new TransportDepartment(LicenseAuthority);
        userLicenseAuthority.use();

        GameEngine GameEngine = new UnrealEngineImpl();
        GameStudio userGameEngine = new GameStudio(GameEngine);
        userGameEngine.use();

        MarinePolicy MarinePolicy = new DeepBlueImpl();
        OceanResearchTeam userMarinePolicy = new OceanResearchTeam(MarinePolicy);
        userMarinePolicy.use();

        CourseContent CourseContent = new CourseraImpl();
        ElearningPlatform userCourseContent = new ElearningPlatform(CourseContent);
        userCourseContent.use();

        Algorithm Algorithm = new OpenAIModelImpl();
        AICompany userAlgorithm = new AICompany(Algorithm);
        userAlgorithm.use();

        CustomerService CustomerService = new WalmartImpl();
        RetailChain userCustomerService = new RetailChain(CustomerService);
        userCustomerService.use();

        BuildingCode BuildingCode = new LarsenToubroImpl();
        ConstructionCompany userBuildingCode = new ConstructionCompany(BuildingCode);
        userBuildingCode.use();

        EventRegulations EventRegulations = new HoliFestImpl();
        FestivalOrganizer userEventRegulations = new FestivalOrganizer(EventRegulations);
        userEventRegulations.use();

        LaunchProtocol LaunchProtocol = new FalconRocketImpl();
        SpaceX userLaunchProtocol = new SpaceX(LaunchProtocol);
        userLaunchProtocol.use();

    }
}