import java.util.*;

public class ExampleMap {

    public static  void main(String [] args) {

        System.out.println("Criar um dicionário que relacione os modelos e seus respectivos consumos: ");
        HashMap<String, Double> popularCars = new HashMap<>();
        popularCars.put("Fusca",7.5);
        popularCars.put("Chevete",9.5);
        popularCars.put("Belina",6.3);
        popularCars.put("Marajo",5.4);
        popularCars.put("Opalao",3.4);
        popularCars.put("Elba",9.5);
        popularCars.put("Corcel II",3.4);
        System.out.println(popularCars.toString());

        System.out.println("\nExibir os modelos: ");
        Set<String> models = popularCars.keySet();
        System.out.println(models);

        System.out.println("\nExibir os consumos dos carros: ");
        Collection<Double> consumption = popularCars.values();
        System.out.println(consumption);


        System.out.println("\nSubstituir o consumo da Marajó por 6,7 km/l: ");
        popularCars.put("Marajo",6.7);
        System.out.println(popularCars);

        System.out.println("\nConferir se o modelo Opalão está no dicionário: " + popularCars.containsKey("Opalao"));

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");

        Double moreEfficientConsumption = Collections.max(popularCars.values());
        Set<Map.Entry<String,Double>> entries = popularCars.entrySet();
        String mostEfficientModel = "";

        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(moreEfficientConsumption)) {
                mostEfficientModel = entry.getKey();
                System.out.println("Most efficient model: " + mostEfficientModel + " - " + moreEfficientConsumption);
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo: " );

        Double lessEfficientConsumption = Collections.min(popularCars.values());
        Set<Map.Entry<String,Double>> entradas = popularCars.entrySet();
        String lessEfficientModel = "";

        for (Map.Entry<String, Double> entry : popularCars.entrySet()) {
            if(entry.getValue().equals(moreEfficientConsumption)) {
                lessEfficientModel = entry.getKey();
                System.out.println("Less efficient model: " + lessEfficientModel + " - " + lessEfficientConsumption);
            }
        }


        Iterator <Double> iterator = popularCars.values().iterator();
        Double sum = 0.0;

        while(iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("\nSum of consumption (km): " + sum);

        System.out.println("\nAverage consumption of the cars (km/l): " + String.format("%.2f",sum/popularCars.size()));

        System.out.println("\nRemover os modelos com o consumo igual a 9.5 km/l: ");
        System.out.println(popularCars);
        Iterator<Double> iterator1 = popularCars.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(9.5)) {
                iterator1.remove();
            }
        }
        System.out.println("Printing Models after removing 9.5 consumption\n" + popularCars);

        System.out.println("\nExibir todos os carros na ordem em que foram informados: ");
        // linkedHashMap mantém a ordem natural de inserção

        Map <String,Double> popularCars1 = new LinkedHashMap<>();
        popularCars1.put("Fusca",7.5);
        popularCars1.put("Chevete",9.5);
        popularCars1.put("Belina",6.3);
        popularCars1.put("Brasilia",5.4);
        popularCars1.put("Opalao",3.4);
        popularCars1.put("Elba",9.5);
        popularCars1.put("Corcel I",3.4);
        System.out.println(popularCars1.toString());

        // TreeMap ordena pela key e não pelo value
        System.out.println("\nExibir o dicionário ordenado pelo modelo (key): ");
        Map<String, Double> popularCars2 = new TreeMap<>(popularCars1);
        System.out.println(popularCars2);


        System.out.println("\nApagar todo o dicionário de carros");
        popularCars.clear();
        System.out.println("Confirme se realmente está vazio o dicionario de carros? " +popularCars.isEmpty());

        }
}
