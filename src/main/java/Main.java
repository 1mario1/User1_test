import sun.reflect.annotation.ExceptionProxy;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 09.01.2018.
 */
public class Main {
    public static void main (String... args){

        new Main().readFile("resources");
    }

    private List<String> readFile (String resouce){
        List<String> data = new ArrayList<String>();
        File file = null;

        try{
            file = new File(this.getClass().getResource(resouce).toURI());
        }
        catch (URISyntaxException e1){
            e1.printStackTrace();
        }

        if(file!=null){
            if(file.isDirectory()){

            }
            else
                System.out.println("Not a directory");
        }
        else
            showError("Resource doesn't exist");

        return data;
    }

    private void showError(String errorNAme){
        throw new RuntimeException("Show error "+errorNAme);
    }
}
