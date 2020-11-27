/**
 * @author Sergei Usov
 * @version 1.0.0
 */
public class Article implements Deletable {
    @Override
    public void delete(String articleId) {
        System.out.println("Article is deleted");
    }
}
