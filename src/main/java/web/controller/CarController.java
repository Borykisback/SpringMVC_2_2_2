package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value ="/cars")
    public String getCar(Model model, @RequestParam(value = "count", defaultValue = "4") int fullCar) {
        CarServiceImp service = new CarServiceImp();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Supra", "123155"));
        cars.add(new Car(2, "Nissan", "413465"));
        cars.add(new Car(3, "BMW", "191120"));
        cars.add(new Car(4, "Volvo", "012877"));
        cars = service.countCar(cars, fullCar);
        model.addAttribute("carList", cars);
        return "cars";
    }
}
