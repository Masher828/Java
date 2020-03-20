class Assignment1{
	public static void main(String[] args){
		int i=0,j=args[0].length()-1,top=0;
		while(i<j){
			if (args[0].charAt(i)!=args[0].charAt(j)){
				top=-1;
				break;
				
			}
		i++;
		j--;
		}
		if (top==0){
			System.out.println(args[0]+" is a pallindrome ");
		}
		else{
			System.out.println(args[0]+" is not a pallindrome ");
		}
	}
}

			
		