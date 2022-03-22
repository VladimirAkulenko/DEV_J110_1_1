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
    private float density;

public Countries(String name, float area) {
        setName(name);
        setArea(area);
    }

    public Countries(String name, float area, String namecapital) {
        setName(name);
        setArea(area);
        setNamecapital(namecapital);
    }

    public Countries(String name, float area, float population) {
        setName(name);
        setArea(area);
        setPopulation(population);
        namecapital = null;
        populationcapital = 0;
    }

    public Countries(String name, float area, float population, String namecapital, float populationcapital) {
        setName(name);
        setArea(area);
        setPopulation(population);
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
        if(getNamecapital() == null && getPopulation() !=0){
        System.out.println("Название: " + getName() + ", " + "Площадь: " 
                + getArea() + " кв. км., " + "Население: " 
                + getPopulation() + " чел.");
        }
        else if (getPopulation()==0){
            if(getNamecapital() == null){
                System.out.println("Название: " + getName() + ", " + "Площадь: " 
                        + getArea() + " кв. км., " + "Население: " 
                                + " Население неизвестно,");
            }
            else{
                System.out.println();
                System.out.println("Название: " + getName() + ", " + "Площадь: " 
                        + getArea() + "кв. км., " + "Население неизвестно, " 
                                + "Столица: " + getNamecapital() 
                        +", Население столицы неизвестно;");
            }
        }
        else{
            System.out.println("Название: " + getName() + ", " + "Площадь: " 
                    + getArea() + "кв. км., " + "Население: " + getPopulation() 
                    + "чел., " + "Столица: " + getNamecapital() 
                    + ", Население столицы: " + getPopulationcapital() + "чел.");
        }
    }

    public static void printAll (Countries[] countries){
        countries[0].print();
        countries[1].print();
        countries[2].print();
        countries[3].print();
        countries[4].print();
        countries[5].print();
        countries[6].print();
    }   
}
