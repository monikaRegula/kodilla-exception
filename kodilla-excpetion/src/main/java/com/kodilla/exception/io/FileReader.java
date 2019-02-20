package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException {
        //ClassLoader klasa odpowiedzialna za odnalezienie klas i plików wewnątrz naszej apki
        ClassLoader classLoader = getClass().getClassLoader();

        //wywołanie metody getResource() -  dla klasy ClassLoader żeby wiedziała gdzie ma szukać pliku
        //pobierany jest uchwyt do pliku za pomocą metody getFile()
        File file = new File(classLoader.getResource("file/names.txt").getFile());

        //sprawdzam ścieżką do pliku czy pobrałam dobry plik
        //Path path = Paths.get("files/test.txt"); //tutaj sprawdzamy czy wywali wyjątek do konsoli jak zła ścieżka
        //Path path = Paths.get(file.getPath());

        try {
            //używam klasy Files, bo jej  metoda lines() odczytuje coś z pliku
            //lines() wynikiem tej metody jest Stream obiektów typu String - czyli poszczególne linie w pliku
            Stream<String> fileLines = Files.lines(Paths.get("files/test.txt"));

            fileLines.forEach(System.out::println);

        } catch (IOException e) {
            // e to referencja do obiektu wyjątku, który pojawił się w trakcie działania programu
            //System.out.println("coś sie zepsuło. Error "+e);
            throw  new FileReaderException();
        }
        finally{
            //zawartość bloku finally zawsze się wykona niezależnie czy wystąpi wyjątek
            //czy wszystko bd ok
            System.out.println("I am gonna be here ... FOREVER");
        }

    }
}
