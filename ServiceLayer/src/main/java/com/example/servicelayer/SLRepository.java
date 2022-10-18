package com.example.servicelayer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SLRepository extends JpaRepository<Users, Long> {
}
