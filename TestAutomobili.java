package com.itbootcamp.bgqa.nedelja4.Automobili;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestAutomobili {
    public static void main(String[] args) {
        ArrayList<Automobil> listaAutomobila=new ArrayList<>();
        Automobil automobil1=new Automobil("Mercedes","crna",16389498,2020,50000);
        Automobil automobil2=new Automobil("Mercedes","bela",5126654,1990,5000);
        Automobil automobil3=new Automobil("BMW","crna",1655498,2017,40000);
        Automobil automobil4=new Automobil("BMW","bela",184465,1995,3000);
        listaAutomobila.add(automobil1);
        listaAutomobila.add(automobil2);
        listaAutomobila.add(automobil3);
        listaAutomobila.add(automobil4);

        automobil2.oldTimer(automobil2.getCena());
        assert automobil4.getCena() == 3000;
        System.out.println(cenaManja(20000.00, listaAutomobila));
        System.out.println(sviBeli(listaAutomobila));
        System.out.println("Testovi prosli");
    }

    public static ArrayList<Automobil> cenaManja(double svotaNovca, ArrayList<Automobil> lista) {
        ArrayList<Automobil> novaLista = new ArrayList<Automobil>();
        for (Automobil auto : lista) {
            if (auto.getCena() < svotaNovca) {
                novaLista.add(auto);
            }
        }
        return novaLista;
    }

    public static ArrayList<Automobil> sviBeli(ArrayList<Automobil> lista) {
        ArrayList<Automobil> sviBeli = new ArrayList<Automobil>();
        for (Automobil auto : lista) {
            if (auto.getBoja().equalsIgnoreCase("bela")) {
                sviBeli.add(auto);
            }
        }
        return sviBeli;
    }
    }

