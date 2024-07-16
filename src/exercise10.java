import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class exercise10 {
    public static void main(String[] args) {
        String url = "https://dantri.com.vn/the-gioi.htm";

        //Ket noi va lay tai lieu html tu url
        Document doc = Jsoup.connect(url).get();

        //chon cac phan tu chua tieu de ban tin
        Elements headlines = doc.select(".article-item_title");

        //Hien thi danh sach cac ban tin
        System.out.println("Danh sach cac ban tin: ");
        for (Element headline : headlines) {
            System.out.println(headline.text());
        }
    }
}
