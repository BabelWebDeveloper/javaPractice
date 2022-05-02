public record OpenCloseCurtainsCommand(Curtains curtains) implements Command{

    @Override
    public void execute() {
        curtains.openClose();
    }

}
