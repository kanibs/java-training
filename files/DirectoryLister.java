import java.io.File;
import java.io.IOException;

public class DirectoryLister {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Please specify a directory name.");
			return;
		}
		File entry = new File(args[0]);
		listDirectory(entry);
	}
	public static void listDirectory(File entry) {
		try {
			if (!entry.exists()) {
				System.out.println(entry.getName() + " not found.");
				return;
			}
			if (entry.isFile()) {
				// Write the pathname of the entry:
				System.out.println(entry.getCanonicalPath());
			} else if (entry.isDirectory()) {
				// Create list of entries for this directory:
				String[] entryNames = entry.list();
				for (String entryName : entryNames) {
					// Create a File object for each entry name:
					File thisEntry = new File(entry.getPath(), entryName);
					// List this entry by a recursive call:
					listDirectory(thisEntry);
				}
			}
		} catch(IOException e) { System.out.println("Error: " + e); }
	}
}
