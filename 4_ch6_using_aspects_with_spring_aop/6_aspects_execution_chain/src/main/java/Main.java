import com.segovia.tutorials.beans.Comment;
import com.segovia.tutorials.configuration.ProjectConfiguration;
import com.segovia.tutorials.services.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment();
        comment.setAuthor("Eli Segovia");
        comment.setText("Hello there person!");

        CommentService commentService = context.getBean(CommentService.class);

        System.out.println(commentService.publishComment(comment));


    }
}
