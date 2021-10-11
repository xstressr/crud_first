package com.sjy.services;

import com.sjy.orm.mybatis.entity.Equipment;
import com.sjy.orm.mybatis.mapper.EquipMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EquipServiceImpl implements EquipService {

    @Autowired
    private EquipMapper equipMapper;

    @Override
    public List<Equipment> getAllEquipment() {
        return equipMapper.selectAllEquip();
    }

    @Override
    public Equipment getOneEquipment(String id) {
        return null;
    }

    @Override
    public boolean addEquipment(Equipment equipment) {
        return equipMapper.saveEquip(equipment) > 0;
    }

    @Override
    public boolean delEquipment(String id) {
        return equipMapper.deleteById(id) > 0;
    }
}
