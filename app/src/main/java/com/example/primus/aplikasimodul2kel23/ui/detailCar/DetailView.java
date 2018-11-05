package com.example.primus.aplikasimodul2kel23.ui.detailCar;


import com.example.primus.aplikasimodul2kel23.data.model.DataCar;

import java.util.List;

public interface DetailView {
    void showErrorCarById(String message);

    void showSuccessCarById(List<DataCar> dataCar);
}
