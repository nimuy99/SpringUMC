package umc.spring.study.converter;

import umc.spring.study.domain.Store;
import umc.spring.study.web.dto.RegionRequestDTO;
import umc.spring.study.web.dto.RegionResponseDTO;

import java.time.LocalDateTime;

public class RegionConverter {

    // Store 요청 형식
    public static Store toStore(RegionRequestDTO.StoreDTO request) {
        return Store.builder()
                .name(request.getName())
                .address(request.getAddress())
                .score(0.0f) // 기본값 설정
                .build();
    }

    // Store 응답 형식
    public static RegionResponseDTO.CreateStoreResultDTO toCreateStoreResultDTO(Store store) {
        return RegionResponseDTO.CreateStoreResultDTO.builder()
                .storeId(store.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }
}