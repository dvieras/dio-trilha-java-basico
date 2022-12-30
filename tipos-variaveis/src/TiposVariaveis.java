public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        // tipo primitivos:

        String nome = "David";
        char sexo = 'M';
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 99999999999L; // Utilizar 'L' no final do valor atribuido;
        float pi = 3.14F; // Utilizar 'F' no final do valor atribuido;
        double salario = 1275.33;
        boolean verdadeFalso = true;
        
        //testes

        int numero = 5;
        System.out.println(numero);
        numero = 10;
        System.out.println(numero);

        String primeiroNome = "David";
        String segundoNome = "Emrich";
        String nomeCompleto;
        nomeCompleto = primeiroNome.concat(" ").concat(segundoNome);

        System.out.println(nomeCompleto);

    }
}
