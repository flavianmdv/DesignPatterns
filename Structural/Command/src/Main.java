public class Main {
    public static void main(String[] args) {
        TV livingRoomTV = new TV();
        Stereo kitchenStereo = new Stereo();

        Command livingRoomTVOn = new TurnOnTVCommand(livingRoomTV);
        Command livingRoomTVOff = new TurnOffTVCommand(livingRoomTV);
        Command kitchenStereoOn = new TurnOnStereoCommand(kitchenStereo);
        Command kitchenStereoOff = new TurnOffStereoCommand(kitchenStereo);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(livingRoomTVOn);
        remote.pressButton();

        remote.setCommand(kitchenStereoOn);
        remote.pressButton();

        remote.setCommand(livingRoomTVOff);
        remote.pressButton();

        remote.setCommand(kitchenStereoOff);
        remote.pressButton();
    }
}