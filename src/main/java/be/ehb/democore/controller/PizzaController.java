package be.ehb.democore.controller;

import be.ehb.democore.data.Pizza;
import be.ehb.democore.exceptions.NotOnMyPizzaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PizzaController {

    @Autowired
    private Pizza pizza;

    @RequestMapping(value = "/size", method = RequestMethod.POST)
    @ResponseBody
    public void defineSize(@RequestParam(name = "diameter", defaultValue = "15") int diameter){
        pizza.setDiameter(diameter);
    }

    @RequestMapping(value = "/topping", method = RequestMethod.POST)
    @ResponseBody
    public void addTopping(@RequestParam(name = "topping", defaultValue = "pineapple") String topping){
        if(topping.equals("pineapple"))
            throw new NotOnMyPizzaException("No can do");
        pizza.addTopping(topping);
    }

}
