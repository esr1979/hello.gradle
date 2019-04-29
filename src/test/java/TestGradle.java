import com.example.hellogradle.HelloGradle;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestGradle {

    @Test
    public void name() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        HelloGradle.print(new PrintStream(out));
        String s = out.toString();
        Assert.assertEquals("Hello, Gradle!", s);

    }

}
