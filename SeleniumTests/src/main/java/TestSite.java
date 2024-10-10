import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.assertTrue;


public class TestSite {
    // Объект WebDriver — управляет браузером
    private WebDriver driver;

    // Метод, который выполняется перед каждым тестом
    @Before
    public void Setup() {
        // Указываем путь к ChromeDriver
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");

        System.setProperty("web-driver.chrome.driver", "chromedriver.exe");

        // Инициализация драйвера Chrome
        driver = new ChromeDriver();

        //Настройка браузера, например размеры окна, режим окна
        driver.manage().window().maximize();
    }

    // Метод самого теста
    @Test
    public void testGoogle() {
        // открываем страницу
        driver.get("https://google.com");

        // поиск элемента на странице
        WebElement searchBox = driver.findElement(By.name("q"));

        //проверка, что
        assertTrue(searchBox.isDisplayed());
    }


    // Метод постусловия, который выполняется после каждого теста

    @After
    public void tearDown() {
        // Закрыть браузер
        if (driver != null) {
            driver.quit();
        }
    }


}
