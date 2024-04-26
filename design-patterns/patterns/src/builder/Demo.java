package builder;

public class Demo {

    public static void main(String[] args) {
        URL url = new URL();
        url.setProtocol("http://");
        url.setHostname("mywebsite");
        url.setPort(":8080/");
        url.setPathParam("homepage?=");
        url.setQueryParam("random");
        System.out.print(url.getProtocol());
        System.out.print(url.getHostname());
        System.out.print(url.getPort());
        System.out.print(url.getPathParam());
        System.out.println(url.getQueryParam());
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("http://").hostname("mywebsite").port(":8080/");
        URLBuilder urlBuilder = builder.build();
        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.println(urlBuilder.port);

    }
}
