public class Hello {

    private static String getFancyGreeting() {
	return "~~~~ Ooooh... now that's *fancy*!~~~~\n"
	    + System.out.println("Hello there!");
    }

    private static String getSimpleGreeting() {
	return "Hello, git user!  You are awesome!";
    }

    public static void main(String[] args) {
	String greeting;
	if (args.length > 0 && "-f".equals(args[0])) {
	    greeting = getFancyGreeting();
	} else {
	    greeting = getSimpleGreeting();
	}
	System.out.println(greeting);
    }

}