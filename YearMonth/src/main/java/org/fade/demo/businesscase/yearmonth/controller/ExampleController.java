package org.fade.demo.businesscase.yearmonth.controller;

import org.fade.demo.businesscase.yearmonth.entity.Example;
import org.fade.demo.businesscase.yearmonth.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.YearMonth;
import java.util.List;

/**
 * @author fade
 * @date 2022/01/09
 */
@RestController
@RequestMapping("/example")
public class ExampleController {

    @Resource(name = "exampleServiceImpl")
    private ExampleService exampleService;

    @PostMapping("/save")
    public ResponseEntity<Void> save(Example example) {
        exampleService.save(example);
        return ResponseEntity.ok().body(null);
    }

    @PostMapping("/queryAll")
    public ResponseEntity<List<Example>> queryAll() {
        return ResponseEntity.ok(exampleService.queryAll());
    }

    @PostMapping("/queryByIdAndTime")
    public ResponseEntity<List<Example>> queryByIdAndTime(Long id, YearMonth time) {
        return ResponseEntity.ok(exampleService.queryByIdAndTime(id, time));
    }

    @PostMapping("/update")
    public ResponseEntity<Void> update(Example example) {
        exampleService.update(example);
        return ResponseEntity.ok(null);
    }

}
