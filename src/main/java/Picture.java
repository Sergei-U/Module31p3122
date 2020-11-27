/**
 * @author Sergei Usov
 * @version 1.0.0
 */
public class Picture implements Deletable {

    @Override
    public void delete(String articleId) {
        System.out.println("Pictures are deleted");
    }

}
