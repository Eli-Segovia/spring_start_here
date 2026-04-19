import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Person;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.config.ProjectConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        /*
         * Here we have multiple parrots, but we want Spring to choose the right one.
         * In this example we are using the Qualifier keyword. Much preferred than just using the parameter name.
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        System.out.println("---- Parrot beans ----");
        for (String name : context.getBeanNamesForType(Parrot.class)) {
            System.out.println(name);
        }

        Person person1 = context.getBean(Person.class);
        Parrot parrot = context.getBean("parrot2", Parrot.class);

        System.out.printf("Person's name: [%s]\n", person1.getName());
        System.out.printf("Parrot's name: [%s]\n", parrot.getName());
        System.out.printf("Person's Parrot: [%s]\n", person1.getParrot());



    }
}
