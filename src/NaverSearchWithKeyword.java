import org.json.JSONArray;
import org.json.JSONObject;
import service.NaverApiAgent;

/**
 * Created by danawacomputer on 2017-04-17.
 */
public class NaverSearchWithKeyword {

    public static void main(String[] args) {

        /*
        String keyword = "자바라";

        String json = NaverApiAgent.searchAndReturnJson(keyword);

        // todo: 1. 3번째 검색 결과의 bloggerlink 값 출력
        JSONObject jsonObj= new JSONObject(json);
        JSONArray jsonArr = jsonObj.getJSONArray("items");
        JSONObject thridValue = jsonArr.getJSONObject(2);
        //System.out.println(thridValue);

        String result = thridValue.getString("bloggerlink");
        System.out.printf("3번째 검색결과의 bloggerlink값은 %s입니다.\n",result);
        */

        String keyword = "커리";
        String json = NaverApiAgent.searchAndReturnJson(keyword);

        JSONObject obj = new JSONObject(json);
        JSONArray list = (JSONArray)obj.get("items");
        JSONObject theThird = (JSONObject) list.get(2);
        String result = theThird.getString("bloggerlink");
        System.out.println("3번째 블로그 링크: "+result);


        //todo: 2. 100개 검색결과의 bloggerName 출력


    }
}
