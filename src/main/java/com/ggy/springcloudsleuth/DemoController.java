package com.ggy.springcloudsleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    protected  final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping()
    public String test(){
        logger.info("======");
        return  "fff";
    }
}
