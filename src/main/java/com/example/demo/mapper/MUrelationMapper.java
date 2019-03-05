package com.example.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface MUrelationMapper {
    @Insert({"INSERT INTO murelation VALUE(#{userId},#{momentId});"})
    void insertMUrelation(@Param("userId") int userId,
                            @Param("momentId") int momentId);

    @Select({"SELECT momentId FROM murelation WHERE userId=#{userId}"})
    int[] findMoments(@Param("userId") int userId);

    @Delete({"DELETE FROM murelation WHERE userId=#{userId}"})
    void deleteRelation(@Param("userId") int userId);
}