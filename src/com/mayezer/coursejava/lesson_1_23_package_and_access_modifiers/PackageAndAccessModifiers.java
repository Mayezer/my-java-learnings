// Isso é um pacote, é ele que diz se nossas classes estão na mesma(o) pasta/grupo.
// Se as classes estiverem em outro pacote, ai temos que importar nosso método/função.
package com.mayezer.coursejava.lesson_1_23_package_and_access_modifiers;

public class PackageAndAccessModifiers {

    public static void main(String[] args) {

        // public - Diz se nossa classe ou método podém ser acessadas por outras classes.
        // private - Diz que não poodemos compartilhar essa classe ou método. A não ser para a própria classe em que ela foi criada.
        // default - Modificador de acesso padrão. Não precisamos declarar ele, apenas usamos class.
        // Quando não definimos um modificador de acesso a alguma classe, ela recebe default.
        // Isso significa que só podemos usar essa classe no mesmo packge que se encontra essa classe, é o tal do packge private.
        // protected - Só podemos acessar classes e métodos protegidas no mesmo pacote.
    }
}
