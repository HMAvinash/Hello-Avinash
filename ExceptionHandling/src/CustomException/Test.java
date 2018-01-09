package CustomException;

public class Test 
{
	public static void main(String[] args) throws CustomCheckedException {
		//throw new UnCheckedCustomException("Buisness Exception has occured");
		throw new CustomCheckedException("Buisness Exception needs to be handled");
	}

}
