package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {


    public void exportPhonebook(Map<String, String> contacts, String output) {
        parametersValidator(contacts, output);
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.write("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write in to the file", ioe);
        }
    }

    private void parametersValidator(Map<String, String> contacts, String output) {
        if (contacts == null) {
            throw new IllegalArgumentException("One or both parameters are null!");
        }
        if (output == null) {
            throw new IllegalArgumentException("One or both parameters are null!");
        }
    }
}
