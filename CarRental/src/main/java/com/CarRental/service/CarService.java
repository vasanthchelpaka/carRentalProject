package com.CarRental.service;

import com.CarRental.Controller.bean.Cars;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Component
public interface CarService {
    List<Cars> getCarByCarId(LocalDate bookfrom, LocalDate bookto,String type);
}
