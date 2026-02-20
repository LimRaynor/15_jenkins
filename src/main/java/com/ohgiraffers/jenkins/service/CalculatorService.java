package com.ohgiraffers.jenkins.service;

import org.springframework.stereotype.Service;

import com.ohgiraffers.jenkins.dto.CalculatorDto;

@Service
public class CalculatorService {
    public int plusTwoNumbers(CalculatorDto calculatorDto) {
        return calculatorDto.getNum1() + calculatorDto.getNum2();
    }
}
