package com.example.schedulev2.controller;

import com.example.schedulev2.dto.schedule.ScheduleRequestDto;
import com.example.schedulev2.dto.schedule.ScheduleResponseDto;
import com.example.schedulev2.entity.Schedule;
import com.example.schedulev2.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor

public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<ScheduleResponseDto> saveSchedule(@RequestBody ScheduleRequestDto requestDto) {

        ScheduleResponseDto scheduleResponseDto = scheduleService.saveSchedule(requestDto.getUserName(), requestDto.getTitle(), requestDto.getContent());
        return new ResponseEntity<>(scheduleResponseDto, HttpStatus.CREATED);
    }
}
