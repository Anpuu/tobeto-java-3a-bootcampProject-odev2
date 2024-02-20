package com.tobeto.bootcampproject.model.dto.instructor.request;

import com.tobeto.bootcampproject.model.dto.user.request.UserCreateRequest;
import lombok.Getter;


@Getter
public class InstructorCreateRequest extends UserCreateRequest {
    private String companyName;
}
