package I202222350.pe.edu.EF_sihuintaandy.response;

import I202222350.pe.edu.EF_sihuintaandy.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code,
                               String error,
                               List<CarDto> cars) {
}
