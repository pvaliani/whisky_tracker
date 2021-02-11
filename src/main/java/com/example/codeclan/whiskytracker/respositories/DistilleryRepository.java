package com.example.codeclan.whiskytracker.respositories;

import com.example.codeclan.whiskytracker.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// GET /distilleries
// GET /distilleries?region=Speyside
// GET /distilleries?whiskyAge=12

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long> {


    List<Distillery> findByRegion(String region);

    List<Distillery> findByWhiskiesAge(int age);

}
