package com.example.tutorial1_mavin.repository;

import com.example.tutorial1_mavin.model.vendorDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface cloudVendorRepository extends JpaRepository<vendorDetails, String> {
//    List<vendorDetails> findByVendorName(String vendorname);
}
