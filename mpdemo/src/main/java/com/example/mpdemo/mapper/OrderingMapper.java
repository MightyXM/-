package com.example.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo.entity.Ordering;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface OrderingMapper extends BaseMapper<Ordering> {
    @Select("select max(`no`) from `ordering`")
    int getmaxno();

    @Delete("delete from `ordering` where `no` = #{no}")
    int delectorder(int no);
}
