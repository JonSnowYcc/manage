package com.zuzu.sys.mapper;

import com.zuzu.sys.entity.Incident;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
@Mapper
public interface IncidentMapper extends BaseMapper<Incident> {
    @Select("SELECT * FROM incidents")
    List<Incident> getAllIncidents();

    @Insert("INSERT INTO incidents(id, title, description, reporter, dateCreated, resolved) " +
            "VALUES(#{id}, #{title}, #{description}, #{reporter}, #{dateCreated}, #{resolved})")
    void insertIncident(Incident incident);
}
