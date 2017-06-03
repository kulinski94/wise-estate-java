package com.wise.estate.estates;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kulinski on 5/29/17.
 */
@RestController
public class EstateController {


    @RequestMapping("/api/estates")
    @CrossOrigin
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
        estate.name = "Casa de Rali " + id;
        estate.price = 123.5;
        estate.photos = Arrays.asList("https://static.pexels.com/photos/106399/pexels-photo-106399.jpeg");
        estate.description = "A bright and spacious fully modernised end of terrace house. This property has 2 reception rooms, with a log burner in one to enjoy on those cold winter nights. Large kitchen breakfast room and downstairs cloakroom. Upstairs there is a split level landing. The master bedroom at the front of the house is very spacious and light, the second bedroom is a good sized double and the third is a great sized single with built in storage. Newly fitted bathroom suite, tiled flooring and walls. New boiler with an 8 year warranty and recently fitted upvc windows and doors throughout. \n" +
                "The garden has an area for outside dining in the glorious sunshine and easy to maintain astro turf.";
        return estate;
    }

    public class Estate{

        public String id;

        public String description;

        public String name;

        public double price;

        public List<String> photos;
    }
}
