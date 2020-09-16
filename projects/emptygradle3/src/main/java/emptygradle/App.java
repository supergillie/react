package emptygradle;


import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Properties;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("hello " + args[0].toUpperCase());
    }

}
