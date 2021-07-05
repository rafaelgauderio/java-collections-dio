public class StreamApiDefinition {

    public static void main (String [] args ) {

        System.out.println("\nStream API\n" +
                "\n\t1. Reference Method: Recurso do Java que permite fazer referência a um médoto ou construtor de uma classe" +
                "\n\te assim indicar que ele deve ser usado em um ponto específico do código, tornando o código mais limpo e legível." +
                "\n\tPara utilizada usamos :: e nome do método sem parêntes." +
                "\n\tNa prática é um maneira de simplificar um expressão Lambda." +
                "\n\n\t2. Empressão Lamda: é um função sem declaração. Não precisa colocar nome, retorno e modificador de acesso." +
                "\n\tA ideia é usar a função no mesmo local que é declarada." +
                "\n\tSintaxe definida como (argumento) -> (corpo)" +
                "\n\tLambda é um forma de simplificar uma classe anônima." +
                "\n\n\t3. Streams API: uma opção para manipular coleções em Java seguindo os princípios da programação funcional." +
                "\n\tStream API junto com função lambda proporciona um maneira simples e objetiva de escrever código." +
                "\n\tSOURCE -> PIPELINE -> TERMINAL" +
                "\n\n\t4. Classe Anônima: É uma classe que não recebeu um nome e é declarada e instanciada em uma única instrução." +
                "\n\tUsada quando a classe será instanciada apenas 1 única vez." +
                "\n\n\t5. Funcional Interface: Qualque interface com um SAM (Single Abstract Method) é uma interface funcional." +
                "\n\tSua implementação pode ser tratada como exmpressões lambda." +
                "\n\t@functionalInterface. Exemplos: Comparator, Consumer, Function, Predicate.");

    }
}
