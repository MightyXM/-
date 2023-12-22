package com.example.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("ordering")
public class Ordering {
    private int no;
    private int tid;
    private double price;

    @Override
    public String toString() {
        return "Ordering{" +
                "no=" + no +
                ", tid=" + tid +
                ", price=" + price +
                '}';
    }

    public Ordering(int no, int tid, double price) {
        this.no = no;
        this.tid = tid;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
}
