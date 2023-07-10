public class Sample {
	public static void main() {
		System.out.println("main()");
	}

	public static void main(String arg) {
		System.out.println("main(String)");
	}

	public static void main(String[] args) {
		System.out.println("main(String[])");
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}

		String[] names = {"India", "Srilanka", "Pakistan", "Bhutan", "Bangladesh"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		names[2] = "Afganistan";
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}

class Example {
}

class Gift {
}
