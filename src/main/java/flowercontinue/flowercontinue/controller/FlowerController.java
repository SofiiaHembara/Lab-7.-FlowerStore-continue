package flowercontinue.flowercontinue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flowercontinue.flowercontinue.model.Flower;
import flowercontinue.flowercontinue.service.FlowerService;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {
    private FlowerService  flowerService;
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flower")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }
}
