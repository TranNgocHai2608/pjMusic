package test_DUC;

import com.google.gson.JsonElement;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import com.google.gson.Gson;
public class trackDetails {
    public static void main(String[] args) {
        HttpResponse<JsonNode> response = Unirest.get("https://shazam-core.p.rapidapi.com/v1/tracks/details?track_id=341759650")
                .header("x-rapidapi-host", "shazam-core.p.rapidapi.com")
                .header("x-rapidapi-key", "533d42cd24msheb307f07f2b6174p1c9e7fjsn952ba01d8c63")
                .asJson();
        Gson gson = new Gson();
        JsonNode results = response.getBody();
        //Convert json to String
        String jsonStr = results.toString();
        System.out.println(jsonStr);
        //create lyricsInf obj from jsonStr

    }
}
