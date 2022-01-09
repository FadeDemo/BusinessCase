package org.fade.demo.businesscase.yearmonth.controller;

import org.fade.demo.businesscase.yearmonth.entity.Example;
import org.fade.demo.businesscase.yearmonth.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

}
