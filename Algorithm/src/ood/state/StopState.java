package ood.state;

public class StopState implements State {
	/* State vs Strategy
	 * States store a reference of context objects that contain them. Strategies do not.
	 * Sates are allowed to replace themselves, while strategies are not.
	 * Strategies are passed to context as parameters, while states are created by the context object itself.
	 * Strategies only handle a single, specific task, while states provide underlying  implementation for everything the conext does
	 */

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Stop state";
	}
}
