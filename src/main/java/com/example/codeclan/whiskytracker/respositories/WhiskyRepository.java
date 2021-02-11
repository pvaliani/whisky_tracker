package com.example.codeclan.whiskytracker.respositories;

import com.example.codeclan.whiskytracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findByYear(int year);

//    Point 3 on MVP of lab
//    go into the distillery, find the property called name - what's in the brackets is temporary name
//    doesnt have to match the class model

    List<Whisky> findByDistilleryNameAndAge(String distilleryName, int age);

    List<Whisky> findByDistilleryRegion(String distilleryRegion);

}
