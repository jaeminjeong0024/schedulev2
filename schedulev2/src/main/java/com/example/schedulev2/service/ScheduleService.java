package com.example.schedulev2.service;

import com.example.schedulev2.dto.schedule.ScheduleResponseDto;
import com.example.schedulev2.entity.Schedule;
import com.example.schedulev2.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;
    public ScheduleResponseDto saveSchedule(String user, String title, String content) {

        Schedule schedule = new Schedule(user, title, content);

        Schedule savedSchedule = ScheduleRepository.save(schedule);

        return new ScheduleResponseDto(savedSchedule);
    }
}
