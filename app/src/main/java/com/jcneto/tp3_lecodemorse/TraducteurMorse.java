package com.jcneto.tp3_lecodemorse;

/**
 * Created by jcneto on 18-04-09.
 */

public interface TraducteurMorse {

    /**
     * Traduit du code Morse international en caracteres latins.
     * Les symboles permis sont ., -, / et l'espace. Si la chaine
     * fournie n'est pas du Morse, ...
     *
     * @param morse Une chaine de caracteres contenant un message en code Morse
     * @return L'equivalent en caracteres latins.
     */
    public String toAlpha(String morse);

    /**
     * Traduit une chaine de caracteres latins en code Morse
     * international a l'aide des symboles . (ti) , - (taah),
     * / (fin mot) et l'espace (fin de caractere). Les caracteres
     * permis sont les caracteres alphanumeriques, l'espace et le
     * point. Si la chaine fournie n'est pas valide, ...
     *
     * @param alpha Une chaine de caracteres contenant un message en caracteres alphanumeriques
     * @return L'equivalent en code Morse.
     *
     */
    public String toMorse(String alpha);

    /**
     * Transforme ou retire les caracteres interdit de la chaine recue.
     * Les accents sont enleves des lettres et tous les caracteres sont
     * mis en majuscules. Les caracteres permis sont les majuscules de
     * A a Z (sans accent), le point et l'espace.
     *
     * @param alpha Une chaine de caracteres.
     * @return La meme chaine, en majuscule, sans accents et sans caracteres speciaux, sauf le point et l'espace.
     *
     */
    public String nettoyerAlpha(String alpha);

    /**
     * Retourne le nom des programmeurs qui ont implemente
     * l'interface.
     *
     * @return Le nom des programmeurs qui ont implemente l'interface.
     *
     */
    public String getNomProgrammeurs();

}
