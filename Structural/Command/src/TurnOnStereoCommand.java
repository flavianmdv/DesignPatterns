class TurnOnStereoCommand implements Command {
    private Stereo stereo;

    public TurnOnStereoCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.turnOn();
    }
}