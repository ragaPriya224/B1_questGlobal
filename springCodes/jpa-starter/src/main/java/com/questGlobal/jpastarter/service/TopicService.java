package com.questGlobal.jpastarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questGlobal.jpastarter.model.Topic;
import com.questGlobal.jpastarter.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;

//	List<Topic> topicList = new ArrayList(Arrays.asList(new Topic("1","j2ee","basic java course"),
//			new Topic("2","angular","basic angular course")));
	
	public List<Topic> getAllTopics() {

//		return topicList;
		
		List<Topic> topicList = new ArrayList();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}

	public Topic getTopic(String id) {
//		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
//		topicList.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic) {
//		for(int i = 0; i<topicList.size();i++) {
//			Topic t = topicList.get(i);
//			if(t.getId().equals(topic.getId())) {
//				topicList.set(i, topic);
//				return;
//			}
//		}
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		topicList.removeIf(t-> t.getId().equals(id));
		topicRepository.deleteById(id);
		
	}


}
