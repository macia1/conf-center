package com.zgs.confcenter.control;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zgs.confcenter.model.Property;
import com.zgs.confcenter.service.impl.PropertyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author zenggs
 * @date
 */
@RestController
@RequestMapping("/property")
public class PropertyControl {
    @Autowired
    PropertyServiceImpl propertyService;
    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Property property){
        return propertyService.save(property) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{propertyId}")
    public ResponseEntity<Object> deleteById(@PathVariable("propertyId") Long propertyId){
        return propertyService.removeById(propertyId) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @PutMapping
    public ResponseEntity<Object> updateById(@RequestBody Property property){
        return propertyService.updateById(property) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @GetMapping("/{propertyId}")
    public ResponseEntity<Object> findById(@PathVariable("propertyId")Long propertyId){
        return ResponseEntity.ok(propertyService.getById(propertyId));
    }

    @GetMapping
    public ResponseEntity<Object> list(@RequestParam Long page,@RequestParam Long size,@RequestParam Long modelId){
        return ResponseEntity.ok(propertyService.page(new Page<>(page,size > 10 ? 10 : size),new QueryWrapper<>(Property.builder().modelId(modelId).build())));
    }
}
