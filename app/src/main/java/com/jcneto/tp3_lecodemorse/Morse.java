package com.jcneto.tp3_lecodemorse;

import java.lang.String;

enum Morse {

        A('A', ".-"),
        B('B', "-..."),
        C('C', "-.-."),
        D('D', "-.."),
        E('E', "."),
        F('F', "..-."),
        G('G', "--."),
        H('H', "...."),
        I('I', ".."),
        J('J', ".---"),
        K('K', "-.-"),
        L('L', ".-.."),
        M('M', "--"),
        N('N', "-."),
        O('O', "---"),
        P('P', ".--."),
        Q('Q', "--.-"),
        R('R', ".-."),
        S('S', "..."),
        T('T', "-"),
        U('U', "..-"),
        V('V', "...-"),
        W('W', ".--"),
        X('X', "-..-"),
        Y('Y', "-.--"),
        Z('Z', "--.."),
        ZERO('0', "-----"),
        UN('1', ".----"),
        DEUX('2', "..---"),
        TROIS('3', "...--"),
        QUATRE('4', "....-"),
        CINQ('5', "....."),
        SIX('6', "-...."),
        SEPT('7', "--..."),
        HUIT('8', "---.."),
        NEUF('9', "----."),
        PONIT('.', ".-.-.-");


        private char alpha;
        private String morse;

        Morse(char alpha, String morse) {
            this.alpha = alpha;
            this.morse = morse;
        }

        Morse(String s) {


        }

        @Override
        public String toString() {
            return "Morse {" +
                    "alpha = " + alpha +
                    ", morse = '" + morse + '\'' +
                    '}';
        }


        public char getAlpha() {
            return this.alpha;
        }

        public String getMorse() {
            return this.morse;
        }


}
