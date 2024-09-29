package top.moma.play.retier;

import java.time.LocalDate;
import top.moma.m64.core.helper.date.DateTimeHelper;

public class RetireCalServiceImpl {

  public static void main(String[] args) {
    System.out.println(new RetireCalServiceImpl().getRetireAge("1967-01-12", 60));
  }

  public String getRetireAge(String birthday, Integer base) {
    LocalDate birth = DateTimeHelper.parseDate(birthday);
    int year = birth.getYear();
    int cur = 2025 - year;
    int remain = 60 - cur;
    if (remain > 0) {
      double plus = remain / 4.0;
      double retire = base + plus;
      double reYear = year + retire;
      return retire + "岁 " + reYear + "年";
    } else {
      return base + "岁 " + (year + base) + "年";
    }
  }
}
