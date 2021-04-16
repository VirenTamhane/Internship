package com.example.demo.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.Topic;

@RestController
public class CourseController {

	@Autowired							//Marks this if it needs any dependency
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/course")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicId}/course/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {	//@PathVariable gives variable from url to function
		return courseService.getCourse(id);
	}

	@RequestMapping(value = "/topics/{topicId}/course", method = RequestMethod.POST)
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {	//@RequestBody converts JASON to JAVA 
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(value = "/topics/{topicId}/course/{id}", method = RequestMethod.PUT)
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId) {	//PUT is used for update
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(value = "/topics/{topicId}/course/{id}", method = RequestMethod.DELETE)
	public void deleteCourse(@RequestBody Course course, @PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
