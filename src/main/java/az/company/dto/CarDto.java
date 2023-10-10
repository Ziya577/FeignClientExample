package az.company.dto;

import lombok.Data;

@Data
public class CarDto {
    private String marka;
    private String model;
    private String qiymeti;

    private CountryDto country;
}