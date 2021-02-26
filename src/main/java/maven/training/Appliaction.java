package maven.training;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Appliaction {

    public int countWords(String words){
        String [] separateWords= StringUtils.split(words, ' ');
        return (separateWords == null) ?0: separateWords.length;
    }
    public void greet(){
        List<String> greetings=new ArrayList<>();
        greetings.add("Hello");
        for (String greeting:greetings)
            System.out.println("Greetings: "+greeting);
    }

    public Appliaction() {
        System.out.println("Inside app");
    }

    public static void main(String[] args) {
        System.out.println("Starting app");
        Appliaction appliaction=new Appliaction();
        appliaction.greet();
        int count=appliaction.countWords("I have four words");
        System.out.println(count);
    }
}
