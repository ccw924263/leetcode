package leetcode.undone;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        List<String> list = getPeriodListByStartPeriodAndEndPeriod("2020-03","2020-04");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    private static final Pattern PERIOD_REGEX_PATTERN = Pattern.compile("^\\d{4}-((0([1-9]))|(1([012])))$");
    public static boolean checkPeriod(String period) {
        if (period == null) {
            return false;
        }
        return PERIOD_REGEX_PATTERN.matcher(period).matches();
    }

    public static List<String> getPeriodListByStartPeriodAndEndPeriod(String startPeriod,String endPeriod){
        if(!checkPeriod(startPeriod)){
            throw new IllegalArgumentException("期间格式有误：" + startPeriod);
        }
        if(!checkPeriod(endPeriod)){
            throw new IllegalArgumentException("期间格式有误：" + endPeriod);
        }
        if(comparePeriod(startPeriod,endPeriod)>0){
            throw new IllegalArgumentException("开始期间大于结束期间：startPeriod：" + startPeriod+">endPeriod:"+endPeriod);
        }
        List<String> resultPeriodList = new ArrayList<String>();
        int startYear = YearMonth.parse(startPeriod).getYear();
        int startMonth = YearMonth.parse(startPeriod).getMonthValue();
        int endYear = YearMonth.parse(endPeriod).getYear();
        int endMonth = YearMonth.parse(endPeriod).getMonthValue();
        //总共需要添加的期间数量
        int size = (endYear-startYear)*12 + endMonth-startMonth+1;
        int year = startYear;
        int month = startMonth;
        for(int i = 0 ;i<size ; i++){
            if(month>9){
                resultPeriodList.add(year+"-"+month);
            }else{
                resultPeriodList.add(year+"-0"+month);
            }
            month++;
            if(month>12){
                year++;
                month = 1;
            }
        }
        return resultPeriodList;
    }
    /**
     * 比较两个期间的大小，period1早与period2 返回 -1
     * @author rd_qingqing_jiao
     * @date 2019/6/28 13:58
     * @param period1
     * @param period2
     * @return
     */
    public static int comparePeriod(String period1,String period2){
        if (!checkPeriod(period1)) {
            throw new IllegalArgumentException("期间格式有误：" + period1);
        }
        if (!checkPeriod(period2)) {
            throw new IllegalArgumentException("期间格式有误：" + period2);
        }
        int year1 = getYearOfPeriod(period1);
        int year2 = getYearOfPeriod(period2);
        if(year1<year2){
            return -1;
        }else if(year1>year2){
            return 1;
        }
        int month1 = getMonthOfPeriod(period1);
        int month2 = getMonthOfPeriod(period2);
        if(month1<month2){
            return -1;
        }else if(month1>month2){
            return 1;
        }else{
            return 0;
        }
    }
    public static int getYearOfPeriod(String period) {
        if (!checkPeriod(period)) {
            throw new IllegalArgumentException("期间格式有误：" + period);
        }
        return YearMonth.parse(period).getYear();
    }
    public static int getMonthOfPeriod(String period) {
        if (!checkPeriod(period)) {
            throw new IllegalArgumentException("期间格式有误：" + period);
        }
        return YearMonth.parse(period).getMonthValue();
    }
}
