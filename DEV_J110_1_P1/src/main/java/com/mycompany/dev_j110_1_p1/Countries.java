/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_1_p1;

/**
 *
 * @author USER
 */
public class Countries {
    private String name;
    private float area;
    private float population;
    private String namecapital;
    private float populationcapital;

public Countries(String name, float area) {
        setName(name);
        setArea(area);
    }

    public Countries(String name, float area, String namecapital) {
        this(name,area);
        setNamecapital(namecapital);
    }

    public Countries(String name, float area, float population) {
        this(name,area);
        setPopulation(population);
        namecapital = null;
        populationcapital = 0;
    }

    public Countries(String name, float area, float population, String namecapital, float populationcapital) {
        this(name,area,population);
        setNamecapital(namecapital);
        setPopulationcapital(populationcapital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Введите название страны");
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        if (area <0) throw new IllegalArgumentException("Площадь должна быть строго больше нуля");
        this.area = area;
    }

    public float getPopulation() {
        return population;
    }

    public void setPopulation(float population) {
        if (population<0) throw new IllegalArgumentException("Население должна быть строго больше нуля");
        this.population = population;
    }

    public String getNamecapital() {
        return namecapital;
    }

    public void setNamecapital(String namecapital) {
        this.namecapital = namecapital;
    }

    public float getPopulationcapital() {
        return populationcapital;
    }

    public void setPopulationcapital(float populationcapital) {
        this.populationcapital = populationcapital;
    }

    public float getDensity() {
        return getPopulation()/getArea();
    }


    public void print (){
        if(namecapital == null && population !=0){
        System.out.println("Название: " + name + ", " + "Площадь: " 
                + area + " кв. км., " + "Население: " 
                + population + " чел.");
        }
        else if (population==0){
            if(namecapital == null){
                System.out.println("Название: " + name + ", " + "Площадь: " 
                        + area + " кв. км., " + "Население: " 
                                + " Население неизвестно,");
            }
            else{
                System.out.println();
                System.out.println("Название: " + name + ", " + "Площадь: " 
                        + area + " кв. км., " + "Население неизвестно, " 
                                + "Столица: " + namecapital 
                        +", Население столицы неизвестно;");
            }
        }
        else{
            System.out.println("Название: " + name + ", " + "Площадь: " 
                    + area + " кв. км., " + "Население: " + population 
                    + " чел., " + "Столица: " + namecapital 
                    + ", Население столицы: " + populationcapital + " чел.");
        }
    }

    public static void printAll (Countries[] countries){
        for (Countries count : countries)
            count.print();
    }   
}
