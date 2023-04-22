double nota = 6.5; //Nota do Aluno;
boolean bomComportamento = false; //Comportamento do Aluno;
boolean passouPorMedia = nota > 7; //Guarda o resultado da verificação se a Nota do Aluno é maior que 7;

Boolean bc = bomComportamento; //Guarda o valor da variável "bomComportamento";
String s = bc.toString(); //Converte o valor da variável "bc" em String e a guarda na variável "s";
		
		 if(bc == true) {
			 s = "Sim"; //Se a variável "bc" for igual a TRUE, então será convertido para SIM;
		 }else {
			 s = "Não"; //Se a variável "bc" for igual a False, então será convertido para NÃO;
		 }
		 
Boolean ppm = passouPorMedia; //Guarda o valor da variável "passouPorMedia";
String n = ppm.toString(); //Converte o valor da variável "ppm" em String e a guarda na variável "n";
			
		 if(ppm == true) {
			 n = "Sim"; //Se a variável "ppm" for igual a TRUE, então será convertido para string SIM;
		 }else {
			 n = "Não"; //Se a variável "ppm" for igual a False, então será convertido para string NÃO;
		 }
     
    System.out.println("Tem bom comportamento? " + s);
		System.out.println("Qual foi sua nota? " + nota);
		System.out.println("A média para passar é = "+ 7);
		System.out.println("O aluno passou? " + n);
