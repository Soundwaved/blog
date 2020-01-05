package user;
import java.util.List;



	

	

		public interface User {
		    public User getArticle(int id);
		    public List<User> getAllArticle1();
		    public void addArticle(User article);
		    public void updateArticle(User article);
		    public void deleteArticle(User article);
		    List<User> getAllArticles();
		    
		}

