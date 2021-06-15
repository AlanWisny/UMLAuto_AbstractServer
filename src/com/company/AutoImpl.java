package com.company;

import com.company.AutoImple.IAutoImpl;

// de eigenaar uit auto word als parameter meegegeven aan het object van deze klasse
public class AutoImpl implements IAutoImpl {
    private final IAutoImpl i;

    public AutoImpl(IAutoImpl imp) {
        i = imp;
    }

    @Override
    public String eigenaar() {
        return null;
    }

    public void reserveer() {
        // dit moet iets doen
        System.out.println("de eigenaar van de auto is: " + i.eigenaar());

    }
}
