class Flag {
    String country;     
    String color;       
    String continent;   
    int population;    

    public static void main(String args[]) {
        Flag flag1 = new Flag();
        flag1.country = "India";
        flag1.color = "Saffron, White, Green";
        flag1.continent = "Asia";
        flag1.population = 340; 
        System.out.println("Country: " + flag1.country + "Colors: " + flag1.color + "Continent: " + flag1.continent + "Population  " + flag1.population);

        Flag flag2 = new Flag();
        flag2.country = "United States";
        flag2.color = "Red, White, Blue";
        flag2.continent = "North America";
        flag2.population = 327;
        System.out.println("Country: " + flag2.country + ", Colors: " + flag2.color + ", Continent: " + flag2.continent + ", Population  : " + flag2.population);

        Flag flag3 = new Flag();
        flag3.country = "Japan";
        flag3.color = "Red, White";
        flag3.continent = "Asia";
        flag3.population = 126;
        System.out.println("Country: " + flag3.country + ", Colors: " + flag3.color + ", Continent: " + flag3.continent + ", Population  : " + flag3.population);

        Flag flag4 = new Flag();
        flag4.country = "Brazil";
        flag4.color = "Green, Yellow, Blue, White";
        flag4.continent = "South America";
        flag4.population = 209;
        System.out.println("Country: " + flag4.country + ", Colors: " + flag4.color + ", Continent: " + flag4.continent + ", Population  : " + flag4.population);

        Flag flag5 = new Flag();
        flag5.country = "South Africa";
        flag5.color = "Black, Green, Yellow, Red, Blue, White";
        flag5.continent = "Africa";
        flag5.population = 57;
        System.out.println("Country: " + flag5.country + ", Colors: " + flag5.color + ", Continent: " + flag5.continent + ", Population  : " + flag5.population);

        Flag flag6 = new Flag();
        flag6.country = "United Kingdom";
        flag6.color = "Red, White, Blue";
        flag6.continent = "Europe";
        flag6.population = 45;
        System.out.println("Country: " + flag6.country + ", Colors: " + flag6.color + ", Continent: " + flag6.continent + ", Population  : " + flag6.population);

        Flag flag7 = new Flag();
        flag7.country = "China";
        flag7.color = "Red, Yellow";
        flag7.continent = "Asia";
        flag7.population = 540;
        System.out.println("Country: " + flag7.country + ", Colors: " + flag7.color + ", Continent: " + flag7.continent + ", Population  : " + flag7.population);

        Flag flag8 = new Flag();
        flag8.country = "Australia";
        flag8.color = "Red, White, Blue";
        flag8.continent = "Oceania";
        flag8.population = 7;
        System.out.println("Country: " + flag8.country + ", Colors: " + flag8.color + ", Continent: " + flag8.continent + ", Population  : " + flag8.population);

        Flag flag9 = new Flag();
        flag9.country = "Canada";
        flag9.color = "Red, White";
        flag9.continent = "North America";
        flag9.population = 20;
        System.out.println("Country: " + flag9.country + ", Colors: " + flag9.color + ", Continent: " + flag9.continent + ", Population  : " + flag9.population);

        Flag flag10 = new Flag();
        flag10.country = "Russia";
        flag10.color = "White, Blue, Red";
        flag10.continent = "Europe/Asia";
        flag10.population = 144;
        System.out.println("Country: " + flag10.country + ", Colors: " + flag10.color + ", Continent: " + flag10.continent + ", Population  : " + flag10.population);
    }
}
