package com.ohgiraffers.jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohgiraffers.jenkins.dto.CalculatorDto;
import com.ohgiraffers.jenkins.service.CalculatorService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorService calculatorService;

    @GetMapping("/health")
    public String healthCheck() {
        return "jenkins pipeline success check!!@!!@";
    }

    @GetMapping("/plus")
    public ResponseEntity<CalculatorDto> plusTwoNumbers(CalculatorDto calculatorDto) {
        log.info("✨핸들러 메소드 실행 여부 및 값 확인!!!!!!!!! : {}", calculatorDto);

        /* Service 계층으로 기능 요청 */
        int result = calculatorService.plusTwoNumbers(calculatorDto);

        log.info("🔥서비스 계층 결과값 리턴 확인!!!!!!! {}", result);
        calculatorDto.setSum(result);

        return ResponseEntity.ok(calculatorDto);
    }
}
