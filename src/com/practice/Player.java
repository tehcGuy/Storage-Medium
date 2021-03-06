package com.practice;

import java.util.LinkedList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override //saving
    public List<String> save() {
        List<String> listOfFields = new LinkedList<>();
        String[] tokens = toString().split("[{}]");

        listOfFields.add(0, tokens[0] + ":");
        for(int i = 1; i < tokens.length; i++) {
            listOfFields.add(i, tokens[i]);
        }
        return listOfFields;
    }

    @Override //loading
    public void print(List<String> list) {
//        Make sure the List is not null and the size() is greater than 0 before storing the values.
        if(list != null && list.size() > 0) {
            for(String s : list) {
                System.out.println(s);
            }
        }
    }
}
