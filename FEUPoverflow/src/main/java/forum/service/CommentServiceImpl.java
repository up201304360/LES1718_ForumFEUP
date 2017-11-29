package forum.service;

import forum.domain.Comment;
import forum.domain.CommentRepository;
import forum.domain.Student;
import forum.domain.StudentRepository;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {

    @Inject
    private CommentRepository commentRepository;

    @Override
    public void createComment(Comment newComment) {
        commentRepository.save(newComment);
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findOne(id);
    }

    @Override
    public void updateComment(Comment newComment) {
        commentRepository.save(newComment);
    }

    @Override
    public void removeComment(Comment comment) {
        commentRepository.delete(comment);
    }
}
