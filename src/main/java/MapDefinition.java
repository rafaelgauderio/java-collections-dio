public class MapDefinition {

    public static void main(String [] args) {
        System.out.println("MAP" +
                "\n\tMap não extend da interface collections" +
                "\n\tjava.util.Map" +
                "\n\tElementos únicos (key) para cada valor (value)" +
                "\n\tPosso colocar objetos complexos e primitivos na coleção Map" +
                "\n\tTreeMap tem a pior performance, não permite chaves nulas, ordena pela Key e utiliza árvore como estrutura de dados." +
                "\n\tHashmap utiliza List of Buckets como estrutura de dados, não preserva a ordem de inserção." +
                "\n\tLinkedHashedMap utilizada doble list of bucketes, preserva a ordem que itens fores inseridos." +
                "\n\tMétodo values() retorna uma Collection e o método keySet() retorna um Set.");
    }


}
