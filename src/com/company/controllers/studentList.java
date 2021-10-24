package com.company.controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class studentList<controllers> {





        private BufferedReader in;

        public static   String[] names;


        public studentList() {

            try {
                Path thePath = Paths.get("src/" + "studentList.txt");

                //FileReader fileReader = new FileReader(String.valueOf(thePath));
                //BufferedReader in = new BufferedReader(fileReader);

                in = new BufferedReader(new FileReader(String.valueOf(thePath)));

                List<String> lines = new ArrayList<>();

                String line = null;

                try{
                    line = in.readLine();

                    while(line != null){
                        lines.add(line);
                        line = in.readLine();
                    }

                    in.close();

                    names = lines.toArray(new String[lines.size()]);



                } catch(IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }






public String[] returnNames(){
            return names;
}


}
