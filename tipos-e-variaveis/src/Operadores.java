import java.util.Date;

public class Operadores {

    public static void main(String[] args) {
        //Tipos de operadores lógicos associados a progrsmsd
        // Realizam operações para obter um resultado
        //Classificando operadores lógicos
        //Operador de atribuição representado pelo símbolo =, atribui ou muda o valor de uma variavel
        //Exemplos

        String nome = "Thaislaine";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date ();

        //Aritméticos Realizam operações matemáticas
        //Exemplos

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicação = 20 * 7;
        int divisão = 15/3;
        int modulo = 18 % 3;
        double resultado = (10*7) + (20/4);

//Operadores untários executa apenas operações positivas, convertendo inclusive as negativas
//operador incremento ++, decremento --, negação !, adição +
//Exemplo

int abacate = 5;

System.out.print(- abacate);

//Dessa forma o numero aparece posito;
//para que se torne realmente negativo faz o seguinte

abacate = abacate * -1;

System.out.print(abacate);

//Fluxo de repetição

int novo = 4;

novo = novo + 2;

System.out.print(novo);

//Novo +1 é a mesma representação de novo ++;

System.out.print( ++ novo ); // a regra para decremento é o mesmo

System.out.print( novo );

boolean variavel = true;

System.out.print(!variavel);

System.out.print(variavel);}

// Operador ternario representado or (?:)
// usado em expressões booleanas (?) true e (:) false

public static void main(String[] args) {

int a, b;

a = 2;
b = 1;

String resultado = "";

if(a==b)
    resultado = "verdadeiro";
else
    resultado = "falso";

System.out.print(resultado);}

/*Exemplo de condicional utilizando IF/Else 
if(a==b)
    resultado "verdadeiro";
else
    resultado "falso";*/















    }
    
}
