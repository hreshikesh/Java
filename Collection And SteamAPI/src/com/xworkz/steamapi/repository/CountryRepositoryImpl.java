package com.xworkz.steamapi.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class CountryRepositoryImpl implements CountryRepository<String> {
    @Override
    public Collection<String> findBy() {
        Collection<String> countryCollection =new ArrayList<>(Arrays.asList(
                "Maldives", "Bolivia", "Australia", "Norway", "Zambia", "Kazakhstan", "Algeria", "Myanmar",
                "Italy", "Guatemala", "Tuvalu", "Cameroon", "Qatar", "Finland", "Iraq", "Belize", "Botswana",
                "North Korea", "Lebanon", "Sri Lanka", "Colombia", "Dominica", "France", "Oman",
                "Czech Republic", "Tanzania", "Uzbekistan", "Canada", "Croatia", "San Marino", "Brunei",
                "Micronesia", "Togo", "Palestine", "Vanuatu", "Japan", "Ghana", "Antigua and Barbuda",
                "Turkey", "Cuba", "Kenya", "Luxembourg", "United Arab Emirates", "Bahrain", "Jamaica", "Russia",
                "Hungary", "Gambia", "Saint Vincent and the Grenadines", "Germany", "Saint Lucia",
                "Papua New Guinea", "Cyprus", "Nepal", "Syria", "Ireland", "Gabon", "Poland", "Namibia",
                "Serbia", "Paraguay", "South Korea", "Slovakia", "Solomon Islands", "Argentina", "Lesotho",
                "Moldova", "Thailand", "Ukraine", "Morocco", "Panama", "Nigeria", "Seychelles", "Ethiopia",
                "Monaco", "Eswatini", "Chile", "Sierra Leone", "Latvia", "Andorra", "Eritrea", "Angola", "Haiti",
                "Singapore", "Libya", "Belgium", "Bhutan", "Saint Kitts and Nevis", "Armenia", "China", "Peru",
                "Venezuela", "South Sudan", "Kosovo", "Saudi Arabia", "Iceland", "Malawi", "El Salvador",
                "Georgia", "Indonesia", "Tunisia", "Grenada", "Madagascar", "Iran", "Marshall Islands",
                "Ecuador", "Montenegro", "Central African Republic", "Denmark", "Israel", "Somalia",
                "Timor-Leste", "Portugal", "Niger", "Mauritania", "Mozambique", "Barbados", "Pakistan",
                "South Africa", "Equatorial Guinea", "Bosnia and Herzegovina", "Fiji", "Vietnam", "Philippines",
                "United Kingdom", "Malta", "Rwanda", "Estonia", "Mali", "Turkmenistan", "Uruguay", "Sudan",
                "Democratic Republic of the Congo", "Switzerland", "Kuwait", "Chad", "Mongolia", "Nicaragua",
                "Azerbaijan", "Albania", "Romania", "Bulgaria", "New Zealand", "Slovenia", "Kyrgyzstan",
                "Malaysia", "Lithuania", "Benin", "Dominican Republic", "Costa Rica", "Vatican City",
                "North Macedonia", "Guinea", "Guyana", "Yemen", "Jordan", "Laos", "Honduras", "Burkina Faso",
                "Bangladesh", "Liechtenstein", "Cape Verde", "Côte d’Ivoire", "Suriname", "Comoros",
                "Sao Tome and Principe", "Republic of the Congo", "Afghanistan", "Mauritius", "Netherlands",
                "Trinidad and Tobago", "Zimbabwe", "Liberia", "Sweden", "Austria", "Spain", "Greece","malayalam"
        ));





        return countryCollection;

    }
}
