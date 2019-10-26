package query.model;

import query.api.QueryTokens;

public class Condition {

	private Column column;
	private Object left;
	private Object right;
	
	private Condition nextCondition;
	private Operator operator;
	
	public Condition(Column column) { this.column = column; }
	
	public Column getColumn() { return this.column; }

	public Object getLeft() { return left; }

	public void setLeft(Object left) { this.left = left; }

	public Object getRight() { return right; }

	public void setRight(Object right) { this.right = right; }
	
	public void setNextCondition(Condition condition) { this.nextCondition = condition; }

	public Condition getNextCondition() { return this.nextCondition; }
	
	public void setOperator(Operator operator) { this.operator = operator; }
	
	public Operator getOperator() { return this.operator; }

	@Override
	public String toString() {
		String result = this.column.getName();
		if(right == null)
			result += QueryTokens.EQUALS + left.toString();
		else
			result += QueryTokens.DELIMITER + QueryTokens.BETWEEN + QueryTokens.DELIMITER + left.toString() + 
					  QueryTokens.DELIMITER + Operator.AND.toString() + QueryTokens.DELIMITER + right.toString();
		return result;
	}
	
	public String generateSQLQuery() {
		if(this.operator != null && this.nextCondition != null)
			return this.toString() + QueryTokens.DELIMITER + this.operator.toString() + QueryTokens.DELIMITER + this.nextCondition.generateSQLQuery();
		else
			return this.toString();
	}
	
}
