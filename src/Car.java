
public class Car {

	public static void main(String[] args) {
		// quando OFF estiver true On teve estar false verse versa
		boolean Off = true;// inverter true ou false
		boolean On = false;// inverter true ou false
		/*algoritmo com operador logico negacao on e off*/
		if (true) {
			if (!(Off)) {
				System.out.println(" ...:::Off:::... ");
				System.out.println("      "+Off);
			}
		}
		if (true) {
			if (!(On)) {
				System.out.println(" ...:::On:::... ");
				System.out.println("      "+On);
			}
		}
	}

}
