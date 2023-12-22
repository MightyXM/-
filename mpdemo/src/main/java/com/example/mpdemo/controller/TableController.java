package com.example.mpdemo.controller;

import com.example.mpdemo.entity.Table;
import com.example.mpdemo.mapper.TableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {
    @Autowired
    private TableMapper tableMapper;
    @GetMapping("/tablelist")
    List<Table> query(){
        return tableMapper.selecttablelist();
    }
    @PostMapping("/tablelist/addtable")
    int addtable(@RequestBody Table t){
//        System.out.println(t.toString());
        return tableMapper.insert(t);
    }
    @PostMapping("/tablelist/edittable")
    int edittable(@RequestBody Table t){
        return tableMapper.updateBytid(t);
    }
    @PostMapping("/tablelist/delecttable")
    int delecttable(@RequestBody Table t) {
        return tableMapper.delectBytid(t);
    }
    @PostMapping("/tablelist/clear")
    int cleartableused(@RequestBody Table t){
        return tableMapper.changeTableStatusTo0(t.getTid());
    }
}
