package command;

interface Command {
    void execute();
}


class Light {
    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}

class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}

class RemoteController {
    Command slot;

    public RemoteController() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

class CommandPattern {
    public static void main(String[] args) {
        RemoteController remote = new RemoteController();
        Light light = new Light();

        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
    }
}

