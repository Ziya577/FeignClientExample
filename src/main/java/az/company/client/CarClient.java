package az.company.client;

import az.company.dto.CarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "car-service", url = "http://localhost:8081/car/get")
public interface CarClient {

    @GetMapping
    List<CarDto> cars(@RequestHeader("Authorization") String authorizationHeader);

}
