package idv.mission.example;

import java.io.File;
import java.io.IOException;

public class FileRenameTest {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\workspace\\practice\\Test\\sourceDir\\RenameTest.txt");
		String targetPath = "C:\\workspace\\practice\\Test\\targetDir\\";
		File targetDir = new File(targetPath);
		if(!targetDir.exists()) {
			targetDir.mkdir();
		}
		String fileName = file.getName();
		File target = new File(targetPath + File.separator + fileName);
		file.renameTo(target);
	}
}