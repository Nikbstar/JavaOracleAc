package ru.nik66.lesson8;

import java.util.Comparator;

public class ClotheComparator implements Comparator<Clothing> {
    @Override
    public int compare(Clothing o1, Clothing o2) {
        return o1.getBrand().compareToIgnoreCase(o2.getBrand());
    }
}
