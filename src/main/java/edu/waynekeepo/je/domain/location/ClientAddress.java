package edu.waynekeepo.je.domain.location;


import edu.waynekeepo.je.domain.DomainID;

public class ClientAddress extends DomainID {
    private Country country;
    private Region region;
    private City city;
    private District district;
    private Street street;
    private House house;
    private String description;
    private AddressCoordinate coordinate;
}
