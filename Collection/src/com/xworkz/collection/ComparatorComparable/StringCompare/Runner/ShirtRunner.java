package com.xworkz.collection.ComparatorComparable.StringCompare.Runner;



import com.xworkz.collection.ComparatorComparable.StringCompare.dto.ShirtDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class ShirtRunner {
    public static void main(String[] args) {
        Comparator<ShirtDto> shirtPriceComparator=((o1, o2)->Integer.compare(o1.getPrice(), o2.getPrice()));

        Comparator<ShirtDto> shirtAscending=((o1,o2)->Integer.compare(o1.getPrice(), o2.getPrice()));
        Comparator<ShirtDto> shirtDescending=((o1,o2)->Integer.compare(o2.getPrice(), o1.getPrice()));


        Comparator<ShirtDto> shirtBrandComparator=(o1,o2)->o1.getShirtBarnd().compareTo(o2.getShirtBarnd());

        Comparator<ShirtDto> shirtNEComparator= Comparator.comparing(ShirtDto::getShirtName).thenComparing(ShirtDto::getBrandEmail);

        Comparator<ShirtDto> shirtPNComparator= Comparator.comparing(ShirtDto::getPhone).thenComparing(ShirtDto::getShirtName);

        Comparator<ShirtDto> shirtdateComparator=Comparator.comparing(ShirtDto::getLocalDateTime);

        Comparator<ShirtDto> shirtDomainComparator=Comparator.comparing(ShirtDto::getBrandEmail);




        ShirtDto shirt1 = new ShirtDto("Formal White", "Van Heusen", "support@vanheusen.com", 1899, 9845001122L, LocalDateTime.of(2025, 1, 12, 10, 30));
        ShirtDto shirt2 = new ShirtDto("Casual Blue", "Levis", "info@levis.in", 1299, 9845112233L, LocalDateTime.of(2025, 2, 15, 11, 15));
        ShirtDto shirt3 = new ShirtDto("Slim Fit Black", "Peter England", "contact@peterengland.com", 1490, 9845223344L, LocalDateTime.of(2025, 3, 1, 9, 45));
        ShirtDto shirt4 = new ShirtDto("Striped Grey", "Zara", "care@zara.com", 2299, 9845334455L, LocalDateTime.of(2025, 3, 22, 13, 5));
        ShirtDto shirt5 = new ShirtDto("Denim Shirt", "Wrangler", "help@wrangler.com", 1990, 9845445566L, LocalDateTime.of(2025, 4, 5, 16, 20));

        ShirtDto shirt6 = new ShirtDto("Half Sleeve Red", "Allen Solly", "support@allensolly.com", 1399, 9845556677L, LocalDateTime.of(2025, 4, 18, 10, 0));
        ShirtDto shirt7 = new ShirtDto("Printed Beach", "H&M", "service@hm.com", 1590, 9845667788L, LocalDateTime.of(2025, 5, 2, 15, 10));
        ShirtDto shirt8 = new ShirtDto("Oxford Blue", "Gap", "info@gap.com", 1890, 9845778899L, LocalDateTime.of(2025, 5, 12, 11, 25));
        ShirtDto shirt9 = new ShirtDto("Linen Comfort", "FabIndia", "fab@india.com", 2099, 9845889900L, LocalDateTime.of(2025, 5, 24, 14, 40));
        ShirtDto shirt10 = new ShirtDto("Checked Shirt", "Mufti", "care@mufti.com", 1790, 9845990011L, LocalDateTime.of(2025, 6, 1, 12, 50));

        ShirtDto shirt11 = new ShirtDto("Mandarin Collar", "Roadster", "support@roadster.in", 1290, 9846001122L, LocalDateTime.of(2025, 6, 6, 9, 30));
        ShirtDto shirt12 = new ShirtDto("Classic Cotton", "Marks & Spencer", "mns@support.com", 2490, 9846112233L, LocalDateTime.of(2025, 6, 10, 13, 45));
        ShirtDto shirt13 = new ShirtDto("Party Shine", "Zodiac", "shine@zodiac.com", 2299, 9846223344L, LocalDateTime.of(2025, 6, 14, 17, 0));
        ShirtDto shirt14 = new ShirtDto("Khadi Weave", "Raymond", "support@raymond.in", 2690, 9846334455L, LocalDateTime.of(2025, 6, 18, 8, 15));
        ShirtDto shirt15 = new ShirtDto("Soft Stretch", "Uniqlo", "info@uniqlo.com", 1999, 9846445566L, LocalDateTime.of(2025, 6, 21, 12, 35));
        ShirtDto shirt21 = new ShirtDto("Soft Stretch", "Uniqlo", "infogoogle.com", 1999, 9846445576L, LocalDateTime.of(2025, 6, 21, 12, 35));
        ShirtDto shirt16 = new ShirtDto("Navy Polka", "Tommy Hilfiger", "th@brands.com", 2899, 9846556677L, LocalDateTime.of(2025, 6, 25, 16, 45));
        ShirtDto shirt17 = new ShirtDto("Flannel Green", "Forever 21", "care@f21.com", 1590, 9846667788L, LocalDateTime.of(2025, 6, 28, 10, 55));
        ShirtDto shirt18 = new ShirtDto("Bold Stripes", "Calvin Klein", "ck@support.com", 3199, 9846778899L, LocalDateTime.of(2025, 7, 1, 14, 20));
        ShirtDto shirt19 = new ShirtDto("Casual Grey", "Jack & Jones", "jack@jones.com", 1490, 9846889900L, LocalDateTime.of(2025, 7, 4, 11, 10));
        ShirtDto shirt20 = new ShirtDto("Ethnic Kurta", "Manyavar", "ethnic@manyavar.com", 1890, 9846990011L, LocalDateTime.of(2025, 7, 7, 9, 0));

        List<ShirtDto> shirtDtoList= Stream.of(shirt1,shirt2,shirt3,shirt4,shirt5,shirt6,shirt7,shirt8,shirt9,shirt10,shirt11,shirt12,shirt13,shirt14,shirt15,shirt16,shirt17,shirt18,shirt19,shirt20,shirt21).collect(Collectors.toList());


        out.println("1.Sort By Integer");
        shirtDtoList.stream().sorted(shirtPriceComparator).forEach(out::println);
        out.println("2.asc and descnding");
        out.println("Asc");
        shirtDtoList.stream().sorted(shirtAscending).forEach(out::println);
        out.println("Dsc");
        shirtDtoList.stream().sorted(shirtDescending).forEach(out::println);

        out.println("3.Sort by String");
        shirtDtoList.stream().sorted(shirtBrandComparator).forEach(out::println);

        out.println("3.Sort by name and email");
        shirtDtoList.stream().sorted(shirtNEComparator).forEach(out::println);

        out.println("4.sort by ph and name");
        shirtDtoList.stream().sorted(shirtPNComparator).forEach(out::println);


        out.println("5.sort by date");
        shirtDtoList.stream().sorted(shirtdateComparator).forEach(out::println);

        out.println("6.sort by domain");
        shirtDtoList.stream().filter(domain->domain.getBrandEmail().contains("@")).sorted(shirtDomainComparator).forEach(out::println);







    }
}
