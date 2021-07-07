import java.util.Random;

public interface SentenceGenerator13 {
	public void sentenceGenerator();
}

class RandomSentenceGenerator implements SentenceGenerator13{

	@Override
	public void sentenceGenerator() {
		// TODO Auto-generated method stub
		Random generator = new Random();
		String[] article = {"A","The",};
		String[] nounPronoun = {"boy","girl","man","woman","car","bicycle"};
		String[] verb = {"eat","sleep","play","study","work"};
		String[] preposition = {"there","here","for","to","with","in","on"};
		
		for(int i=0;i<10;i++)
		{
			StringBuffer buffer = new StringBuffer();
			int article1 = generator.nextInt(article.length);
			int nounPronoun1 = generator.nextInt(nounPronoun.length);
			int verb1 = generator.nextInt(verb.length);
			int preposition1 = generator.nextInt(preposition.length);
			int article2 = generator.nextInt(article.length);
			int nounPronoun2 = generator.nextInt(nounPronoun.length);
			buffer.append(article[article1]+" "+nounPronoun[nounPronoun1]+" "+verb[verb1]+" "+preposition[preposition1]+" "+article[article2]+" "+nounPronoun[nounPronoun2]);
			System.out.println(buffer.toString().toLowerCase());
		}
		
	}
	
}

class SortedSentenceGenerator implements SentenceGenerator13{

	@Override
	public void sentenceGenerator() {
		// TODO Auto-generated method stub
		
		
	}
	
}

class OrderedSentenceGenerator implements SentenceGenerator13{

	@Override
	public void sentenceGenerator() {
		// TODO Auto-generated method stub
		
	}
	
}

class Sentence{
	public static void main(String[] args) {
		RandomSentenceGenerator RSG = new RandomSentenceGenerator();
		RSG.sentenceGenerator();
		SortedSentenceGenerator SSG = new SortedSentenceGenerator();
		SSG.sentenceGenerator();
		OrderedSentenceGenerator OSG = new OrderedSentenceGenerator();
		OSG.sentenceGenerator();
	}
}
