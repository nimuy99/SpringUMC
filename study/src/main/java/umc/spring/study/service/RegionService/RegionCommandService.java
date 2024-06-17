package umc.spring.study.service.RegionService;

import umc.spring.study.domain.Store;
import umc.spring.study.web.dto.RegionRequestDTO;

public interface RegionCommandService {
    Store addStore(Long regionId, RegionRequestDTO.StoreDTO request);
}
