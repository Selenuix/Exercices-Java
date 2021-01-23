package ArticleV1;

import java.util.ArrayList;

public class ArticleDAO
{
	// Définition des attributs
	private static ArrayList<Article> lesArticles;

	// Conbstructeur
	public ArticleDAO()
	{
		this.lesArticles = new ArrayList<Article>();
	}

	// Ajout d'un article
	public static void ajouterArticle(Article unArticle)
	{
		lesArticles.add(unArticle);
	}

	// Récupération des articles
	public static ArrayList<Article> getLesArticles() {
		return lesArticles;
	}

	public static Article getArticleByRef(String ref)
	{
		// Définition des variables
		Article lArticle = null;

			for (Article unArticle : lesArticles)
			{
				if(unArticle.getRef().equals(ref))
				{
					lArticle = unArticle;
				}
			}
			return lArticle;
	}
}
