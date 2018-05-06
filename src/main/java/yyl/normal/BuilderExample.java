package yyl.normal;

public class BuilderExample {

	Long id;
	String name;

	BuilderExample(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public static BuilderExampleBuilder builder() {
		return new BuilderExampleBuilder();
	}

	public static class BuilderExampleBuilder {
		private Long id;
		private String name;

		public BuilderExampleBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public BuilderExampleBuilder name(String name) {
			this.name = name;
			return this;
		}

		public BuilderExample build() {
			return new BuilderExample(this.id, this.name);
		}

		public String toString() {
			return "BuilderExample.BuilderExampleBuilder(id=" + this.id + ", name=" + this.name + ")";
		}
	}
}
