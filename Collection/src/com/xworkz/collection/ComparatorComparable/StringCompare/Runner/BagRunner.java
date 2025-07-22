package com.xworkz.collection.ComparatorComparable.StringCompare.Runner;

import com.xworkz.collection.ComparatorComparable.StringCompare.dto.BagDto;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDateTime;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class BagRunner {
    public static void main(String[] args) {
        Comparator<BagDto> bagPriceComparator=((o1,o2)->Integer.compare(o1.getBagPrice(), o2.getBagPrice()));

        Comparator<BagDto> bagAscending=((o1,o2)->Integer.compare(o1.getBagPrice(), o2.getBagPrice()));
        Comparator<BagDto> bagDescending=((o1,o2)->Integer.compare(o2.getBagPrice(), o1.getBagPrice()));


        Comparator<BagDto> bagBrandComparator=(o1,o2)->o1.getBagBrand().compareTo(o2.getBagBrand());

        Comparator<BagDto> bagNEComparator= Comparator.comparing(BagDto::getBagName).thenComparing(BagDto::getBarndEmail);

        Comparator<BagDto> bagPNComparator= Comparator.comparing(BagDto::getBrandPhone).thenComparing(BagDto::getBagName);

        Comparator<BagDto> bagdateComparator=Comparator.comparing(BagDto::getLocalDateTime);

        Comparator<BagDto> bagDomainComparator=Comparator.comparing(BagDto::getBarndEmail);



        BagDto bag1 = new BagDto("Classic Backpack", "Wildcraft", 1599, "support@wildcraft.com", 9845012345L, LocalDateTime.now());
        BagDto bag2 = new BagDto("Urban Hiker", "American Tourister", 2499, "care@amtourister.com", 9988776655L, LocalDateTime.now());
        BagDto bag3 = new BagDto("School Bag Pro", "Skybags", 1890, "contact@skybags.com", 9876543210L, LocalDateTime.now());
        BagDto bag4 = new BagDto("Office Sleek", "Samsonite", 4799, "info@samsonite.com", 9123456780L, LocalDateTime.now());
        BagDto bag22 = new BagDto("Office Sleek", "Samsonite", 4799, "infoyahoo.com", 9123456770L, LocalDateTime.now());
        BagDto bag5 = new BagDto("Laptop Carrier", "HP", 3299, "help@hpbrand.com", 9008007006L, LocalDateTime.now());
        BagDto bag21 = new BagDto("Rugged Trail", "North Face", 5199, "northface@google.com", 9876665545L, LocalDateTime.of(2025, 6, 2, 15, 55));

        BagDto bag6 = new BagDto("Trekking Beast", "Decathlon", 3999, "query@decathlon.com", 9988001122L, LocalDateTime.of(2025, 4, 20, 8, 20));
        BagDto bag7 = new BagDto("Traveller Pro", "Safari", 2899, "hello@safaribags.com", 8080808080L, LocalDateTime.of(2025, 5, 1, 12, 10));
        BagDto bag8 = new BagDto("College Companion", "Gear", 1799, "gearcaregmail.com", 9345678901L, LocalDateTime.of(2025, 5, 9, 13, 30));
        BagDto bag9 = new BagDto("Messenger Lite", "Timbuk2", 2599, "customercare@timbuk2.com", 9123445678L, LocalDateTime.of(2025, 5, 15, 9, 45));
        BagDto bag10 = new BagDto("Casual Zip", "F Gear", 1499, "info@fgear.com", 9888777665L, LocalDateTime.of(2025, 5, 19, 17, 20));

        BagDto bag11 = new BagDto("Rugged Trail", "North Face", 5199, "northface@support.com", 9876665544L, LocalDateTime.of(2025, 6, 2, 15, 55));
        BagDto bag12 = new BagDto("Lightweight Pack", "Quechua", 1999, "care@quechua.in", 9812345670L, LocalDateTime.of(2025, 6, 8, 10, 5));
        BagDto bag13 = new BagDto("Biker Sling", "HRX", 1290, "team@hrxbrand.com", 9023456701L, LocalDateTime.of(2025, 6, 12, 18, 25));
        BagDto bag14 = new BagDto("Daily Commute", "Adidas", 2290, "support@adidas.in", 9870098765L, LocalDateTime.of(2025, 6, 15, 14, 40));
        BagDto bag15 = new BagDto("Tech Organizer", "Nike", 3090, "help@nikebags.com", 8765432109L, LocalDateTime.of(2025, 6, 18, 13, 10));

        BagDto bag16 = new BagDto("Military Duffel", "Puma", 2590, "service@puma.com", 9345612345L, LocalDateTime.of(2025, 6, 22, 11, 35));
        BagDto bag17 = new BagDto("Minimalist Tote", "Lavie", 1490, "laviecare@gmail.com", 8901234567L, LocalDateTime.of(2025, 6, 25, 16, 5));
        BagDto bag18 = new BagDto("Kids Cartoon", "Disney", 1299, "support@disneybags.com", 9988776650L, LocalDateTime.of(2025, 6, 28, 9, 50));
        BagDto bag19 = new BagDto("Adventure Series", "Arctic Fox", 3499, "connect@arcticfox.com", 9801234567L, LocalDateTime.of(2025, 7, 1, 13, 15));
        BagDto bag20 = new BagDto("Smart Rollers", "VIP", 4699, "vipservice@vipbags.com", 9012345678L, LocalDateTime.of(2025, 7, 20, 15, 45));

        List<BagDto> bagDtoList=Stream.of(bag1,bag2,bag3,bag4,bag5,bag6,bag7,bag8,bag9,bag10,bag11,bag12,bag13,bag14,bag15,bag16,bag17,bag18,bag19,bag20,bag21,bag22).collect(Collectors.toList());


        out.println("1.Sort By Integer");
        bagDtoList.stream().sorted(bagPriceComparator).forEach(out::println);
        out.println("2.asc and descnding");
        out.println("Asc");
        bagDtoList.stream().sorted(bagAscending).forEach(out::println);
        out.println("Dsc");
        bagDtoList.stream().sorted(bagDescending).forEach(out::println);

        out.println("3.Sort by String");
        bagDtoList.stream().sorted(bagBrandComparator).forEach(out::println);

        out.println("3.Sort by name and email");
        bagDtoList.stream().sorted(bagNEComparator).forEach(out::println);

        out.println("4.sort by ph and name");
        bagDtoList.stream().sorted(bagPNComparator).forEach(out::println);


        out.println("5.sort by date");
        bagDtoList.stream().sorted(bagdateComparator).forEach(out::println);

        out.println("6.sort by domain");
        bagDtoList.stream().filter(domain->domain.getBarndEmail().contains("@")).sorted(bagDomainComparator).forEach(out::println);







    }

















}
