package com.plesk.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

//    @Autowired
//    private TopicService topicService;

//    @RequestMapping("/topics")
//    public List<Topic> getAllTopics() {
//        return topicService.getAllTopics();
//    }

//    @RequestMapping("/topics")
//    public List<Topic> getAllTopics() {
//        return  Arrays.asList(
//                new Topic("spring", "Spring Framework", "Spring Framework Description"),
//                new Topic("java", "Core Java", "Core Java Description"),
//                new Topic("javascript", "JavaScript", "JavaScript Description")
//        );
//    }


    @RequestMapping("/topics")
    public String getAllTopics() {
        return "All Topics";
    }

}


//needs to start chapt 13, Spring Boot Quick start.