package com.example.radhi.myapplication1;

import java.util.ArrayList;

/**
 * Created by Radhi on 4/7/2016.
 */
public class FieldController {
    static ArrayList ParametersOptions = new ArrayList();

    static ExpertADT Field;

    public FieldController(){
        ExpertADT Field = new ExpertADT();
        //ExpertADT.setParametersOptions(Meteorologist, ParametersOptions);
        ExpertADT.setNumCat(Field, 2);
        ExpertADT.setIDNumber(Field, 0);
        ExpertADT.setDB(FieldExpertDatabase.FData, Field);
    }

    public static void compareAnswer(ArrayList b){
        for(int i=0; i < 2;){
            if (FieldExpertDatabase.getDensity(FieldExpertDatabase.getInfo(i)).equals(b.get(0)) && FieldExpertDatabase.getMoistness(FieldExpertDatabase.getInfo(i)).equals(b.get(1))){
                ExpertADT.setSolveAnswer(i,Field);}
            else {i = i + 1;}
        }
    }
}
