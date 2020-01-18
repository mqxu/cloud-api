package com.scs.soft.cloud.api.service;

import com.scs.soft.cloud.api.CloudApiApplication;
import com.scs.soft.cloud.api.domain.dto.QueryDto;
import com.scs.soft.cloud.api.entity.Permission;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author wf
 * @create 2020
 * @description TODO
 */
@SpringBootTest(classes = CloudApiApplication.class)
class PermissionServiceTest {
    @Resource
    private PermissionService permissionService;

    @Test
    void updatePermission() {
        Permission permission = Permission.builder().id(9).name("编辑资料").build();
        permissionService.updatePermissionById(permission);
    }

    @Test
    void deletePermission(){
        permissionService.deletePermissionById(1);
    }

    @Test
    void get() {
    }

    @Test
    void getPermissionByName() {
        Permission queryDto = Permission.builder().name("资源").build();
        System.out.println(permissionService.getPermissionByName(queryDto));
    }
}