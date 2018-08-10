package com.adrugroupe.testproject.patterns.fabric_metod;

public class FabricRome implements Fabric {

    Watch mWatch;

    @Override
    public Watch createWatch() {
        mWatch = new RomeWatch();
        return mWatch;
    }
}
