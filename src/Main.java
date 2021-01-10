public class Main {

    public static void main(String[] args) {

        var profile = new Profile("Hello world.");
        var profileInvoker = new Invoker();
        System.out.println("initial: " + profile);

        // update 1
        var bioUpdateCommand1 = new SetProfileBiographyCommand(profile, "Welcome to my profile!");
        profileInvoker.invoke(bioUpdateCommand1);
        System.out.println("update 1: " + profile);

        // update 2
        var bioUpdateCommand2 = new SetProfileBiographyCommand(profile, "I'm an intern.");
        profileInvoker.invoke(bioUpdateCommand2);
        System.out.println("update 2: " + profile);

        // update 3
        var bioUpdateCommand3 = new SetProfileBiographyCommand(profile, "On the finance team.");
        profileInvoker.invoke(bioUpdateCommand3);
        System.out.println("update 3: " + profile);

        // undo 1
        profileInvoker.undo();
        System.out.println("undo 1: " + profile);

        // undo 2
        profileInvoker.undo();
        System.out.println("undo 2: " + profile);

        // undo 3 (will fail as no more to undo, the initial state is not in the history context)
        profileInvoker.undo();
        System.out.println();

    }

}
