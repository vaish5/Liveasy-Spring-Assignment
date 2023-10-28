package com.liveasyspringrest.liveasyspringrestassignment.dao;

import com.liveasyspringrest.liveasyspringrestassignment.entities.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoadDao extends JpaRepository<Load, Long> {
    Load findByshipperId(Long shipperId);

    Optional<Load> findByShipperId(long shipperId);
}
