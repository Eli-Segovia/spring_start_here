import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Person;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.config.ProjectConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        /*
         * Here we have multiple parrots, but we want Spring to choose the right one.
         * In this example we are just relying on parameter name, but that did not seem to work for me
         * Probably a good indication that I should not rely on this method of injection.
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Person person1 = context.getBean(Person.class);
        Parrot parrot1 = context.getBean(Parrot.class);

        System.out.printf("Person's name: [%s]\n", person1.getName());
        System.out.printf("Parrot's name: [%s]\n", parrot1.getName());
        System.out.printf("Person's Parrot: [%s]\n", person1.getParrot());



    }
}
