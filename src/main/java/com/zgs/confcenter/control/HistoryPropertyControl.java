package com.zgs.confcenter.control;

import com.zgs.confcenter.model.HistoryProperty;
import com.zgs.confcenter.service.impl.HistoryPropertyServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author zenggs
 * @date 2023/2/12
 */
@RestController
@RequestMapping("/historyProperty")
public class HistoryPropertyControl {
    @Autowired
    HistoryPropertyServiceImpl historyPropertyService;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody HistoryProperty historyProperty) {
        return historyPropertyService.save(historyProperty) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable("id") Long id) {
        return historyPropertyService.removeById(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @PutMapping
    public ResponseEntity<Object> updateById(@RequestBody HistoryProperty id) {
        return historyPropertyService.updateById(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(historyPropertyService.getById(id));
    }

    @GetMapping
    public ResponseEntity<Object> list(@RequestParam Long page, @RequestParam Long size, @RequestParam Long id) {
        return ResponseEntity.ok(historyPropertyService.page(new Page<>(page, size > 10 ? 10 : size), new QueryWrapper<>(HistoryProperty.builder().historyId(id).build())));
    }
}

