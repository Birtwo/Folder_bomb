package com.biruk;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Virus {

  public static final String PATHTODIR = "E:\\Virus\\";

  public void createVirus() {

    for (int i = 0; i < 20; i++) {
      try {
        Thread.sleep(50);
      } catch (InterruptedException e) { }
      File folder = new File(PATHTODIR + generateRandom());
      folder.mkdir();
    }
    String[] list = new File("E:\\Virus").list();
    List<String> namesList = Arrays.asList(list);

    for (int i = 0; i < namesList.size(); i++) {
      generateFolder(PATHTODIR + namesList.get(i) + "\\");
    }
  }

  private void generateFolder(String path) {
    for (int i = 0; i < 20; i++) {
      boolean folder = new File(path + generateRandom()).mkdir();
    }
  }

  public String generateRandom() {
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
      int randomLimitedInt = leftLimit + (int)
          (random.nextFloat() * (rightLimit - leftLimit + 1));
      buffer.append(randomLimitedInt);
    }

    return buffer.toString();
  }
}

