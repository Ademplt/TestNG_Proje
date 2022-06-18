package tests.day20_xmlFiles;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.React_SoppingCartPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class react_Shopping {
    // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
// 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
// (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
// 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
// 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
// (Her ürün 1 defadan fazla eklenemez!)
// 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
// 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
// 7.Checkout'a tıklayın
    React_SoppingCartPage react_soppingCartPage=new React_SoppingCartPage();

    @Test
    public void test01(){
        Driver.getDriver().get("https://react-shopping-cart-67954.firebaseapp.com/");
        List<String> urunListesi=new ArrayList<>();
        int count=1;
        for (WebElement each:react_soppingCartPage.urunler
             ) {
            urunListesi.add(each.getText());
            System.out.print("sitede 16 urun var ,"+count+".urun");
            count++;
        }
        System.out.println(".... "+urunListesi);


    }
}