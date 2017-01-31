package com.capgemini.trafficlight;

import com.capgemini.trafficlight.exception.FunctionalException;
import com.capgemini.trafficlight.exception.FunctionalReason;

/**
 * Enumeration for trffic light colors
 * 
 * @author fbontemp
 *
 */
public enum Color {
    RED("0", "Red"), YELLOW("1", "Yellow"), GREEN("2", "Green");

    private final String code;
    private final String label;

    private Color(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public static Color getColorFromCode(String code) throws FunctionalException {
        switch (code) {
        case "0":
            return RED;
        case "1":
            return YELLOW;
        case "2":
            return GREEN;
        default:
            throw new FunctionalException(FunctionalReason.COLOR_NOT_FOUND);
        }
    }

}