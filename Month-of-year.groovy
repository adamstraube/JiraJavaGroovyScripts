// Month of Year Scriptrunner script
//
// Allows easy searching by month of year in JQL and analytics
//
// Searcher: Exact Text Searcher (stats)
// Template: Text Field (multi-line)

import com.atlassian.core.util.DateUtils
import com.atlassian.jira.datetime.LocalDate
import com.atlassian.jira.ComponentManager

timestamp = issue.getCreated()
    
def cal = Calendar.getInstance()
cal.setTime(new Date(timestamp.getTime()))
double weekday = cal.get(Calendar.MONTH);
String weekdayName;

switch(weekday) {
  case 0:  weekdayName = '1.January';  break;
  case 1:  weekdayName = '2.February';  break;
  case 2:  weekdayName = '3.March';  break;
  case 3:  weekdayName = '4.April';  break;
  case 4:  weekdayName = '5.May';  break;
  case 5:  weekdayName = '6.June';  break;
  case 6:  weekdayName = '7.July';  break;
  case 7:  weekdayName = '8.August';  break;
  case 8:  weekdayName = '9.September';  break;
  case 9:  weekdayName = '10.October';  break;
  case 10:  weekdayName = '11.November';  break;
  case 11:  weekdayName = '12.December';  break;

}

return weekdayName
