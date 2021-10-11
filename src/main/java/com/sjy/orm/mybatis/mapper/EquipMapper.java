package com.sjy.orm.mybatis.mapper;

import com.sjy.orm.mybatis.entity.Equipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface EquipMapper {
    /**
     * 查询所有设备
     * @return 设备列表
     */
    @Select("SELECT * FROM tb_equip")
    List<Equipment> selectAllEquip();

    /**
     * 保存设备
     *
     * @param equipment 设备
     * @return 成功 - {@code 1} 失败 - {@code 0}
     */
    int saveEquip(@Param("equipment") Equipment equipment);

    /**
     * 删除设备
     *
     * @param id 主键id
     * @return 成功 - {@code 1} 失败 - {@code 0}
     */
    int deleteById(@Param("id") String id);

}
