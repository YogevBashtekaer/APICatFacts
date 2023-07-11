package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
      // Window window = new Window();
        try {
            Document doc = Jsoup.connect("https://www.ynet.co.il/").get();

            // תבנית CSS לאיתור כתבות בעמוד הראשי
            String articleCssQuery = ".slotTitle a";

            // מילה שתרצה לבדוק אם קיימת בכל כתבה
            String searchTerm = "המילה_המבוקשת";

            // ביצוע חיפוש והתאמת הכתבות בעמוד הראשי
            Elements articles = doc.select(articleCssQuery);

            // עבר על הכתבות ובדיקה אם הן מכילות את המילה המבוקשת
            for (Element article : articles) {

                String url = article.attr("href");
                Document articleDoc = Jsoup.connect(url).get();
                String articleText = articleDoc.text();

                    String title = article.text();
                    System.out.println("כותרת: " + title);
                    System.out.println("קישור: " + url);
                    System.out.println("----------------------------------------");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}