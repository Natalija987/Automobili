package com.itbootcamp.bgqa.nedelja4.Automobili;

import com.itbootcamp.bgqa.nedelja4.Automobili.Automobil;

public class Mercedes extends Automobil {
    public Mercedes(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);
    }
    @Override
    public String toString() {
        return "Mercedes{}";
    }

}
