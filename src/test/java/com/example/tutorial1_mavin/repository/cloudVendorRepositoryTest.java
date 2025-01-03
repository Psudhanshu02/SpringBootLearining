package com.example.tutorial1_mavin.repository;

import com.example.tutorial1_mavin.model.vendorDetails;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cache.annotation.EnableCaching;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@EnableCaching
//@SpringBootTest
@DataJpaTest
public class cloudVendorRepositoryTest {

    @Autowired
    private cloudVendorRepository cloudVendorRepository_1;
    vendorDetails vendorDetails;

    @BeforeEach
    void setUp() {
        vendorDetails =new vendorDetails("100","Amazon","XXXXXXXXXX","bangalore");

    }

    @AfterEach
    void tearDown() {
        vendorDetails=null;
        cloudVendorRepository_1.deleteAll();
    }

    @Test
    void testFindByName_found(){
        vendorDetails cloudVendorList=cloudVendorRepository_1.findById("100").get();
        System.out.println("bsdk tere :"+cloudVendorList.getId());
        assertThat(cloudVendorList.getId()).isEqualTo(vendorDetails.getId());
    }
}
