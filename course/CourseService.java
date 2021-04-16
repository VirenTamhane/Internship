package com.example.demo.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service						//Marks this class as business service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {							//Working
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String id) {				//Working
		return courseRepository.findById(id);
	}

	public void addCourse(Course courses) {							//Working
		courseRepository.save(courses);
	}

	public void updateCourse(Course courses) {			//Working
		courseRepository.save(courses);
	}

	public void deleteCourse(String id) {						//Working
		courseRepository.deleteById(id);
	}
}
