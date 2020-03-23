package com.automation.appium.Utils;
      import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
public class Batfile {
    public static void main(String[] args) {
        /*ProcessBuilder processBuilder = new ProcessBuilder("C:\\Users\\ccdsru\\Desktop\\Desktop_backup\\MentiAddUsersTest\\MentiRun.bat");
        processBuilder.start();*/
        ProcessBuilder processBuilder1 = new ProcessBuilder("E:\\RecordandAuthentication.Bat");
        //processBuilder1.start();
        try {

            Process process = processBuilder1.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println(output);
                System.exit(0);
            } else {
                //abnormal...
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
