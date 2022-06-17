package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {


    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        //amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // nutella
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        String expectedKelime = "Nutella";
        String actualSonucYazisi = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

        Driver.closeDriver();
    }
    @DataProvider
    public static Object[][] AranacakKelimeler() {
Object [][] arananKelimeArrayi={{"Nutella"},{"java"},{"cigdem"}};
        return arananKelimeArrayi;
    }
    @Test(dataProvider = "AranacakKelimeler")
    //Arayacagimiz kelimeleri bir liste gibi tutup bana yollayacak bir veri saglayicisi olusturacagiz.
    public void DataProviderTesti(String arananKelime) {
        AmazonPage amazonPage = new AmazonPage();
        //amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella java, cigdem ve netherland icin arama yapalim.
        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);
        //sonuclarin aradigimiz kelime icerdigini test edelim sayfayi kapatalim


        String expectedKelime = arananKelime;
        String actualSonucYazisi = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

        Driver.closeDriver();
    }
}
