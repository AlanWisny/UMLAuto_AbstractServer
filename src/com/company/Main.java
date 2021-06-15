package com.company;

import com.company.AutoImple.Auto;
import com.company.AutoImple.IAutoImpl;

public class Main {

    public static void main(String[] args) {
    	// week 2 - Abstract Server
	    IAutoImpl i = new Auto("alan");
	    AutoImpl auto = new AutoImpl(i);
	    auto.reserveer();
    }
}
