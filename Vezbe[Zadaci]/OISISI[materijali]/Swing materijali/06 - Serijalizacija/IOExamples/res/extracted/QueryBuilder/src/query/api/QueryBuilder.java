package query.api;

import query.model.Column;
import query.model.Operator;
import query.model.Query;
import query.model.Table;

public class QueryBuilder {

	private Query query;

	public QueryBuilder() { this.query = new Query(); }
	
	public QueryBuilder selectFrom(Table table) {
		this.query.setType(QueryType.SELECT);
		this.query.setTable(table);
		return this;
	}

	public QueryBuilder deleteFrom(Table table) {
		this.query.setType(QueryType.DELETE);
		this.query.setTable(table);
		return this;
	}

	public QueryBuilder insertInto(Table table) {
		this.query.setType(QueryType.INSERT);
		this.query.setTable(table);
		return this;
	}

	public QueryBuilder updateInto(Table table) {
		this.query.setType(QueryType.UPDATE);
		this.query.setTable(table);
		return this;
	}

	public QueryBuilder where(Column column) {
		this.query.addConditionForColumn(column);
		return this;
	}

	public QueryBuilder is(Object value) throws NullPointerException {
		this.query.getLastCondition().setLeft(value);
		return this;
	}
	public QueryBuilder between(Object minimumValue, Object maximumValue) throws NullPointerException {
		this.query.getLastCondition().setLeft(minimumValue);
		this.query.getLastCondition().setRight(maximumValue);
		return this;
	}

	public QueryBuilder and() {
		this.query.addOperator(Operator.AND);
		return this;
	}

	public QueryBuilder or() {
		this.query.addOperator(Operator.OR);
		return this;
	}

	public QueryBuilder not() {
		this.query.addOperator(Operator.NOT);
		return this;
	}

	public Query build() { 
		Query result = this.query;
		this.query = new Query();
		return result; }

}
