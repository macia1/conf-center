package com.zgs.confcenter;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zgs.confcenter.model.Model;
import com.zgs.confcenter.service.impl.ModelServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfCenterApplicationTests {
    @Autowired
    ModelServiceImpl modelService;

    @Test
    void contextLoads() {
        Model model = Model.builder().modelName("测试栏目2").modelCode("testCode2").createUser("zgs").build();
        modelService.save(model);
        QueryWrapper<Model> queryWrapper = new QueryWrapper<>();
        Page<Model> iPage = new Page<>(2,5);
        modelService.page(iPage,queryWrapper);
        System.out.println(JSONObject.toJSONString(iPage,true));
    }

}
