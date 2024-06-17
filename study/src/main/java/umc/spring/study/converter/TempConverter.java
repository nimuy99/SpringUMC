package umc.spring.study.converter;

import umc.spring.study.web.dto.TempResponseDTO;

public class TempConverter {

    // 테스트 API
    public static TempResponseDTO.TempTestDTO toTempTestDTO(){
        return TempResponseDTO.TempTestDTO.builder()
                .testString("This is Test!")
                .build();
    }

    // 예외 처리를 위한 작업
    public static TempResponseDTO.TempExceptionDTO toTempExceptionDTO(Integer flag){
        return TempResponseDTO.TempExceptionDTO.builder()
                .flag(flag)
                .build();
    }
}
