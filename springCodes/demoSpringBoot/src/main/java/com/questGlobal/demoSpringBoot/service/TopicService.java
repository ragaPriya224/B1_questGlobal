package com.questGlobal.demoSpringBoot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.questGlobal.demoSpringBoot.model.Topic;

@Service
public class TopicService {

	List<Topic> topicList = new ArrayList(Arrays.asList(new Topic("1","j2ee","basic java course"),
			new Topic("2","angular","basic angular course")));
	public List<Topic> getAllTopics() {

		return topicList;
	}

	public Topic getTopic(String id) {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicList.add(topic);
	}

	public void updateTopic(Topic topic) {
		for(int i = 0; i<topicList.size();i++) {
			Topic t = topicList.get(i);
			if(t.getId().equals(topic.getId())) {
				topicList.set(i, topic);
				return;
			}
		}

	}

	public void deleteTopic(String id) {
		topicList.removeIf(t-> t.getId().equals(id));
		
	}


}
