package com.example.mpdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mpdemo.entity.Menu;
import com.example.mpdemo.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    private MenuMapper menuMapper;
    @GetMapping("/menu")
    List<Menu> query(){
        return menuMapper.selectList(null);
    }
    @PostMapping("/menu/addmenu")
    int addmenu(@RequestBody Menu menu){
        QueryWrapper<Menu> queryWrapper = new QueryWrapper();
        queryWrapper.eq("mid", menu.getMid());
        List<Menu> li = menuMapper.selectList(queryWrapper);
        if(!li.isEmpty()){
            return editmenu(menu);
        }
        return menuMapper.insert(menu);
    }
    @PostMapping("/menu/editmenu")
    int editmenu(@RequestBody Menu menu){
        QueryWrapper<Menu> queryWrapper = new QueryWrapper();
        queryWrapper.eq("mid", menu.getMid());//tom_age必须是数据库中的字段
        List<Menu> li = menuMapper.selectList(queryWrapper);
        if(li.isEmpty()){
            return menuMapper.insert(menu);
        }
        return menuMapper.updateBymid(menu);
    }
    @PostMapping("/menu/delectmenu")
    int delectmenu(@RequestBody Menu menu){
        return menuMapper.delectBymid(menu);
    }

}
