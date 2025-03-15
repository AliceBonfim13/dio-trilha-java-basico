public class For {
    public static void main(String[] args) throws Exception {
        for(int carneirinhos = 1; carneirinhos <=20; carneirinhos++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        String nome [] = {"julia", "marcos", "fernando", "marcela"};
        for(int x = 0; x < nome.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + nome[x]);
        }

        String alunos [] = {"Alice", "Ingrid", "Ana", "Bruna", "Marcelo"};

        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        for(int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                // break;
                continue;
    
            }
            System.out.println(numero);
        }
    }
}
