package demidov.projects.tests

import java.nio.file.Files
import java.nio.file.FileSystems

class TestUtils {	
	
	def public static readSourceFile(String fileName) {
		var data = Files.readAllBytes(FileSystems.getDefault().getPath(fileName))		
		return new String(data)
	}
}