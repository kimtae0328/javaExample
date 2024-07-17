package com.human.a_variable;

import java.util.Scanner;

public class Point {
    // 필드, 지역변수
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Point p = new Point();
        p.getPoint();
        
    }
    // 접근제한자를 주지 않은경우, 같은 패키지 내부에서만 사용 가능
    // private : 외부에서 접근 불가
    private void getPoint(){
        double korean, math, english, average;
        String avStr;

        // 사용자로부터 성적을 입력받음
        System.out.println("국어(p) :");
        korean = scan.nextDouble();
        System.out.println("수학(p) :");
        math = scan.nextDouble();
        System.out.println("영어(p) :");
        english = scan.nextDouble();

        // 국어, 영어, 수학
        System.out.println("사용자 정보");
        System.out.printf("국어 : %.1f, 수학 : %.1f, 영어 : %.1f\n", korean, math, english);

        // 평균을 구함
        average = (korean + math + english)/3;

        if(average>=90){
            avStr = "A";
        }else if(average>=80){
            avStr = "B";
        }else if(average>=70){
            avStr = "C";
        }else if(average>=60){
            avStr = "D";
        }else {
            avStr = "F";
        }
        // 등급을 출력 (>=90 A, >=80 B, >=70 C, >=60 D, F)
        System.out.printf("당신의 점수는 %.1f이고, 등급은 %s 입니다\n", average, avStr);

    }
}
