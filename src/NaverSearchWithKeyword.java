import org.json.JSONArray;
import org.json.JSONObject;
import service.NaverApiAgent;

/**
 * Created by danawacomputer on 2017-04-17.
 */
public class NaverSearchWithKeyword {

    public static void main(String[] args) {

        String keyword = "자바라";

        String json = NaverApiAgent.searchAndReturnJson(keyword);
        String json2 = NaverApiAgent.searchAndReturnJsonLink(keyword);
        System.out.println(json2);


        // 1. 3번째 검색 결과의 bloggerlink 값 출력
        JSONObject jsonObj= new JSONObject(json);

        JSONArray jsonArr = jsonObj.getJSONArray("items");

        JSONObject thridValue = jsonArr.getJSONObject(2);
        System.out.println(thridValue);

        String result = thridValue.getString("bloggerlink");
        System.out.printf("3번째 검색결과의 bloggerlink값은 %s입니다.\n",result);

    }
}
