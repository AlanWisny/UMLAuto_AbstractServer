package com.company.AutoImple;

// auto geeft de eigenaar door, via de interface methode
public class Auto implements IAutoImpl{
    private String eigenaar;


    public Auto(String eigenaar) {
        this.eigenaar = eigenaar;
    }

    @Override
    public String eigenaar() {
        return this.eigenaar;
    }
}
