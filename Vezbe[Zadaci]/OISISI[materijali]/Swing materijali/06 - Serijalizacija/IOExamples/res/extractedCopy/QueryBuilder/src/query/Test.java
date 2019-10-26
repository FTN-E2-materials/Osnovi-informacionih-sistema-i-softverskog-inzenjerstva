package query;

import query.api.QueryBuilder;
import query.model.Column;
import query.model.Table;

public class Test {

	public static void main(String[] args) {
		QueryBuilder builder = new QueryBuilder();
		Table table = new Table("TabelaPrimer");
		Column c1 = new Column("Kolona1");
		Integer v1 = 53;
		Column c2 = new Column("Kolona2");
		Integer v21 = 13;
		Integer v22 = 23;
		Column c3 = new Column("Kolona3");
		String v3 = "PrimerStringa";
		Column c4 = new Column("Kolona4");
		String v4 = "Cetvrta";
		builder.selectFrom(table).where(c1).is(v1).and().where(c2).between(v21, v22).and().where(c3).is(v3).or().where(c4).is(v4);
		System.out.println(builder.build().generateSQLQuery());
	}

}
