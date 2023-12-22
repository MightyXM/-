package com.example.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo.entity.Table;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface TableMapper extends BaseMapper<Table> {
    @Select("select tid,used,reserved from `table`")
    List<Table> selecttablelist();
    @Update("update `table` set tid = #{tid},used = #{used},reserved=#{reserved} where tid = #{tid}")
    int updateBytid(Table t);
    @Update("update `table` set `used` = 1 where tid = #{tid}")
    int changeTableStatus(int tid);
    @Update("update `table` set  `used` = 0 where tid = #{tid}")
    int changeTableStatusTo0(int tid);
    @Delete("delete from `table` where tid = #{tid}")
    int delectBytid(Table t);
}
