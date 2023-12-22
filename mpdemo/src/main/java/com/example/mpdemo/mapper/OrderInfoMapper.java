package com.example.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo.entity.OrderInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderInfoMapper extends BaseMapper<OrderInfo> {
    @Select("select max(`index`) from orderinfo")
    int selectindex();
    @Delete("delete from orderinfo where `no`=#{no}")
    int delectorderinfo(int no);
}
