package org.example;

import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class SaveProduct {
    private static FileWriter file;

    public SaveProduct(Product product1) {
        JSONObject obj = new JSONObject();

        obj.put("name", product1.getName());
        obj.put("quantity", product1.getQuantity());
        obj.put("price", product1.getPrice());
        obj.put("image", product1.getImage());

        try {
            file = new FileWriter("src/main/resources/products.json"); // salva na pasta resources
            file.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}