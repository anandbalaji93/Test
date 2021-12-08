public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "  Hello     my name is             Anand Balaji";
        String str1= str.replaceAll("\\s+", " ");
        System.out.println(str1);
    }
}
