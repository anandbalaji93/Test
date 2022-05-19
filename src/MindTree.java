import java.util.ArrayList;
import java.util.List;

public class MindTree {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MindTree(String name , int salary) {
        this.name = name;
        this.salary = salary;
    }
    public static void main(String[] args) {
      //List of employee obj, name and salary .average of employee salary
        MindTree m1 = new MindTree("Anand", 5000);
        MindTree m2 = new MindTree("Balaji", 7000);
        MindTree m3 =  new MindTree("John", 8000);
        List<MindTree> objList =  new ArrayList<>();
        objList.add(m1);
        objList.add(m2);
        objList.add(m3);

        System.out.println(objList.stream().mapToInt( x-> x.getSalary()).average());


    }
}
