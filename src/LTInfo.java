import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LTInfo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main (String[] args) {
    LTInfo  ltinfo1 = new LTInfo();
    ltinfo1.setName("Anand");
    ltinfo1.setAge(25);
    LTInfo  ltinfo2 = new LTInfo();
    ltinfo1.setName("ABC");
    ltinfo1.setAge(24);
    LTInfo  ltinfo3 = new LTInfo();
    ltinfo1.setName("defga");
    ltinfo1.setAge(34);
    List<LTInfo> ltinfolist = new ArrayList<>();
    ltinfolist.add(ltinfo1);
    ltinfolist.add(ltinfo2);
    ltinfolist.add(ltinfo3);
 //filter the list whose age is > 30
        List<LTInfo> resultlist = new ArrayList<>();
        resultlist = ltinfolist.stream().filter(x->x.getAge()>30).collect(Collectors.toList());

        for(LTInfo ltinfo: resultlist) {
            System.out.println(ltinfo.getAge());
            System.out.println(ltinfo.getName());
        }
        }
        }
