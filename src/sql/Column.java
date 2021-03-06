package sql;
/*test*/
public class Column {
	private String name;
	private Table origin;
	
	public Column(String name, Table t) {
		this.name = name;
		origin = t;
	}

	public String getName() {
		return origin.getName() + "." + name;
	}

	public Table getOrigin() {
		return origin;
	}

	@Override
	public String toString() {
		return "Column{" +
				"name='" + name + '\'' +
				", table='" + origin.getName() + '\'' +
				'}';
	}

	public String getBareName() {
		return name;
	}
}
