package teste;

public class Calc {
	
	public void binario(int decimal) {
		int remainder;

        if (decimal <= 1) {
            System.out.print(decimal);
            return;
        }

        remainder = decimal %2; 
        binario(decimal >> 1);
        System.out.print(remainder);
	}	
}
