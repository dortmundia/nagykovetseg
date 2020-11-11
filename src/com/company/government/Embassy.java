package com.company.government;

import java.util.ArrayList;

public class Embassy {
    private String orszag;
    private ArrayList<Diplomat> diplomatak;

   public ArrayList<String> spokenLanguages(){
       ArrayList<String> beszelik = new ArrayList<>();




           if(diplomatak.get().getLanguages.equals(nyelv)){
               beszelik+=nyelv;
           }



       return beszelik;
   }

    public ArrayList<String> spokenBy(String nyelv){
       ArrayList<String> azokaDiplomatak = new ArrayList<>();
        for (int i = 0; i < diplomatak.size(); i++) {


           if (diplomatak.get(i).speak(nyelv) )
           {
               azokaDiplomatak.add(diplomatak.get(i).getName());
           }
        }
        return azokaDiplomatak;
    }

    public ArrayList<String> delegation(){} //no idea
}
