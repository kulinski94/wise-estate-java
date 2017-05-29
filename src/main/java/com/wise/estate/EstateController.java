package com.wise.estate;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kulinski on 5/29/17.
 */
@RestController
public class EstateController {


    @RequestMapping("/")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Estate> index() {

        List<Estate> estates = new ArrayList<>();
        estates.add(getEstates(1));
        estates.add(getEstates(2));
        estates.add(getEstates(3));

        return estates;
    }

    private Estate getEstates(int id) {
        Estate estate = new Estate();
        estate.id = "Estate" + id;
        estate.name = "Case de Rali " + id;
        estate.money = 123.5;
        return estate;
    }

    public class Estate{
        public String id;

        public String name;

        public double money;
    }
}
