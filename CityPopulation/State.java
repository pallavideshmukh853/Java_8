package CityPopulation;

public class State {

	int stateid;
	String statename;

	public State(int stated, String statename) {
		super();
		this.stateid = stated;
		this.statename = statename;
	}

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "State [stateid=" + stateid + ", statename=" + statename + "]";
	}

}
