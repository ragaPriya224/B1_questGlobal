package com.questGlobal.jpastarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.questGlobal.jpastarter.model.Topic;
import com.questGlobal.jpastarter.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	

	@GetMapping(value = "/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();

	}

	@GetMapping(value="topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	

	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		 topicService.addTopic(topic);
	}

	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable Integer id) {
		topic.setId(id);
		 topicService.updateTopic(topic);
	}

	@DeleteMapping(value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	}
	

	
}
