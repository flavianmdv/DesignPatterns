class TurnOffStereoCommand implements Command {
    private Stereo stereo;

    public TurnOffStereoCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.turnOff();
    }
}