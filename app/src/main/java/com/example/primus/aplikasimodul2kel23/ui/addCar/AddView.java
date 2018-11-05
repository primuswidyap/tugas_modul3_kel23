package com.example.primus.aplikasimodul2kel23.ui.addCar;


public interface AddView {

    String getName();

    String getMerk();

    String getModel();

    String getYear();

    void successAddCar();

    void failedAddCar();
}