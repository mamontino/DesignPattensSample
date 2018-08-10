package com.adrugroupe.testproject.patterns.fabric_metod;

public class FabricDigital implements Fabric {

    Watch mWatch;

    @Override
    public Watch createWatch() {
        mWatch = new DigitalWatch();
        return mWatch;
    }
}
