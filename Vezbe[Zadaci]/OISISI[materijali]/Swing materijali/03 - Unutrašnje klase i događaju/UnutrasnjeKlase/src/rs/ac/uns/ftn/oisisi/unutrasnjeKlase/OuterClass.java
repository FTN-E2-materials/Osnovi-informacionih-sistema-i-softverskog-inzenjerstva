package rs.ac.uns.ftn.oisisi.unutrasnjeKlase;

public class OuterClass implements SayHi {

	private String name;

	public OuterClass() {
		this.name = "Outer Class";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHi() {
		System.out.println("Hi from: " + this.name);
	}

	public class InnerClass implements SayHi {
		private String innerName;

		public InnerClass() {
			this.innerName = "Inner Class";
		}

		public String getInnerName() {
			return innerName;
		}

		public void setInnerName(String innerName) {
			this.innerName = innerName;
		}

		@Override
		public void sayHi() {
			System.out.println("Hi from: " + this.innerName + " which can access to attributes of: " + name);
		}

	}

	public static class StaticInnerClass implements SayHi {

		private String staticInnerName;

		public StaticInnerClass() {

		}

		public String getStaticInnerName() {
			return staticInnerName;
		}

		public void setStaticInnerName(String staticInnerName) {
			this.staticInnerName = staticInnerName;
		}

		@Override
		public void sayHi() {
			System.out.println("Hi from: " + this.staticInnerName + " which cannot access to attibutes of: "
					+ OuterClass.class.toString());
		}

	}

}
