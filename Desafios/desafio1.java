package desafios;

public class DesafioOperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double resultB = Math.pow(numB, 2);
		double denB = 2;
		double rdenB = Math.pow(denB, 2);
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		//Formula
		System.out.println("( " + "[6 * (3 + 2)]² - " + "( " + "(1 - 5) * (2 - 7)" + " )²" + " )³");
		System.out.println("  " + "______________   " + "  " + "_________________");
		System.out.println("  " + "    3 * 2        " + "  " + "        2        ");
		System.out.println("____________________________________________");
		System.out.println("                 "+"10³");
		System.out.println("\n");
		
		//Resolução part1
		System.out.println("(    " + numA + "      - " + "(  " + numB + "  )²" + ")³");
		System.out.println("  " + "____________   " + "  " + "________");
		System.out.println("      " + denA + "             " + denB);
		System.out.println("  __________________________");
		System.out.println("               "+"10³");
		System.out.println("\n");
		
		//Resolução part2
		System.out.println("(    " + numA + "      - " + "  " + resultB + "   )³");
		System.out.println("  " + "____________   " + "  " + "________");
		System.out.println("      " + denA + "             " + rdenB);
		System.out.println("  _________________________");
		System.out.println("               "+"10³");
		System.out.println("\n");
		
		//Resolução part3
		System.out.println("( " + superiorA + " - " + superiorB + " )³");
		System.out.println("  _____________");
		System.out.println("      " + inferior);
		System.out.println("\n");
		
		//Resolução part4
		System.out.println("    " + superior);
		System.out.println("  _____________");
		System.out.println("      " + inferior);
		System.out.println("\n");
		
    //Resultado
		System.out.println("O resultado é: " + resultado);
    //OU System.out.println("O resultado é: " + superior / inferior);
	}

}
