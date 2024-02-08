package com.CHB.StartFlow.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private int id;                 // 선수 아이디
    private String name;            // 선수 이름
    private String weight;          // 선수 체중
    private String height;          // 선수 키
    private String birth;           // 선수 생년월일
    private String country;         // 선수 국적
//    private String career;      	// 선수 경력 (팀 전적, 이적내역)
//    private String updateDate;  	// 정보 업데이트 일시
//    private String team;        	// 소속 팀
//    private String position;    	// 선수 포지션
//    private String joinDate;    	// 선수 입단일
//    private String status;      	// 선수 상태 (활동, 부상)
//    private int apps;           	// 선수 출선 횟수
}
