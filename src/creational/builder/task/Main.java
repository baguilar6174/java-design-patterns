package creational.builder.task;

import java.util.Arrays;

public class Main {

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

        /*
        Result:

        SELECT id, name, email from users WHERE age > 18 AND country = 'EC' ORDER BY name ASC, ORDER BY age DESC LIMIT 100;
        */
    }
}
