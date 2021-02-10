package com.example.codeclan.whiskytracker.respositories;

import com.example.codeclan.whiskytracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {
}
