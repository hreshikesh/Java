package com.xworkz.collection.ComparatorComparable.StringCompare.Runner;

import com.xworkz.collection.ComparatorComparable.StringCompare.dto.PantDto;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class PantRunner {
    public static void main(String[] args) {

        Comparator<PantDto> pantPriceComparator = (o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice());

        Comparator<PantDto> pantAscending = (o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice());
        Comparator<PantDto> pantDescending = (o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice());

        Comparator<PantDto> pantBrandComparator = (o1, o2) -> o1.getPantBrand().compareTo(o2.getPantBrand());

        Comparator<PantDto> pantNEComparator = Comparator
                .comparing(PantDto::getPantName)
                .thenComparing(PantDto::getPantEmail);

        Comparator<PantDto> pantPNComparator = Comparator
                .comparing(PantDto::getPhone)
                .thenComparing(PantDto::getPantName);

        Comparator<PantDto> pantDateComparator = Comparator
                .comparing(PantDto::getLocalDateTime);

        Comparator<PantDto> pantDomainComparator = Comparator
                .comparing(PantDto::getPantEmail);


        PantDto pant1 = new PantDto("Levis", "Slim Fit Blue", 2499, "support@levis.com", "9845012345", LocalDateTime.of(2025, 1, 10, 11, 0));
        PantDto pant2 = new PantDto("Wrangler", "Denim Black", 1999, "help@wrangler.com", "9845112233", LocalDateTime.of(2025, 1, 15, 14, 30));
        PantDto pant3 = new PantDto("Pepe Jeans", "Regular Grey", 1890, "care@pepejeans.com", "9845223344", LocalDateTime.of(2025, 1, 20, 10, 15));
        PantDto pant4 = new PantDto("Peter England", "Formal Navy", 2090, "info@peterengland.com", "9845334455", LocalDateTime.of(2025, 1, 25, 16, 45));
        PantDto pant5 = new PantDto("Mufti", "Cotton Cargo", 1799, "mufti@style.com", "9845445566", LocalDateTime.of(2025, 2, 1, 9, 30));

        PantDto pant6 = new PantDto("Blackberrys", "Tapered Olive", 2290, "contact@blackberrys.com", "9845556677", LocalDateTime.of(2025, 2, 5, 13, 50));
        PantDto pant7 = new PantDto("Van Heusen", "Stretch Fit Beige", 2699, "support@vanheusen.com", "9845667788", LocalDateTime.of(2025, 2, 10, 15, 10));
        PantDto pant8 = new PantDto("Allen Solly", "Chino Brown", 2199, "allen@solly.com", "9845778899", LocalDateTime.of(2025, 2, 15, 12, 20));
        PantDto pant9 = new PantDto("Zara", "Slim Formal Grey", 2799, "zara@support.com", "9845889900", LocalDateTime.of(2025, 2, 20, 11, 40));
        PantDto pant10 = new PantDto("Raymond", "Linen Cream", 2990, "raymond@brand.com", "9845990011", LocalDateTime.of(2025, 2, 25, 17, 0));

        PantDto pant11 = new PantDto("Gap", "Relaxed Fit Blue", 2390, "gap@care.com", "9846001122", LocalDateTime.of(2025, 3, 1, 10, 15));
        PantDto pant12 = new PantDto("Jack & Jones", "Jogger Khaki", 2099, "jack@jones.com", "9846112233", LocalDateTime.of(2025, 3, 5, 12, 45));
        PantDto pant13 = new PantDto("Louis Philippe", "Formal Black", 3199, "lp@support.com", "9846223344", LocalDateTime.of(2025, 3, 10, 9, 10));
        PantDto pant14 = new PantDto("Roadster", "Casual Green", 1590, "roadster@wear.com", "9846334455", LocalDateTime.of(2025, 3, 15, 14, 35));
        PantDto pant15 = new PantDto("HRX", "Activewear Grey", 1899, "support@hrx.com", "9846445566", LocalDateTime.of(2025, 3, 20, 16, 25));

        PantDto pant16 = new PantDto("Uniqlo", "Ankle Fit Black", 2599, "info@uniqlo.com", "9846556677", LocalDateTime.of(2025, 3, 25, 13, 0));
        PantDto pant17 = new PantDto("H&M", "Loose Fit Blue", 1990, "hm@brand.com", "9846667788", LocalDateTime.of(2025, 3, 30, 11, 30));
        PantDto pant18 = new PantDto("Flying Machine", "Tapered Light Blue", 1790, "flying@machine.com", "9846778899", LocalDateTime.of(2025, 4, 5, 15, 15));
        PantDto pant19 = new PantDto("Tommy Hilfiger", "Business Slim Black", 3290, "tommy@hilfiger.com", "9846889900", LocalDateTime.of(2025, 4, 10, 10, 5));
        PantDto pant20 = new PantDto("U.S. Polo", "Smart Fit Khaki", 2499, "uspolo@brand.com", "9846990011", LocalDateTime.of(2025, 4, 15, 14, 55));


        List<PantDto> pantDtos= Stream.of(pant1,pant2,pant3,pant4,pant5,pant6,pant7,pant8,pant9,pant10,pant11,pant12,pant13,pant14,pant15,pant16,pant17,pant18,pant19,pant20).collect(Collectors.toList());

        out.println("1.Sort By Integer");
        pantDtos.stream().sorted(pantPriceComparator).forEach(out::println);
        out.println("2.asc and descnding");
        out.println("Asc");
        pantDtos.stream().sorted(pantAscending).forEach(out::println);
        out.println("Dsc");
        pantDtos.stream().sorted(pantDescending).forEach(out::println);

        out.println("3.Sort by String");
        pantDtos.stream().sorted(pantBrandComparator).forEach(out::println);

        out.println("3.Sort by name and email");
        pantDtos.stream().sorted(pantNEComparator).forEach(out::println);

        out.println("4.sort by ph and name");
        pantDtos.stream().sorted(pantPNComparator).forEach(out::println);


        out.println("5.sort by date");
        pantDtos.stream().sorted(pantDateComparator).forEach(out::println);

        out.println("6.sort by domain");
        pantDtos.stream().filter(domain->domain.getPantEmail().contains("@")).sorted(pantDomainComparator).forEach(out::println);



    }
}
