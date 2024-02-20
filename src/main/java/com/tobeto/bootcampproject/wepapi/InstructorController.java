package com.tobeto.bootcampproject.wepapi;

import com.tobeto.bootcampproject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcampproject.model.entities.Instructor;
import com.tobeto.bootcampproject.services.InstructorCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/instructors")
@RequiredArgsConstructor
public class InstructorController {
    private final InstructorCreateService instructorCreateService;


    // TODO: instructor oluşturma
    // TODO: instrur'a id üzerinden erişme
    // TODO: bütün instructorlara erişe
    // TODO: url üzerinden belirtilen instructarı güncelleyen endpoint
    // TODO: id değeri url üzerinden belirtilen instructorı silen endpoint

    @PostMapping
    public Instructor createInstructor(
            @RequestBody final InstructorCreateRequest instructorCreateRequest
    ) {
        final Instructor createdInstructor = instructorCreateService.create(instructorCreateRequest);

        return createdInstructor;
    }

}