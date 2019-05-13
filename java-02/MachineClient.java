public class MachineClient {
public static void main(String[] args) {
		Machine machine = new Machine();
		machine.setState(MachineState.IDLE);
		MachineState state = machine.getState();
		System.out.println("The machine state is: " + state);
	}
}