
public class Unserscord2Camel {

public static void main(String[] args) {
// TODO Auto-generated method stub

String[] orignalA = new String[] { "SURVEY_DASHBOARD", "SURVEY_OPEN_SURVEY", "SURVEY_LAST_SYNC", "SURVEY_NAME", "SURVEY_START_DATE", "SURVEY_END_DATE", "SURVEY_TYPE", "SURVEY_FROM", "SURVEY_TO", "SURVEY_BACK",
"SURVEY_COMPLETION_OVERVIEW", "SURVEY_SURVEYED_CUSTOMERS", "SURVEY_SUBMITTED_SURVEY_FORMS", "SURVEY_SAVED_SURVEY_FORMS", "SURVEY_COMPLETION", "SURVEY_REMAINING_SURVEY_TARGETS", "SURVEY_SAVED_TO_BE_SUBMITTED",
"SURVEY_VIEW_ALL", "SURVEY_MY_LAST_INTERACTION", "SURVEY_MY_NEXT_INTERACTION", "SURVEY_CREATED", "SURVEY_SURVEYED_CUSTOMERS_BY_SPECIALTY", "SURVEY_SURVEYED_CUSTOMERS_BY_TIER", "SURVEY_TARGET_GROUP",
"SURVEY_CUSTOMER_UNIVERSE", "SURVEY_CUSTOMER_SURVEYED", "SURVEY_SPECIALTY", "SURVEY_DISTRIBUTION", "SURVEY_TIER_VERY_HIGH", "SURVEY_TIER_HIGH", "SURVEY_TIER_MEDIUM", "SURVEY_TIER_LOW", "SURVEY_TIER_NO_TIER",
"SURVEY_TIER_EMPTY", "SURVEY_TIER_TOTAL" };

StringBuffer buf = new StringBuffer();
for (String item : orignalA) {
buf = new StringBuffer();

String[] splits = item.toLowerCase().split("_");
for (int i = 0; i < splits.length; i++) {
String each = splits[i];
if (i == 0) {
buf.append(each);
} else 
buf.append(each.substring(0, 1).toUpperCase() + each.substring(1));
}
System.out.println(buf.toString());
}

}








}
