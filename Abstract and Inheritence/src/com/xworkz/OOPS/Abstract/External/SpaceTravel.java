package com.xworkz.OOPS.Abstract.External;

import com.xworkz.OOPS.Abstract.Internal.SportCar;
import com.xworkz.OOPS.Abstract.Internal.Travel;

public class SpaceTravel extends Travel {


    public SpaceTravel(String source,String destination){
        super(source,destination);
    }
    public SpaceTravel(String distance){
        super(distance);
    }
    public SpaceTravel(String distance,int cost){
        super(distance,cost);
    }
}
