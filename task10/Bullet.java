class Bullet {
    String type;      
    String size;       
    int manufactre;     
    String speed;      

    public static void main(String args[]) {
        Bullet bullet1 = new Bullet();
        bullet1.type = "Pistol";
        bullet1.size = "Small";
        bullet1.manufactre = 2020;
        bullet1.speed = "800 m/s";
        System.out.println("Bullet type: " + bullet1.type + ", Size: " + bullet1.size + ", Year of Manufacture: " + bullet1.manufactre + ", Speed: " + bullet1.speed);

        Bullet bullet2 = new Bullet();
        bullet2.type = "Rifle";
        bullet2.size = "Medium";
        bullet2.manufactre = 2018;
        bullet2.speed = "1200 m/s";
        System.out.println("Bullet type: " + bullet2.type + ", Size: " + bullet2.size + ", Year of Manufacture: " + bullet2.manufactre + ", Speed: " + bullet2.speed);

        Bullet bullet3 = new Bullet();
        bullet3.type = "Shotgun";
        bullet3.size = "Large";
        bullet3.manufactre = 2015;
        bullet3.speed = "500 m/s";
        System.out.println("Bullet type: " + bullet3.type + ", Size: " + bullet3.size + ", Year of Manufacture: " + bullet3.manufactre + ", Speed: " + bullet3.speed);

        Bullet bullet4 = new Bullet();
        bullet4.type = "Sniper";
        bullet4.size = "Long";
        bullet4.manufactre = 2022;
        bullet4.speed = "1500 m/s";
        System.out.println("Bullet type: " + bullet4.type + ", Size: " + bullet4.size + ", Year of Manufacture: " + bullet4.manufactre + ", Speed: " + bullet4.speed);

        Bullet bullet5 = new Bullet();
        bullet5.type = "Cannonball";
        bullet5.size = "Very Large";
        bullet5.manufactre = 1800;
        bullet5.speed = "300 m/s";
        System.out.println("Bullet type: " + bullet5.type + ", Size: " + bullet5.size + ", Year of Manufacture: " + bullet5.manufactre + ", Speed: " + bullet5.speed);
    }
}
