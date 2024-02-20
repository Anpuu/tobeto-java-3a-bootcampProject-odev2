package com.tobeto.bootcampproject.services;

import com.tobeto.bootcampproject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcampproject.model.entities.Instructor;

public interface InstructorCreateService {
    Instructor create(
            final InstructorCreateRequest instructorCreateRequest
    );
}
