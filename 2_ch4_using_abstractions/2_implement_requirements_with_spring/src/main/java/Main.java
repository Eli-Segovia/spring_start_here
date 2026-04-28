import com.segovia.tutorials.ch4_using_abstractions.beans.Comment;
import com.segovia.tutorials.ch4_using_abstractions.configuration.ProjectConfiguration;
import com.segovia.tutorials.ch4_using_abstractions.services.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        CommentService service = context.getBean(CommentService.class);

        Comment c1 = new Comment("Eli", "This is comment #1");
        Comment c2 = new Comment("Eli", "This is comment #2");
        Comment c3 = new Comment("Eli", "This is comment #3");

        service.publishComment(c1);
        service.publishComment(c2);
        service.publishComment(c3);

    }
}
