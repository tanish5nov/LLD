package DesignPatterns.AbstractFactoryPattern;

public enum CarTypes {
    LUXURY("luxury"),
    ECONOMY("economy");

    private final String value;

    CarTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
