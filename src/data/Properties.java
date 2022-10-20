package data;

import com.sun.source.tree.CatchTree;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Properties implements Resource {
    public Properties(String mainFolder, InputStream input) throws IOException {
        this.mainFolder = mainFolder;
        this.input = input;
    }
    public Properties(String s) throws FileNotFoundException {super();}

    public Map<String, String> read = new HashMap<>();              //используем коллекцию Map

    Map<String, String> result = new HashMap<>();
    Map<String, String> props = new HashMap<>();
    String mainFolder = System.getProperty("user.dir");           //системные Property

    InputStream input = new FileInputStream(String.format("%s/src/u.resources/%s", mainFolder, "db.properties"));

    java.util.Properties prop = new java.util.Properties();
    {
        try {
            prop.load(input);  }                                     //при вводе строки-> путь указан (библиотека db.properties)
            catch (IOException ex){                               //базовое исключение при доступе к данным
                            ex.printStackTrace();
                            throw new RuntimeException(ex);
        }
        for (Object key : prop.keySet()) {                      //для ключа выбираем коллекцию Set, т.к. не имеют дубликатов)
            props.put((String) key, prop.getProperty((String) key));
        }

        result = props;

        //return result;
    }
}



