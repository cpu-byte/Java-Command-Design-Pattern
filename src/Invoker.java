import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> history = new ArrayList<>();

    public void invoke(Command command) {
        this.history.add(command);
        command.execute();
    }

    public void undo() {
        try {
            if (history.size() == 1)
                throw new Exception(
                        "No more to undo, at initial " +
                                "invoked command in history context.");

            // removing recently added command, i.e. performing .pop()
            this.history.remove(this.history.size() - 1);

            // executing the previous command
            this.history.get(this.history.size() - 1).execute();

        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }
    }

}