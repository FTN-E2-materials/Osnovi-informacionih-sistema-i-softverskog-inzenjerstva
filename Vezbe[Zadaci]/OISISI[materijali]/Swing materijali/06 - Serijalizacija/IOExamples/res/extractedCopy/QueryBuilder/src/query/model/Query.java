package query.model;

import query.api.QueryTokens;
import query.api.QueryType;

public class Query {

	private Table table;
	private QueryType type;
	private Condition firstCondition;
	private Condition lastCondition;
	
	public void setTable(Table table) { this.table = table; }
	
	public Table getTable() { return this.table; }

	public void setType(QueryType type) { this.type = type; }

	public QueryType getType() { return this.type; }
	
	public Condition getLastCondition() { return this.lastCondition; }
	
	public void addOperator(Operator operator) {
		this.lastCondition.setOperator(operator);
	}
	
	public String generateSQLQuery() {
		String queryString = type.toString() + QueryTokens.DELIMITER + QueryTokens.ALL_FROM + QueryTokens.DELIMITER + table.getName();
		if(firstCondition != null) {
			queryString += QueryTokens.WHERE + firstCondition.generateSQLQuery();
		}
		return queryString + QueryTokens.FINAL;
	}

	public void addConditionForColumn(Column column) {
		if(firstCondition == null) {
			this.firstCondition = new Condition(column);
			this.lastCondition = this.firstCondition;
		} else {
			this.lastCondition.setNextCondition(new Condition(column));
			this.lastCondition = this.lastCondition.getNextCondition();
		}
	}
	
}
