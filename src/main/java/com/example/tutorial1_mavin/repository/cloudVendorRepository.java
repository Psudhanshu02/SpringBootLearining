package com.example.tutorial1_mavin.repository;

import com.example.tutorial1_mavin.model.vendorDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cloudVendorRepository extends JpaRepository<vendorDetails, String> {
}
