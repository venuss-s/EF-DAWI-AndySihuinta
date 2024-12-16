package I202222350.pe.edu.EF_sihuintaandy.response;

import I202222350.pe.edu.EF_sihuintaandy.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto carDetailDto) {
}
