package com.raghavender.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements Comparable<Player>{
    private int ranking;
    private String name;
    private int age;

    Player(){

    }
   public int compareTo(Player otherPlayer){
    return Integer.compare(getRanking(),otherPlayer.getRanking());
    }

    Player(int ranking,String name,int age){
        this.ranking =ranking;
        this.name= name;
        this.age=age;

    }
    // getters

    public int getRanking(){
        return this.ranking;
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    // setters

    public void setRanking(int ranking){
        this.ranking =ranking;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
    @Override
    public String toString(){
        return "Player{ranking "+ ranking+", name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {

        List<Player> footballTeam = new ArrayList<Player>();
        Player player1 = new Player(9,"Raj",23);
        Player player2 = new Player(2,"Harsh",21);
        Player player3 = new Player(5,"Balaji",23);
        Player player4 = new Player(7,"JJ",19);
        Player player5 = new Player(1,"Kiran",16);

        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
        footballTeam.add(player4);
        footballTeam.add(player5);

       // The objects are sorted using Comparable interface...
        System.out.println("//The objects are sorted using Comparable interface...");

        System.out.println("The football team before sorting"+footballTeam);

        Collections.sort(footballTeam);

        System.out.println("The football team after sorting"+footballTeam);




    }
}

