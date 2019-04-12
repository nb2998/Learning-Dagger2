package com.apps.nb2998.learningDagger2.car;

public class Wheels {

//    @Inject if we don't won this class this can't be done like 3rd party libs
//    public Wheels() {
//    }

    private Rims rims;
    private Tyres tyres;

    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }
}
