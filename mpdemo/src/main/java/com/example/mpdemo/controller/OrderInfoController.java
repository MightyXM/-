package com.example.mpdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mpdemo.entity.Menu;
import com.example.mpdemo.entity.OrderInfo;
import com.example.mpdemo.entity.Ordering;
import com.example.mpdemo.mapper.OrderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderInfoController {
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @GetMapping("/order/orderinfo")
    List<OrderInfo> getorderinfo(@RequestParam("no") int no){
        System.out.println(no);
        QueryWrapper<OrderInfo> queryWrapper = new QueryWrapper();
        queryWrapper.eq("`no`", no);
        return orderInfoMapper.selectList(queryWrapper);
    }
}
