import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        //Hello World API
        get("/hello", (request, response) -> "Hello Friend!");

        get("/hello/world", (request, response) -> {
            if(request.params("Hello") == "hello") {
                return "This the root path";
            } else {
                return "This not the root param";
            }
        });

        //CRUD API
        get("/", (request, response) -> {
            // Show something
        });

        post("/", (request, response) -> {
            // Create something
        });

        put("/", (request, response) -> {
            // Update something
        });

        delete("/", (request, response) -> {
            // Annihilate something
        });

        options("/", (request, response) -> {
            // Appease something
        });
    }
}