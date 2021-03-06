package hacker.govern.gateway;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  // 此工程是一个zuul网关

public class ZuulAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulAppApplication.class, args);

        System.out.println("此工程是一个zuul网关");
    }

}
