package com.company.government;

import java.util.ArrayList;

public class Diplomat {
    private String nev;
    private ArrayList<String> beszeltnyelvek;

    //public Diplomat James_Bond = new Diplomat("James Bond","English","German","French");
    public Diplomat(String nev, ArrayList<String> beszeltnyelvek) {
        this.nev = nev;
        this.beszeltnyelvek = beszeltnyelvek;
      /*  beszeltnyelvek= new ArrayList<String>();
        this.beszeltnyelvek= new ArrayList<String>();*/
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


    public ArrayList<String> speak() {
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

    public ArrayList<String> getLanguages() {
        return beszeltnyelvek;
    }

    @Override
    public String toString() {
        return "Diplomata(" + nev + '\'' + ", [" + beszeltnyelvek+"])";
    }

}
