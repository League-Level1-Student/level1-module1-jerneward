package _05_vault;

public class Vault {
		

	int secretCode = 1876;
	
	public static void main(String[] args) {
		
		Vault V = new Vault ();
		V.tryCode(1876);
		boolean code = V.tryCode(1876);
		System.out.println(code);
		
	}
	
public boolean tryCode(int number){

	if(number == secretCode) {
		return true;
	}
	
return false; 

}
	

}
