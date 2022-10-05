package com.mapsa.exercise.seriesa.c.raminRezaei;

public class People {
    private String name ;
    private int age ;
    private int budget ;
    private static People people =null;
    public static People setPeople(String name , int age , int budget){
        if(getPeople()==null){
            return  new People(name, age, budget);
        }
        return people ;
    }
    private People(String name , int age , int budget){
        this.name = name ;
        this.age = age ;
        this.budget  = budget ;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }
    public static People getPeople() {
        return people;
    }
    public  void setPeople(People people) {
        People.people = people;
    }
    @Override
    public String toString(){
        return getName() +"  "+ getAge() +"  "+ getBudget();
    }

}