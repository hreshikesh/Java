package com.xworkz.streamapi.repository;

import com.xworkz.streamapi.dto.CountryDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CountryRepositoryImpl implements CountryRepository<CountryDTO>{
    @Override
    public Collection<CountryDTO> countryFetch() {
        CountryDTO country1 = new CountryDTO("India", 240805, 1093, 18, 10318709, "Modi", "English", "Portuguese", "2.6 trillion USD");
        CountryDTO country2 = new CountryDTO("United States", 977452, 71, 20, 16724081, "Maria Silva", "French", "English", "3.5 trillion USD");
        CountryDTO country3 = new CountryDTO("China", 584510, 1295, 7, 12756140, "Ivan Petrov", "French", "Swahili", "8.4 trillion USD");
        CountryDTO country4 = new CountryDTO("Japan", 413696, 715, 6, 5008638, "Ahmed Khan", "Portuguese", "English", "75 billion USD");
        CountryDTO country5 = new CountryDTO("Germany", 167686, 1293, 48, 1476357, "Carlos Reyes", "Mandarin", "German", "75 billion USD");
        CountryDTO country6 = new CountryDTO("Brazil", 279127, 382, 30, 10932276, "Maria Silva", "Mandarin", "Hindi", "1.2 trillion USD");
        CountryDTO country7 = new CountryDTO("Australia", 845199, 661, 7, 3162017, "Maria Silva", "English", "Russian", "8.4 trillion USD");
        CountryDTO country8 = new CountryDTO("United Kingdom", 339250, 424, 33, 14845303, "George Lee", "Russian", "Mandarin", "8.4 trillion USD");
        CountryDTO country9 = new CountryDTO("France", 474509, 774, 12, 2767197, "Carlos Reyes", "Swahili", "German", "1.2 trillion USD");
        CountryDTO country10 = new CountryDTO("Canada", 159313, 784, 35, 16129229, "Chen Wei", "English", "Portuguese", "1 trillion USD");
        CountryDTO country11 = new CountryDTO("Russia", 921362, 293, 28, 12618237, "George Lee", "Russian", "English", "500 billion USD");
        CountryDTO country12 = new CountryDTO("South Korea", 885404, 1022, 10, 7822023, "Maria Silva", "Portuguese", "Mandarin", "500 billion USD");
        CountryDTO country13 = new CountryDTO("South Africa", 485128, 1002, 49, 3905646, "Fatima Ali", "English", "Mandarin", "2.6 trillion USD");
        CountryDTO country14 = new CountryDTO("Mexico", 190025, 864, 25, 6349782, "George Lee", "Arabic", "German", "500 billion USD");
        CountryDTO country15 = new CountryDTO("Saudi Arabia", 471906, 381, 15, 4719257, "Jane Doe", "Swahili", "Portuguese", "1 trillion USD");
        CountryDTO country16 = new CountryDTO("Italy", 571943, 1081, 48, 13127604, "Fatima Ali", "Portuguese", "Mandarin", "200 billion USD");
        CountryDTO country17 = new CountryDTO("Argentina", 198076, 888, 15, 8885923, "George Lee", "Arabic", "Russian", "3.5 trillion USD");
        CountryDTO country18 = new CountryDTO("Egypt", 690860, 541, 22, 12757003, "Alex Brown", "Hindi", "Portuguese", "1 trillion USD");
        CountryDTO country19 = new CountryDTO("Spain", 657644, 728, 36, 15181213, "Carlos Reyes", "Mandarin", "Russian", "8.4 trillion USD");
        CountryDTO country20 = new CountryDTO("Turkey", 253116, 1275, 42, 7367180, "John Smith", "Portuguese", "German", "2.6 trillion USD");
        CountryDTO country21 = new CountryDTO("Indonesia", 141873, 411, 25, 10984733, "Jane Doe", "French", "Swahili", "500 billion USD");
        CountryDTO country22 = new CountryDTO("Pakistan", 752191, 453, 10, 15459468, "John Smith", "Mandarin", "Spanish", "8.4 trillion USD");
        CountryDTO country23 = new CountryDTO("Bangladesh", 86312, 172, 4, 11223593, "Maria Silva", "Arabic", "Russian", "500 billion USD");
        CountryDTO country24 = new CountryDTO("Vietnam", 309270, 1126, 44, 5953775, "George Lee", "Hindi", "English", "500 billion USD");
        CountryDTO country25 = new CountryDTO("Thailand", 169101, 1233, 13, 6829619, "Alex Brown", "Russian", "German", "2.6 trillion USD");
        CountryDTO country26 = new CountryDTO("Philippines", 719263, 858, 10, 8423016, "Jane Doe", "Portuguese", "Mandarin", "8.4 trillion USD");
        CountryDTO country27 = new CountryDTO("Iran", 325613, 676, 11, 7758897, "Fatima Ali", "Spanish", "Hindi", "2.6 trillion USD");
        CountryDTO country28 = new CountryDTO("Iraq", 790352, 1094, 6, 6948424, "John Smith", "Mandarin", "Portuguese", "1.2 trillion USD");
        CountryDTO country29 = new CountryDTO("Afghanistan", 997065, 1344, 11, 15099884, "Fatima Ali", "Swahili", "Arabic", "1 trillion USD");
        CountryDTO country30 = new CountryDTO("Nepal", 708754, 1174, 19, 8628283, "Chen Wei", "English", "German", "500 billion USD");
        CountryDTO country31 = new CountryDTO("Sri Lanka", 655018, 544, 9, 7887733, "Jane Doe", "Arabic", "Mandarin", "200 billion USD");
        CountryDTO country32 = new CountryDTO("Maldives", 445750, 763, 17, 9372579, "Fatima Ali", "Russian", "Portuguese", "75 billion USD");
        CountryDTO country33 = new CountryDTO("Norway", 581325, 1137, 50, 16257923, "Fatima Ali", "English", "Hindi", "3.5 trillion USD");
        CountryDTO country34 = new CountryDTO("Sweden", 161650, 796, 25, 13514156, "Maria Silva", "German", "Swahili", "8.4 trillion USD");
        CountryDTO country35 = new CountryDTO("Denmark", 119092, 138, 33, 13739971, "Fatima Ali", "Mandarin", "Arabic", "3.5 trillion USD");
        CountryDTO country36 = new CountryDTO("Finland", 106881, 925, 8, 13047846, "Maria Silva", "Portuguese", "English", "3.5 trillion USD");
        CountryDTO country37 = new CountryDTO("Netherlands", 336326, 1011, 15, 12036017, "Jane Doe", "German", "Spanish", "500 billion USD");
        CountryDTO country38 = new CountryDTO("Belgium", 138882, 478, 7, 9347703, "George Lee", "Hindi", "French", "200 billion USD");
        CountryDTO country39 = new CountryDTO("Switzerland", 446189, 1012, 7, 8410125, "George Lee", "English", "Mandarin", "500 billion USD");
        CountryDTO country40 = new CountryDTO("Poland", 414344, 402, 3, 13052493, "Jane Doe", "Mandarin", "Russian", "8.4 trillion USD");
        CountryDTO country41 = new CountryDTO("Austria", 308473, 747, 31, 16000967, "Ahmed Khan", "Spanish", "French", "500 billion USD");
        CountryDTO country42 = new CountryDTO("Ukraine", 726309, 547, 9, 8560534, "Jane Doe", "Arabic", "Portuguese", "200 billion USD");
        CountryDTO country43 = new CountryDTO("Greece", 898630, 145, 24, 4359246, "Alex Brown", "French", "English", "2.6 trillion USD");
        CountryDTO country44 = new CountryDTO("Portugal", 828054, 810, 7, 10781291, "Jane Doe", "Portuguese", "Mandarin", "3.5 trillion USD");
        CountryDTO country45 = new CountryDTO("Czech Republic", 909264, 350, 35, 13306593, "Maria Silva", "Russian", "German", "3.5 trillion USD");
        CountryDTO country46 = new CountryDTO("Romania", 127638, 890, 12, 9311626, "Jane Doe", "English", "Arabic", "75 billion USD");
        CountryDTO country47 = new CountryDTO("Hungary", 987172, 123, 10, 10243276, "George Lee", "Mandarin", "German", "200 billion USD");
        CountryDTO country48 = new CountryDTO("Slovakia", 356885, 136, 5, 11669861, "Ahmed Khan", "Portuguese", "English", "1 trillion USD");
        CountryDTO country49 = new CountryDTO("Slovenia", 408414, 1181, 6, 15275231, "Jane Doe", "Russian", "Swahili", "1.2 trillion USD");
        CountryDTO country50 = new CountryDTO("Bulgaria", 164202, 1292, 6, 14369680, "Fatima Ali", "Hindi", "German", "3.5 trillion USD");
        CountryDTO country51 = new CountryDTO("Croatia", 381724, 376, 23, 13783720, "Carlos Reyes", "English", "Russian", "1.2 trillion USD");
        CountryDTO country52 = new CountryDTO("Serbia", 877167, 954, 25, 9662592, "Maria Silva", "German", "English", "3.5 trillion USD");
        CountryDTO country53 = new CountryDTO("Albania", 167097, 413, 6, 11741183, "Ivan Petrov", "Portuguese", "Russian", "1.2 trillion USD");
        CountryDTO country54 = new CountryDTO("Bosnia", 583502, 541, 22, 3137619, "Maria Silva", "Swahili", "Mandarin", "1 trillion USD");
        CountryDTO country55 = new CountryDTO("Montenegro", 967365, 1230, 23, 8720929, "George Lee", "French", "Mandarin", "8.4 trillion USD");
        CountryDTO country56 = new CountryDTO("Kosovo", 693027, 1385, 22, 4742959, "Chen Wei", "Mandarin", "Russian", "500 billion USD");
        CountryDTO country57 = new CountryDTO("Estonia", 995661, 364, 47, 1811357, "Chen Wei", "Spanish", "Portuguese", "8.4 trillion USD");
        CountryDTO country58 = new CountryDTO("Latvia", 318655, 696, 48, 14486657, "Alex Brown", "English", "Russian", "75 billion USD");
        CountryDTO country59 = new CountryDTO("Lithuania", 225097, 239, 48, 12143742, "George Lee", "Hindi", "Portuguese", "2.6 trillion USD");
        CountryDTO country60 = new CountryDTO("Iceland", 456572, 600, 20, 14375399, "Alex Brown", "Russian", "Swahili", "1.2 trillion USD");
        CountryDTO country61 = new CountryDTO("Ireland", 451989, 19, 28, 5074949, "Ivan Petrov", "Hindi", "Mandarin", "3.5 trillion USD");
        CountryDTO country62 = new CountryDTO("New Zealand", 238211, 509, 33, 7501304, "Ivan Petrov", "Russian", "Swahili", "8.4 trillion USD");
        CountryDTO country63 = new CountryDTO("Singapore", 132807, 476, 7, 4055658, "Fatima Ali", "Swahili", "German", "200 billion USD");
        CountryDTO country64 = new CountryDTO("Malaysia", 926130, 658, 21, 12405228, "Jane Doe", "English", "French", "200 billion USD");
        CountryDTO country65 = new CountryDTO("Myanmar", 319594, 429, 10, 14906645, "John Smith", "English", "German", "75 billion USD");
        CountryDTO country66 = new CountryDTO("Cambodia", 512615, 250, 29, 1799193, "Alex Brown", "Portuguese", "Swahili", "8.4 trillion USD");
        CountryDTO country67 = new CountryDTO("Laos", 678997, 628, 42, 2014806, "Maria Silva", "Arabic", "French", "1.2 trillion USD");
        CountryDTO country68 = new CountryDTO("Mongolia", 752859, 255, 41, 7704013, "Jane Doe", "Portuguese", "Hindi", "200 billion USD");
        CountryDTO country69 = new CountryDTO("North Korea", 554790, 517, 35, 9290997, "Chen Wei", "Portuguese", "Russian", "75 billion USD");
        CountryDTO country70 = new CountryDTO("Taiwan", 108105, 664, 2, 1386930, "George Lee", "German", "Portuguese", "200 billion USD");
        CountryDTO country71 = new CountryDTO("Israel", 639285, 321, 36, 6093486, "Jane Doe", "Arabic", "English", "1.2 trillion USD");
        CountryDTO country72 = new CountryDTO("Jordan", 14609, 380, 2, 4691609, "Chen Wei", "Spanish", "Russian", "8.4 trillion USD");
        CountryDTO country73 = new CountryDTO("Lebanon", 967377, 261, 20, 279913, "Alex Brown", "German", "Spanish", "1 trillion USD");
        CountryDTO country74 = new CountryDTO("Syria", 506820, 605, 50, 3147101, "Maria Silva", "Spanish", "Portuguese", "75 billion USD");
        CountryDTO country75 = new CountryDTO("Yemen", 110573, 1096, 48, 8734910, "George Lee", "German", "French", "1.2 trillion USD");
        CountryDTO country76 = new CountryDTO("Oman", 671301, 443, 28, 15561507, "Chen Wei", "Portuguese", "German", "2.6 trillion USD");
        CountryDTO country77 = new CountryDTO("Qatar", 530283, 925, 46, 14807167, "Carlos Reyes", "Hindi", "Spanish", "1 trillion USD");
        CountryDTO country78 = new CountryDTO("UAE", 683398, 1355, 11, 9299914, "Alex Brown", "Hindi", "Spanish", "3.5 trillion USD");
        CountryDTO country79 = new CountryDTO("Bahrain", 190243, 510, 1, 1450891, "Alex Brown", "Russian", "English", "75 billion USD");
        CountryDTO country80 = new CountryDTO("Kuwait", 874064, 644, 39, 12947638, "Alex Brown", "German", "Swahili", "500 billion USD");
        CountryDTO country81 = new CountryDTO("Nigeria", 721976, 445, 27, 16674274, "Carlos Reyes", "Spanish", "Mandarin", "1.2 trillion USD");
        CountryDTO country82 = new CountryDTO("Kenya", 679797, 553, 41, 6903085, "Chen Wei", "Swahili", "English", "3.5 trillion USD");
        CountryDTO country83 = new CountryDTO("Ethiopia", 574346, 829, 8, 3736412, "John Smith", "Arabic", "French", "1 trillion USD");
        CountryDTO country84 = new CountryDTO("Tanzania", 187831, 516, 50, 1250859, "Ivan Petrov", "English", "Swahili", "200 billion USD");
        CountryDTO country85 = new CountryDTO("Uganda", 264465, 948, 5, 1575836, "Alex Brown", "Spanish", "Portuguese", "75 billion USD");
        CountryDTO country86 = new CountryDTO("Ghana", 920732, 890, 31, 16874206, "Ahmed Khan", "Swahili", "English", "75 billion USD");
        CountryDTO country87 = new CountryDTO("Ivory Coast", 633848, 658, 6, 3623166, "Carlos Reyes", "Portuguese", "Arabic", "1.2 trillion USD");
        CountryDTO country88 = new CountryDTO("Cameroon", 806791, 1212, 46, 5425291, "Fatima Ali", "French", "Russian", "8.4 trillion USD");
        CountryDTO country89 = new CountryDTO("Senegal", 158450, 1169, 41, 6811613, "Carlos Reyes", "Spanish", "German", "2.6 trillion USD");
        CountryDTO country90 = new CountryDTO("Morocco", 798182, 888, 20, 4830717, "Ahmed Khan", "English", "Mandarin", "1 trillion USD");
        CountryDTO country91 = new CountryDTO("Algeria", 4428, 600, 22, 5280078, "Maria Silva", "Portuguese", "English", "200 billion USD");
        CountryDTO country92 = new CountryDTO("Tunisia", 485949, 1178, 45, 10404467, "John Smith", "French", "Mandarin", "75 billion USD");
        CountryDTO country93 = new CountryDTO("Libya", 235004, 443, 26, 2875544, "Jane Doe", "Spanish", "Hindi", "8.4 trillion USD");
        CountryDTO country94 = new CountryDTO("Sudan", 131629, 1154, 4, 16500286, "George Lee", "Portuguese", "Arabic", "3.5 trillion USD");
        CountryDTO country95 = new CountryDTO("South Sudan", 335129, 880, 7, 16904131, "Carlos Reyes", "English", "Swahili", "75 billion USD");
        CountryDTO country96 = new CountryDTO("Zambia", 516022, 1343, 48, 15397139, "Chen Wei", "French", "Swahili", "1.2 trillion USD");
        CountryDTO country97 = new CountryDTO("Zimbabwe", 325994, 124, 4, 429249, "Carlos Reyes", "Swahili", "English", "1 trillion USD");
        CountryDTO country98 = new CountryDTO("Namibia", 824431, 356, 23, 7528428, "Fatima Ali", "French", "Swahili", "2.6 trillion USD");
        CountryDTO country99 = new CountryDTO("Botswana", 294740, 653, 47, 1493047, "Maria Silva", "French", "Russian", "500 billion USD");
        CountryDTO country100 = new CountryDTO("Mozambique", 244501, 1167, 46, 14939253, "George Lee", "Hindi", "Spanish", "3.5 trillion USD");
        CountryDTO country101 = new CountryDTO("Angola", 689427, 987, 45, 14702541, "Chen Wei", "Hindi", "Russian", "1.2 trillion USD");
        CountryDTO country102 = new CountryDTO("Congo", 212095, 1381, 28, 712408, "John Smith", "German", "Spanish", "1.2 trillion USD");
        CountryDTO country103 = new CountryDTO("DR Congo", 213268, 353, 23, 11267977, "Maria Silva", "English", "Mandarin", "200 billion USD");
        CountryDTO country104 = new CountryDTO("Gabon", 323252, 917, 5, 11872966, "Carlos Reyes", "English", "German", "1 trillion USD");
        CountryDTO country105 = new CountryDTO("Chad", 962199, 615, 41, 11126173, "Jane Doe", "Mandarin", "Swahili", "500 billion USD");
        CountryDTO country106 = new CountryDTO("Niger", 767110, 924, 4, 11756996, "George Lee", "Russian", "English", "75 billion USD");
        CountryDTO country107 = new CountryDTO("Mali", 58063, 62, 21, 10942965, "John Smith", "Portuguese", "English", "8.4 trillion USD");
        CountryDTO country108 = new CountryDTO("Burkina Faso", 180880, 221, 2, 13704082, "Carlos Reyes", "Portuguese", "Swahili", "1 trillion USD");
        CountryDTO country109 = new CountryDTO("Benin", 261873, 247, 33, 4253391, "Alex Brown", "Hindi", "Arabic", "75 billion USD");
        CountryDTO country110 = new CountryDTO("Togo", 617314, 141, 34, 4229055, "Chen Wei", "Spanish", "Russian", "500 billion USD");
        CountryDTO country111 = new CountryDTO("Central African Republic", 130928, 1244, 7, 8096281, "Ivan Petrov", "English", "Mandarin", "2.6 trillion USD");
        CountryDTO country112 = new CountryDTO("Eritrea", 599252, 947, 13, 6627106, "Jane Doe", "Russian", "Portuguese", "2.6 trillion USD");
        CountryDTO country113 = new CountryDTO("Djibouti", 709745, 1251, 44, 15923106, "Chen Wei", "English", "Swahili", "1.2 trillion USD");
        CountryDTO country114 = new CountryDTO("Somalia", 185673, 884, 13, 4894177, "Maria Silva", "English", "Spanish", "75 billion USD");
        CountryDTO country115 = new CountryDTO("Madagascar", 842216, 446, 16, 7711949, "Fatima Ali", "German", "Hindi", "3.5 trillion USD");
        CountryDTO country116 = new CountryDTO("Seychelles", 875502, 826, 20, 16648179, "Fatima Ali", "English", "Mandarin", "75 billion USD");
        CountryDTO country117 = new CountryDTO("Mauritius", 220508, 1035, 15, 1079440, "Alex Brown", "Arabic", "English", "2.6 trillion USD");
        CountryDTO country118 = new CountryDTO("Comoros", 250916, 664, 16, 1053122, "John Smith", "Mandarin", "Hindi", "1.2 trillion USD");
        CountryDTO country119 = new CountryDTO("Lesotho", 486368, 194, 18, 4068381, "Jane Doe", "Mandarin", "Hindi", "3.5 trillion USD");
        CountryDTO country120 = new CountryDTO("Eswatini", 493833, 811, 32, 15115220, "Carlos Reyes", "Swahili", "French", "1 trillion USD");
        CountryDTO country121 = new CountryDTO("Paraguay", 613082, 1037, 37, 15878494, "Carlos Reyes", "Mandarin", "Spanish", "3.5 trillion USD");
        CountryDTO country122 = new CountryDTO("Uruguay", 847076, 370, 50, 13165900, "Chen Wei", "Portuguese", "Spanish", "8.4 trillion USD");
        CountryDTO country123 = new CountryDTO("Bolivia", 878821, 854, 26, 14702123, "Chen Wei", "Russian", "Portuguese", "2.6 trillion USD");
        CountryDTO country124 = new CountryDTO("Peru", 501300, 1080, 46, 3180489, "Ivan Petrov", "English", "Russian", "200 billion USD");
        CountryDTO country125 = new CountryDTO("Ecuador", 337771, 37, 38, 9597336, "Fatima Ali", "Hindi", "Mandarin", "500 billion USD");
        CountryDTO country126 = new CountryDTO("Colombia", 880308, 1355, 50, 16151513, "Maria Silva", "Spanish", "Hindi", "3.5 trillion USD");
        CountryDTO country127 = new CountryDTO("Venezuela", 142725, 69, 37, 14928727, "Chen Wei", "German", "English", "8.4 trillion USD");
        CountryDTO country128 = new CountryDTO("Chile", 523638, 1176, 26, 14087713, "Chen Wei", "Mandarin", "Hindi", "75 billion USD");
        CountryDTO country129 = new CountryDTO("Panama", 420640, 595, 25, 4967490, "George Lee", "Swahili", "Hindi", "8.4 trillion USD");
        CountryDTO country130 = new CountryDTO("Costa Rica", 760424, 86, 2, 16203679, "Jane Doe", "French", "Portuguese", "500 billion USD");
        CountryDTO country131 = new CountryDTO("Honduras", 363169, 1369, 45, 16755741, "Maria Silva", "Arabic", "Mandarin", "8.4 trillion USD");
        CountryDTO country132 = new CountryDTO("El Salvador", 20802, 447, 14, 14815611, "John Smith", "French", "English", "1 trillion USD");
        CountryDTO country133 = new CountryDTO("Guatemala", 169452, 447, 40, 10825158, "Alex Brown", "Russian", "Mandarin", "2.6 trillion USD");
        CountryDTO country134 = new CountryDTO("Nicaragua", 819566, 504, 1, 5696814, "Carlos Reyes", "Russian", "German", "75 billion USD");
        CountryDTO country135 = new CountryDTO("Cuba", 441666, 209, 10, 8231356, "Ahmed Khan", "Spanish", "Swahili", "75 billion USD");
        CountryDTO country136 = new CountryDTO("Haiti", 781783, 294, 49, 8544984, "Chen Wei", "Swahili", "German", "2.6 trillion USD");
        CountryDTO country137 = new CountryDTO("Dominican Republic", 93756, 1173, 47, 236055, "George Lee", "English", "German", "1 trillion USD");
        CountryDTO country138 = new CountryDTO("Jamaica", 204921, 502, 13, 3718369, "Alex Brown", "German", "Spanish", "3.5 trillion USD");
        CountryDTO country139 = new CountryDTO("Trinidad and Tobago", 949225, 1030, 12, 6879268, "Carlos Reyes", "Hindi", "French", "1 trillion USD");
        CountryDTO country140 = new CountryDTO("Bahamas", 860155, 198, 39, 13436734, "Maria Silva", "Spanish", "Russian", "3.5 trillion USD");
        CountryDTO country141 = new CountryDTO("Barbados", 215310, 316, 23, 14991401, "Jane Doe", "Arabic", "Spanish", "200 billion USD");
        CountryDTO country142 = new CountryDTO("Saint Lucia", 627964, 1094, 49, 3909125, "George Lee", "Arabic", "Mandarin", "3.5 trillion USD");
        CountryDTO country143 = new CountryDTO("Saint Vincent", 216471, 139, 43, 5745383, "Chen Wei", "Russian", "Hindi", "2.6 trillion USD");
        CountryDTO country144 = new CountryDTO("Grenada", 224765, 268, 5, 10922183, "Fatima Ali", "Arabic", "German", "1 trillion USD");
        CountryDTO country145 = new CountryDTO("Antigua and Barbuda", 439019, 733, 9, 11892287, "Chen Wei", "French", "English", "1.2 trillion USD");
        CountryDTO country146 = new CountryDTO("Dominica", 730297, 1306, 20, 11112273, "John Smith", "Spanish", "French", "500 billion USD");
        CountryDTO country147 = new CountryDTO("Saint Kitts and Nevis", 816903, 1042, 24, 10813681, "Maria Silva", "Hindi", "Arabic", "2.6 trillion USD");
        CountryDTO country148 = new CountryDTO("Fiji", 649076, 425, 45, 3248788, "Ivan Petrov", "Hindi", "German", "2.6 trillion USD");
        CountryDTO country149 = new CountryDTO("Samoa", 927936, 6, 22, 11418646, "Alex Brown", "Hindi", "French", "1 trillion USD");
        CountryDTO country150 = new CountryDTO("Tonga", 60176, 928, 17, 9455316, "Alex Brown", "Russian", "Mandarin", "500 billion USD");
        CountryDTO country151 = new CountryDTO("Palau", 189902, 903, 9, 14269457, "Jane Doe", "Arabic", "German", "500 billion USD");
        CountryDTO country152 = new CountryDTO("Micronesia", 315003, 52, 3, 14426567, "Ahmed Khan", "Mandarin", "Arabic", "2.6 trillion USD");
        CountryDTO country153 = new CountryDTO("Marshall Islands", 420791, 202, 48, 2463545, "Jane Doe", "Mandarin", "Russian", "3.5 trillion USD");
        CountryDTO country154 = new CountryDTO("Kiribati", 259318, 382, 36, 3832848, "Jane Doe", "Hindi", "English", "2.6 trillion USD");
        CountryDTO country155 = new CountryDTO("Tuvalu", 258869, 85, 36, 15223573, "Jane Doe", "Portuguese", "Swahili", "75 billion USD");
        CountryDTO country156 = new CountryDTO("Vanuatu", 576255, 684, 1, 1599678, "George Lee", "Portuguese", "Swahili", "3.5 trillion USD");
        CountryDTO country157 = new CountryDTO("Solomon Islands", 124118, 865, 48, 11297455, "Alex Brown", "Mandarin", "Swahili", "75 billion USD");
        CountryDTO country158 = new CountryDTO("Papua New Guinea", 921417, 1045, 9, 7783720, "Fatima Ali", "Mandarin", "Russian", "500 billion USD");
        CountryDTO country159 = new CountryDTO("Timor-Leste", 190579, 709, 14, 11075755, "George Lee", "Arabic", "Hindi", "2.6 trillion USD");
        CountryDTO country160 = new CountryDTO("Brunei", 324920, 1206, 15, 15368164, "Jane Doe", "Arabic", "Swahili", "500 billion USD");
        CountryDTO country161 = new CountryDTO("Georgia", 937886, 1345, 6, 8992044, "Maria Silva", "Arabic", "German", "75 billion USD");
        CountryDTO country162 = new CountryDTO("Armenia", 550072, 1301, 50, 12481249, "Jane Doe", "Arabic", "Mandarin", "3.5 trillion USD");
        CountryDTO country163 = new CountryDTO("Azerbaijan", 512188, 1074, 12, 8880257, "Alex Brown", "Arabic", "Mandarin", "200 billion USD");
        CountryDTO country164 = new CountryDTO("Kazakhstan", 763979, 787, 1, 10215098, "Jane Doe", "German", "Arabic", "500 billion USD");
        CountryDTO country165 = new CountryDTO("Uzbekistan", 68269, 1209, 17, 16062576, "Alex Brown", "French", "Russian", "2.6 trillion USD");
        CountryDTO country166 = new CountryDTO("Turkmenistan", 351353, 976, 39, 11927577, "Jane Doe", "French", "Arabic", "500 billion USD");
        CountryDTO country167 = new CountryDTO("Kyrgyzstan", 263307, 1097, 23, 11984495, "Alex Brown", "Russian", "Mandarin", "3.5 trillion USD");
        CountryDTO country168 = new CountryDTO("Tajikistan", 772235, 502, 13, 12628267, "Fatima Ali", "Portuguese", "German", "3.5 trillion USD");
        CountryDTO country169 = new CountryDTO("Belarus", 528992, 1273, 31, 16174231, "Fatima Ali", "Portuguese", "English", "75 billion USD");
        CountryDTO country170 = new CountryDTO("Moldova", 556047, 771, 27, 9280322, "Jane Doe", "Arabic", "Swahili", "3.5 trillion USD");
        CountryDTO country171 = new CountryDTO("Luxembourg", 317292, 834, 35, 15382532, "Ahmed Khan", "French", "Mandarin", "500 billion USD");
        CountryDTO country172 = new CountryDTO("Liechtenstein", 671416, 229, 35, 10559955, "Jane Doe", "German", "Mandarin", "3.5 trillion USD");
        CountryDTO country173 = new CountryDTO("Monaco", 769096, 1298, 33, 3263376, "John Smith", "Hindi", "Russian", "75 billion USD");
        CountryDTO country174 = new CountryDTO("San Marino", 451154, 800, 47, 9261960, "Jane Doe", "Spanish", "Arabic", "500 billion USD");
        CountryDTO country175 = new CountryDTO("Vatican City", 424401, 491, 46, 8122756, "Fatima Ali", "Arabic", "French", "75 billion USD");
        CountryDTO country176 = new CountryDTO("Andorra", 745709, 1151, 16, 13238150, "Jane Doe", "Russian", "Arabic", "2.6 trillion USD");
        CountryDTO country177 = new CountryDTO("Malta", 992250, 927, 34, 14776310, "Ahmed Khan", "Mandarin", "Swahili", "3.5 trillion USD");
        CountryDTO country178 = new CountryDTO("Cyprus", 491653, 697, 39, 13455912, "Alex Brown", "German", "Russian", "2.6 trillion USD");
        CountryDTO country179 = new CountryDTO("Equatorial Guinea", 154389, 1081, 49, 12247193, "George Lee", "Arabic", "Mandarin", "75 billion USD");
        CountryDTO country180 = new CountryDTO("Guinea", 226411, 839, 30, 13269795, "Alex Brown", "Hindi", "Arabic", "1.2 trillion USD");
        CountryDTO country181 = new CountryDTO("Guinea-Bissau", 331303, 690, 11, 14792809, "Fatima Ali", "Swahili", "Portuguese", "2.6 trillion USD");
        CountryDTO country182 = new CountryDTO("Gambia", 638514, 185, 24, 16648912, "George Lee", "Mandarin", "German", "3.5 trillion USD");
        CountryDTO country183 = new CountryDTO("Suriname", 839253, 1026, 36, 12515116, "Jane Doe", "French", "English", "75 billion USD");
        CountryDTO country184 = new CountryDTO("Guyana", 397365, 1052, 31, 11035187, "Ahmed Khan", "Arabic", "French", "1.2 trillion USD");
        CountryDTO country185 = new CountryDTO("Belize", 251638, 776, 2, 4201752, "Maria Silva", "French", "English", "200 billion USD");
        CountryDTO country186 = new CountryDTO("Greenland", 642969, 528, 20, 13976216, "John Smith", "Hindi", "Portuguese", "3.5 trillion USD");

        Collection<CountryDTO> countryDTOCollection = new ArrayList<>(Arrays.asList(
                country1, country2, country3, country4, country5, country6, country7, country8, country9, country10,
                country11, country12, country13, country14, country15, country16, country17, country18, country19, country20,
                country21, country22, country23, country24, country25, country26, country27, country28, country29, country30,
                country31, country32, country33, country34, country35, country36, country37, country38, country39, country40,
                country41, country42, country43, country44, country45, country46, country47, country48, country49, country50,
                country51, country52, country53, country54, country55, country56, country57, country58, country59, country60,
                country61, country62, country63, country64, country65, country66, country67, country68, country69, country70,
                country71, country72, country73, country74, country75, country76, country77, country78, country79, country80,
                country81, country82, country83, country84, country85, country86, country87, country88, country89, country90,
                country91, country92, country93, country94, country95, country96, country97, country98, country99, country100,
                country101, country102, country103, country104, country105, country106, country107, country108, country109, country110,
                country111, country112, country113, country114, country115, country116, country117, country118, country119, country120,
                country121, country122, country123, country124, country125, country126, country127, country128, country129, country130,
                country131, country132, country133, country134, country135, country136, country137, country138, country139, country140,
                country141, country142, country143, country144, country145, country146, country147, country148, country149, country150,
                country151, country152, country153, country154, country155, country156, country157, country158, country159, country160,
                country161, country162, country163, country164, country165, country166, country167, country168, country169, country170,
                country171, country172, country173, country174, country175, country176, country177, country178, country179, country180,
                country181, country182, country183, country184, country185, country186
        ));

        return countryDTOCollection;
    }
}
