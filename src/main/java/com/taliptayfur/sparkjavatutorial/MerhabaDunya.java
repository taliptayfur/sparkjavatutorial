package com.taliptayfur.sparkjavatutorial;

import static spark.Spark.get;

public class MerhabaDunya {
    public static void main(String[] args) {

        get("/merhaba", (request, response) -> "Merhaba Dunya");

        // "GET /merhaba/talip" ve "GET /merhaba/tayfur" yazarsak tarayicimizin adresine bu endpoint e duseriz
        // request.params(":isim") ile 'talip' ya da 'tayfur' bilgisini aliriz
        get("/merhaba/:isim", (request, response) -> {
            return "Merhaba: " + request.params(":isim");
        });
    }
}
