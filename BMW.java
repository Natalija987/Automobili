package com.itbootcamp.bgqa.nedelja4.Automobili;

import com.itbootcamp.bgqa.nedelja4.Automobili.Automobil;

public class BMW extends Automobil {
    public BMW(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);
    }


    @Override
    public String toString() {
        return "BMW{}";
    }
}
