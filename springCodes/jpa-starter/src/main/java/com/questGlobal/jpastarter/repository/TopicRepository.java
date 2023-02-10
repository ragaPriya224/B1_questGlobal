package com.questGlobal.jpastarter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.questGlobal.jpastarter.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{

}
