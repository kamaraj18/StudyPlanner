package com.kamaraj.studyplanner.repository;

import com.kamaraj.studyplanner.entity.Subject;
import com.kamaraj.studyplanner.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    List<Subject> findByUser(User user);
}
