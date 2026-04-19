import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Person;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.config.ProjectConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        /*
         * Here we actually link the two beans. We use the Autowired annotation to wire into
         * the constructor. This way is preferred. We can use the final keyword with this approach. If you
         * only have one constructor, autowired is automatically used.
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.printf("Person's name: [%s]\n", person.getName());
        System.out.printf("Parrot's name: [%s]\n", parrot.getName());
        System.out.printf("Person's Parrot: [%s]\n", person.getParrot());  // we get the parrot from ProjectConfig

    }
}
