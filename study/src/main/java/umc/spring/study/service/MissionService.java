package umc.spring.study.service;

import org.springframework.stereotype.Service;
import umc.spring.study.web.dto.MissionResponseDTO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MissionService {

    public List<MissionResponseDTO> getMissionsByStatus(String status) {
        // 더미 데이터 생성
        List<MissionResponseDTO> dummyMissions = Arrays.asList(
                new MissionResponseDTO(1L, "가게이름A", "12,000원 이상", "5%", "completed"),
                new MissionResponseDTO(2L, "가게이름B", "15,000원 이상", "10%", "completed"),
                new MissionResponseDTO(3L, "가게이름C", "20,000원 이상", "15%", "challenging"),
                new MissionResponseDTO(4L, "가게이름D", "20,000원 이상", "15%", "challenging"),
                new MissionResponseDTO(5L, "가게이름E", "20,000원 이상", "15%", "completed")
        );

        // 요청된 status와 일치하는 미션만 필터링하여 반환
        return dummyMissions.stream()
                .filter(mission -> mission.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }
}
