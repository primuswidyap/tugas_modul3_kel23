package com.example.primus.aplikasimodul2kel23.ui.home;

import com.example.primus.aplikasimodul2kel23.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);

}
