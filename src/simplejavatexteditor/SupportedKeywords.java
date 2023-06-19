package simplejavatexteditor;

import java.util.ArrayList;

/**
 * 存储编程语言关键字和
 * 提供对它们的访问。
 *
 *使多语言支持成为可能，并可以添加新语言
 *支持方便。要添加更多关键字，请添加字符串数组和 getter
 * 到这个类。然后，在 UI.java 中更新开关语句。
 */
public class SupportedKeywords {

    private String[] supportedLanguages = {".java"};

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
