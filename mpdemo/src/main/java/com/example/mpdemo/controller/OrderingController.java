package com.example.mpdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mpdemo.entity.Menu;
import com.example.mpdemo.entity.OrderInfo;
import com.example.mpdemo.entity.Ordering;
import com.example.mpdemo.entity.Values;
import com.example.mpdemo.mapper.MenuMapper;
import com.example.mpdemo.mapper.OrderInfoMapper;
import com.example.mpdemo.mapper.OrderingMapper;
import com.example.mpdemo.mapper.TableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderingController {
    @Autowired
    private OrderingMapper orderingMapper;
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private TableMapper tableMapper;
    @GetMapping("/order/orderlist")
    List<Ordering> orderlist(){
        return orderingMapper.selectList(null);
    }
    @PostMapping("/choice/orderingtest")
    int addordering(@RequestBody Ordering o){
        return orderingMapper.insert(o);
    }
    @PostMapping("/choice/orderingsubmit")
    void tranform(@RequestBody Values v){
        int tid = v.getTid();
        System.out.println(tid);
        tableMapper.changeTableStatus(tid);
        float price = v.getMoney();
        int no = orderingMapper.getmaxno()+1;
        int index = orderInfoMapper.selectindex()+1;
        Ordering o = new Ordering(no,tid,price);
        orderingMapper.insert(o);
        int nums = v.getNums();
        System.out.println(nums);
        List<Menu> me = v.getFood();
//        System.out.println(me.get(1).toString());
        for(int i=0;i<me.size();i++){
            Menu temp = me.get(i);
            System.out.println(temp.toString());
            OrderInfo oi = new OrderInfo(index,no,temp.getMid(), temp.getFname());
            index++;
            System.out.println(oi);
            menuMapper.countRestBymid(temp.getMid());
            orderInfoMapper.insert(oi);
        }
    }
    @PostMapping("/choice/delectorder")
    void delecto(@RequestBody Ordering o){
        int no = o.getNo();
        orderingMapper.delectorder(no);
        QueryWrapper<OrderInfo> queryWrapper = new QueryWrapper();
        queryWrapper.eq("`no`", no);
        List<OrderInfo> oi = orderInfoMapper.selectList(queryWrapper);
        if(!oi.isEmpty())
            orderInfoMapper.delectorderinfo(no);
    }
}
