
public class Dog extends Animal{
	public Dog(String n, int l) {
		name = n;
		legs = l;
	}
	public String toString() {
		return "The dog "+name+" has "+legs+" legs";
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return this.getLegs()-o.getLegs();
	}
}
