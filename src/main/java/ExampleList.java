import java.util.*;

public class ExampleList {

    public static void main (String [] args) {

        //Instanciando dessa maneira, dae não é possível adicionar e remover.
        List<Double> immutableGrades = Arrays.asList(7.0, 8.5,9.0,4.6,7.3,9.2, 4d);
        System.out.println(immutableGrades);

        List<Double> grades = new ArrayList<Double>(Arrays.asList(6.3, 8.5,9.2,4.6,7.3,9.7, 4d,3.7));
        grades.add(4.5);
        grades.add(5d);
        grades.remove(9.2);

        System.out.println(grades);
        System.out.println("Posição da nota 7.3 é " +grades.indexOf(7.3));

        System.out.println("Adicionar na lista a nota 5.5 na posição 4: ");
        grades.add(4,5.5);
        System.out.println(grades);

        System.out.println("Substituir a nota 6.3 por 6.6: ");
        grades.set(grades.indexOf(6.3),6.6);
        System.out.println(grades);

        System.out.println("Verificar se a nota 4.0 está na lista? " +  grades.contains(4.0));
        System.out.println("Verificar se a nota 7.0 está na lista? " +  grades.contains(7.0));

        System.out.println("\nImprimindo com o for");

        for (Double apelido: grades) {
            System.out.println(apelido);
        }

        System.out.println("Exibir a terceira nota adicionada: " + grades.get(2));

        System.out.println("Exibir a MENOR nota: " + Collections.min(grades));
        System.out.println("Exibir a MAIOR nota: " + Collections.max(grades));
        System.out.println("Exibir a soma da dos valores da lista. ");
        Iterator<Double> iterator = grades.iterator();
        Double soma=0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma = soma + next;
        }

        System.out.println("Exibir a soma da dos valores da lista: " + String.format("%.2f",soma));

        System.out.println("Exibir a média das notas: " + String.format("%.2f",soma/grades.size()));

        System.out.println("Remover a nota 4.0: " + grades.remove(4.0));
        System.out.println(grades);

        System.out.println("Remover as notas menore que 7.0 ");

        Iterator<Double> iterator1 = grades.iterator();
        while(iterator1.hasNext()) {
            Double proximo = iterator1.next();
            if(proximo <7.0) {
                iterator1.remove();
            }
        }
        System.out.println("Exibir a lista apos os valores menores que 7.0 removidos: " + grades);

        grades.clear();
        System.out.println("Imprimindo a lista vazia: " + grades);
        System.out.println("Lista está vazia? " + grades.isEmpty());

    }
}
