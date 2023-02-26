package com.zgs.confcenter.control;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zgs.confcenter.model.Model;
import com.zgs.confcenter.service.impl.ModelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author macia
 * @create 2023/2/12
 * @description
 */
@RequestMapping("/model")
@RestController
public class ModelControl {

    @Autowired
    ModelServiceImpl modelService;

    @PostMapping
    public ResponseEntity<Object> createModel(@RequestBody Model model){
        return modelService.save(model) ? ResponseEntity.ok().build() : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @DeleteMapping("/{modelId}")
    public ResponseEntity<Object> deleteByModelId(@PathVariable("modelId") Long modelId){
        return modelService.removeById(modelId) ? ResponseEntity.ok().build() : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PutMapping
    public ResponseEntity<Object> updateModelById(@RequestBody Model model){
        return modelService.updateById(model) ? ResponseEntity.ok().build() : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/{parentModelId}")
    public ResponseEntity<List<Model>> queryModelById(@PathVariable("parentModelId") Long parentModelId){
        return ResponseEntity.ok(modelService.list(new QueryWrapper<>(Model.builder().parentId(parentModelId).build())));
    }

}
