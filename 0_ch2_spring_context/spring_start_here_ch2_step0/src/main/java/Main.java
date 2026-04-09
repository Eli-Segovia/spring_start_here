import com.segovia.tutorials.spring_start_here_ch2_step0.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        /*
         * Here we have created our context, but did not add the Parrot into it.
         * Things that we put into the context are called beans.
         */
        ApplicationContext context = new AnnotationConfigApplicationContext();

        Parrot p = new Parrot();

    }
}
