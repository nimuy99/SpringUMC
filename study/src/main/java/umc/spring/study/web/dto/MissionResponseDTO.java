package umc.spring.study.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// 미션 목록 조회 api 응답 형식
public class MissionResponseDTO {
    private long missionId;
    private String name;
    private String description;
    private String reward;
    private String status;
}