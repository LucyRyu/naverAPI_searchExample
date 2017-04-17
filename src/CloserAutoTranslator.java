import org.json.JSONObject;
import service.NaverApiAgent;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by danawacomputer on 2017-04-17.
 */
public class CloserAutoTranslator {

    public static void main(String[] args) {
        //1. 파일에서 한 라인씩 읽어온다.
        try {
            BufferedReader fbr = new BufferedReader(
                    new FileReader("src\\closer.txt"));

            String line = "";
            while ((line = fbr.readLine()) != null) {

                if (line.trim().equals("")) {
                    continue;
                }

                String result =
                        NaverApiAgent.tranlate("en", "ko", line);

                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
