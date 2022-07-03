import java.io.File;

public class copyPaste {

    public void CopyImg1() {
        File source = new File("C:\\ImagenesJava\1");
        File dest = new File("C:\\ImagenesCopiadasJava\\1");
        try {
            FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CopyImg2() {
        File source = new File("C:\\ImagenesJava\2");
        File dest = new File("C:\\ImagenesCopiadasJava\\2");
        try {
            FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CopyImg3() {
        File source = new File("C:\\ImagenesJava\3");
        File dest = new File("C:\\ImagenesCopiadasJava\\3");
        try {
            FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CopyImg4() {
        File source = new File("C:\\ImagenesJava\4");
        File dest = new File("C:\\ImagenesCopiadasJava\\4");
        try {
            FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DeleteFile1() {
        File file = new File("C:\\ImagenesCopiadasJava\\1");
        file.delete();
    }

    public void DeleteFile2() {
        File file = new File("C:\\ImagenesCopiadasJava2\\2");
        file.delete();
    }

    public void DeleteFile3() {
        File file = new File("C:\\ImagenesCopiadasJava\\3");
        file.delete();
    }

    public void DeleteFile4() {
        File file = new File("C:\\ImagenesCopiadasJava\\4");
        file.delete();
    }

}
