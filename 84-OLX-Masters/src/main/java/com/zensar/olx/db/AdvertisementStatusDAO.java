package com.zensar.olx.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olx.bean.AdvertismentStatus;

@Repository
public interface AdvertisementStatusDAO extends JpaRepository<AdvertismentStatus, Integer> {

}
