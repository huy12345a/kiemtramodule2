import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class writereadfile {
    private static final String FILE_PATH = "src\\myfile.bin";
    private static final File MY_FILE = new File(FILE_PATH);

    public static void writeFile(PhoneManage phoneManage) {
        try {
            FileOutputStream fos = new FileOutputStream(MY_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(phoneManage.getPhoneManageMap());

            oos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
