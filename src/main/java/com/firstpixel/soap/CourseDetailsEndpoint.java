package com.firstpixel.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.firstpixel.courses.*;

@Endpoint
public class CourseDetailsEndpoint {

	@PayloadRoot(namespace="http://firstpixel.com/courses", 
			localPart="GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse 
	processGetCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(request.getId());
		courseDetails.setName("Microservice Course");
		courseDetails.setDescription("This is the description of the course");
		response.setCourseDetails(courseDetails);
		return response;
	}
	
}
