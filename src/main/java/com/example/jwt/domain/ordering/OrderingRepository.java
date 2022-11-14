package com.example.jwt.domain.ordering;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderingRepository extends JpaRepository<Ordering, UUID> {
}
