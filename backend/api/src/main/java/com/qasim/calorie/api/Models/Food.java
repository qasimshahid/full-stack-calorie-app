package com.qasim.calorie.api.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "userFoods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int food_id;

    @Column
    private String food_name;

    @Column
    private int calories;

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int id) {
        this.food_id = id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String name) {
        this.food_name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

}
