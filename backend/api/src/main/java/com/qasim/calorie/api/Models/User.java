package com.qasim.calorie.api.Models;

import jakarta.persistence.*;

import java.util.List;

// POJO Users class, Hibernate automatically creates the table "users" with the predefined columns.
// strategy = GenerationType.Identity - auto increment IDs

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private int height;

    @Column
    private int weight;

    @Column
    private int activityLevel;

    @Column
    private String emailAddress;

    @Column
    private String password;

    @Column
    private int caloriesIn;

    @Column
    private int caloriesOut;

    @Column
    private int calorieGoal;

    @OneToMany(cascade = CascadeType.ALL) // Create the foods when creating user.
    @JoinColumn(name = "fk_user_id", referencedColumnName = "user_id")
    private List<Food> foods;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long id) {
        this.user_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(int activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCaloriesIn() {
        return caloriesIn;
    }

    public void setCaloriesIn(int caloriesIn) {
        this.caloriesIn = caloriesIn;
    }

    public int getCaloriesOut() {
        return caloriesOut;
    }

    public void setCaloriesOut(int caloriesOut) {
        this.caloriesOut = caloriesOut;
    }

    public int getCalorieGoal() {
        return calorieGoal;
    }

    public void setCalorieGoal(int calorieGoal) {
        this.calorieGoal = calorieGoal;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

}
