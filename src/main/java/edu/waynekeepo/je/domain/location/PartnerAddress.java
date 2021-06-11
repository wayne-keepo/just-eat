package edu.waynekeepo.je.domain.location;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartnerAddress {
    private String country;
    private String region;
    private String city;
    private String district;
    private String street;
    private House house;
    private String description;
    private AddressCoordinate coordinate;
}
