package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Hammer;
import com.xworkz.isarelation.Internal.Tool;

public class WallPainting {
    public void hangPaint(Tool tool){
        tool.use();
        tool.maintain();
        tool.store();
        tool.clean();
        tool.repair();
        if(tool instanceof Hammer){
            System.out.println("In Hammer");
            Hammer hammer=(Hammer) tool;
            hammer.nailIt();
        }
    }
}
