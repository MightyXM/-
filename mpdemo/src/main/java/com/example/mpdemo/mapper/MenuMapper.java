package com.example.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo.entity.Menu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    @Update("update `menu` set mid = #{mid},fname = #{fname},price=#{price},rest=#{rest} where mid = #{mid}")
    int updateBymid(Menu menu);

    @Update("update `menu` set rest=rest-1 where mid = #{mid}")
    int countRestBymid(int mid);
    @Delete("delete from `menu` where mid = #{mid}")
    int delectBymid(Menu t);
}
