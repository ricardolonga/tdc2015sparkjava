package br.com.ricardolonga.tdc2015sparkjava;

import static spark.Spark.*;

/**
 * Created by ricardo.longa on 09/05/15.
 */
public class ApplicationServer {

    public static void main(String[] args) {
        port(8080);
        
        get("/", (req, res) -> "Bem vindo ao SparkJava!");
       
        get("/hello", (req, res) -> {
            String name = req.queryParams("name");
            
            if(name == null) {
                res.status(400);
                return "Faltou o parâmetro 'name'.";
            }
            
            return name + ", bem vindo ao SparkJava!";
        });
    }
    
}
