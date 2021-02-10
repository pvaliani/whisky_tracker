package com.example.codeclan.whiskytracker.respositories;

import com.example.codeclan.whiskytracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findByYear(int year);

    List<Whisky> findByDistilleryNameAndAge(String distilleryName, int age);

    List<Whisky> findByDistilleryRegion(String distilleryRegion);

}
