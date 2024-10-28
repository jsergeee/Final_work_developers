import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    protected String name;
    protected String type;
    protected List<String> commands;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        this.commands = new ArrayList<>();
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public List<String> getCommands() {
        return commands;
    }

    public abstract void displayInfo();
}
