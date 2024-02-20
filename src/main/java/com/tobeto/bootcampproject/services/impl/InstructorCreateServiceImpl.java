package com.tobeto.bootcampproject.services.impl;

import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import com.tobeto.bootcampproject.dataAccess.InstructorRepository;
import com.tobeto.bootcampproject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcampproject.model.entities.Instructor;
import com.tobeto.bootcampproject.services.InstructorCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InstructorCreateServiceImpl implements InstructorCreateService {
    private final InstructorRepository instructorRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public Instructor create(
            final InstructorCreateRequest instructorCreateRequest
    ) {
        final Instructor instructorToBeSave = modelMapperService.forRequest()
                .map(instructorCreateRequest,Instructor.class);

        return instructorRepository.save(instructorToBeSave);
    }
}
