package com.flores.daggerdi;


import javax.inject.Inject;

public class School {

    @Inject
    public School(){
    }

    public String ingresoClase(){
        return "7:00 AM";
    }

    public String salidaClase(){
        return "10:00 PM";
    }
}
