package com.mayezer.coursejava.lesson_1_32_stream_api;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Mayezer Sanatana");
        list.add("Mayezer Souza");
        list.add("Mayezer Caitano");
        list.add("Samara Santana");
        list.add("Samara Souza");
        list.add("Samara Caitano");

        // Trasformamos nossa Lista em stream, e podemos usar os métodos dessa stream().
        List<String> mayezerList = list
            .stream()
            .filter(name -> name.startsWith("Mayezer")) // Filtrar todos os nomes Mayezer
            .map(String::toUpperCase) // Deixa todos os nome em letras maiúsculas - Podemos usar também: .map(name -> name.toUpperCase())
            //.reduce("Mayezer", (a, b) -> a + ", " + b) - Soma todos os Mayezers, trasformando em uma String única.
            
            .toList();
        // Estamos filtrando somente quem se chama 'Mayezer', e transformando em uma lista - toList()
        // Transformamos em uma stream, mas se quisermos retornar esse valor, devemos transformar ele novamente em uma lista.

        System.out.println(mayezerList); // Retorna toda a nossa lista com todos os cadastros de 'Mayezers'


        // NOTA: É muito importante, se usa muito, estude bastante até entender.
    }
}
