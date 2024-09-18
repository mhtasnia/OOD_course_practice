package com.prblm6;

public class Athlete extends Person{

    @Override
    public void eat() {
        System.out.println("Eat Protein, Minrals and Vitamin Enriched diet");
    }

    @Override
    public void exercise() {
       System.out.println("Follow a proper exercise routine");
    }
    
}
