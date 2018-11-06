package com.xys.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/11.
 */
public class City implements Serializable {
    private static final long serialVersionUID = 1141402943889793889L;
    private String name;
    private int population;
    private String state;
    private City chosenCity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public City getChosenCity() {
        return chosenCity;
    }

    public void setChosenCity(City chosenCity) {
        this.chosenCity = chosenCity;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
