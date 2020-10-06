interface studentFee {
	public  void getFee(int a);
}
class student implements studentFee{
	int fee;

	public void getFee(int fee) {
		this.fee = fee;
		try {
			if(fee<=0) {
				throw new  InvalidFeeException("invalid fee");
			}
			System.out.println("fee :"+fee);
		}catch (InvalidFeeException e) {
			System.out.println(e);
		}	
		
		

	}
}
class InvalidFeeException extends Exception{
	String str;
	InvalidFeeException(String str1){
		str = str1;
	}
	@Override
	public String toString() {
		return "InvalidFeeException [str=" + str + "]";
	}
}
public class Q60 {

	public static void main(String args[]) {
	System.out.println("eneter fee");
	Scanner sc = new Scanner(System.in);
	int fee = sc.nextInt();
	student s = new student();
	
		s.getFee(fee);
}
}