package com.adrugroupe.testproject.patterns.fabric_metod;

public class Example {

    void createDigital() {
        Fabric fabric = new FabricDigital();
        Watch watch = fabric.createWatch();
        watch.showTime();
    }

    void createRome() {
        Fabric fabric = new FabricRome();
        Watch watch = fabric.createWatch();
        watch.showTime();
    }
}
