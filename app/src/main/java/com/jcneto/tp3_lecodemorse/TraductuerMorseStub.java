package com.jcneto.tp3_lecodemorse;

public class TraductuerMorseStub implements TraducteurMorse {
    @Override
    public String getNomProgrammeurs() {
        return "Stub";
    }

    @Override
    public String toAlpha(String morse) {
        if (morse.equals("."))
            return "E";
        if (morse.equals(".."))
            return "I";
        if (morse.equals("..."))
            return "S";
        return null;
    }

    @Override
    public String toMorse(String alpha) {
        if (alpha.equals("E"))
            return ".";
        if (alpha.equals("I"))
            return "..";
        if (alpha.equals("S"))
            return "...";
        return null;
    }

    @Override
    public String nettoyerAlpha(String alpha) {
        return alpha.toUpperCase();
    }
}