import java.net.URI;

public class OpenGoogle {
    public void openGoogle() {
        try {

            URI uri = new URI("http://google.com");

            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
