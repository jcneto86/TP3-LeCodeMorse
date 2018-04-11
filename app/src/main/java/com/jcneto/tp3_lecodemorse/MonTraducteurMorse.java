package com.jcneto.tp3_lecodemorse;


public class MonTraducteurMorse implements TraducteurMorse {

    /**
     * Traduit du code Morse international en caracteres latins.
     * Les symboles permis sont ., -, / et l'espace. Si la chaine
     * fournie n'est pas du Morse, ...
     *
     * @param morse Une chaine de caracteres contenant un message en code Morse
     * @return L'equivalent en caracteres latins.
     */
    public String toAlpha(String morse) {
        return "";
    }

    /**
     * Traduit une chaine de caracteres latins en code Morse
     * international a l'aide des symboles . (ti) , - (taah),
     * / (fin mot) et l'espace (fin de caractere). Les caracteres
     * permis sont les caracteres alphanumeriques, l'espace et le
     * point. Si la chaine fournie n'est pas valide, ...
     *
     * @param alpha Une chaine de caracteres contenant un message en caracteres alphanumeriques
     * @return L'equivalent en code Morse.
     */
    public String toMorse(String alpha) {
        return "";
    }

    /**
     * Transforme ou retire les caracteres interdit de la chaine recue.
     * Les accents sont enleves des lettres et tous les caracteres sont
     * mis en majuscules. Les caracteres permis sont les majuscules de
     * A a Z (sans accent), le point et l'espace.
     *
     * @param alpha Une chaine de caracteres.
     * @return La meme chaine, en majuscule, sans accents et sans caracteres speciaux, sauf le point et l'espace.
     */
    public String nettoyerAlpha(String alpha) {
        String alphaNettoyer = alpha.toUpperCase();
        alphaNettoyer.replaceAll("\\^[ÉËÈÊ]", "E");
        alphaNettoyer.replaceAll("[ÁÄÀÃÂ]", "A");
        alphaNettoyer.replaceAll("[ÍÏÌÎ]", "I");
        alphaNettoyer.replaceAll("[ÓÖÒÕÔ]", "O");
        alphaNettoyer.replaceAll("[Ç]", "C");
        return alphaNettoyer;
    }

    /**
     * Retourne le nom des programmeurs qui ont implemente
     * l'interface.
     *
     * @return Le nom des programmeurs qui ont implemente l'interface.
     */
    public String getNomProgrammeurs() {
        String NomProgrammeurs = "João Carlos Fernandes Neto";
        return NomProgrammeurs;
    }
}
