package com.xworkz.classparameter;

import com.xworkz.classparameter.Barber.Barber;
import com.xworkz.classparameter.Barber.Saloon;
import com.xworkz.classparameter.Camera.Camera;
import com.xworkz.classparameter.Camera.Pixels;
import com.xworkz.classparameter.Dolo650.Dolo;
import com.xworkz.classparameter.Dolo650.Tablet;
import com.xworkz.classparameter.Mango.Mango;
import com.xworkz.classparameter.Mango.Price;
import com.xworkz.classparameter.Pillow.Pillow;
import com.xworkz.classparameter.Poster.Poster;
import com.xworkz.classparameter.Poster.Theater;
import com.xworkz.classparameter.RCB.IPL;
import com.xworkz.classparameter.RCB.RCB;
import com.xworkz.classparameter.Rocket.Rocket;
import com.xworkz.classparameter.Rocket.Speed;
import com.xworkz.classparameter.Shop.Display;
import com.xworkz.classparameter.Shop.Shop;
import com.xworkz.classparameter.Space.Star;
import com.xworkz.classparameter.Space.Space;

public class Runner {
    public static void main(String[] args) {
        Display display=new Display();
        Shop shop=new Shop();
        shop.ads(display);

        System.out.println("=================");


        Poster poster=new Poster();
        Theater theater=new Theater();
        theater.show(poster);

        System.out.println("=================");

        IPL ipl=new IPL();
        RCB rcb=new RCB();
        rcb.getInfo(ipl);

        System.out.println("=================");

        Star star=new Star();
        Space space=new Space();
        space.getStar(star);

        System.out.println("=================");

        Speed speed=new Speed();
        Rocket rocket=new Rocket();
        rocket.getRocketSpeed(speed);

        System.out.println("=================");

        Dolo dolo=new Dolo();
        Tablet tablet=new Tablet();
        tablet.getTablet(dolo);

        System.out.println("=================");
        String saloonOwnerName="Vaman";
        Saloon saloon=new Saloon(saloonOwnerName);
        Barber barber=new Barber();
        barber.getName(saloon);

        System.out.println("=================");
        Pixels pixels=new Pixels();
        Camera camera=new Camera();
        camera.getPixels(pixels);

        System.out.println("=================");
        Price price=new Price();
        Mango mango=new Mango();
        mango.getPrice(price);

        System.out.println("=================");
        Pillow pillow=new Pillow();
        pillow.getPillowPrice(price);






    }
}
