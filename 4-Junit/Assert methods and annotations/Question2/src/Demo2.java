
public class Demo2 {
 boolean palindromeCheck(String s) {
	 int top=1;
	 int i=0,j=s.length()-1;
	 while(i<j) {
		 if (s.charAt(i)!=s.charAt(j)) {
			 	top=0;
			 
			 	break;
		 }
		 i++;
		 j--;
	 }
	 if (top==1) {
		 	return true;
	 }
	 else {
		 return false;
	 }
 }	
}
