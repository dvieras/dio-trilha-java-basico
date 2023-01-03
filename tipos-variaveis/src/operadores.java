public class operadores {
    public static void main(String[] args) {

        String nomeUm = "David";
        String nomeDois = new String("David");

        System.out.println(nomeUm.equals(nomeDois)); // compara conteudo de classes diferentes 

        int valor1 = 5;
        int valor2 = 2;

        String resultado = valor1 == valor2 ? "verdadeiro" : "falso"; // operador ternario

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean SimNao = numero1 == numero2;

       if (numero1 < numero2) {
        System.out.println("A nossa condição é verdadeira");
       }

        System.out.println("numeroUm é igual a numeroDois ?" + SimNao);

        SimNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois ?" + SimNao);

        SimNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois ?" + SimNao);

       // operadores logicos 

       boolean condicao1 = true;
       boolean condicao2 = false;

       if (condicao1 && condicao2) {
        System.out.println("as duas condições são verdadeiras");
       }

       if (condicao1 && (7 > 4)) {
        System.out.println("as duas condições são verdadeiras");
       }

       if (condicao1 || condicao2) {
        System.out.println("uma das condições são verdadeiras");
       }

       System.out.println("fim");

    }
}
