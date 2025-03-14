class Alpha{
	public static char[] sortAlpha(char[] alphas){
		char temp;
		for(int i=0;i<alphas.length;i++){
			for(int j=i+1;j<alphas.length;j++){
				if(alphas[i]<alphas[j]){
					
					temp=alphas[i];
					alphas[i]=alphas[j];
					alphas[j]=temp;
				}
			}
		}
		return alphas;
	}
}