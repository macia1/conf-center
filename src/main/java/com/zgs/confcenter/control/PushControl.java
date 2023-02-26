package com.zgs.confcenter.control;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zgs.confcenter.model.Push;
import com.zgs.confcenter.service.impl.PushServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author zenggs
 * @date 2023/2/12
 */
@RestController
@RequestMapping("/push")
public class PushControl {
    @Autowired
    PushServiceImpl pushService;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Push push) {
        return pushService.save(push) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable("id") Long id) {
        return pushService.removeById(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @PutMapping
    public ResponseEntity<Object> updateById(@RequestBody Push id) {
        return pushService.updateById(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(pushService.getById(id));
    }

    @GetMapping
    public ResponseEntity<Object> list(@RequestParam Long page, @RequestParam Long size, Push push) {
        return ResponseEntity.ok(pushService.page(new Page<>(page, size > 10 ? 10 : size), new QueryWrapper<>(push)));
    }
}

