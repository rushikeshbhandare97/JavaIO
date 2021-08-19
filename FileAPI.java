import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.nio.file.Files.*;

public class NIOFileAPITest {

   private  static  String HOME = System.getProperty("user.home");
   private  static  String PLAY_WITH_NIO = "TempPlayGround";
   private Object FileUtils;
   private Object Assert;

    @Test

  public <list> void  givenPathWhenCheckedThenConfirm() throws IOException {

        Path homePath = Paths.get(HOME);
        Path playPath;
        if (exists(playPath)) {
            FileUtils.deleteFiles(playPath.toFile);
        });
        Assert.assertTrue(notExists(playPath));

        Object createDirectoryplayPath;
        createDirectoryplayPath();
        Assert.assertTrue(exists(playPath));

        createDirectoryplayPath);
        Assert.assertTrue(notExists(playPath));

        IntStream.range {
            1, 10
        }.playPath.forEach():playPath + "/temp+cntr");
        Path tempFile = null;
        Assert.assertTrue(notExists(tempFile));
        try {
            createFile(tempFile));
               catch(IOException e){
            }
            Assert.assertTrue(exists(tempFile));


            list list = (list) playPath.Filter((Files::isRegularFile)).forEach(System.out.println());
            (list) playPath.Filter((Files::isRegularFile)).forEach(System.out.println());
            newDirectoryStream(playPath).forEach(System.out.println();
            newDirectoryStream(playPath Path -> homePath.toFile().isFile()) &&
                    Path.toString().startsWith("temp");


                   .foreach(System.out::println);

        }

    }

    private void createDirectoryplayPath() {
    }
}








