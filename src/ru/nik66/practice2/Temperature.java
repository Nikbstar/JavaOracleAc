package ru.nik66.practice2;

import java.util.ArrayList;

public class Temperature {

    public static final int MIN_TEMP = -50;
    public static final int MAX_TEMP = 50;
    private String month;
    private int days;
    private ArrayList<Integer> tempDB;
    private int minTemp;
    private int maxTemp;
    private int minTempDay;
    private int maxTempDay;

    public int getMinTempDay() {
        return minTempDay;
    }

    public int getMaxTempDay() {
        return maxTempDay;
    }


    public void setMinTempDay(int minTempDay) {
        this.minTempDay = minTempDay;
    }

    public void setMaxTempDay(int maxTempDay) {
        this.maxTempDay = maxTempDay;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getMonth() {
        return month;
    }

    public boolean setMonth(String month) {
        this.month = month;
        return setDays(month);
    }

    public int getDays() {
        return days;
    }

    private boolean setDays(String month) {
        boolean result = true;
        month = month.toLowerCase();
        switch (month) {
            case "january":
            case "march":
            case "may":
            case "jule":
            case "august":
            case "october":
            case "december": days = 31;
            break;
            case "april":
            case "june":
            case "september":
            case "november": days = 30;
            break;
            case "february": days = 28;
            break;
            default: result = false;
        }
        tempDB = new ArrayList<>(getDays());
        return result;
    }

    public boolean addTempInDB(String temp) throws NumberFormatException {
        boolean result = false;
        try {
            int tmp = Integer.parseInt(temp);
            if (tmp >= MIN_TEMP && tmp <= MAX_TEMP) {
                tempDB.add(tmp);
                result = true;
            }
        } catch(Exception e) {
            result = false;
        }
        return result;
    }

    public int avgMinMaxTemp() {
        int avgTemp = 0;
        int minTemp = MAX_TEMP;
        int maxTemp = MIN_TEMP;
        int minTempDay = 0;
        int maxTempDay = 0;

        for (int i = 0; i < tempDB.size(); i++) {
            avgTemp += tempDB.get(i);
            if (tempDB.get(i) < minTemp) {
                minTemp = tempDB.get(i);
                minTempDay = i + 1;
            }
            if (tempDB.get(i) > maxTemp) {
                maxTemp = tempDB.get(i);
                maxTempDay = i + 1;
            }
        }
        avgTemp /= getDays();
        setMinTemp(minTemp);
        setMaxTemp(maxTemp);
        setMinTempDay(minTempDay);
        setMaxTempDay(maxTempDay);
        return avgTemp;
    }

}
