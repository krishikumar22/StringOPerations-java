
public class StrCharAtEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome to String Programming";
int Stringlength=str.length();
int count=0;
for(int i=0;i<=str.length()-1;i++)
	if(str.charAt(i)=='o') {
		count++;
	}
System.out.println(count);
	}

}
