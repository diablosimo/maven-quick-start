package maven.training;

import java.util.ArrayList;
import java.util.List;

public class Appliaction {
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
    }
}
