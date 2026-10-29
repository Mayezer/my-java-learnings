package com.mayezer.coursejava.lesson_1_36_text_blocks;

public class TextBlocks {

    public static void main(String[] args) {

        // OLD - Modo antigo de se fazer
        String oldTextBlock = 
            "<html>\n" +
            "   <body>\n" +
            "       <em>Bad Java String Block</em>\n" +
            "   </body>\n" +
            "</html>\n";

        // NEW - Modo novo de se fazer
        String newTextBlock = 
            """
            <html>
                <body>
                    <em>Cool LTS Java 17 Features</em>\
                </body>
            </html>
            """;
    }
}
