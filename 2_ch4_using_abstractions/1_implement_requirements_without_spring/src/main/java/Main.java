import com.segovia.tutorials.ch4_using_abstractions.services.repositories.beans.Comment;
import com.segovia.tutorials.ch4_using_abstractions.services.repositories.proxies.EmailCommentNotificationProxy;
import com.segovia.tutorials.ch4_using_abstractions.services.repositories.repositories.DatabaseCommentRepository;
import com.segovia.tutorials.ch4_using_abstractions.services.repositories.services.CommentService;

public class Main {
    public static void main(String[] args) {
        CommentService service = new CommentService(new DatabaseCommentRepository(), new EmailCommentNotificationProxy());

        Comment c1 = new Comment("Eli", "This is comment #1");
        Comment c2 = new Comment("Eli", "This is comment #2");
        Comment c3 = new Comment("Eli", "This is comment #3");

        service.publishComment(c1);
        service.publishComment(c2);
        service.publishComment(c3);

    }
}
