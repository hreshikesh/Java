package com.xworkz.country.runner;

import com.xworkz.country.dto.*;


import java.util.ArrayList;
import java.util.List;

public class CountryRunner {
    public static void main(String[] args) {


        System.out.println("1.");
        List<Staff> staff = new ArrayList<>();
        staff.add(new Staff("Nisha", "Dsa", new Details("3yrs", 40000, new Education("BE", "SDIT", new University("VTU", 20000, new Chancellor("Praksh", 40, 10))))));
        staff.add(new Staff("Usha", "Ai", new Details("2yrs", 20000, new Education("BCA", "SDMC", new University("VTA", 40000, new Chancellor("Kumar", 45, 5))))));
        staff.add(new Staff("Disha", "Ml", new Details("1yrs", 10000, new Education("BCA", "SDMC", new University("VTA", 40000, new Chancellor("Kumar", 45, 5))))));
        staff.add(new Staff("Ramya", "DBMS", new Details("2.5yrs", 25000, new Education("MCA", "VIT", new University("MI", 45000, new Chancellor("Karuma", 55, 15))))));
        List<Staff> staff1 = new ArrayList<>();
        staff1.add(new Staff("Deepu", "SEO", new Details("5yrs", 50000, new Education("ME", "SIJ", new University("AtMS", 10000, new Chancellor("Rakesh", 45, 10))))));
        staff1.add(new Staff("Sampu", "Accounts", new Details("1yrs", 90000, new Education("CA", "SDM", new University("VIT", 20000, new Chancellor("Swamy", 15, 15))))));
        staff1.add(new Staff("Samarth", "Chemestry", new Details("10yrs", 100000, new Education("MSc", "SMJ", new University("MIT", 400000, new Chancellor("Karuppu", 50, 7))))));
        staff1.add(new Staff("Soumya", "Cse", new Details("2yrs", 25000, new Education("MCA", "VPT", new University("MIP", 45000, new Chancellor("Umavathi", 15, 8))))));
        List<Staff> staff2 = new ArrayList<>();
        staff.add(new Staff("Preethi", "Data Structures", new Details("3.5yrs", 32000, new Education("BTech", "AIT", new University("JNTU", 28000, new Chancellor("Rajendra", 52, 10))))));
        staff.add(new Staff("Niveditha", "Web Dev", new Details("2yrs", 26000,new Education("BSc CS", "Christ College", new University("Mysore University", 23000, new Chancellor("Leela", 47, 8))))));
        List<Staff> staff3 = new ArrayList<>();
        staff1.add(new Staff("Girish", "Cyber Security", new Details("4yrs", 47000, new Education("MTech", "SJBIT", new University("VTU", 50000, new Chancellor("Subramanya", 55, 13))))));
        staff1.add(new Staff("Harshini", "Data Science", new Details("1.5yrs", 29500,new Education("MCA", "Oxford College", new University("BU", 27000, new Chancellor("Yamini", 44, 7))))));
        staff1.add(new Staff("Rohith", "Networking", new Details("2yrs", 31000, new Education("BCA", "MSRIT", new University("RGPV", 25000, new Chancellor("Vishwanath", 50, 9))))));
        List<Staff> staff4= new ArrayList<>();
        staff.add(new Staff("Divya", "AI Fundamentals", new Details("4yrs", 37000, new Education("BE", "RNSIT", new University("Bangalore University", 31000, new Chancellor("Manjunath", 49, 11))))));
        staff.add(new Staff("Shraddha", "Ethical Hacking", new Details("2.5yrs", 29000,new Education("BSc IT", "KLE College", new University("Kuvempu University", 26000, new Chancellor("Revathi", 46, 9))))));
        List<Staff> staff5 = new ArrayList<>();
        staff1.add(new Staff("Rakesh", "Software Testing", new Details("5.5yrs", 54000, new Education("ME", "Dayananda Sagar", new University("VTU", 48000, new Chancellor("Kiran", 53, 12))))));
        staff1.add(new Staff("Anjali", "Operating Systems", new Details("3yrs", 35000,new Education("MSc CS", "Mount Carmel", new University("Christ University", 39000, new Chancellor("Nalini", 42, 10))))));
        staff1.add(new Staff("Sujay", "System Programming", new Details("2yrs", 31500,new Education("BCA", "BMS College", new University("RGUHS", 27000, new Chancellor("Gopal", 48, 7))))));
        List<Staff> staff6 = new ArrayList<>();
        staff6.add(new Staff("Arjun", "Java", new Details("4yrs", 42000, new Education("BE", "RVCE", new University("VTU", 21000, new Chancellor("Shankar", 52, 12))))));
        staff6.add(new Staff("Bhavana", "Python", new Details("2yrs", 28000, new Education("BSc", "PES", new University("BU", 25000, new Chancellor("Maya", 45, 10))))));
        List<Staff> staff7 = new ArrayList<>();
        staff7.add(new Staff("Chandana", "AI", new Details("3yrs", 35000, new Education("MTech", "NIE", new University("VTU", 30000, new Chancellor("Keshav", 54, 11))))));
        staff7.add(new Staff("Dinesh", "DBMS", new Details("1.5yrs", 22000, new Education("MCA", "MSRIT", new University("BU", 24000, new Chancellor("Preethi", 48, 9))))));
        List<Staff> staff8 = new ArrayList<>();
        staff8.add(new Staff("Esha", "HR", new Details("6yrs", 51000, new Education("MBA", "Christ", new University("BU", 23000, new Chancellor("Anitha", 51, 13))))));
        staff8.add(new Staff("Feroz", "Accounts", new Details("4yrs", 45000, new Education("BCom", "JNC", new University("BU", 21000, new Chancellor("Ravi", 49, 10))))));
        List<Staff> staff9 = new ArrayList<>();
        staff9.add(new Staff("Geetha", "Finance", new Details("5yrs", 47000, new Education("MCom", "St. Josephs", new University("BU", 28000, new Chancellor("Meera", 44, 8))))));
        staff9.add(new Staff("Harsha", "Tax", new Details("3yrs", 36000, new Education("CA", "Bangalore Univ", new University("BU", 29000, new Chancellor("Kumar", 50, 7))))));
        List<Staff> staff10 = new ArrayList<>();
        staff10.add(new Staff("Indira", "OS", new Details("2.5yrs", 30000, new Education("MCA", "BIT", new University("BU", 22000, new Chancellor("Rachna", 47, 9))))));
        staff10.add(new Staff("Jeevan", "C++", new Details("2yrs", 27000, new Education("BCA", "NMIT", new University("VTU", 21000, new Chancellor("Suraj", 46, 6))))));
        List<Staff> staff11 = new ArrayList<>();
        staff11.add(new Staff("Karthik", "Cloud", new Details("3yrs", 39000, new Education("BE", "MVIT", new University("VTU", 30000, new Chancellor("Chandru", 55, 10))))));
        staff11.add(new Staff("Lavanya", "DevOps", new Details("2yrs", 31000, new Education("BTech", "REVA", new University("VTU", 27000, new Chancellor("Shanthi", 43, 8))))));
        List<Staff> staff12 = new ArrayList<>();
        staff12.add(new Staff("Ravi", "Circuits", new Details("4yrs", 45000, new Education("BE", "IET", new University("AKTU", 42000, new Chancellor("Alok", 58, 20))))));
        staff12.add(new Staff("Sneha", "Digital", new Details("3.5yrs", 42000, new Education("BTech", "GIT", new University("AKTU", 39000, new Chancellor("Alok", 58, 20))))));
        staff12.add(new Staff("Kavya", "DSP", new Details("2yrs", 38000, new Education("BSc", "MIT", new University("AKTU", 31000, new Chancellor("Alok", 58, 20))))));
        staff12.add(new Staff("Surya", "Logic", new Details("5yrs", 47000, new Education("ME", "IITK", new University("AKTU", 44000, new Chancellor("Alok", 58, 20))))));
        List<Staff> staff13 = new ArrayList<>();
        staff13.add(new Staff("Manu", "AI Core", new Details("6yrs", 51000, new Education("MCA", "Amity", new University("AMU", 61000, new Chancellor("Neha", 50, 15))))));
        staff13.add(new Staff("Amit", "ML Apps", new Details("3yrs", 43000, new Education("MSc", "SMIT", new University("AMU", 58000, new Chancellor("Neha", 50, 15))))));
        staff13.add(new Staff("Zoya", "Vision", new Details("4.5yrs", 46000, new Education("BTech", "IMS", new University("AMU", 60000, new Chancellor("Neha", 50, 15))))));
        staff13.add(new Staff("Tarun", "NLP", new Details("2yrs", 39000, new Education("BE", "ITM", new University("AMU", 55000, new Chancellor("Neha", 50, 15))))));
        List<Staff> staff14 = new ArrayList<>();
        staff14.add(new Staff("Deepa", "Design", new Details("3yrs", 40000, new Education("BFA", "LU", new University("LUU", 30000, new Chancellor("Ravi", 52, 12))))));
        staff14.add(new Staff("Megha", "Art Lab", new Details("2.5yrs", 37000, new Education("MFA", "BHU", new University("LUU", 32000, new Chancellor("Ravi", 52, 12))))));
        staff14.add(new Staff("Nikhil", "UI", new Details("4yrs", 41000, new Education("BCA", "IGNOU", new University("LUU", 34000, new Chancellor("Ravi", 52, 12))))));
        staff14.add(new Staff("Rashmi", "UX", new Details("5yrs", 45000, new Education("BA", "DU", new University("LUU", 35000, new Chancellor("Ravi", 52, 12))))));
        List<Staff> staff15 = new ArrayList<>();
        staff15.add(new Staff("Karan", "Fluid Mech", new Details("6yrs", 52000, new Education("BE", "KIT", new University("IITK", 70000, new Chancellor("Jaya", 60, 25))))));
        staff15.add(new Staff("Simran", "Thermal", new Details("4yrs", 47000, new Education("ME", "NIET", new University("IITK", 69000, new Chancellor("Jaya", 60, 25))))));
        staff15.add(new Staff("Harsh", "AutoCAD", new Details("3yrs", 43000, new Education("Diploma", "UPTU", new University("IITK", 66000, new Chancellor("Jaya", 60, 25))))));
        staff15.add(new Staff("Divya", "Mech Tools", new Details("5yrs", 48000, new Education("BE", "JNTU", new University("IITK", 71000, new Chancellor("Jaya", 60, 25))))));
        List<Staff> staff16 = new ArrayList<>();
        staff16.add(new Staff("Rekha", "Pharma", new Details("4yrs", 44000, new Education("BPharm", "SMS", new University("HNU", 50000, new Chancellor("Shaam", 53, 18))))));
        staff16.add(new Staff("Pradeep", "Biochem", new Details("3yrs", 41000, new Education("BSc", "IMS", new University("HNU", 47000, new Chancellor("Shaam", 53, 18))))));
        staff16.add(new Staff("Arun", "Microbio", new Details("5yrs", 47000, new Education("MSc", "LU", new University("HNU", 49000, new Chancellor("Shaam", 53, 18))))));
        staff16.add(new Staff("Jyoti", "Med Research", new Details("2.5yrs", 39000, new Education("BPharm", "BHU", new University("HNU", 46000, new Chancellor("Shaam", 53, 18))))));
        List<Staff> staff17 = new ArrayList<>();
        staff17.add(new Staff("Bhavya", "Civ Law", new Details("4.5yrs", 43000, new Education("LLB", "IIL", new University("BLU", 48000, new Chancellor("Preet", 57, 16))))));
        staff17.add(new Staff("Sahil", "Crim Law", new Details("3yrs", 40000, new Education("BA", "SMIT", new University("BLU", 45000, new Chancellor("Preet", 57, 16))))));
        staff17.add(new Staff("Anu", "Admin Law", new Details("6yrs", 46000, new Education("LLM", "RIL", new University("BLU", 49000, new Chancellor("Preet", 57, 16))))));
        staff17.add(new Staff("Farhan", "Comp Law", new Details("2yrs", 37000, new Education("LLB", "IIL", new University("BLU", 47000, new Chancellor("Preet", 57, 16))))));


        HeadOfDepartment headOfDepartment = new HeadOfDepartment("Anand", 55, staff);
        HeadOfDepartment headOfDepartment1 = new HeadOfDepartment("Sandeep", 35, staff1);
        HeadOfDepartment headOfDepartment2 = new HeadOfDepartment("Sudhakar", 53, staff2);
        HeadOfDepartment headOfDepartment3 = new HeadOfDepartment("Lakshmi", 40, staff3);
        HeadOfDepartment headOfDepartment4 = new HeadOfDepartment("Sharath", 50, staff4);
        HeadOfDepartment headOfDepartment5 = new HeadOfDepartment("Rekha", 38, staff5);
        HeadOfDepartment headOfDepartment6 = new HeadOfDepartment("Suresh", 53, staff6);
        HeadOfDepartment headOfDepartment7 = new HeadOfDepartment("Meenakshi", 45, staff7);
        HeadOfDepartment headOfDepartment8 = new HeadOfDepartment("Rajeev", 50, staff8);
        HeadOfDepartment headOfDepartment9 = new HeadOfDepartment("Divya", 38, staff9);
        HeadOfDepartment headOfDepartment10 = new HeadOfDepartment("Nandini", 42, staff10);
        HeadOfDepartment headOfDepartment11 = new HeadOfDepartment("Vinay", 40, staff11);
        HeadOfDepartment headOfDepartment12 = new HeadOfDepartment("Ramesh", 50, staff12);
        HeadOfDepartment headOfDepartment13 = new HeadOfDepartment("Namita", 45, staff13);
        HeadOfDepartment headOfDepartment14 = new HeadOfDepartment("Krish", 48, staff14);
        HeadOfDepartment headOfDepartment15 = new HeadOfDepartment("Sweta", 43, staff15);
        HeadOfDepartment headOfDepartment16 = new HeadOfDepartment("Rajiv", 52, staff16);
        HeadOfDepartment headOfDepartment17 = new HeadOfDepartment("Vidya", 46, staff17);

        Department department = new Department("CSE", 3, headOfDepartment);
        Department department1 = new Department("ISE", 2, headOfDepartment1);
        Department department2 = new Department("ECE", 2, headOfDepartment2);
        Department department3 = new Department("AIML", 3, headOfDepartment3);
        Department department4 = new Department("Cyber Security", 2, headOfDepartment4);
        Department department5 = new Department("Computer Science", 3, headOfDepartment5);
        Department department6 = new Department("IT", 3, headOfDepartment6);
        Department department7 = new Department("Technology", 2, headOfDepartment7);
        Department department8 = new Department("Commerce", 2, headOfDepartment8);
        Department department9 = new Department("Accounts", 3, headOfDepartment9);
        Department department10 = new Department("Software Systems", 2, headOfDepartment10);
        Department department11 = new Department("DevOps", 3, headOfDepartment11);
        Department department12 = new Department("Electronics", 3, headOfDepartment12);
        Department department13 = new Department("AI", 4, headOfDepartment13);
        Department department14 = new Department("Design", 2, headOfDepartment14);
        Department department15 = new Department("Mechanical", 3, headOfDepartment15);
        Department department16 = new Department("Medical", 5, headOfDepartment16);
        Department department17 = new Department("Law", 2, headOfDepartment17);


        List<Portfolio> portfolios = new ArrayList<>();
        portfolios.add(new Portfolio("CM", 3, department));
        portfolios.add(new Portfolio("Education minister", 1, department1));
        List<Portfolio> portfolios1 = new ArrayList<>();
        portfolios1.add(new Portfolio("DCM", 1, department2));
        portfolios1.add(new Portfolio("Education minister", 2, department3));
        List<Portfolio> portfolios2 = new ArrayList<>();
        portfolios1.add(new Portfolio("AffiarsMinister", 1, department4));
        portfolios1.add(new Portfolio("Singing minister", 1, department5));
        List<Portfolio> portfolio3 = new ArrayList<>();
        portfolio3.add(new Portfolio("CM", 2, department6));
        portfolio3.add(new Portfolio("IT Minister", 1, department7));
        List<Portfolio> portfolio4 = new ArrayList<>();
        portfolio4.add(new Portfolio("Health Minister", 2, department8));
        portfolio4.add(new Portfolio("Transport Minister", 1, department9));
        List<Portfolio> portfolio5 = new ArrayList<>();
        portfolio5.add(new Portfolio("Sports Minister", 1, department10));
        portfolio5.add(new Portfolio("Home Minister", 2, department11));
        List<Portfolio> portfolios3 = new ArrayList<>();
        portfolios3.add(new Portfolio("Tech & Digital", 7, department12));
        portfolios3.add(new Portfolio("AI & Research", 5, department13));
        List<Portfolio> portfolios4 = new ArrayList<>();
        portfolios4.add(new Portfolio("Art & Design", 4, department14));
        portfolios4.add(new Portfolio("Engineering", 6, department15));
        List<Portfolio> portfolios5 = new ArrayList<>();
        portfolios5.add(new Portfolio("Health & Biotech", 8, department16));
        portfolios5.add(new Portfolio("Legal Affairs", 3, department17));

        List<Minister> ministers = new ArrayList<>();
        ministers.add(new Minister("Pinarayi", "LDF", portfolios));
        ministers.add(new Minister("Sooraj", "MDF", portfolios1));
        ministers.add(new Minister("Ranu Mandal", "Congress", portfolios2));
        List<Minister> ministers1 = new ArrayList<>();
        ministers1.add(new Minister("Basavaraj", "BJP", portfolio3));
        ministers1.add(new Minister("Sowmya Reddy", "Congress", portfolio4));
        ministers1.add(new Minister("Yash", "Independent", portfolio5));
        Minister minister = new Minister("Dev", "Tech", portfolios3);
        Minister minister1 = new Minister("Sheela", "Edu", portfolios4);
        Minister minister2 = new Minister("Vik", "Law", portfolios5);
        List<Minister> ministers2 = new ArrayList<>();
        ministers2.add(minister);
        ministers2.add(minister1);
        ministers2.add(minister2);

        List<State> states = new ArrayList<>();
        states.add(new State("Kerala", 671372, ministers));
        states.add(new State("Karnataka", 973142, ministers1));
        states.add(new State("Uttar Pradesh", 8799451, ministers2));

        Country country = new Country("India", 40, states);


    }
}
