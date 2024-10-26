
class Throw {
	static void fun()
	{
		try {
			throw new NullPointerException("demo");
		}
		catch (NullPointerException e) {
			System.out.println("Caught inside fun().");
			throw e; // rethrowing the exception
		}
	}

	public static void main(String args[])
	{
        Throw n = new Throw();

		try {
			n.fun();
		}
		catch (NullPointerException e) {
			System.out.println("Caught in main.");
		}
	}
}
