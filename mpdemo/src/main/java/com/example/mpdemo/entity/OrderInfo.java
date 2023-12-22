package com.example.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("orderinfo")
public class OrderInfo {
    @TableField("`index`")
    private int index;
    private int no;
    private int mid;
    private String fname;

    public OrderInfo(int index, int no, int mid, String fname) {
        this.index = index;
        this.no = no;
        this.mid = mid;
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "index=" + index +
                ", no=" + no +
                ", mid=" + mid +
                ", fname='" + fname + '\'' +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
