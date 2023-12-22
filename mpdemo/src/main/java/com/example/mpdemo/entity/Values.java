package com.example.mpdemo.entity;

import java.util.List;

public class Values {
    private int tid;
    private int nums;
    private float money;
    private List<Menu> food;

    @Override
    public String toString() {
        return "Values{" +
                "tid=" + tid +
                ", nums=" + nums +
                ", money=" + money +
                ", menusData=" + food.toString() +
                '}';
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public List<Menu> getFood() {
        return food;
    }

    public void setFood(List<Menu> food) {
        this.food = food;
    }
}
