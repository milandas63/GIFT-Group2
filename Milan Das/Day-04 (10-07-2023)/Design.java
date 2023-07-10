class Design {
	public static void main(String[] args) {
		for(int h=0; h<1; h++) {
			System.out.print(" +");
			for(int i=0; i<5; i++) System.out.print("\"");
			System.out.print("+");
			for(int i=0; i<10; i++) System.out.print(" ");
			System.out.print(" +");
			for(int i=0; i<5; i++) System.out.print("\"");
			System.out.println("+");
		}

		for(int h=0; h<1; h++) {
			System.out.print("[| O O |]");
			for(int i=0; i<9; i++) System.out.print(" ");
			System.out.println("[| O O |]");
		}
		for(int h=0; h<1; h++) {
			System.out.print(" |  ^  |");
			for(int i=0; i<10; i++) System.out.print(" ");
			System.out.println(" |  ^  |");
		}
		for(int h=0; h<1; h++) {
			System.out.print(" | '_' |");
			for(int i=0; i<10; i++) System.out.print(" ");
			System.out.println(" | '_' |");
		}
		for(int h=0; h<1; h++) {
			System.out.print(" +");
			for(int i=0; i<5; i++) System.out.print("-");  System.out.print("+");
			for(int i=0; i<10; i++) System.out.print(" ");
			System.out.print(" +");
			for(int i=0; i<5; i++) System.out.print("-");  System.out.println("+");
		}
	}
}
