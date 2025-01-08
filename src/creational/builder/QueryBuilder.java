package creational.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueryBuilder {

    private final String table;
    private List<String> fields = new ArrayList<>();
    private final List<String> conditions = new ArrayList<>();
    private final List<String> orderFields = new ArrayList<>();
    private int limitCount;

    public QueryBuilder(String table) {
        this.table = table;
    }

    public QueryBuilder select(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public QueryBuilder where(String condition) {
        this.conditions.add(condition);
        return this;
    }

    public QueryBuilder orderBy(String field, Direction direction) {
        this.orderFields.add(String.format("ORDER BY %s %s", field, direction));
        return this;
    }

    public QueryBuilder limit(int limit) {
        this.limitCount = limit;
        return this;
    }

    public String execute() {
        String fields = !this.fields.isEmpty() ? String.join(", ", this.fields) : "*";
        String whereClause = !this.conditions.isEmpty() ? "WHERE " + String.join(" AND ", this.conditions) : "";
        String orderByClause = !this.orderFields.isEmpty() ? String.join(", ", this.orderFields) : "";
        String limitClause = this.limitCount > 0 ? "LIMIT " + this.limitCount : "";
        return String.format("SELECT %s from %s %s %s %s;", fields, this.table, whereClause, orderByClause, limitClause);
    }

    public static void main(String[] args) {
        String query = new QueryBuilder("users")
                .select(Arrays.asList("id", "name", "email"))
                .where("age > 18")
                .where("country = 'EC'")
                .orderBy("name", Direction.ASC)
                .orderBy("age", Direction.DESC)
                .limit(100)
                .execute();
        System.out.println(query);
    }
}
