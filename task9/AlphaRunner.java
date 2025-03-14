class AlphaRunner{
	public static void main(String args[]){
		char[] alphas={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',  'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] ref=Alpha.sortAlpha(alphas);
		for(char r:ref)
		System.out.println(" "+r);
	}
}