package demidov.projects.tests;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class TestUtils {
  public static String readSourceFile(final String fileName) {
    try {
      FileSystem _default = FileSystems.getDefault();
      Path _path = _default.getPath(fileName);
      byte[] data = Files.readAllBytes(_path);
      return new String(data);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
