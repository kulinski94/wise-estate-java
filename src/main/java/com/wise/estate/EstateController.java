package com.wise.estate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kulinski on 5/29/17.
 */
@RestController
public class EstateController {


    @RequestMapping("/")
    public List<Estate> index() {

        Estate estate = new Estate();
        estate.id = "Estate1";
        estate.name = "Case de Rali";
        estate.money = 123.5;

        return Arrays.asList(estate);
    }

    public class Estate{
        public String id;

        public String name;

        public double money;
    }
}
