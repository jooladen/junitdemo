package com.niceinfoshop.junitdemo;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

//@Controller
@Service
//@Repository 
public class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("오류: 나누기 연산의 분모는 0이 될 수 없습니다.");
            return Double.NaN; // 예외 처리를 위해 NaN(Not-a-Number) 반환
        }
    }
    
    @PostConstruct
	public void add() {
		System.out.println("aaaaaaaaaaaaaaaaaa");
	}
}
