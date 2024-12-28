package com.example.tutorial1_mavin.Controller;



import com.example.tutorial1_mavin.model.vendorDetails;
import com.example.tutorial1_mavin.response.responseHandler;
import com.example.tutorial1_mavin.service.cloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cloudVendor")
public class controller {

    cloudVendorService cloudVendorService;
    public controller(com.example.tutorial1_mavin.service.cloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    vendorDetails vendor;

    //Get particular vendor
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getVendorDetails(@PathVariable("vendorId") String vendorId){
        return responseHandler.responseBuilder("Vendor getails have been successfully fetched", HttpStatus.OK,cloudVendorService.getVendor(vendorId));
    }

    //Get All Vendor
    @GetMapping
    public List<vendorDetails> getAllVendorDetails(){
        return cloudVendorService.showAllVendor();
    }


    @PostMapping
    public String addNewVendor(@RequestBody vendorDetails vendor){
        cloudVendorService.createVendor(vendor);
        return "Added vendor";

    }

    @PutMapping
    public String updateVendor(@RequestBody vendorDetails vendor){
        cloudVendorService.updateVendor(vendor);
        return "updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteVendor(vendorId);
        return "Deleted";
    }


}
