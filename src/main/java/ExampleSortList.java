import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleSortList {

    public static void main(String [] args) {


    List<Cat> myCats = new ArrayList<Cat>(){{
        add(new Cat("Malandro",18,"back"));
        add(new Cat("Claudio",13,"brown"));
        add(new Cat("Priscila",21,"yellow"));
        add(new Cat("Juanita",6,"white"));
        add(new Cat("Claudio",10,"brown"));
    }};

    System.out.println("--\tInsertion Order\t--");
    System.out.println(myCats);

        System.out.println("\n--\tRandon Order\t--");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("\n--\tNatural Order (Name)\t--");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("\n--\tOrder by age\t--");
        Collections.sort(myCats, new CompareAge());
        //myCats.sort(new CompareAge());
        System.out.println(myCats);

        System.out.println("\n--\tOrder by Color\t--");
        Collections.sort(myCats, new CompareColor());
        System.out.println(myCats);

        System.out.println("\n--\tOrder by Name/Color/Idade\t--");
        Collections.sort(myCats, new CompareNameColorAge());
        System.out.println(myCats);

    }
}

class Cat implements Comparable<Cat>{

    private String name;
    private Integer age;
    private String color;

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + name +
                ", age=" + age +
                ", color=" + color +"}"
                ;
    }


    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
        //zero is equal, -1 is different
    }

 }

 class CompareAge implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {

        return Integer.compare(c1.getAge(),c2.getAge());

    }
 }

 class CompareColor implements Comparator<Cat> {

     @Override
     public int compare(Cat c1, Cat c2) {
         return c1.getColor().compareToIgnoreCase(c2.getColor());
     }
 }

 class CompareNameColorAge implements Comparator<Cat> {

    @Override
     public int compare(Cat c1, Cat c2) {
         int name = c1.getName().compareToIgnoreCase(c2.getName());
         if (name != 0) {
             return name;
         }
         int color = c1.getColor().compareToIgnoreCase(c2.getColor());
         if (color != 0) {
             return color;
         }
            return Integer.compare(c1.getAge(),c2.getAge());
         }

 }
