public class Date {

  private int month;
  private int day;
  private int year;

  public Date(int month, int day, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  public int getYear() {
    return year;
  }

  public boolean isDateNewerThenOtherDate(Date date) {
    if (date.year > year) {
      return true;
    } else if (date.year == year) {
      if (date.month > month) {
        return true;
      } else if (date.month == month) {
        if (date.day > day) {
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return day + "/" + month + "/" + year;
  }
}
