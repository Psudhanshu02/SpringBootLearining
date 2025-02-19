package com.example.tutorial1_mavin.service.impl;
import com.example.tutorial1_mavin.exception.vendorNotFoundException;
import com.example.tutorial1_mavin.model.vendorDetails;
import com.example.tutorial1_mavin.repository.cloudVendorRepository;
import com.example.tutorial1_mavin.service.cloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cloudVendorServiceImp implements cloudVendorService{

    cloudVendorRepository cloudVendorRepository;
    public cloudVendorServiceImp(cloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createVendor(vendorDetails vendorDetails) {
        cloudVendorRepository.save(vendorDetails);
        return "success";
    }

    @Override
    public String updateVendor(vendorDetails vendorDetails) {
        cloudVendorRepository.save(vendorDetails);
        return "success";
    }

    @Override
    public String deleteVendor(String vendorID) {
        if(cloudVendorRepository.findById(vendorID).isEmpty()){
            throw new vendorNotFoundException("vendor not found");
        }
        cloudVendorRepository.deleteById(vendorID);
        return "Deleted";
    }

    @Override
    public vendorDetails getVendor(String vendorID) {
        if(cloudVendorRepository.findById(vendorID).isEmpty()){
            throw new vendorNotFoundException("vendor not found");
        }
        return cloudVendorRepository.findById(vendorID).get();
    }

    @Override
    public List<vendorDetails> showAllVendor() {
        return cloudVendorRepository.findAll();
    }



//    @Override
//    public List<vendorDetails> findByVendorName(String vendorName){
//        return cloudVendorRepository.findByVendorName(vendorName);
//    }
}
