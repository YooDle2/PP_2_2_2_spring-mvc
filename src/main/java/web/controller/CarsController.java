package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String printList(@RequestParam(name = "count", required = false) Integer count, ModelMap modelMap) {
        if (count == null) {
            modelMap.addAttribute("cars", carService.getCars());
        } else {
            modelMap.addAttribute("cars", carService.getCountCars(count));
        }
        return "cars";
    }

}