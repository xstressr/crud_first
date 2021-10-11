package com.sjy.services;

import com.sjy.orm.mybatis.entity.Equipment;

import java.util.List;

public interface EquipService {

    //获取所有的设备
    List<Equipment> getAllEquipment();


    //通过id获取某个设备信息
    Equipment getOneEquipment(String id);

    //新增一条记录
    boolean addEquipment(Equipment equipment);

    //删除一条记录
    boolean delEquipment(String id);
}
