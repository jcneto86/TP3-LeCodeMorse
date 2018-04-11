package com.jcneto.tp3_lecodemorse;

import java.lang.String;

/**
 * Created by jcneto on 18-04-09.
 */

public enum Morse {

    A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--.."),
    ZERO('0', "-----"),
    ONE('1', ".----"),
    TWO('2', "..---"),
    THREE('3', "...--"),
    FOUR('4', "....-"),
    FIVE('5', "....."),
    SIX('6', "-...."),
    SEVEN('7', "--..."),
    EIGHT('8', "---.."),
    NINE('9', "----.");

    private char character;
    private String code;

    private Morse(char character, String code) {
        this.character = character;
        this.code = code;
    }

    Morse(String s) {


    }

    public char getCharacter() {
        return character;
    }

    public String getCode() {
        return code;
    }
}
