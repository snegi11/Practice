package com.company.JavaGenerics.GenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by srnegi on 2/26/2017.
 */
public class League<T extends Team> {
  public String name;
  private ArrayList<T> league = new ArrayList<T>();

  public League(String name){
    this.name= name;
  }

  public boolean add(T team){
    if(league.contains(team)){
      return false;
    }
    else
    {
      league.add(team);
      return true;
    }
  }

  public void showLeagueTable(){
    Collections.sort(league);
    for (T t :league){
      System.out.println(t.getName()+ ": " +t.ranking());
    }
  }
}
