package com.liveasyspringrest.liveasyspringrestassignment.controller;

import com.liveasyspringrest.liveasyspringrestassignment.entities.Load;
import com.liveasyspringrest.liveasyspringrestassignment.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoadController {
    @Autowired
    LoadService loadService;

    @PostMapping("/load")
    public Load addLoad(@RequestBody Load load){
        return this.loadService.addLoad(load);
    }

    @GetMapping("/load")
    public List<Load> getLoads(){
        return this.loadService.getLoads();
    }

    @GetMapping("/load/{shipperId}")
    public Load getLoad(@PathVariable Long shipperId){
        return this.loadService.getLoad(shipperId);
    }

    @PutMapping("/load/{shipperId}")
    public Load updateLoad(@PathVariable long shipperId, @RequestBody Load load) {
        return this.loadService.updateLoadByShipperId(shipperId, load);
    }

    @DeleteMapping("/load/{shipperId}")
    public ResponseEntity<String> deleteLoadByShipperId(@PathVariable long shipperId) {
        if (loadService.deleteLoadByShipperId(shipperId)) {
            return ResponseEntity.ok("Load deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Load not found for shipperId: " + shipperId);
        }
    }

}
