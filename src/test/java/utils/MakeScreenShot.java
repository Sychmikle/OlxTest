package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tests.BaseTest;

import java.io.File;
import java.io.IOException;

public class MakeScreenShot extends BaseTest{
    private int i;
    File file = new File("C:\\OlxTest\\screenShots\\screen"+ i++ +".png" );

    public void shoot() throws IOException
    {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, file);
    }}
