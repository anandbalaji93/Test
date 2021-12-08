public class ReverseSentence {
    public static void main(String[] args) {
        String Sentence = "I am a student";
        String[] str = Sentence.split(" ");
        int n = str.length;
        for(int i=n-1;i>=0;i--)
         System.out.print(str[i] + " ");
    }
}
