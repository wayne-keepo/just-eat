package edu.waynekeepo.je.domain.location;

@Deprecated
public enum Country {
    RUSSIA("Russia", "Россия", "RU", "RUS", 643);

    private final String en;
    private final String ru;
    private final String alpha2;      // ISO 3166-1 alpha-2 — двубуквенные
    private final String alpha3;      // ISO 3166-1 alpha-3 — трёхбуквенные
    private final int numericCode;    // ISO 3166-1 numeric — цифровые

    Country(String en, String ru, String alpha2, String alpha3, Integer numericCode) {
        this.en = en;
        this.ru = ru;
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.numericCode = numericCode;
    }

    public String en() {
        return en;
    }

    public String ru() {
        return ru;
    }

    public String alpha2Code() {
        return alpha2;
    }

    public String alpha3Code() {
        return alpha3;
    }

    public int numericCode() {
        return numericCode;
    }
}