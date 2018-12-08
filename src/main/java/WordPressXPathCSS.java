import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import org.joox.selector.CSS2XPath;

public class WordPressXPathCSS {

public static void main(String[] args) {

    try {
        Document doc = Jsoup.connect("http://demosite.center/wordpress/wp-login.php/").get();
        Elements elements = doc.select("*");
        for (Element element : elements) {
            String path = CSS2XPath.css2xpath(element.cssSelector(), true);
      
            System.out.println("      CSS : " + element.cssSelector());
            System.out.println("    XPath : " + path + "\n");

        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}