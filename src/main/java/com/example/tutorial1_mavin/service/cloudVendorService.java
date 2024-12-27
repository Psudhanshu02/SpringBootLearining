package com.example.tutorial1_mavin.service;

import com.example.tutorial1_mavin.model.vendorDetails;

import java.util.List;

public interface cloudVendorService {
    public String createVendor(vendorDetails vendorDetails);
    public String updateVendor(vendorDetails vendorDetails);
    public String deleteVendor(String vendorID);
    public vendorDetails getVendor(String vendorID);
    public List<vendorDetails> showAllVendor();



}
