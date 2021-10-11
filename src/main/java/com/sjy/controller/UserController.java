package com.sjy.controller;

import com.sjy.common.ApiResponse;
import com.sjy.common.DataType;
import com.sjy.common.ParamType;
import com.sjy.orm.mybatis.entity.Equipment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * User Controller
 * </p>
 *
 */
@RestController
@RequestMapping("/equip")
@Api(tags = "1.0.0-SNAPSHOT", description = "用户管理", value = "用户管理")
@Slf4j
public class UserController {

/*    @GetMapping("/{id}")
    @ApiOperation(value = "主键查询（DONE）", notes = "备注")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "用户编号", dataType = DataType.INT, paramType = ParamType.PATH)})
    public ApiResponse<Equipment> get(@PathVariable Integer id) {
        log.info("单个参数用  @ApiImplicitParam");
        return ApiResponse.<Equipment>builder().code(200).message("操作成功").data(new Equipment(id, "u1", "p1")).build();
    }*/

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除用户（DONE）", notes = "备注")
    @ApiImplicitParam(name = "id", value = "用户编号", dataType = DataType.INT, paramType = ParamType.PATH)
    public void delete(@PathVariable Integer id) {
        log.info("单个参数用 ApiImplicitParam");
    }

    @PostMapping
    @ApiOperation(value = "添加用户（DONE）")
    public Equipment post(@RequestBody Equipment equipment) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");
        return equipment;
    }

    @PostMapping("/multipar")
    @ApiOperation(value = "添加用户（DONE）")
    public List<Equipment> multipar(@RequestBody List<Equipment> equipment) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");

        return equipment;
    }

    @PostMapping("/array")
    @ApiOperation(value = "添加用户（DONE）")
    public Equipment[] array(@RequestBody Equipment[] user) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");
        return user;
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改用户（DONE）")
    public void put(@PathVariable Long id, @RequestBody Equipment equipment) {
        log.info("如果你不想写 @ApiImplicitParam 那么 swagger 也会使用默认的参数名作为描述信息 ");
    }

}
