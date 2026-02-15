package com.kamaraj.studyplanner.repository;

import com.kamaraj.studyplanner.entity.Timetable;
import com.kamaraj.studyplanner.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimetableRepository extends JpaRepository<Timetable, Integer> {

    List<Timetable> findByUser(User user);

    boolean existsByUser(User user);
}
