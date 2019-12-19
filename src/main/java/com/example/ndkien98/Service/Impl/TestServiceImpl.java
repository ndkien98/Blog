package com.example.ndkien98.Service.Impl;

import com.example.ndkien98.DTO.TestDTO;
import com.example.ndkien98.Repository.TestRepo;
import com.example.ndkien98.Service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepo testRepo;

    @Override
    public void add(TestDTO testDTO) {



    }
}
