import java.time.*;
interface Logger {
  void log(String m);
  default void stamp(){ System.out.println(LocalDateTime.now()); }
  static void ready(){ System.out.println("Logger ready"); }
}
class Console implements Logger {
  public void log(String m){ System.out.println(m); }
}
