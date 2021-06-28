import java.util.*;

public class ExampleSet {

    public static void main(String [] args) {

        System.out.println("java.util.set\n" +
                "1. Não permite elementos duplicados;\n" +
                "2. Não possui índice (tem tem métodos como o indeof());\n" +
                "Hashset: NÃO mantém a ordem dos elementos, melhor perfomance, permite 1 elemento null.\n" +
                "LinkedHashSet: mantém a ordem dos elementos na ordem que forem adicionados, performance média, permite 1 elemento null.\n" +
                "TreeSet: mantém a ordem natural dos elementos, pior perfomance, não permite nenhum elemento null.\n");

        System.out.println("Criar uma HahsSet List e adicionar as notas: ");
        Set<Double> grades = new HashSet<Double>(Arrays.asList(7.0, 8.5,9.0,4.6,7.3,9.2, 4d,3.4));
        System.out.println(grades);

        System.out.println("Exibir a posição da nota 9.0: " + "Não é possível, pois Set não tem índice");

        System.out.println("Adicinar uma nota 9.5 na posição 3: " + "Não tem com fazer com HashSet");

        System.out.println("Conferir se a nota 4.0 está no conjunto? " + grades.contains(4.0));

        System.out.println("Exibir a menor nota: " + Collections.min(grades));

        System.out.println("Exibir a maior nota: " + Collections.max(grades));

        Iterator<Double> iterator = grades.iterator();
        Double soma=0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma = soma + next;
        }

        System.out.println("O somatório das notas é :" + String.format("%.2f",soma));

        System.out.println("Exibir a média das notas: " + String.format("%.2f",soma/grades.size()));

        System.out.println("Remover a nota 9.0: ");
        grades.remove(9.0);
        System.out.println(grades);

        Iterator<Double> iterator1 = grades.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next <7.0) {
                iterator1.remove();
            }
        }
        System.out.println("Exibir a lista após os valores menores que 7.0 removidos: " + grades);

        System.out.println("Exibir toda as notas na ordem que forem informadas, LinkedHashSet:");
        // linkedHashSet respeita a ordem que foram adicionados e não aceita números repetidos
        Set<Double> grades2 = new LinkedHashSet<Double>();
        grades2.add(7.0);
        grades2.add(8.5);
        grades2.add(9.0);
        grades2.add(4.6);
        grades2.add(7.3);
        grades2.add(9.2);
        grades2.add(4d);
        grades2.add(3.4);
        grades2.add(9.0);
        System.out.println(grades2);

        System.out.println("Exibir todas as notas na ordem crescente: ");
        // TreeSet respeita a ordem que foram adicionados e não aceita números repetidos
        Set<Double> grades3 = new TreeSet<>(grades2);
        System.out.println(grades3);

        grades.clear();
        grades2.clear();

        System.out.println("grades: " + grades);
        System.out.println("grades2: " + grades2);
        System.out.println("grades3: " + grades3);

        System.out.println("Grades está vazio? " + grades.isEmpty());
        System.out.println("Grades3 está vazio? " + grades3.isEmpty());














    }
}
