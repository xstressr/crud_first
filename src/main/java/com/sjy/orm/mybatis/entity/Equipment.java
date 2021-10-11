package com.sjy.orm.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Equipment {
//    private static final long serialVersionUID = -1840831686851699943L;

    /**
     * 主键
     *
     * 设备编号
     */
    private String id;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 设备型号
     */
    private String model;

    /**
     * 生产厂家
     */
    private String manufactor;

    /**
     * 设备价值
     */
    private float price;

    /**
     * 备注
     */
    private String others;
}
