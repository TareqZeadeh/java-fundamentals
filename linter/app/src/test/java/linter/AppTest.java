package linter;

import linter.App;
import org.junit.jupiter.api.Test;

import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void noError(){
        String link="C:\\Users\\STUDENT\\401courseJAVA\\java-fundamentals\\linter\\app\\src\\test\\resources\\no errors.js";
        App app=new App();
        String exp="";
        assertEquals(exp,app.checkJSfile(link));
    }
    @Test
    public void empty(){
        String link="C:\\Users\\STUDENT\\401courseJAVA\\java-fundamentals\\linter\\app\\src\\test\\resources\\empty.js";
        App app=new App();
        String exp="Empty File.";
        assertEquals(exp,app.checkJSfile(link));
    }
    @Test
    public void oneError(){
        String link="C:\\Users\\STUDENT\\401courseJAVA\\java-fundamentals\\linter\\app\\src\\test\\resources\\one error.js";
        App app=new App();
        String exp="Line 5 : Missing semicolon.\n";
        assertEquals(exp,app.checkJSfile(link));
    }
    @Test
    public void fewError(){
        String link="C:\\Users\\STUDENT\\401courseJAVA\\java-fundamentals\\linter\\app\\src\\test\\resources\\few errors.js";
        App app=new App();
        String exp="Line 3 : Missing semicolon.\nLine 5 : Missing semicolon.\n";
        assertEquals(exp,app.checkJSfile(link));
    }
    @Test
    public void manyError(){
        String link="C:\\Users\\STUDENT\\401courseJAVA\\java-fundamentals\\linter\\app\\src\\test\\resources\\many errors.js";
        App app=new App();
        String exp="Line 2 : Missing semicolon.\nLine 4 : Missing semicolon.\nLine 6 : Missing semicolon.\n";
        assertEquals(exp,app.checkJSfile(link));
    }
}
