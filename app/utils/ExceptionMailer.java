package utils;

public class ExceptionMailer {

  public static void send(Throwable e) {
    System.out.println("Fake sending email containing exception " + e);
  }
}
