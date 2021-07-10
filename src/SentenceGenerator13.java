
public class SentenceGenerator13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomSortedOrdered13 rand = new RandomSentenceGenerator13();
		RandomSortedOrdered13 sorts = new SortedSentenceGenerator13();
		RandomSortedOrdered13 order = new OrderedSentenceGenerator13();
		System.out.println(rand.tryToGenerate());
		System.out.println(sorts.tryToGenerate());
		System.out.println(order.tryToGenerate());
	}
	
}
