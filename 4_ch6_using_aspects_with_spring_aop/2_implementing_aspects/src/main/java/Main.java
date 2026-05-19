import com.segovia.tutorials.beans.Comment;
import com.segovia.tutorials.config.ProjectConfig;
import com.segovia.tutorials.services.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();

        comment.setText("Hello");
        comment.setAuthor("Segovia");

        service.publishComment(comment);

    }
}
