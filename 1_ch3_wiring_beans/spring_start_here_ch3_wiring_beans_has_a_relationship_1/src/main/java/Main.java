import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Person;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.config.ProjectConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        /*
         * Here we show that there is no link/wiring between the Person Bean and Parrot Bean yet.
         *
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.printf("Person's name: [%s]\n", person.getName());
        System.out.printf("Parrot's name: [%s]\n", parrot.getName());
        System.out.printf("Person's Parrot: [%s]\n", person.getParrot());  // we get null because there is no wiring yet

    }
}
