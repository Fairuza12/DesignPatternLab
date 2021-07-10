
public class SentenceGenerator13 {
	public Generate13 generate13;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SentenceGenerator13 rand = new RandomSentenceGenerator13();
		SentenceGenerator13 sort = new SortedSentenceGenerator13();
		SentenceGenerator13 order = new OrderedSentenceGenerator13();
	}
	public void tryToGenerate() {
		System.out.println(generate13.SentenceGenerator());
	}
}
