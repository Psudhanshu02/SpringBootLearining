package com.example.tutorial1_mavin.Controller;


import com.example.tutorial1_mavin.model.vendorDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cloudVendor")
public class controller {
    vendorDetails vendor;
    @GetMapping("{vendorId}")
    public  vendorDetails getVendorDetails(String vendorId){
        return vendor;
    }

    @PostMapping
    public String addNewVendor(@RequestBody vendorDetails vendor){
        this.vendor=vendor;
        return "Added vendor";

    }

    @PutMapping
    public String updateVendor(@RequestBody vendorDetails vendor){
        this.vendor=vendor;
        return "updated";
    }

    @DeleteMapping
    public String deleteVendoor(@RequestBody vendorDetails vendor){
        this.vendor=null;
        return "Deleted";
    }


}
