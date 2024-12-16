package I202222350.pe.edu.EF_sihuintaandy.service;

import I202222350.pe.edu.EF_sihuintaandy.dto.CarDetailDto;
import I202222350.pe.edu.EF_sihuintaandy.dto.CarDto;
import I202222350.pe.edu.EF_sihuintaandy.dto.CarUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto CarDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarUpdateDto carUpdateDto) throws Exception;
}
