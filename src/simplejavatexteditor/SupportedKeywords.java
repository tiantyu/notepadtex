package simplejavatexteditor;

import java.util.ArrayList;

/**
 * <h1>A class to store the programming language keywords and
 * provide access to them.</h1>
 *
 * <p>Makes multiple language support possible and makes adding new language
 * support convenient. To add more keywords, add a string array and getters
 * to this class. Then, update the switch statement in UI.java.</p>
 */
public class SupportedKeywords {

    private String[] supportedLanguages = {".cpp",".java"};

    private String[] java = {"abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "System", "out", "print()", "println()",
            "new", "null", "package", "private", "protected", "public", "interface",
            "long", "native", "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while", "String"};



    public String[] getSupportedLanguages() {
        return supportedLanguages;
    }

    private String[] brackets = { "{", "(" };
    private String[] bCompletions = { "}", ")" };
    public String[] getJavaKeywords() {
        return java;
    }

    public ArrayList<String> getBracketCompletions() {
        ArrayList<String> al = new ArrayList<>();
        for(String completion : bCompletions) {
            al.add(completion);
        }
        return al;
    }
    public ArrayList<String> getBrackets() {
        ArrayList<String> al = new ArrayList<>();
        for(String completion : brackets) {
            al.add(completion);
        }
        return al;
    }
    public ArrayList<String> setKeywords(String[] arr) {
        ArrayList<String> al = new ArrayList<>();
        for(String words : arr) {
            al.add(words);
        }
        return al;
    }

}
