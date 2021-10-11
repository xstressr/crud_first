package com.sjy.crud.mapper;

import cn.hutool.core.collection.CollUtil;
import com.sjy.crud.SpringCrudApplicationTests;
import com.sjy.orm.mybatis.entity.Equipment;
import com.sjy.orm.mybatis.mapper.EquipMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class UserMapperTest extends SpringCrudApplicationTests {

    @Autowired
    private EquipMapper equipMapper;

    /**
     * 测试查询所有
     */
    @Test
    public void selectAllUser() {
        List<Equipment> equipList = equipMapper.selectAllEquip();
        log.debug("【userList】= {}", equipList);
        System.out.println(equipList);
    }
}
