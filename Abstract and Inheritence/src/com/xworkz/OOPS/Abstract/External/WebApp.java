package com.xworkz.OOPS.Abstract.External;

import com.xworkz.OOPS.Abstract.Internal.Project;

public class WebApp extends Project {
    @Override
    public void compile() {
        System.out.println("Ruuning compile");
    }
}
