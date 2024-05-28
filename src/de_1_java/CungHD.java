/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de_1_java;

import java.util.Scanner;

public class CungHD {
    private int id;
    private String name;
    private int dayStart;
    private int monthStart;
    private int dayEnd;
    private int monthEnd;

    public CungHD(int id, String name, int dayStart, int monthStart, int dayEnd, int monthEnd) {
        this.id = id;
        this.name = name;
        this.dayStart = dayStart;
        this.monthStart = monthStart;
        this.dayEnd = dayEnd;
        this.monthEnd = monthEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayStart() {
        return dayStart;
    }

    public void setDayStart(int dayStart) {
        this.dayStart = dayStart;
    }

    public int getMonthStart() {
        return monthStart;
    }

    public void setMonthStart(int monthStart) {
        this.monthStart = monthStart;
    }

    public int getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(int dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getMonthEnd() {
        return monthEnd;
    }

    public void setMonthEnd(int monthEnd) {
        this.monthEnd = monthEnd;
    }

    @Override
    public String toString() {
        return "CungHD{" + "id=" + id + ", name=" + name + ", dayStart=" + dayStart + ", monthStart=" + monthStart + ", dayEnd=" + dayEnd + ", monthEnd=" + monthEnd + '}';
    }
}
