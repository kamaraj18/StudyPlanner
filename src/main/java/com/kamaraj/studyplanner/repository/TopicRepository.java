package com.kamaraj.studyplanner.repository;

import com.kamaraj.studyplanner.entity.Subject;
import com.kamaraj.studyplanner.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Integer> {

    List<Topic> findBySubject(Subject subject);

    List<Topic> findBySubjectAndStatusNot(Subject subject, String status);
}
