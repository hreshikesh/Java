package com.xworkz.isarelation.Casting;


import com.xworkz.isarelation.Internal.Clock;
import com.xworkz.isarelation.Internal.Watch;

import java.sql.Time;

public class TimeMachine {
    public void timeControl(Clock clock){
        clock.showTime();
        clock.setAlarm();
        clock.tick();
        clock.displayFormat();
        clock.powerSource();
        if(clock instanceof Watch){
            System.out.println("In Watch");
            Watch watch=(Watch) clock;
            watch.timeStop();
        }

    }
}
