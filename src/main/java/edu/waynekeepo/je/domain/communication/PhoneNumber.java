package edu.waynekeepo.je.domain.communication;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneNumber {
    private String countryCode;
    private String operatorCode;
    private String subscriberNumber;
}
