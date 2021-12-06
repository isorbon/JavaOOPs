package com.syntax.class26.homework.Insurance;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceObjects {
    public static void main(String[] args) {
        ArrayList<Insurance> insur = new ArrayList<>();
        insur.add(new Car("Allstate","BMW"));
        insur.add(new Pet("Embrace","Cat"));
        insur.add(new Health("UnitedHealthcare"));

        for (Insurance ins:insur
             ) {
            ins.getQuote();
            ins.cancelInsurance();
        }

    }
}
