package Materi;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;

import java.net.URL;


public class FirstConnect {
    public static void main (String[]args) throws IOException {
        ConnectURI koneksiSaya = new ConnectURI();
        URL myAddress = koneksiSaya.buildURL
                ("https://farmasi.mimoapps.xyz/mimoqss2auygD1EAlkqZCOhiffSsFl6QqAEIGtM");
    String response =koneksiSaya.getResponseFromHttpurl(myAddress);
    System.out.println(response);

    assert  response != null;
    JSONArray responseJSON = new JSONArray(response);
    ArrayList<ResponModel> responModel =
            new ArrayList<>();
    for(int i=0 ; i< responseJSON.length();i++) {
        ResponModel resModel = new ResponModel();
        JSONObject myJSONObject=
                responseJSON.getJSONObject(i);
        resModel.setMsg(myJSONObject.getString("message"));
        resModel.setStatus(myJSONObject.getString("status"));
        resModel.setComment(myJSONObject.getString("comment"));
        responModel.add(resModel);



    }
    System.out.println("Response are :");
    for(int index=0; index<responModel.size();index++){
        System.out.println("MESSAGE : " +responModel.get(index).getMsg());
        System.out.println("STATUS : " +responModel.get(index).getStatus());
        System.out.println("COMMENTS : " +responModel.get(index).getComment());
    }

}
}