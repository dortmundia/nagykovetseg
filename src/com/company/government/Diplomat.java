package com.company.government;

import java.util.ArrayList;

public class Diplomat {
    private String nev;
    private ArrayList<String> beszeltnyelvek;

    public Diplomat(String nev, ArrayList<String> beszeltnyelvek) {
        this.nev = nev;
        this.beszeltnyelvek = beszeltnyelvek;
    }

    public Diplomat make(String nev, ArrayList<String> beszeltnyelvek){

        if(!(nev.isEmpty()))
        {
            this.nev = nev;
            this.beszeltnyelvek = beszeltnyelvek;
        }
        return this;
    }

    public String getName() {
        return nev;
    }


    public ArrayList<String> getBeszeltnyelvek() {
        return beszeltnyelvek;
    }

    public boolean speak(String nyelv){
        boolean beszelie=false;

        for (String i:beszeltnyelvek             ) {


            if (beszeltnyelvek.equals(nyelv)) {
                beszelie = true;
            }
        }

        return  beszelie;
    }










}
