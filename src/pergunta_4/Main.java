package pergunta_4;

public class Main {

	public static void main(String[] args) {
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		double total = sp + rj + mg + es + outros;
		// debug System.out.println(total);

		double porcentagemSp = (sp / total) * 100;
		// debug System.out.println(porcentagemSp);

		double porcentagemRj = (rj / total) * 100;
		// debug System.out.println(porcentagemRj);

		double porcentagemMg = (mg / total) * 100;
		// debug System.out.println(porcentagemMg);

		double porcentagemEs = (es / total) * 100;
		// debug System.out.println(porcentagemEs);

		double porcentagemOutros = (outros / total) * 100;
		// debug System.out.println(porcentagemOutros);

		// debug double porcentagemTotal = porcentagemSp + porcentagemRj + porcentagemMg
		// + porcentagemEs + porcentagemOutros;
		// debug System.out.println(porcentagemTotal);

		System.out.printf("Percentual de representação por estado:\n");
		System.out.println("Sp: " + porcentagemSp);
		System.out.println("Rj: " + porcentagemRj);
		System.out.println("Mg: " + porcentagemMg);
		System.out.println("Es: " + porcentagemEs);
		System.out.println("Outros: " + porcentagemOutros);
	}

}
