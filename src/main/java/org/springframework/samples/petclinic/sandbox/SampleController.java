package org.springframework.samples.petclinic.sandbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @ResponseBody
    @GetMapping
    @LogExecutionTime
    public SimpleResult hello() {
        return new SimpleResult("OK", "Hello");
    }

}
