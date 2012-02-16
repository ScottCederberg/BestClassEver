public class Hello {

    public static void main(String[] args) {
	if (args.length > 0 && "-f".equals(args[0])) {
	    System.out.println("~~~~ Ooooh... now that's *fancy*!~~~~");
	    System.out.println("Hello there!");
	} else {
	    System.out.println("Hello, git user!  You are awesome!");
	}
    }

}