import java.io.File;
import java.io.FilenameFilter;
public class FileFinder {


    public static void main(String[] args) throws Exception {

        File[] fileList = getFileList("C:\\Users\\yiy556\\Desktop\\Backup\\SPEED");
for(File file : fileList) {
 System.out.println(file.getName());

	
}
 }
    private static File[] getFileList(String dirPath) {
        File dir = new File(dirPath);   
 File[] fileList = dir.listFiles(new FilenameFilter() {public boolean accept(File dir, String name) {return name.startsWith("SPEED");}});
        return fileList;
        
    }
}
